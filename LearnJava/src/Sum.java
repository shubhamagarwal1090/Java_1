
public class Sum {
	public static void main(String[] args) {

		Sum s = new Sum();

		s.sum(3, 5);
	}

	public void sum(int n, int m) {
		int x = n + m;

		if (x >= 10 && x <= 19) {
			System.out.print("20");
		} else
			System.out.print("" + x);

	}
}