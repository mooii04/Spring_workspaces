package prueba;

import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	}
	
	public static void saltarTodos(List <PuedeSaltar> lista) {
		
		for (PuedeSaltar puedeSaltar : lista) {
			puedeSaltar.saltarHaciaArriba();
		}
		
	}

}
