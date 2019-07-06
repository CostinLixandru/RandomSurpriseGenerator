package surprise;

import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public abstract class AbstractGiveSurprises {	
	private IBag tolba;
	private int waitTime;
	
	public AbstractGiveSurprises(String container, int waitTime) {
		ChooseBagFactory bagType = new ChooseBagFactory();
		this.tolba = bagType.makeBag(container);
		this.waitTime = waitTime;
	}
	public void put(ISurprise newSurprise)  {
		this.tolba.put(newSurprise);
	}
	public void put(IBag surprises) {                     
		this.tolba.put(surprises);
	}
	void give() {
		if(this.isEmpty()) {
			System.out.println("Nu este nici o surpriza in tolba");
		}else {
			giveWithPassion();
			this.tolba.takeOut().enjoy();
			if(this.isEmpty()) {
				System.out.println("Nu mai exista surprize");
			}
		}
	}
	void giveAll() {
		if(this.isEmpty()) {
			System.out.println("Nu este nici o surpriza in tolba");
		}		
		for(int i=0; i<this.tolba.size();) {
			give();
			try {
				TimeUnit.SECONDS.sleep(this.waitTime); // number of seconds to sleep
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		}

	}	
	boolean isEmpty() {
		return this.tolba.isEmpty();
	}
	public IBag getTolba() {
		return this.tolba;
	}
	protected abstract void giveWithPassion();

}
