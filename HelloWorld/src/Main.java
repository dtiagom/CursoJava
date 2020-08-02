import	java.util.Scanner;/*Input teclado*/


public class Main {
	
	static void Soma() {
	
		Scanner scan = new Scanner(System.in);	
		
		int a,b;
		a = scan.nextInt();
		b = scan.nextInt();
		
		System.out.printf("SOMA = %d\n", a+b);
		
		scan.close();
		
	}
	
	static void areaCirculo() {
		
		Scanner scan = new Scanner(System.in);	
		
		double r, pi=3.14159;
		r = scan.nextDouble();
		
		System.out.printf("A = %.4f\n", pi*Math.pow(r, 2));
		
		scan.close();
		
	}
	
	static void diferencia() { 
		
		Scanner scan = new Scanner(System.in);	
		
		int A, B, C, D;
		A = scan.nextInt();
		B = scan.nextInt();
		C = scan.nextInt();
		D = scan.nextInt();
		
		System.out.printf("DIFERENCA = %d\n", A*B-C*D);
		
		scan.close();
		
	}
	
	static void salario() { 
		
		Scanner scan = new Scanner(System.in);	
		
		int number, hour;
		float price;
		number = scan.nextInt();
		hour = scan.nextInt();
		price = scan.nextFloat();
		
		System.out.printf("NUMBER = %d\n", number);
		System.out.printf("SALARY =  %.2f\n", price*hour);
		
		scan.close();
		
	}
	
	static void compra() { 
		
		Scanner scan = new Scanner(System.in);	
		
		int item1, quantity1, item2, quantity2;
		float price1, price2;
		item1 = scan.nextInt();
		quantity1 = scan.nextInt();
		price1 = scan.nextFloat();
		item2 = scan.nextInt();
		quantity2 = scan.nextInt();
		price2 = scan.nextFloat();
		
		System.out.printf("VALOR A PAGAR = R$ %.2f\n", quantity1*price1+quantity2*price2);
		
		scan.close();
	}
	
	static void area() {
		
		Scanner scan = new Scanner(System.in);	
		
		double a, b, c, pi=3.14159;
		a = scan.nextDouble();
		b = scan.nextDouble();
		c = scan.nextDouble();
		
		System.out.printf("TRIANGULO = %.3f\n", a*c/2);
		System.out.printf("CIRCULO = %.3f\n", pi*Math.pow(c, 2));
		System.out.printf("TRAPEZIO = %.3f\n", (a+b)*c/2);
		System.out.printf("QUADRADO = %.3f\n", Math.pow(b, 2));
		System.out.printf("RETANGULO = %.3f\n", a*b);
		
		scan.close();
		
	}
	
	public static void main(String[] args) {
					
		area();
				
	}
}