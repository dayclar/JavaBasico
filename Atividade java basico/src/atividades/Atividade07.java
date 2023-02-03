import java.util.Scanner;

public class Atividade07 {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);

		System.out.print("Inoforme a temperatura em Celsius: ");
		int C = ent.nextInt();

		int F = (9 * C + 160) / 5;
		System.out.print("Temperafura em Fahrenheit: " + F + " F");

	}
}
