package Parte1;

import java.util.Scanner;

public class Exercicio4 {

	public Exercicio4() {
		char opc;
		double total=0.00, camisolas=0.00, bilhetes=0.00;
		
		do
		{
			do
			{
				System.out.println("Introduza 'c' se o sócio tiver camisola do clube, 'n' se não tiver e 's' para ver os resultados!");
				opc = (new Scanner(System.in)).next().charAt(0);
			}while(opc!='c' && opc!='n' && opc!='s');
			
			if(opc=='c')
			{
				camisolas+=14.00;
				bilhetes+=7.50;
			}
			if(opc=='n') bilhetes+=7.50;
			
		}while(opc!='s');
		
		total=camisolas+bilhetes;
		
		System.out.println((bilhetes/7.50)+" pessoas compraram ingresso!");
		System.out.println("Com a venda dos bilhetes angariou-se "+bilhetes+"!");
		System.out.println("Com a venda das camisolas angariou-se "+camisolas+"!");
		
	}

}
