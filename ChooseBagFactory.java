package surprise;

import java.util.Scanner;

public class ChooseBagFactory implements IBagFactory{
	
	
	public ChooseBagFactory() {}
	
	@Override
	public IBag makeBag(String type) {
		if(type.equals("FIFO")) {
			return new Fifo();
		}else if(type.equals("LIFO")) {
			return new Lifo();
		}else if(type.equals("RANDOM")){
			Scanner sc = new Scanner(System.in);
			System.out.println("Introdu numarul suprizelor");
			int n = sc.nextInt();
			return new RandomOrder(n);
		}else {			
			System.out.println("Nu ai introdus o tolba valida");
			return null;
		}
	}
}
