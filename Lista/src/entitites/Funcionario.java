package entitites;

public class Funcionario {
	
	private Integer id;
	private String name;
	private Double salary;
	
	public Funcionario(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	
	public Integer getId() {
		return id;
	}
	public String getNome() {
		return name;
	}

	public void setNome(String nome) {
		this.name = nome;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public void aumentoSalario(double porcentage) {
		this.salary *= .01*porcentage;
	}
	
	
	public String toString() {
		return id + ", " + name + ", " + salary + "\n";
	}
}
