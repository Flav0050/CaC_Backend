package ar.com.codoacodo;

public class MainAuto {

	public static void main(String[] args) {

		Auto clio = new Auto("renault",
				"clio",
				"azul",
				2020,
				"abc123",
				3f);
		
		clio.encender();
		
		clio.acelerar();
		
		clio.frenar();
		clio.frenar();
	}

}
