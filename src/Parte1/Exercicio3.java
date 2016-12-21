package Parte1;

public class Exercicio3 {

	public Exercicio3() {
		int[] golos = {2, 0, 3, 1};
		double media=0.00;
		
		for(int i=0;i<golos.length;i++)	media+=golos[i];
		media/=4;
		System.out.println("Media de golos: "+media);
		
	}

}
