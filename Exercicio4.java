package CodigoInicial;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		float n1,n2,n3,n4,calculo;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("\n Entre com o primeiro valor: ");
		n1 = input.nextFloat();
		
		System.out.println("\n Entre com o segundo valor: ");
		n2 = input.nextFloat();
		
		System.out.println("\n Entre com o terceiro valor: ");
		n3 = input.nextFloat();
		
		System.out.println("\n Entre com o quarto valor: ");
		n4 = input.nextFloat();
		
		calculo = (n1*n2) - (n3*n4);
		System.out.println("\n cauculo final: "+calculo);
		

	}

}
