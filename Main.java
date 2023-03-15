
public class Main {

	public static void main(String[] args) {
		
		A objA= new A();
		objA.readX();
		objA.displayX();
		objA.setterX(2);
		System.out.println("x="+objA.GetX());
		B objB= new B();
		objB.readS();
		objB.displayS();
		objB.displayX();
		C objC= new C();
		objC.readY();
		objC.displayXYS();
		//Atunci cand apelam metoda dintr-o clasa
		//extinsa pentru afisarea valorii
		// atributelor  se foloseste const. default.
	}

}
