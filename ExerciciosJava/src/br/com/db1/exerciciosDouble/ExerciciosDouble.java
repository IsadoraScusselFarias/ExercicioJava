package br.com.db1.exerciciosDouble;

public class ExerciciosDouble {
	
	public Double comparacaoNumero(Double valor1, Double valor2){
		return Math.min(valor1, valor2);
	}
	
	public Double comparacaoTresNumeros(Double valor1, Double valor2, Double valor3){
		return Math.min(Math.min(valor1, valor2),valor3);
	}
	
	public Double media(Double valor1, Double valor2, Double valor3){
		return (valor1+valor2+valor3)/3;
	}
	public Double trianguloArea(Double valor1, Double valor2){
		return (valor1*valor2)/2;
	}
			
}
