package surprise;
import java.util.Random;

public class RandomOrder extends GenericContainer{
	private static Random random;

	
	public RandomOrder(int n) {
		super();	
		if(RandomOrder.random==null) {
			RandomOrder.random = new Random();
		}
		this.getContainer().addAll(GatherSurprise.gather(n));
	}
	@Override
	public ISurprise takeOut() {
		int n = random.nextInt(this.size());
		return this.getContainer().remove(n);
	}
}
