package application;

import java.util.Scanner;

import entities.Retangle;

public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Retangle x = new Retangle();

		System.out.println("Entre com o comprimento e altura: ");
		x.width = sc.nextDouble();
		x.height = sc.nextDouble();
		
		System.out.println(x);
		
		
		
		sc.close();

	}

}
