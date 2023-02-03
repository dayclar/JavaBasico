import java.util.Scanner;

public class Atividade09 {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		double deposito, rendimento;

		System.out.print("Informe o valor do deposito: ");
		deposito = ent.nextDouble();

		rendimento = deposito + (deposito * 0.07);
		System.out.printf("Valor com o rendumento: %.2f", rendimento);
	}
}
