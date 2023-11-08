package CodigoInicial;

import java.util.Scanner;   

public class Exercicio2 {

	public static void main(String[] args) {
		
		float n1,n2,n3,n4,media;
		
		try(Scanner input = new Scanner (System.in)) {
			System.out.println("\n Digite a primeira nota: ");
			n1= input.nextFloat();
			
			System.out.println("\n Digite a segunda nota: ");
			n2= input.nextFloat();
			
			System.out.println("\n Digite a terceira nota: ");
			n3= input.nextFloat();
			
			System.out.println("\n Digite a quarta nota: ");
			n4= input.nextFloat();	
		}
		
		media = (n1+n2+n3+n4)/4;
		System.out.println("\n Média final:"+media);
	}

}
