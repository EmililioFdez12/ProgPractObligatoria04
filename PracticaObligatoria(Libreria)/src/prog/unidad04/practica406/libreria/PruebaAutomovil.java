package prog.unidad04.practica406.libreria;

public class PruebaAutomovil {

	public static void main(String[] args) {
		
		Fecha fecha1 = new Fecha(1, 10, 2023);

		Automovil coche1 = new Automovil("1234 ABC", fecha1, "azul", 4);
		
		System.out.println(coche1.aTexto());
	}

}
