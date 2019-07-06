package surprise;


public class FortuneCookie extends GenericSurprise{
	private static String[] fortuneMessages;               
	private String fnlMessage;                   

	private FortuneCookie() {
		super();
		if(FortuneCookie.fortuneMessages==null) {			
			formTypes();
		}
		this.fnlMessage=FortuneCookie.fortuneMessages[FortuneCookie.random.nextInt(FortuneCookie.fortuneMessages.length)];	
	}
	private void formTypes() {
		fortuneMessages = new String[]{"Today it's up to you to create the peacefulness you long for.", "A friend asks only for your time not your money.",
				"If you refuse to accept anything but the best, you very often get it.", "A smile is your passport into the hearts of others.", "A good way to keep healthy is to eat more Chinese food.",
				"Your high-minded principles spell success.", "Hard work pays off in the future, laziness pays off now.", "Change can hurt, but it leads a path to something better.", 
				"Enjoy the good luck a companion brings you.", "People are naturally attracted to you.", "Hidden in a valley beside an open stream- This will be the type of place where you will find your dream.",
				"A chance meeting opens new doors to success and friendship.", "You learn from your mistakes... You will learn a lot today.","If you have something good in your life, don't let it go!",
				"What ever you're goal is in life, embrace it visualize it, and for it will be yours.", "Your shoes will make you happy today.", "You cannot love life until you live the life you love.",
				"Be on the lookout for coming events; They cast their shadows beforehand.", "Land is always on the mind of a flying bird.", "The man or woman you desire feels the same about you."};
		
	}
	public static FortuneCookie Generate() {
		return new FortuneCookie();
	}
	@Override
	public String toString() {
		return "Un mesaj pentru viitor: " + this.fnlMessage;
	}
}
