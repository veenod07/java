
public class ReverseWords {
	public static void main(String[] args) {
		String s = "Hi how you doing";
		String [] a = s.split(" ");
		System.out.println("Before reversing: ");
		for(String v : a)
		{
			System.out.print(v+" ");
		}
		System.out.println();
		System.out.println("XOXOXOXOXOXOXOXO");
		System.out.println("After reversing: ");
		for(int i = a.length - 1; i > 0; i--)
		{
			System.out.print(a[i]+" ");
		}
		
		
	}
}
