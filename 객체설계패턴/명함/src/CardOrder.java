/**
 * OOP Assignment One
 * CardOrder class keeps details of one card order
 * and provides methods to print a card 
 * and determine the price
 *
 */
public class CardOrder {
	private Name name;  	//the name printed on the card
	private char border;    //the card border
	private int numCards;   //the number of cards to be printed
	
	private static final int CARD_LEN = 32;  //the length of the card in characters
	
	//initialises name from value in parameter
	//and sets other instance variables to suitable default values
	//you can create a Name from a single string after L5
      //If you want to start before then, just write name = new Name("A", "B", "C") in the constructor!
	public CardOrder(String fullName) {
		border = '*';
		String[] nameArr = fullName.split(" ");
		if (nameArr.length < 3){
			name = new Name(nameArr[0], nameArr[1]);
		} else{
			name = new Name(nameArr[0], nameArr[1], nameArr[2]);
		}
	}
	
	///////////////////////////////////////////
	//accessor/mutator methods
	
	//returns the character used in the border
	public char getBorder() {
		return border;
	}
	
	//sets the character used in the border 
	//to that provided in the parameter
	public void setBorder(char ch) {
		this.border = ch;
	}
	
	//returns the name 
	public Name getName() {
		return name;
	}
	
	//sets the name used in the card
	//to that provided in the parameter
	public void setName(Name name) {
		this.name = name;
	}
	
	//returns the number of cards to be printed
	public int getNumCards() {
		return numCards;
	}
	
	//sets the number of cards to be printed 
	//to that provided in the parameter
	public void setNumCards(int n) {
		this.numCards = n;
	}
	///////////////////////////////////////////
	
	//returns a sample card, including a newline at the end of each line
	public String getSampleCard() {
		return getTopLine() + getBlankLine() + this.getLineWithName()
		       + getBlankLine() + getTopLine();
	}
	
	//returns a String containing the top or bottom line
	//of a card, including a newline character at the end
	private String getTopLine() {
		char[] ToplineChar;
		String Topline;
		if(name.getIsMiddle()){
			ToplineChar = new char[CARD_LEN - 6];
			for(int i=0;i<(CARD_LEN - 6);i++){
				ToplineChar[i] = border;
			}
			Topline = name.getInits() + String.valueOf(ToplineChar) + name.getInits();
		}
		else{
			ToplineChar = new char[CARD_LEN - 4];
			for(int i=0;i<(CARD_LEN - 4);i++){
				ToplineChar[i] = border;
			}
			Topline = name.getInits() + String.valueOf(ToplineChar) + name.getInits();
		}

		return Topline+'\n';
	}
	
	//returns a String containing the blank line
	//of a card, with a border char at each end
	//and including the newline character	
	private String getBlankLine() {	
		//use this value until more code written
		char[] Blankline = new char[CARD_LEN];
		Blankline[0] = border;
		Blankline[CARD_LEN-1] = border;
		for(int i=1;i<CARD_LEN-1;i++)
		{
			Blankline[i]=' ';
		}
		return String.valueOf(Blankline)+'\n';
	}
	
	//returns a String containing the name line
	//of a card, including name, padding and border
	//and including the newline character	
	private String getLineWithName() {
		//use this value until more code written
		String Nameline = name.getFirstName();
		if(name.getMiddleName()==null){
			Nameline += name.getLastName();
		}
		else Nameline = Nameline + ' ' + name.getMiddleName().charAt(0) + ' ' + name.getLastName();

		int size = (CARD_LEN - Nameline.length()) / 2;
		char[] blank = new char[size-1];
		for(int i = 0 ;i < size-1 ; i++)
		{
			blank[i] = ' ';
		}
		if(Nameline.length() % 2 == 0)
		{
			Nameline = String.valueOf(blank) + Nameline + String.valueOf(blank);
		}
		else
		{
			Nameline = String.valueOf(blank) + " " + Nameline + String.valueOf(blank);
		}
		return border + Nameline + border + '\n';
	}
	
	//returns the price of one card
	//in pounds (i,e either 0.20 or 0.25)
	//based on the number of characters in the name to be printed
	//0.20 if <=12 otherwise 0.25
	public double getCardPrice() {
		//use this value until more code written
		double price;
		if (name.getNameLength() > 12)
		{
			price = numCards * 50;
		}
		else {
			price = numCards * 40;
		}
		return price;
	}

	//returns the final cost of the order
	//which is the number of cards multiplied by the card price
	//and reduced by 10% if >= 100 cards
    public double getFinalCost() {
		//use this value until more code written
		double price = getCardPrice()*0.9;
		return price;
    }
    
    //returns true if number of cards < 100, false otherwise
	public boolean hasDiscount() {
		if(numCards >= 200) return true;
		else return false;
	}
}
