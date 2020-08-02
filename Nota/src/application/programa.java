package application;

import java.util.Scanner;

import entities.aluno;

public class programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		aluno studant = new aluno();
		
		System.out.println("Entre com o nome do aluno: ");
		studant.nome = sc.nextLine();
		System.out.println("Entre com as notas do aluno: ");
		studant.trimestre1 = sc.nextDouble();
		studant.trimestre2 = sc.nextDouble();
		studant.trimestre3 = sc.nextDouble();
		
		System.out.println(studant);
		
		sc.close();

	}

}
