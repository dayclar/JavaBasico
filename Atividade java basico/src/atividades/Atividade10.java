import java.util.Scanner;

public class Atividade10 {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		double compra, prestacao;

		System.out.print("Informe o valor da compra: ");
		compra = ent.nextDouble();

		prestacao = compra / 5;
		System.out.printf("Valor das prestações: %.2f", prestacao);

	}
}
