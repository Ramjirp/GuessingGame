import java.util.Scanner;

class Welcome
{
	String Player;
	//String Player2;
	
	public String getNames()
	{
		System.out.println("Welcome To The Number Guessing Game");
		System.out.println("Enter Your Name");
		Scanner sc=new Scanner(System.in);
		Player=sc.nextLine();
	//	Player2=sc.nextLine();
		return Player;
	}
}

class Guesser
{
	int GuesserNumber;
	
	public int  guess()
	{
		Scanner sc=new Scanner(System.in);
	System.out.println("Guesser Kindly Guess The Number");	
		GuesserNumber=sc.nextInt();
	  if(GuesserNumber<=10)	  
	  {
		  GuesserNumber=GuesserNumber;
	  }
	  else
	  {
		  System.out.println("Enter The Values Upto The Range Of 0 to 10");
		  guess();
	  }
	  return GuesserNumber;	
	}	
}

class Player
{
	int PlayerNumber;
		
	public int playerGuess()
	{
		Welcome w=new Welcome();
		String h=w.getNames();
	  Scanner sc=new Scanner(System.in);
	  System.out.println(h + " Kindly Guess The Number");
	  PlayerNumber=sc.nextInt();
	  if(PlayerNumber<=10)
	  {
		  PlayerNumber=PlayerNumber;
	  }
	  else
	  {
		  System.out.println("Enter The Values Upto The Range Of 0 to 10");
		 playerGuess();
	  }
	  return PlayerNumber;	
	}	
}

class Umpire
{
	

	int GuessNumber;
	int PlayerNumber1;
	int PlayerNumber2;
		
	public void getGuessNumber()
	{
		Guesser g=new Guesser();
		 GuessNumber=g.guess();
	}
	
	public void getPlayerNumber()
	{
		Player p=new Player();
		PlayerNumber1=p.playerGuess();
 
        Player p1=new Player();
        PlayerNumber2=p.playerGuess();		
	}
	
	public void compare()
	{
		
		if(GuessNumber==PlayerNumber1 && GuessNumber==PlayerNumber2)
		{
			System.out.println("Game Tied");
		}
		else if(GuessNumber==PlayerNumber1)
		{
			System.out.println("player1 Has Won The Match");
		}
		else if(GuessNumber==PlayerNumber2)
		{
			System.out.println("player2 Has Won The Match");
		}	
		else
		{
			System.out.println("OOPS Try Again!....");
		}
	}
}

public class Game {
	public static void main(String[] args) {
	Umpire u=new Umpire();
	u.getGuessNumber();
	u.getPlayerNumber();
	u.compare();	
	}
}
