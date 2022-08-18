
public class Reverse {
public static void main(String[] args) {
	
	
	String a = "Im okay sadly";
	
	String[] s = a.split(" ");
	//System.out.println(s.toString());
	
	for(String v : s)
		System.out.println(v);
	String res = "";
	
	for(int i = 0; i < s.length; i++)
	{
		int j = s[i].length();
		
		while(j-->0) {
			res += s[i].charAt(j);
		}
		res = res + " ";
		
	}
	System.out.print(res);
}
}
