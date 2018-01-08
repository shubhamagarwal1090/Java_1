
public class Great {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Great g = new Great();

		g.great(3, 4);
	}

	public void great(int n, int m) {
		if (n == 6 || m == 6 || m + n == 6) {
			System.out.print("true");
		} else
			System.out.print("false");
	}
}