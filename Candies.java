package surprise;
import java.util.ArrayList;

public class Candies extends GenericSurprise{
	private static ArrayList<String> candyType;
	private int nTypeOfCandy;
	private String fnlCandy;
	
	private Candies() {
		super();
		if(Candies.candyType==null) {
			Candies.candyType = new ArrayList<String>(4);
			formTypes();
		}
		this.nTypeOfCandy = Candies.random.nextInt(30)+5;		
		this.fnlCandy=Candies.candyType.get(Candies.random.nextInt(Candies.candyType.size()-1));
	}	
	private static void formTypes(){
		Candies.candyType.add("chocolate");
		Candies.candyType.add("vanilla");
		Candies.candyType.add("strayberry");
		Candies.candyType.add("jelly");
	}
	public static Candies Generate() {
		return new Candies();
	}
	@Override
	public String toString() {
		return "Ai primit " + this.nTypeOfCandy + " de bomboane de " + this.fnlCandy+ "!";
	}
}
