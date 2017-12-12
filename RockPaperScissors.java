import java.util.Scanner;  

public class RockPaperScissors 
{ 
	public static void main(String[] args) 
	{ 
		// user inputs R, P, or S
		String user; 

		// computer R, P, or S
		String computer = "";

		//array used to assign computer value
		String[] randomizer = {"R", "P", "S"};

		//number of games
		int games = 0;
		int current = 0;

		//user scores
		int uScore = 0;

		//computer scores
		int cScore = 0;

		Scanner scan = new Scanner(System.in); 

		System.out.println("Time to play Rock, Paper, Scissors!\n" + "Rock = R, Paper" + "= P, and Scissors = S.\n");
		System.out.println("How many games?\nBest out of: "); 
		games = scan.nextInt();

		//repeats game until best out of "games" is accomplished
		while (current < games) {
			computer = randomizer[(int) (Math.random()*3)];

			//player input 
			System.out.println("\nEnter your play: "); 
			user = scan.next().toUpperCase(); 

			//computer output
			System.out.println("Computer play is: " + computer); 


			//results!
			if (user.equals(computer)) {
				System.out.println("It's a tie! Play again."); 
				current--;
			} else if (user.equals("R")) {
				if (computer.equals("S")) {
					System.out.println("Rock crushes scissors. You win!!");
					uScore++;
				} else if (computer.equals("P")) {
					System.out.println("Paper beats rock. You lose!!"); 
					cScore++;
				}
			} else if (user.equals("P")) {
				if (computer.equals("R")) {
					System.out.println("Paper beats rock. You win!!");
					uScore++;
				} else if (computer.equals("S")) {
					System.out.println("Scissors cut paper. You lose!!"); 
					cScore++;
				}
			} else if (user.equals("S")) {
				if (computer.equals("P")) {
					System.out.println("Scissors cut paper. You win!!");
					uScore++;
				} else if (computer.equals("R")) {
					System.out.println("Rock crushes scissors. You lose!!"); 
					cScore++;
				}
			} else {
				System.out.println("Invalid user input. Try again");
				continue;
			}

			current++;
			System.out.println("Player: " + uScore + ", Computer: " + cScore);

			//stop when score achieved
			if(uScore == (games/2) + 1 || cScore == (games/2) + 1) {
				break;
			}
		}

		//returns winner
		if(uScore > cScore) {
			System.out.println("\nPlayer wins!");
		} else {
			System.out.println("\nComputer wins!");
		}
	}
}