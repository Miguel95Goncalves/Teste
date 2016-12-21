package Parte1;

import java.util.Scanner;

public class Exercicio6 {

	public Exercicio6() {
		int num,contador=0;
		
		System.out.println("Introduza o número");
		num = (new Scanner(System.in)).nextInt();
		
		System.out.println("Números primos:");
		for(int i=1;i<=num;i++)
		{
			contador=0;
			for(int j=1;j<=i;j++) if(i%j==0) contador++;
			if(contador==2) System.out.println(i);
		}
	}

}
