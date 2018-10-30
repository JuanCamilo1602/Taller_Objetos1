 package Taller;
 /** La energía de una empresa se mide hora a hora,de esto se necesita saber:
 1.	El consumo por hora , 2.  Consumo por día, 3.  Consumo total del mes (teniendo en cuenta que son de 30 días) 
 4.  El consumo está en un rango entre 200 y 400, 5.  Tomar tres meses para la estadística
 Generar y programar un algoritmo que permite visualizar lo anterior 
 */
 public class Ejercicio{
	 public static void main(String []args){
		 consumo br = new consumo(); 
		 int [] time = new int [24];
		 int [] day = new int [30];
		 int [] month = new int [12];
		 
		 time = br.consumo_hora(time);
		 day = br.consumo_dia(time, day);
		 month = br.consumo_mes(day, month);

		for(int i = 0; i < time.length; i++) {
			System.out.println("El consumo a la hora " + (i+1) + "es de: " +time[i]);
		}
		for(int i = 0; i < day.length; i++) {
			System.out.println("El consumo en el dia " + (i+1) + "es de: " +day[i]);
		}
		for(int i = 0; i < month.length; i++) {
			System.out.println("El consumo en el mes " + (i+1) + "es de: " +month[i]);
		}
		int mes1 = 0; int mes2=0 ; int mes3=0;
		for(int i = 0 ; i < 3; i++) {
			 mes1 = 0-((int)Math.round(Math.random())*(0-11));
			 mes2 = 0-((int)Math.round(Math.random())*(0-11));
			 mes3 = 0-((int)Math.round(Math.random())*(0-11));
			 
			System.out.println("Cnosumo mes 1 :" + month[mes1]);
			System.out.println("Cnosumo mes 2 :" + month[mes2]);
			System.out.println("Cnosumo mes 3 :" + month[mes3]);
		}
	
	 }
}
 