package src;

public class Main {

	public static void main(String[] args) {
		Automotor a1 = new Automotor("las514", "01/01/2002", 5);
		Automotor a2 = new Automotor("las514", "01/01/2002", 15);
		Embarcacion e1 = new Embarcacion("las514", "01/01/2002", 5);
		Embarcacion e2 = new Embarcacion("las514", "01/01/2002", 15);
		Embarcacion e3 = new Embarcacion("las514", "01/01/2002", 50);
		
		System.out.println(a1.calcular());
		System.out.println(a2.calcular());
		System.out.println(e1.calcular());
		System.out.println(e2.calcular());
		System.out.println(e3.calcular());
	}

}
