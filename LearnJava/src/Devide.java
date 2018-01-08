
public class Devide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Devide d = new Devide();

		d.devide(20);
	}

	public void devide(int n) {
		if ((n%3!=0 && n%5==0) || (n%3==0 && n%5!=0)) {
	
				System.out.print("true");
		} else
			System.out.print("false");
	}
}
