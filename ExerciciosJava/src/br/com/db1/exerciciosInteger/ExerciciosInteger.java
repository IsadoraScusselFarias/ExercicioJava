package br.com.db1.exerciciosInteger;

public class ExerciciosInteger {
	private Integer resultado;
	public ExerciciosInteger(){
	}
	
	public Integer getResultado() {
		return resultado;
	}
	public void setResultado(Integer resultado) {
		this.resultado = resultado;
	}
		
	public void somar(Integer valor1, Integer valor2){
		resultado=valor1+valor2;
	}
	
	public void subtrair(Integer valor1, Integer valor2){
		resultado=valor1-valor2;
	}
	
	public void dividir(Integer valor1, Integer valor2){
		resultado=valor1/valor2;
	}
	
	public void multiplicar(Integer valor1, Integer valor2){
		resultado=valor1*valor2;
	}
	
	public Integer exibirResultado(){
		return resultado;
	}
	
	public String numeroPar(Integer valor1){
		if (valor1%2==0){
			return "É par";
		}else{
			return "Não é par";
		}
	}
	
	public Integer comparacaoNumero(Integer valor1, Integer valor2){
		if(valor1>valor2){
			return valor1;
		}else{
			return valor2;
		}
	}
	
	public Boolean sequenciaCem(Integer valor){
		if((valor<100)&&(valor>0)){
			
			for(Integer i = valor; i<=100; i++){
				
				if(i%2!=0){
					System.out.print(i+" ");
				}
			}
			
			return true;
		}else{
			return false;
		}
		
	}
	
}
