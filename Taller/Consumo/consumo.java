package Taller;
/** La energía de una empresa se mide hora a hora,de esto se necesita saber:
1.	El consumo por hora , 2.  Consumo por día, 3.  Consumo total del mes (teniendo en cuenta que son de 30 días) 
4.  El consumo está en un rango entre 200 y 400, 5.  Tomar tres meses para la estadística
Generar y programar un algoritmo que permite visualizar lo anterior 
*/
public class consumo {
// hora
	public int [] consumo_hora(int [] time) {
		 for(int i = 0; i < time.length;i++) {
			 time [i] = 200-((int)Math.round(Math.random())*(200-400));
		 }
			return time;
	}
//dia
	public int [] consumo_dia(int [] time,int [] day) {
		 for(int i = 0; i < day.length; i++) {
			 for(int a = 0; a < day.length;a++) {
				 int c = 0 - ((int)Math.round(Math.random())*(0-23));
				 day[i] += time[a];
			 }
		 }
	return day;
	}
//mes
	public int [] consumo_mes(int []month, int []day) {
		for(int i = 0; i <month.length; i++) {
			 for(int a = 0; a < month.length;a++) {
				 int c = 0-((int)Math.round(Math.random())*(0-11));
				 month [i] += day[a];
			 }
		 }
	return month;
	}
prom
}
