package CodigoInicial;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		float SB,AN,HE,D,SL;
		
		Scanner input = new Scanner (System.in);{
		
		System.out.println("\n Digite o sálario bruto: ");
		SB = input.nextFloat();
		
		System.out.println("\n Digite o adicional noturno: ");
		AN = input.nextFloat();
		
		System.out.println("\n Digite as horas extras: ");
		HE = input.nextFloat();
		
		System.out.println("\n Digite o desconto: ");
		D = input.nextFloat();
		}
		
		SL = (SB+AN+HE*5-D);
		System.out.println("\n Sálario líquido: "+SL);
		
		
		

	}

}
