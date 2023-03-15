import java.util.Scanner;

public class C extends B{
	private float y;
	public C(float y) {
		this.y=y;
	}
	public C() {
		this.y=0;
	}
	public void readY() {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Input y:");
		this.y=scanner.nextFloat();
		//scanner.close();
	}
	//Cum apelez in C functia din clasa A?
	public void displayXYS() {
		super.displayX();
		System.out.println("y="+y);
		super.displayS();
	}
}
