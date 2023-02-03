import java.util.Scanner;

public class Atividade13 {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int numero;

		System.out.print("Informe um número: ");
		numero = ent.nextInt();

		if (numero > 10) {
			System.out.print("número informado é maior do que 10");
		}
	}
}
