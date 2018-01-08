
public class Multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Multiple g = new Multiple();

		g.multiple(38);
	}

	public void multiple(int n) {
		if ((n+1) % 20 == 0 || (n+2) % 20 == 0) {
			System.out.print("true");
		} else {
			System.out.print("false");
		}
	}
}