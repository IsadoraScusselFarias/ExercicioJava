package br.com.db1.exerciciosDoubleTest;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.exerciciosDouble.ExerciciosDouble;

public class ExerciciosDoubleTest {
	ExerciciosDouble exercicio = new ExerciciosDouble();
	
	@Test 
	public void comparacaoNumeroTest(){
		Assert.assertTrue(exercicio.comparacaoNumero(2d,3d)==2d);
		Assert.assertTrue(exercicio.comparacaoNumero(5d,3d)==3d);
	}
	
	@Test 
	public void comparacaoTresNumerosTest(){
		Assert.assertTrue(exercicio.comparacaoTresNumeros(2d,3d,1d)==1d);
		Assert.assertTrue(exercicio.comparacaoTresNumeros(5d,3d,9d)==3d);
		Assert.assertTrue(exercicio.comparacaoTresNumeros(1d,3d,9d)==1d);
	}
	
	@Test 
	public void mediaTest(){
		Assert.assertTrue(exercicio.media(3d,1d,2d)==2d);
	}
	
	@Test 
	public void trianguloAreaTest(){
		Assert.assertTrue(exercicio.trianguloArea(3d,2d)==3d);
	}
	
	
}
