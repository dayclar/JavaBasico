import java.util.Scanner;

public class Atividade04 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String nome;
		double salario = 0, vendas, salarioF;

		System.out.print("Digite seu nome: ");
		nome = entrada.nextLine();
		System.out.print("Digite o valor do salário fixo: ");
		salario = entrada.nextDouble();
		System.out.print("Digite o valor em dinheiro das vendas: ");
		vendas = entrada.nextDouble();

		salarioF = salario * 1.15;
		System.out.printf("\nNome: %s\nSalário Fixo: R$ %.2f\nSalário Final: R$ %.2f", nome, salario, salarioF);
	}
}
