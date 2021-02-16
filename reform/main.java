package reform;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner fetch = new Scanner(System.in); // Creating scanner to fetch responses
//		scramble[] accounts = new scramble[100]; // Creating bank account list
//		while (true) { // Program Keeps Running
//			int AccountsCreated = scramble.getNumberOfAccountsCreated(); //Number of accounts created
//			System.out.println(AccountsCreated);
//			
//			System.out.println("Welcome, Please make a selection"); // printing selections
//			System.out.println("1: Encript Message");
//			System.out.println("2: Decript Message");
//			System.out.println("3: Quit");
//			System.out.println("Enter your selection:");
//			
//			int fetch1 = fetch.nextInt(); // Selection input
//			
//			if(fetch1 == 1) { // If creating new account
//				if (AccountsCreated >= 100) {
//					System.out.println("You have the maximim number of accounts we can support."); // over 100 accounts made
//				} else {
//					System.out.println("Please enter this given formation");// Asking/Reciving name and initial balance
//					System.out.println("Name: ");
//					String fetchName = fetch.next();
//					System.out.println("Starting Deposit:");
//					double fetchBalance = fetch.nextDouble();
//					accounts[AccountsCreated] = new scramble(fetchName,fetchBalance);
//					System.out.println("Account for " + fetchName + " created with balance $" + fetchBalance); // Shows that account is created
//					System.out.println("Click any key to go back."); // Function to head back if you want to
//					String backfuntion = fetch.next();
//				}
//				
//			}else if(fetch1 == 2) { // Wanting to view account
//					for (int a = 0; a < AccountsCreated; a++) { // Traversing accounts
//						System.out.println(accounts[a].toString());
//					}
//				System.out.println("All Accounts were shown. Click any key to go back."); // Another back function
//				String backfuntion2 = fetch.next();	
//				} else if (fetch1 == 3) { // Exiting program
//					System.out.println("Do you want to exit?"); // Confirmation with menu
//					System.out.println("1: YES");
//					System.out.println("2. NO");
//					int exitMenu = fetch.nextInt();
//						if(exitMenu == 1) {
//							break; // BREAKS LOOP SO YOU CAN EXIT
//						}else if(exitMenu == 2) {
//							System.out.println("Click any key to go back to Main Menu"); // Back function for people who don't actually want to exit (mistake clicks)
//							String backfuntion3 = fetch.next();
//						} else {
//							System.out.println("INVALID RESPONCE"); // Anything other than 1 or 2 for exit menu
//						}
//				} else {
//					System.out.println("INVALID RESPONCE"); //Anthing other than 1 or 2 or 3 for main menu
//				}
//		}
		
		Scramble code = new Scramble("");
//		for (int i = 0; i < code.messageList.length; i++) {
//			System.out.print(code.messageList[i] + ", ");
//		}
		System.out.println(code.encoder());
				
		//System.out.println(AccountsCreated);
		
	}
	
	

}

