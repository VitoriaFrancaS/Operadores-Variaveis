package CodigoInicial;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		float salario,abono,novoslr;
		
		try (Scanner input = new Scanner(System.in)) {
		
			
			System.out.println("\n Entre com o sálario atual: ");
			salario = input.nextFloat();
			System.out.println("\n Digite o abono: ");
			abono = input.nextFloat();
		}
		
		novoslr = (salario+abono);
		System.out.println("\n Valor do novo sálario:" +novoslr);
		
		
			
		
		
			
			
		
		

	}

}
