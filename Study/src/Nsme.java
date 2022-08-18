import java.util.Scanner;

public class Nsme {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String n = s.nextLine();
		for(int i = 0; i < n.length(); i++ ) {
			int k = 0;
			while(k<=i) {
				System.out.print(n.charAt(k)+" ");
				k++;
			}
			System.out.println();
			
		}

	}


}
