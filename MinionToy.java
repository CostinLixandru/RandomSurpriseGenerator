package surprise;
import java.util.ArrayList;

public class MinionToy extends GenericSurprise{
	private static ArrayList<String> minions;
	private String theMinion;
	private static int contor;
	
	private MinionToy() {
		if(MinionToy.minions==null) {
			MinionToy.minions = new ArrayList<String>(5);
			formTypes();
		}
		if(MinionToy.contor==5) {
			MinionToy.contor=0;
		}
		this.theMinion=MinionToy.minions.get(++contor);   /// ???????????????
	}
	private static void formTypes(){
		MinionToy.minions.add("Dave");
		MinionToy.minions.add("Carl");
		MinionToy.minions.add("Kevin");
		MinionToy.minions.add("Stuart");
		MinionToy.minions.add("Jerry");
		MinionToy.minions.add("Tim");
	}
	public static MinionToy Generate() {
		return new MinionToy();
	}
	@Override
	public String toString() {
		return "Ai primit pe minionul " + this.theMinion +"!";
	}
}
