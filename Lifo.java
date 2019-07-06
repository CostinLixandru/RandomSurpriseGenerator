package surprise;

public class Lifo extends GenericContainer{
	
	public Lifo() {
		super();	
	}
	@Override
	public ISurprise takeOut() {		
		return this.getContainer().remove(0);
	}	 
}
