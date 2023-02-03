import java.util.Scanner;

public class Atividade06 {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int A, B, C;
		System.out.print("Informe um valor A: ");
		A = ent.nextInt();
		System.out.print("Informe um valor B: ");
		B = ent.nextInt();

		C = A;
		A = B;
		B = C;
		System.out.println("A: " + A);
		System.out.println("B: " + B);
	}
}
