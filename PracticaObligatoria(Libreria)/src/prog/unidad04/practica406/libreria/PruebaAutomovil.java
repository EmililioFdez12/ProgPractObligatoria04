package prog.unidad04.practica406.libreria;

public class PruebaAutomovil {

	public static void main(String[] args) {
		
		Fecha fecha1 = new Fecha(1, 1, 2005);

		Motocicleta coche1 = new Motocicleta("1234 ABC", fecha1, 50);
		
		System.out.println(coche1.getCilindrada());
		System.out.println(coche1.aTexto());

	}

}
