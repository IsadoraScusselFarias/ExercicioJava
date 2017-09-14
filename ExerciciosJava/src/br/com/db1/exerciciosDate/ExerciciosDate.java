package br.com.db1.exerciciosDate;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ExerciciosDate {
	public String anoBissexto(Integer ano){
		if((ano%4)==0){
			if((ano%100)!=0){
				return "É ano bissexto.";
			}else{
				if((ano%400)!=0){
					return "Não é bissexto.";
				}else{
					return "É ano bissexto.";
				}
			}	
		}else{
			return "Não é bissexto.";
		}
	}
	
	public String diaUtil(Integer day){
		if((day==7)||(day==1)){
			return "Não é útil.";
		}else{
			return "É útil.";
		}
	}
	
	public String idade(Integer year){
		Calendar ano = new GregorianCalendar();
		return (ano.get(Calendar.YEAR) - year)+" anos";
	}
	public Integer diferencaDias(Integer dia1, Integer dia2){
		return dia2-dia1;
	}
	public Integer diferencaMeses(Integer mes1, Integer mes2){
		return mes2-mes1;
	}
	public Integer diferencaAnos(Integer ano1, Integer ano2){
		return ano2-ano1;
	}
	public Double diferencaHoras(Integer h1,Integer m1, Integer h2, Integer m2){
		return (h2-h1)*60d+(m1+m2);
	}
	
	
}
