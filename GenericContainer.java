package surprise;

import java.util.ArrayList;

public abstract class GenericContainer implements IBag{
	private ArrayList<ISurprise> container;
	
	public GenericContainer() {
		container = new ArrayList<ISurprise>(20);
	}
	@Override
    public void put(ISurprise newSurprise) {
		this.container.add(newSurprise);
	}
	@Override
    public void put(IBag bagOfSurprises) {
		if(bagOfSurprises.size()==0) {
			System.out.println("Nu ai nimic in container");
		}else {
			for(int i=0 ; i<bagOfSurprises.size();) {
				this.container.add(0, bagOfSurprises.takeOut());
				if(this.isEmpty()) {
					System.out.println("Nu mai sunt suprise in tolba");
				}
			}  
		}	
	}
	@Override
    public boolean isEmpty() {
		if(this.size()==0) {
			return true;
		}
    	return false;
    }
	@Override
    public int size() {
    	return this.container.size();
    }
	@Override
	public abstract ISurprise takeOut();
	ArrayList<ISurprise> getContainer(){
		return this.container;
	}
}
