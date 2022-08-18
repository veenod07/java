import java.util.Stack;

public class Stream {
	
	static long small(int n) {
		if(n>=0 && n<=9) return n;
		
		Stack<Integer> s= new Stack<>();
		for(int i= 9;i>=2 && n>1 ;i--) {
			if(n%i == 0)
			{
				s.push(i);
				n/=i;
			}
			
		}
		if(n!=1) {
			return -1;
		}
		long k = 0;
		while(!s.empty())
		{
			k = k * 10 + s.peek();
			s.pop();
		}
		return k;
		
	}
	
	public static void main(String[] args) {
		int n = 120;
		System.out.println(small(n));
		
	}

}
