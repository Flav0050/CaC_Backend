package ar.com.codoacodo.entity;

import java.time.LocalDate;

public class MainOrador {

	public static void main(String[] args) {

		//Creamos un objetos de orador, despues lo metemos en la base de datos
		Orador nuevoOrador = new Orador("carlos", "lopez", "email@email.com", "JAVA", LocalDate.now()); 
		
		
		System.out.println(nuevoOrador);
	}

}
