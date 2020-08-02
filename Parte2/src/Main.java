import	java.util.Scanner;/*Input teclado*/





public class Main {
	
	static void analisaInteiro() {
		
		Scanner sc =  new Scanner(System.in);
		
		int a;
		a=sc.nextInt();
		
		if (a>0) {
			System.out.println("N�O NEGATIVO");
		}else {
			System.out.println("NEGATIVO");
		}
				
		sc.close();
	}
	
	static void analisaParidade() {
		
		Scanner sc =  new Scanner(System.in);
		
		int a;
		a=sc.nextInt();
		
		if (a%2 == 0) {
			System.out.println("PAR");
		}else {
			System.out.println("IMPAR");
		}
				
		sc.close();
	}
	
	static void analisaMutiplicidade() {
		
		Scanner sc =  new Scanner(System.in);
		
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		
		if (a%b == 0 || b%a == 0 ) {
			System.out.println("S�o Multiplos");
		}else {
			System.out.println("N�o S�o Multiplos");
		}
				
		sc.close();
	}
	
	
	static void contaHoras() {
		
		Scanner sc =  new Scanner(System.in);
		
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		
		/*if (a > b) {
			a=24-a;
		}if (a == b){
			a=24;b=0;
		}if (a < b && b > 12) {
			b=2;
		}
		
		System.out.printf("O jogo durou %d hora(s)", a+b);
		*/
		
		int c;
	
		if(a < b) {
			c = a - b;
		}else {
			c = 24 - a + b;
		}
		
		System.out.printf("O jogo durou " + Math.abs(c) + " hora(s)");
		
		sc.close();
	}
	
	static void compra() {
		
		Scanner sc =  new Scanner(System.in);
		
		int a, b;
		double c;
		a = sc.nextInt();
		b = sc.nextInt();
		
		if (a == 1) {
			c = b*4;
		}else if (a == 2) {
			c = b*4.5;
		}else if (a ==3) {
			c = b*5;
		}else if (a == 4) {
			c = b*2;
		}else {
			c = b*1.5;
		}
		
		System.out.printf("Total: R$ %.2f", c);
		
		sc.close();
	}
	
	static void intervalo() {
		
		Scanner sc =  new Scanner(System.in);
		
		double a;
		a = sc.nextDouble();

		if (a >= 0 && a <= 25) {
			System.out.printf("Intervalo [0,25]");
		}else if (a > 25 && a <= 50) {
			System.out.printf("Intervalo (25,50]");
		}else if (a > 50 && a <= 75) {
			System.out.printf("Intervalo (50,75]");
		}else if (a > 75 && a <= 100) {
			System.out.printf("Intervalo (75,100]");
		}else {
			System.out.printf("Fora do Intervalo");
		}
		
		sc.close();
	}
	
	static void quadrante() {
		
		Scanner sc =  new Scanner(System.in);
		
		double a, b;
		a = sc.nextDouble();
		b = sc.nextDouble();

		if (a >= 0) {
			if(b > 0) {
				System.out.println("Q1");
			}else if (b < 0) {
				System.out.println("Q4");
			}else{
				System.out.println("Origem");
			}
		}else {
			if(b > 0) {
				System.out.println("Q2");
			}else{
				System.out.println("Q3");
			}
		}
		
		sc.close();
	}
	
	static void renda() {
		
		Scanner sc =  new Scanner(System.in);
		
		double renda, t;
		renda = sc.nextDouble();
		
		if (renda >= 0 && renda <= 2000) {
			System.out.println("Isento");
		}else if (renda > 2000 && renda <= 3000){
			t=(renda-2000)*.08;
			System.out.printf("R$ %.2f", t);
		}else if (renda > 3000 && renda <= 4500){
			if(renda-3000 > 0) {
				t = 1000*.08 + (renda-3000)*.18;
			}else {
				t = (renda-2000)*.8;
			}
			System.out.printf("R$ %.2f", t);
		}else{
			System.out.printf("R$ %.2f", 1000*.08 + 1500*.18 + (renda-4500)*.28);
		}
		
		sc.close();
	}
	
	public static void main(String[] args) {
		
		renda();
	}

}
