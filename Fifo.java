package surprise;

public class Fifo extends GenericContainer{
	
	public Fifo() {
		super();
	}
	@Override
	public ISurprise takeOut() {
		return this.getContainer().remove(size()-1);
	}
}
