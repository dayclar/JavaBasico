import java.util.Scanner;

public class Atividade05 {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		String nome;
		Double[] n = new Double[3];

		System.out.print("Informe seu nome: ");
		nome = ent.nextLine();
		System.out.print("Informe a primeira nota: ");
		n[0] = ent.nextDouble();
		System.out.print("Informe a segunda nota: ");
		n[1] = ent.nextDouble();
		System.out.print("Informe a terceira nota: ");
		n[2] = ent.nextDouble();

		Double media = (n[0] + n[1] + n[2]) / 3;
		System.out.printf("Nome do aluno: %s\nMédia: %.1f", nome, media);
	}
}
