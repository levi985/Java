package Fundamentos;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner m = new Scanner(System.in);
		System.out.println("Digite F-Feminino ou M-Masculino: ");
		char sexo = m.next().charAt(0);
		if (sexo == 'M' || sexo == 'm' ) 
			System.out.println("Sexo Maculino ");
		else if (sexo == 'F' || sexo == 'f') 
			System.out.println("Sexo Feminino");
		else 
			System.out.println("Invalido");
				

	}

}
