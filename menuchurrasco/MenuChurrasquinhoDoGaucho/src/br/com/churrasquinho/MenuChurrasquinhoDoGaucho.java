package br.com.churrasquinho;

import java.util.Scanner;

public class MenuChurrasquinhoDoGaucho {
	
	public static void main(String[] args) {
		
		//vou criar o menu do restaurante
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println(" BEM VINDOS AO CHURRASQUINHO DO GA�CHO");
		System.out.println(" O QUE DESEJA COMER?");
		System.out.println(" COMO OP��ES TEMOS: \n1.- CUPIM \n2.-COSTELA DE CARNEIRO \n3.-FRANGO COM BACON \n4.-MOIDA COM BACON");
		int opcionComida = teclado.nextInt();
		
		switch(opcionComida) {
		
		case 1: System.out.println("Ser� servido o CUPIM como comida");
		break;
		case 2: System.out.println("Ser� servida a COSTELA DE CARNEIRO como comida");
		break;
		case 3: System.out.println("Ser� servido o FRANGO COM BACON como comida");
		break;
		case 4: System.out.println("Ser� servido a MOIDA COM BACON como comida");
		break;
		}
		
	}

}
