package atividades;

import java.util.Scanner;

// 1. Faça um algoritmo que receba dois números e exiba o resultado da sua soma;
public class Atividade01 {
	 public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("informe o primeiro número:");
		int n1 = entrada.nextInt();
		
		System.out.println("informe o segundo número:");
		int n2 = entrada.nextInt();
		
		int soma = n1 + n2;
		
		System.out.println("A soma dos números é:" + soma);
		
	}

}
