package atividades;

import java.util.Scanner;

// 2. Faça um algoritmo que receba dois números e ao final mostre a soma, subtração, multiplicação e a divisão 
// dos dois números lidos;

public class Atividade02 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o primeiro número: ");
		double n1 = entrada.nextDouble();
		
		System.out.print("Informe o segundo número: ");
		double n2 = entrada.nextInt();
		
		double soma = n1 + n2;
				
		double sub = n1 - n2;
		
		double mult = n1 * n2;
		
		double divisao = n1 / n2;
		
		System.out.println(" A soma dos dois números é: " + soma );
		
		System.out.println(" A subtração do dois números é: " + sub);
		
		System.out.println(" A multiplicação dos dois números é: " + mult);
		
		System.out.println(" A divisão dos dois números é: " + divisao);
		
	}

}
