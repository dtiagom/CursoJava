package entities;

public class funcionario {

	public String nome;
	public double salario;
	public double taxa;
	
	public double netSalary() {
		return salario-taxa;
	}
	
	public void aumentoSalario(double porcentagem) {
		salario = salario * (porcentagem/100+1);
	}
	
	public String toString() {
		return nome + ", $" + String.format("%.2f", netSalary());
	}
	
	

}
