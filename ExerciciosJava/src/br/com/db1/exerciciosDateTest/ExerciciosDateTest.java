package br.com.db1.exerciciosDateTest;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.exerciciosDate.ExerciciosDate;

public class ExerciciosDateTest {
	ExerciciosDate exercicios = new ExerciciosDate();
	@Test 
	public void anoBissextoTest(){
		Calendar ano = new GregorianCalendar();
		ano.set(2012, 00, 01);
		Assert.assertTrue(exercicios.anoBissexto(ano.get(Calendar.YEAR)).equals("É ano bissexto."));
	}
	@Test 
	public void diaUtilTest(){
		Calendar ano = new GregorianCalendar();
		ano.set(1998, 02, 13);
		Assert.assertTrue(exercicios.diaUtil(ano.get(Calendar.DAY_OF_WEEK)).equals("É útil."));
	}
	@Test 
	public void idadeTest(){
		Calendar ano = new GregorianCalendar();
		ano.set(1998, 02, 13);
		Assert.assertTrue(exercicios.idade(ano.get(Calendar.YEAR)).equals("19 anos"));
	}
	
	@Test 
	public void diferencaDiasTest(){
		Calendar dia1 = new GregorianCalendar();
		Calendar dia2 = new GregorianCalendar();
		dia1.set(1998, 02, 13);
		dia2.set(1998, 02, 19);
		Assert.assertTrue(exercicios.diferencaDias(dia1.get(Calendar.DAY_OF_MONTH),dia2.get(Calendar.DAY_OF_MONTH))==6);
	}
	@Test 
	public void diferencaMesesTest(){
		Calendar mes1 = new GregorianCalendar();
		Calendar mes2 = new GregorianCalendar();
		mes1.set(1998, 02, 13);
		mes2.set(1998, 06, 19);
		Assert.assertTrue(exercicios.diferencaDias(mes1.get(Calendar.MONTH),mes2.get(Calendar.MONTH))==4);
	}
	@Test 
	public void diferencaAnosTest(){
		Calendar ano1 = new GregorianCalendar();
		Calendar ano2 = new GregorianCalendar();
		ano1.set(1998, 02, 13);
		ano2.set(2000, 06, 19);
		Assert.assertTrue(exercicios.diferencaDias(ano1.get(Calendar.YEAR),ano2.get(Calendar.YEAR))==2);
	}
	@Test 
	public void diferencaHoraTest(){
		Calendar hora1 = new GregorianCalendar();
		Calendar hora2 = new GregorianCalendar();
		hora1.set(2017, 02, 13, 01, 30);
		hora2.set(2017, 02, 13, 10, 00);
		Assert.assertTrue(exercicios.diferencaHoras(hora1.get(Calendar.HOUR),hora1.get(Calendar.MINUTE),hora2.get(Calendar.HOUR),hora2.get(Calendar.MINUTE))==570);
	}
	
}
