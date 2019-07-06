package surprise;

import java.util.Random;

public abstract class GenericSurprise implements ISurprise{
	public static Random random;
	
	public GenericSurprise() {
		if(random==null) {
			random = new Random();
		}
	}
	public void enjoy() {
		System.out.println(toString());
	}
}
