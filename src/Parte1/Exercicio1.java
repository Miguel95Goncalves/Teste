package Parte1;

import java.util.Scanner;

public class Exercicio1 {

	public Exercicio1() {
		char[] caracteres = new char[5];
		int contador=0,tamanho=caracteres.length;
		
		System.out.println("Insira 5 caracteres!");
		caracteres = (new Scanner(System.in)).next().toCharArray();
		
		for(int i=0;i<tamanho;i++)
		{
			if(caracteres[i]>=48 && caracteres[i]<=57) contador++;
		}
		
		System.out.println("Você introduzio "+contador+" numeros dentro do tamanho do array!");
		
	}

}
