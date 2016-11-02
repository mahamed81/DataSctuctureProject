import java.util.Scanner;
public class GameController{
	static Scanner scan = new Scanner(System.in);//new scanner
	public static void main(String[] args) {
		System.out.println("how many players would you like to make?");
		int numberOfPlayers = scan.nextInt();
		group groupA= new group(numberOfPlayers);//group will create a link list of class type Players.
	

	}

}
