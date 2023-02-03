import java.util.Scanner;

public class Atividade12 {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		double custoF, custo;

		System.out.print("Informe o custo de fabrica: ");
		custoF = ent.nextDouble();

		custo = (custoF * 1.45) * 1.28;
		System.out.printf("O carro custa: R$ %.2f", custo);
	}
}
