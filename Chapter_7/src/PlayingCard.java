public interface PlayingCard {
	public static final int SPACE = 4;
	final int DIAMOND = 3;	//public static final int DIAMOND = 3;
	static int HEART = 2;	//public static final int HEART = 2;
	int CLOVER = 1;			//public static fianl int CLOVER = 1;
	
	public abstract String getCardNumber();
	String getCardKind();	//public abstract String getCardKind();
}
