
public class Word {
public static void main(String[] args) {
	int n = 10;
	
	for(int i = 0; i < n ; i++)
	{
		for(int j = 0; j< n; j++) {
			if( i == 0 || i == n-1 || j == n / 2)
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.print("   ");
		for(int x = 0; x < n; x++) {
			if(x == 0 || x == n-1 || x == i)
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.print("  ");
		for(int e = 0; e < n; e++) {
			if( e == 0 || i == 0 || i==n/2 || i==n-1)
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.print("   ");
		for(int u = 0; u < n; u++) {
			if( u == 0 && i!= n-1 || u==n-1 && i!=n-1 || i == n-1 && u>=2 && u<=7)
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.print("   ");
		for(int r = 0; r < n; r++) {
			if( i == 0 || i==(n-1)/2 || r==0 || r == (n-1) && i <= (n-1)/2 || i ==r && r!=1 && r!=2 && r!=3)
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.print("   ");
		for(int o = 0; o < n; o++) {
			if( o == 0 && i != 0 && i!=n-1 || o==n-1 && i!=0 && i!=n-1 || i ==0 && o!=0 && o!=n-1 ||  i==n-1 && o!=0 && o!=n-1)
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.print("   ");
		
		for(int f = 0; f < n; f++)
		{
			if(f == 0 || f == n-1 || f == i)
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println( );
	}
}
}
