import java.util.Scanner;

public class Atividade03 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double km, l, consumo;

		System.out.print("Digite a distância total percorrida em km: ");
		km = entrada.nextDouble();
		System.out.print("Digite a quantidade total de litros consumidos: ");
		l = entrada.nextDouble();

		consumo = km / l;
		System.out.printf("\nO consumo médio do automóvel é: %.1f km/l", consumo);
	}
}
