package entities;

public class aluno {
	
	public String nome;
	public double trimestre1;
	public double trimestre2;
	public double trimestre3;
	
	public double calculaMedia() {
		return trimestre1 + trimestre2 + trimestre3;
	}
	
	public String toString() {
		
		if(calculaMedia()>60) {
			return "\nNota Final = " + calculaMedia() + "\nAprovado";
		}else {
			double falta = 60-calculaMedia();
			return  "\nNota Final = " + calculaMedia() + 
					"\nReprovado\nFalta " + falta + " pontos";
		}
	}
	
}
