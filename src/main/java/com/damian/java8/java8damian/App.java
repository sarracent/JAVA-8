package com.damian.java8.java8damian;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
	
	public void ordenar() {
		List<String> lista = new ArrayList<>();
		lista.add("MitoCode");
		lista.add("Code");
		lista.add("Mito");
		
		/*Collections.sort(lista, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
			
		});*/
		
		Collections.sort(lista, (String p1, String p2) -> p1.compareTo(p2));
		
		for (String elemento : lista) {
			System.out.println(elemento);
		}
	}
    
	public void calcular() {
		/*Operacion operacion = new Operacion() {
			
			@Override
			public double calcularPromedio(double n1, double n2) {
				return (n1+n2)/2;
			}
		};
		
		System.out.println(operacion.calcularPromedio(2, 3));*/
		
		Operacion operacion = (double n1, double n2) -> (n1+n2)/2;
		System.out.println(operacion.calcular(2, 3));
	}
	
	public static void main( String[] args ) {
		App app = new App();
		app.ordenar();
		app.calcular();
	}
}
