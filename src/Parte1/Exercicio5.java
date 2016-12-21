package Parte1;

public class Exercicio5 {

	public Exercicio5() {
		int[] valores ={5,2,7};
		int produto=valores[0];
		
		for(int i=1;i<valores.length;i++)
		{
			produto*=valores[i];
		}
		
		System.out.println("O produto dos valores é "+produto);
	}

}
