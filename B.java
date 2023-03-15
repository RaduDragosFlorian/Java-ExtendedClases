import java.util.Scanner;

public class B extends A{
	private String S;
	public B(String S) {
		this.SetS(S);
	}
	public B() {
		this.SetS("");
	}
	public void readS() {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Input S:");
		SetS(scanner.nextLine());
		//De ce nu merge cand pun scanner.close();?????
	}
	@Override
	public void displayX() {
		System.out.println("x="+GetX());
	}
	public String GetS() {
		return this.S;
	}
	public void SetS(String S) {
		this.S = S;
	}
	public void displayS() {
		System.out.println("S:"+S);
	}
}
