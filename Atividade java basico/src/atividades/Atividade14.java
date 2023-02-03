import java.util.Scanner;

public class Atividade14 {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int A, B;

		System.out.print("Informe um número: ");
		A = ent.nextInt();
		System.out.print("Informe outro número: ");
		B = ent.nextInt();
		System.out.print("O maior número é: " + Math.max(A, B));
	}
}
