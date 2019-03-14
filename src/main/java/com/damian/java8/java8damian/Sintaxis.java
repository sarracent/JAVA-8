package com.damian.java8.java8damian;

public class Sintaxis {
	
	public double probarSintaxis() {
		
		//Operacion operacion = (double n1, double n2) -> (n1+n2)/2;
		//Operacion operacion = (double n1, double n2) -> {return(n1+n2)/2;};
		/*Operacion operacion = (double n1, double n2) -> {
			double a = 2.0;
			System.out.println(a);
			return (n1 + n2)/2 + a;
		};*/
		Operacion operacion = (n1, n2) -> (n1+n2) / 2;
		return operacion.calcularPromedio(2, 3);	
	}

	public static void main(String[] args) {
		
		Sintaxis app = new Sintaxis();
		System.out.println(app.probarSintaxis());

	}

}
