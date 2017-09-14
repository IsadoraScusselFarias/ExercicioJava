package br.com.db1.exerciciosString;

public class ExerciciosString {
	
	public String stringMaiuscula(String palavra){
		return palavra.toUpperCase();
		
	}
	public String stringMinuscula(String palavra){
		return palavra.toLowerCase();
		
	}
	public Integer stringQuantidade(String palavra){
		return palavra.length();
	}
	public Integer stringQuantidadeEspaco(String palavra){
		String palavraSemEspaco = palavra.trim();
		Integer tamanho = palavra.length();
		
		return tamanho-(tamanho-palavraSemEspaco.length());
	}
	public Integer stringQuantidadeIgual(String palavra){
		String palavraSemEspaco = palavra.replaceAll(" ", "");
		return palavraSemEspaco.length();
	}
	public String stringCortada(String palavra){
		return palavra.substring(0, 4);	
	}
	public String stringCortadaFinal(String palavra){
		return palavra.substring(3, palavra.length());	
	}
	public String stringCortadaFinalQuatro(String palavra){
		return palavra.substring(palavra.length()-4, palavra.length());	
	}
	public String stringNomeAluno(String palavra){
		String[] array = palavra.split(" ");
		return "Aluna " + array[1];
	}
	public String stringFrutasSeparadas(String palavra){
		String[] array = palavra.split(",");
		return  array[0]+" "+array[1]+" "+array[2];
	}
	public Integer stringVogais(String palavra){
		char [] array = palavra.toCharArray();
		Integer cont=0;
		for (Integer i=0;i<palavra.length();i++){
			if((array[i]=='a')||(array[i]=='A')||(array[i]=='e')||(array[i]=='E')||(array[i]=='i')||(array[i]=='I')||(array[i]=='o')||(array[i]=='O')||(array[i]=='u')||(array[i]=='U')){
				cont++;
			}
		}
		return cont;
	}
	public String stringInvertida(String palavra){
		String invertida = new StringBuilder(palavra).reverse().toString();
		return invertida;
	}
	
}
