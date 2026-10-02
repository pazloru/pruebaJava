package pruebaJava;

import java.util.Scanner;

//Estamos construyendo un conversor que recoge un total de segundos y nos devuelve cuántos días, horas, minutos y segundos son 

public class ConversorSegundos {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int dias=0, horas=0, minutos=0, segundos=0;
		
		//entrada de datos
		System.out.println("Dame segundos: ");
		segundos= scanner.nextInt();

		//algoritmo de conversión con while
		//mientras los segundos sean mayor o igual que 60, haz incremento 1 minuto y quito 60 segundos a t.
		
		while (segundos >= 60) {
			minutos ++ ; //incremento un minuto
			segundos = minutos - 60; //voy restando 60 a los segundos 
		}
		
		while (minutos >= 60) { //mientras minutos sea mayor o igual que 60
			horas ++ ; //incrementa la hora
			minutos = minutos - 60; //voy quitando 60 a los minutos
		}
		
		while (horas >24) {
			dias ++;
			horas -= 24; //esta anotación equivale a "horas = Horas - 24"
		}
		
		System.out.println("Esos segundos son "+dias+" dias, "+horas+" horas, "+minutos+" minutos y "+segundos+" segundos");
		
		scanner.close();
	}

}
