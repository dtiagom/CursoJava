package application;

import java.util.Scanner;

import entities.Triangulo;

public class Program {
	

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		Triangulo x, y;
		x = new Triangulo();y = new Triangulo();
		
		System.out.println("Entre com os valores do triangulo X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.b = sc.nextDouble();
		System.out.println("Entre com os valores do triangulo Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();

		System.out.printf("A Area do Triando X: %.4f\n", areaX);
		System.out.printf("A Area do Triando y: %.4f\n", areaY);
		
		sc.close();
		
	}

}
