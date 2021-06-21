/*
 * OOP Assignment 1
 * Contains methods for interaction with user
 */
import java.util.InputMismatchException;
import java.util.Scanner;
public class CardInteraction {
	private Scanner scanner;
	private CardOrder card;
	
	public CardInteraction() {
		scanner = new Scanner(System.in);
	}
	
	//runs the program as follows:
	//Gets details of card name from user
	//Displays card
	//Repeatedly, until user responds ok
	//	Asks the user if they would like to change the border
	//	If so, change the border and print the new card
	//Print the price of the order
	//print whether a discount is applicable or not
	public void run() {
		//Alter this gradually to add more details
		String name = getNameFromUser();
		CardOrder order = new CardOrder(name);

		System.out.println("Here is a sample card : ");
		System.out.println(order.getSampleCard());

		System.out.print("Enter 'OK' if this card is ok, otherwise enter an alternative border character : ");
		String border = scanner.nextLine();


		while (!border.equals("OK")) {
			order.setBorder(border.charAt(0));
			System.out.println("Here is a sample card : ");
			System.out.println(order.getSampleCard());

			System.out.print("Enter 'OK' if this card is ok, otherwise enter an alternative border character : ");
			border = scanner.nextLine();
		}

		order.setNumCards(getNumberFromUser());

		System.out.print("\nThe price of " + order.getNumCards() + " cards is ");
		if (order.hasDiscount()) {
			System.out.println((int) order.getFinalCost() + " won.\n10% discount applied");
		} else{
			System.out.println((int)order.getCardPrice()+" won.\n No discount given");
		}
	}

	//repeatedly requests and reads name from user
	//until valid (i.e. <=28 chars and contains at least one space
	//finally returns the valid text
	private String getNameFromUser() {
		//use this value until more code written
		boolean blankChecker = false;
		boolean lengthCheck = false;
		String name;
		while (true) {
			System.out.print("Enter name : ");
			name = scanner.nextLine();

			for (int i = 0; i < name.length(); i++) {
				if (name.charAt(i) == ' ') {
					blankChecker = true;
					break;
				} else {
					blankChecker = false;
				}
			}

			if(name.length() > 28)
				lengthCheck = false;
			else
				lengthCheck = true;

			if(blankChecker == true && lengthCheck == true)
			{
				break;
			}
			System.out.println("잘못된 형식의 입력입니다. 지정된 형식에 맞추어 다시 입력해주세요.\n");
		}
		return name;
	}
	
	//repeatedly requests and reads number from user
	//until valid number entered i.e. between 1 and 1000
	//finally returns the valid number	
	private int getNumberFromUser() {
		//use this number until more code written
		int count;
		while (true){
			while (true){
				System.out.print("\nHow many cards would you like? ");
				try {
					count = scanner.nextInt();
					break;
				}
				catch (InputMismatchException e){
					scanner = new Scanner(System.in);
					System.out.println("정수만 입력할 수 있습니다.");
				}
			}
			if(1<=count && count<=1000){
				break;
			}
			else {
				System.out.println("수량은 1개이상 1000개 이하로 입력해주세요.");
			}
		}
		return count;
	}
	

}


