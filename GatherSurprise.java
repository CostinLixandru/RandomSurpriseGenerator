package surprise;

import java.util.ArrayList;
import java.util.Random;

public final class GatherSurprise {
	private static Random random;
	
	
	private GatherSurprise() {

	}

	
	public static ISurprise gather() {
		if(random==null) {
			random = new Random();
		}
		int n = random.nextInt(3);
		if(n==1) {
			return Candies.Generate();
		}else if(n==2) {
			return MinionToy.Generate();
		}else {
			return FortuneCookie.Generate();
		}
	}
	protected static ArrayList<ISurprise> gather(int n) {
		ArrayList<ISurprise> surprizeRandom = new ArrayList<ISurprise>(n);
		for(int i=0; i<n; i++) {
			surprizeRandom.add(gather());
		}
		return surprizeRandom;
	}
}
