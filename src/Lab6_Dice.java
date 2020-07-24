import java.util.Random;
import java.util.Scanner;

public class Lab6_Dice {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
			
		String runAgain;
		do {
			System.out.println("How many sided dice? 1 (how), 3, 6, 8 (questionable), 10, 12 (also questionable), or 20.  Everything else is heresy.");
	        int sides = scnr.nextInt(); 
	        
	        int dice1 = generateRandomDieRoll(sides);
	        int dice2 = generateRandomDieRoll(sides);
	        
	        System.out.println("You have rolled a " + dice1 + " and a " + dice2 +".");
	        
	        int total = dice1 + dice2;
	        
	        //this switch works best with 6-sided dice.
	        
	        switch (total) {
	        	case 2:
	        		System.out.println("Perils! and fail to cast.");
	        		break;
	        	case 5:
	        		System.out.println("Barely getting the smite off.");
	        		break;
	        	case 7:
	        		System.out.println("THE BLESSED NUMBER!");
	        		break;
	        	case 8:
	        		System.out.println("Warp time. Death hex.");
	        		break;
	        	case 11:
	        		System.out.println("SUPER SMITE.");
	        		break;
	        	case 12:
	        		System.out.println("S-S-SUPER SMITE AND PERILS.");
	        		break;
	        	default:
	        		System.out.println("deff rolla");
	        }
	        
	        //*** enable this block if you would like to select the number of dice being rolled instead of just two. 
			/*System.out.println("How many dice are you rolling?");
			int numberDice = scnr.nextInt();
			
	        
	        for (int i = 0; i <= numberDice; i++) {
	        System.out.println(generateRandomDieRoll(sides));
	        }*/
	        
	        System.out.println("Keep rolling? y/n");
	        runAgain = scnr.next();
		} while (runAgain.equalsIgnoreCase("y"));
		
			System.out.println("Later, gator.");
	    }
	private static int generateRandomDieRoll(int sides) {
		int roll = (int) (Math.random() * sides) + 1;
		return roll;
	}
}
	
