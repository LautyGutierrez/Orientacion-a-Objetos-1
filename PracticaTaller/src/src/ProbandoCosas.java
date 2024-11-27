package src;
import java.util.Scanner;
public class ProbandoCosas {
	enum Color {
		ROJO, AMARILLO, VERDE, AZUL, BLANCO, NEGRO
	}
	public static void main(String[] args) {
		double promedio = 7.3;
		String nota = (promedio >= 6.0) ? "Aprobado" : "Desaprobado";
		System.out.println(nota);
		Color color = Color.ROJO;
		for(Color c : Color.values()) {
			System.out.println(c);
		}
		Scanner teclado = new Scanner(System.in);
		int numero = teclado.nextInt();
		System.out.println(numero + numero);
	}

}
