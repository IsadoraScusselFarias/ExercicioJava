package br.com.db1.exerciciosIntegerTest;

import org.junit.Assert;

import org.junit.Test;

import br.com.db1.exerciciosInteger.ExerciciosInteger;

public class ExerciciosIntegerTest {
	ExerciciosInteger exercicio = new ExerciciosInteger();
	
	
	@Test
	public void somarTest(){
		exercicio.somar(1,2);
		Assert.assertTrue(exercicio.exibirResultado()==3);
		exercicio.somar(5,5);
		Assert.assertTrue(exercicio.exibirResultado()==10);
		
	}
	@Test
	public void subtrairTest(){
		exercicio.subtrair(1,2);
		Assert.assertTrue(exercicio.exibirResultado()==-1);
		exercicio.subtrair(5,5);
		Assert.assertTrue(exercicio.exibirResultado()==0);
		
	}
	@Test
	public void dividirTest(){
		exercicio.dividir(4,2);
		Assert.assertTrue(exercicio.exibirResultado()==2);
		exercicio.dividir(5,5);
		Assert.assertTrue(exercicio.exibirResultado()==1);
		
	}
	@Test
	public void multiplicarTest(){
		exercicio.multiplicar(4,2);
		Assert.assertTrue(exercicio.exibirResultado()==8);
		exercicio.multiplicar(5,5);
		Assert.assertTrue(exercicio.exibirResultado()==25);
		
	}
	
	@Test 
	public void numeroParTest(){
		Assert.assertTrue(exercicio.numeroPar(2).equals("É par"));
		Assert.assertTrue(exercicio.numeroPar(3).equals("Não é par"));
	}
	
	@Test 
	public void comparacaoNumeroTest(){
		Assert.assertTrue(exercicio.comparacaoNumero(2,3)==3);
		Assert.assertTrue(exercicio.comparacaoNumero(5,3)==5);
	}
	
	@Test
	public void sequenciaCemTest(){
		Assert.assertTrue(exercicio.sequenciaCem(101)==false);
		Assert.assertTrue(exercicio.sequenciaCem(50)==true);	
	}
	

}
