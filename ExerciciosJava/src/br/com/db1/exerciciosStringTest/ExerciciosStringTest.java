package br.com.db1.exerciciosStringTest;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.exerciciosString.ExerciciosString;




public class ExerciciosStringTest {
	
	ExerciciosString exercicio = new ExerciciosString();
	
	@Test 
	public void stringMaiusculaTest(){
		Assert.assertTrue(exercicio.stringMaiuscula("Isadora").equals("ISADORA"));
	}
	
	@Test 
	public void stringMinusculaTest(){
		Assert.assertTrue(exercicio.stringMinuscula("ISADORA").equals("isadora"));
	}
	
	@Test 
	public void stringQuantidadeTest(){
		Assert.assertTrue(exercicio.stringQuantidade("DB1START")==8);
	}
	@Test
	public void stringQuantidadeEspacoTest(){
		Assert.assertTrue(exercicio.stringQuantidadeEspaco(" DB1START ")==8);
	}
	@Test
	public void stringQuantidadeIgualTest(){
		Assert.assertTrue(exercicio.stringQuantidadeIgual(" DB1START ")==exercicio.stringQuantidade("DB1START"));
	}
	@Test 
	public void stringCortadaTest(){
		Assert.assertTrue(exercicio.stringCortada("Isadora").equals("Isad"));
	}
	@Test 
	public void stringCortadaFinalTest(){
		Assert.assertTrue(exercicio.stringCortadaFinal("Isadora").equals("dora"));
	}
	@Test 
	public void stringCortadaFinalQuatroTest(){
		Assert.assertTrue(exercicio.stringCortadaFinalQuatro("Isadora Farias").equals("rias"));
	}
	@Test 
	public void stringNomeAlunoTest(){
		Assert.assertTrue(exercicio.stringNomeAluno("Isadora Farias").equals("Aluna Farias"));
	}
	@Test 
	public void stringFrutasSeparadasTest(){
		Assert.assertTrue(exercicio.stringFrutasSeparadas("banana, maçã, melancia").equals("banana  maçã  melancia"));
	}
	@Test 
	public void stringVogaisTest(){
		Assert.assertTrue(exercicio.stringVogais("Isadora")==4);
	}
	@Test 
	public void stringInvertidaTest(){
		Assert.assertTrue(exercicio.stringInvertida("Isadora").equals("arodasI"));
	}
	
	
	
	
	
	
}
