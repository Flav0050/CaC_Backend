package ar.com.codoacodo.repository;

import java.time.LocalDate;
import java.util.List;

import ar.com.codoacodo.entity.Orador;

public class MainOradorRepository {

	 public static void main(String[] args) {
		
		 //Interface i = new ClaseQueImplementa();
		 OradorRepository repository = new MySqlOradorRepository();
		 
		 //repository.save(new Orador("juan", "perez", "jua@mail.com", "php", LocalDate.now()));
		 
		 //elimino a juan!!!
		 //Orador carlos =repository.getById(3L);
		 
		 //carlos.setApellido("perez");
		 //carlos.setNombre("martin");
		 //carlos.setTema("c#");
		 
		 //repository.update(carlos);
		 
		 // Orador steveJobs = new Orador("Steve", "Jobs", "steve.jobs@gmail.com", "Tecnología", LocalDate.now());
		 // repository.save(steveJobs);

	        // Crear y guardar Bill Gates
		 //  Orador billGates = new Orador("Bill", "Gates", "bill.gates@gmail.com", "Software", LocalDate.now());
		 //  repository.save(billGates);

	        // Crear y guardar Ada Lovelace
		 //   Orador adaLovelace = new Orador("Ada", "Lovelace", "ada.lovelace@gmail.com", "Matemáticas", LocalDate.now());
		 //   repository.save(adaLovelace);
		 
		 System.out.println(repository.findAll());
		 
	}
}
