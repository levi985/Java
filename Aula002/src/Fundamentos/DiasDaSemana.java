package Fundamentos;

import java.util.Scanner;

public class DiasDaSemana {

	public static void main(String[] args) {
		Scanner m = new Scanner (System.in);
		System.out.println("Digite um numero para saber o dia da semana entre 1 e 7");
		int n = m.nextInt();
		if (n==1) {
		System.out.println("Monday");
		}else if (n ==2) 
		System.out.println("Twesday");
		else if (n ==3)
		System.out.println("Wensday");
		else if (n ==4)
		System.out.println("thursday");
		else if (n ==5)
		System.out.println("Friday");
		else if (n ==6)
		System.out.println("Saturday");
		else if (n ==7)
		System.out.println("Sunday");
		else
		System.out.println("Número inválido");
		

	}

}
