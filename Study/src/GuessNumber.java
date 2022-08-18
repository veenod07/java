import java.util.*;
import java.lang.*;

class Guesser{
	int in;
	public int guess() {
		System.out.println(" Take your chance and guess the number: ");
		//Scanner s = new Scanner(System.in);
		int in =(int) (Math.random()*10);
		return in;
	}
}

class Player{
	int p;
	static int count = 0;
	public int player() {
		Scanner s = new Scanner(System.in);
		System.out.println("Guess the number"+ ++count);
		int p = s.nextInt();
		return p;
	}
}

class Refree{
	int g1fromg;
	int p1fromp;
	int p2fromp;
	int p3fromp;
	
	public void refree() {
		Guesser gu = new Guesser();
		
		g1fromg = gu.guess();
		Player p1 = new Player();
		p1fromp = p1.player();
		Player p2 = new Player();
		p2fromp = p2.player();
		Player p3 = new Player();
		p3fromp = p3.player();
		
	}
	
	public void compare() {
		if(p1fromp == g1fromg) {
			if(p2fromp == g1fromg && p3fromp == g1fromg)
				System.out.println("Damn ALL of you are Winner's. Sheesh I'm Weak :/ ");
			else if(p3fromp == g1fromg)
				System.out.println("Winner is player1 and player3!!");
			
			else if(p2fromp == g1fromg)
				System.out.println("Winner is player1 and player2!!");
			else
				System.out.println("SedLyf only player1 made to the end!!");
		}
		else if(p2fromp == g1fromg) {
			if(p3fromp == g1fromg)
				System.out.println("Winners are player2 and player3");
			else
				System.out.println("MyMan player2 LuckyAF");
		}
		else if(p3fromp == g1fromg)
			System.out.println("Only player3 gg!!");
		else
			System.out.println("Getgood all of you!!"+" "+g1fromg);
		
	}
}
public class GuessNumber {
public static void main(String[] args) {
	Refree r =new  Refree();
	r.refree();
	r.compare();
	
}
}
