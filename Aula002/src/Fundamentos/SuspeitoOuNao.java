package Fundamentos;
import java.util.Scanner;
public class SuspeitoOuNao {
	public static void main(String[] args) {
		Scanner m = new Scanner(System.in);
		System.out.println("Para todas as perguntas responda 1-Sim  e 0-Não" );
		int resp = 0;
		System.out.println("==============================================================");
		System.out.println("Telefonou Para a vítima?: ");
		resp += m.nextInt();
		System.out.println("Esteve no local do crime?: ");
		resp += m.nextInt();
		System.out.println("Mora perto da vítima?: ");
		resp += m.nextInt();
		System.out.println("Devia para a vítima?: ");
		resp += m.nextInt();
		System.out.println("Já trabalhou com a vítima?: ");
		resp += m.nextInt();
		
		
		//USANDO IF-ELSE
		/*========================================
		if (resp <= 2)
			System.out.println("Suspeito");
		else if (resp ==3 || resp == 4)
				System.out.println("Cúmplice");
		else if (resp >=5)
			System.out.println("Assassino");
		else 
			System.out.println("Inocente");
		*///=======================================
		//USANDO SWITCH-CASE
		
		
        switch (resp) {
        case 2:
        case 1:
        case 0:
            System.out.println("Inocente");
            break;
        case 3:
        case 4:
            System.out.println("Cúmplice");
            break;
        case 5:
            System.out.println("Assassino");
            break;
        default:
            System.out.println("Suspeito");
    }
		
	}

}
