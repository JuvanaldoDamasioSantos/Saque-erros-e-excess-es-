package application;


//import java.util.ArrayList;
//import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Conta;
import model.excetions.Ecessoes;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		
		
		
			System.out.println("Entre com os dados da conta");
			
				System.out.print("Numero: ");
				Integer numero = sc.nextInt();
				sc.nextLine();
				System.out.print("Titular: ");
				String titular =sc.nextLine();
				System.out.print("Balanço inicial: ");
				Double balanco = sc.nextDouble();
				System.out.print("Limite de saque: ");
				double limiteRetirada = sc.nextDouble();
				
				Conta cont = new Conta(numero, titular, balanco, limiteRetirada);
	
			System.out.println();
			System.out.println("digite a quantia que deseja sacar");
			Double quantia = sc.nextDouble();
		try {	
			cont.retirada(quantia);
			System.out.printf("Novo saldo " + String.format("%.2f", cont.getBalanco()));
		
		
		}
		
		catch (Ecessoes e) {
			System.out.println("Erro na transação: " + e.getMessage());
			
		}
		
		catch (RuntimeException e) {
			System.out.println("Erro inesperado");
			
		}
		
		
		sc.close();

	}

}
