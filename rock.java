
package bruh;

import java.util.Scanner;

public class rock{

public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	String userChoice;
	System.out.print("rock, paper, or scissors");
	userChoice= sc.nextLine();

	System.out.println(userChoice);
	String computer;
	double computerChoice = Math.random();
	if (computerChoice < 0.34) {
	    computer = "rock";
	} else if(computerChoice <= 0.67) {
	    computer = "paper";
	} else {
	    computer = "scissors";
	}
	
	System.out.println("The computer chose " + computer);
	if(userChoice.equals(computer)) {
		System.out.println("Congratulations its a tie!");
	}
	if(userChoice.equals("rock") && computer.equals("scissors")){
		System.out.println("Congratulations, you win!");

	}
	if(userChoice.equals("rock") && computer.equals("paper")){
		System.out.println("Unfortunately, you lose!");

	}
	if(userChoice.equals("paper") && computer.equals("scissors")){
		System.out.println("Unfortunately, you lose!");

	}
	if(userChoice.equals("paper") && computer.equals("rock")){
		System.out.println("Congratulations, you win!");

	}
	if(userChoice.equals("scissors") && computer.equals("rock")){
		System.out.println("Unfortunately, you lose!");

	}
	if(userChoice.equals("scissors") && computer.equals("paper")){
		System.out.println("Congratulations, you win!");

	}
	
	
	
	
	

}
}
