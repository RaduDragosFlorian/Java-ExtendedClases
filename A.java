import java.util.Scanner;

public class A {
	private int x;
	public A(int x) {
		this.x=x;
	}
	public A() {
		this.x=0;
	}
	public int GetX() {
		return this.x;
	}
	public void displayX() {
		System.out.println("X="+x);
	}
	public void setterX(int x) {
		this.x=x;
	}
	public void readX() {
		Scanner scanner= new Scanner(System.in);
		System.out.print("Input x:");
		setterX(scanner.nextInt());
		//scanner.close();
	}
}
