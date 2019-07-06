package surprise;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n =2;
		AbstractGiveSurprises test1 = new GiveSurpriseAndApplause("RANDOM", 2);
		AbstractGiveSurprises test2 = new GiveSurpriseAndApplause("LIFO", 2);
		AbstractGiveSurprises test3 = new GiveSurpriseAndHug("FIFO", 2);
		AbstractGiveSurprises test4 = new GiveSurpriseAndHug("LIFO", 2);
		AbstractGiveSurprises test5 = new GiveSurpriseAndHug("RANDOM", 2);
		AbstractGiveSurprises test6 = new GiveSurpriseAndSing("RANDOM", 2);
		System.out.println("testul 1 introdu orice tasta");
		String Test1 = sc.next();
		for (int i = 0; i < n; i++) {
			test1.put(Candies.Generate());
			test1.put(FortuneCookie.Generate());
			test2.put(Candies.Generate());
			test2.put(FortuneCookie.Generate());
			test2.put(MinionToy.Generate());
			test3.put(MinionToy.Generate());
			test3.put(Candies.Generate());
			test3.put(FortuneCookie.Generate());
		}
		test2.giveAll();
		test2.give();
		test3.give();	
		System.out.println("testul 2 introdu orice tasta");
		String Test2 = sc.next();
		test3.give();
		System.out.println("asd");
		test5.give();
		test5.give();
		test5.give();
		test5.give();
		test5.give();
		test5.give();
		test5.give();
		System.out.println("testul 3 introdu orice tasta");
		String Test3 = sc.next();
		test6.put(test3.getTolba());
		test3.give();
		test1.put(test6.getTolba());
		System.out.println("testul 4 introdu orice tasta");
		String Test4 = sc.next();
		for (int i = 0; i < n; i++) {
			test1.put(Candies.Generate());
			test1.put(FortuneCookie.Generate());
			test2.put(Candies.Generate());
			test2.put(FortuneCookie.Generate());
			test3.put(Candies.Generate());
			test3.put(FortuneCookie.Generate());
		}
		  ArrayList<AbstractGiveSurprises> asd1 = new ArrayList<AbstractGiveSurprises>(20); 
		  asd1.add(test1); 
		  asd1.add(test2); 
		  asd1.add(test3);
		  for(int i=0;i<asd1.size();i++) {
			  asd1.get(i).give();
		  }
		 
	}
}
