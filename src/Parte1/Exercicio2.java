package Parte1;

import java.util.Scanner;
import java.util.Random;

public class Exercicio2 {

	public Exercicio2() {
		int aux,cont=0;
		char aposta;
		
		Random rand = new Random();
		int numAleatorio = rand.nextInt(10);
		
		do
		{
			System.out.println("Número aleatório: "+numAleatorio);
			System.out.println("Intorduza 'c' para apostar num número acima e 'b' para apostar num número abaixo");
			aposta = (new Scanner(System.in)).next().charAt(0);
			
			aux=numAleatorio;
			
			numAleatorio = rand.nextInt(10);
			
			if (aposta=='c' && numAleatorio>aux || aposta=='b' && numAleatorio<aux) cont++;
			
		}while(aposta=='c' && numAleatorio>aux || aposta=='b' && numAleatorio<aux);
		
		System.out.println("Número aleatório: "+numAleatorio);
		
		System.out.println("Acertou "+cont+" vezes!");
	}

}
