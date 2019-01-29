import java.util.Scanner; //for keyboard
import java.text.DecimalFormat; // for the decimals
public class Population {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		double startingAmount = 0.0; //saving the starting amount of organisms 
		double growthRate = 0.0; //the percentage of the growth rate
		int dayz = 0; //records the days that the organisms will grow in 
		 
		
		do { //asks for starting organisms amount and does not stop till it is >= 2
		System.out.println("What is the starting Number of Organisms (>2)");
		startingAmount = kb.nextDouble();
		}while(startingAmount < 2);
		
		do { //asks for the population growth rate in decimal form which will then be /100 to get 0.0000
			System.out.println("What is the average daily percentage increase");
			growthRate = kb.nextDouble();
		}while(growthRate <= 0);
		
		growthRate = growthRate/100; //changing it into decimal form 
		
		do {
			System.out.println("How many days will the organisms be growing for: ");
			dayz = kb.nextInt();
		}while(dayz <= 0);
		
		DecimalFormat df = new DecimalFormat("###.##"); // for the decimal places
		
		for(int i=1; i<=dayz; i++) {
			startingAmount = (startingAmount * growthRate) + startingAmount ;
			System.out.println("On Day "+ i + " the population increased to " + df.format(startingAmount));
		}
		
		kb.close();
	}

}
