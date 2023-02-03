import java.util.Scanner;

public class Atividade08 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double cotacao, dolar, real;

		System.out.print("Informe a cotação do dolar: ");
		cotacao = entrada.nextDouble();
		System.out.print("Informe a quantidade de dolares: ");
		dolar = entrada.nextDouble();

		real = dolar * cotacao;

		System.out.printf("Valor em real: %.2f", real);

	}
}
