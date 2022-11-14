import java.util.Scanner;

public class DiceRollApp {

	public static void main(String[] args) {
		
		// This dice game will ask for the user to enter how 
				//many sides the dice should have, and generate a random number
				
				Scanner scnr = new Scanner(System.in);
				
				
				int dice1;
				int dice2;
				int diSides;
				int rollCnt = 0;
				String yesNo;
				
				System.out.println("Welcome to the Grand Circus Casino! ");
				
				System.out.println("\n");
				
				System.out.println("How many sides should each die have?");
				
				diSides = scnr.nextInt();		
				System.out.println("\n");
				
				do {
					
					dice1 = (int) (diSides * Math.random());
					dice2 = (int) (diSides * Math.random());
					
					
					rollCnt++;
					
					System.out.println("Roll " + rollCnt + ":");
					System.out.println(dice1);
					System.out.println(dice2);
					
					scnr.nextLine();
					System.out.println("\n");
					
					System.out.println("Do you want to roll again? (Y/N)");
					yesNo = scnr.nextLine();
					
					if(yesNo.equalsIgnoreCase("N") ) {
						System.out.println("Shucks! Hate to seeyou go, but would love to see you again!");
					}
				
				}while(yesNo.equalsIgnoreCase("Y"));		
				
				scnr.close(); 


	}

}
