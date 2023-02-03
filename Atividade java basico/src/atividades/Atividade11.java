import java.util.Scanner;

public class Atividade11 {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		double vlCusto, acrescimo = 0;

		System.out.print("Informe o valor de custo do produto: ");
		vlCusto = ent.nextDouble();
		System.out.print("Informe o valor do acrescimo: ");
		acrescimo = ent.nextDouble();
		acrescimo /= 100;

		acrescimo = vlCusto + (vlCusto * acrescimo);
		System.out.printf("O valor de venda do produto é: %.2f", acrescimo);
	}
}
