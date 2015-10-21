package rotation;

public class RotationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true)
		{
			try {
				System.out.print("\b|");
				Thread.sleep(500);
				System.out.print("\b\\");
				Thread.sleep(500);
				System.out.print("\b-");
				Thread.sleep(500);
				System.out.print("\b/");
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
