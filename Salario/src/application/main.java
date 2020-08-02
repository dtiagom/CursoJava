package application;

import entities.funcionario;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		

		Scanner sc =  new Scanner(System.in);
		funcionario fun = new funcionario();
		
		System.out.println("Nome: ");
		fun.nome = sc.nextLine();
		System.out.println("Salario Bruto: ");
		fun.salario = sc.nextDouble();
		System.out.println("Taxa: ");
		fun.taxa = sc.nextDouble();
		
		System.out.println("\nFuncionario: " + fun);
		System.out.println("\nQual a porcentagem para aumento de salario? ");
		fun.aumentoSalario(sc.nextDouble());
		System.out.println("\nDado atualizado: " + fun);

		sc.close();
	}

}
