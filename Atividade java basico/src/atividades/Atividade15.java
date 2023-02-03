import java.util.Scanner;

public class Atividade15 {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int n;

		System.out.print("Informe um número: ");
		n = ent.nextInt();

		if (n >= 100 && n <= 200) {
			System.out.print("O número informado está no intervalo entre 100 e 200");
		}
	}
}
