package brun.christian.colecciones;

import java.util.List;
import java.util.ArrayList;

public class ArrayLists {

	public static void main(String[] args) {
		
		List<Coche> lista = new ArrayList<Coche>();
		lista.add(new Coche(1,"BMW","320D"));
		lista.add(new Coche(2,"Ford","Mustang"));
		lista.add(new Coche(3,"Tesla","Model S"));
		lista.add(new Coche(4,"Nissan","GT-R"));
		
		
		System.out.println("-----------------FOR---------------");
		//recorrer la lista por indice
		for (int i=0; i<lista.size(); i++) 
		{
			System.out.println("prueba: " + lista.get(i).getMarca() + " - " + lista.get(i).getModelo());
		}
		
		System.out.println("---------------FOREACH-------------");
		//recorrer la lista con foreach
		for (Coche car:lista)
		{
			System.out.println("prueba: " + car.getMarca() + " - " + car.getModelo());
		}
	}

}
