
public class Three {
	public static void main(String[] args) 
	{
		
		Three a = new Three();
	
		a.three(3, 5, 1);
	}
		
		
	public void three (int n, int m, int o) {
	   if ( n + m == o || o + m == n || o + n == m)
	 {
		 System.out.print("true");
	 }
	  else  
		  System.out.print("false");
	}
}