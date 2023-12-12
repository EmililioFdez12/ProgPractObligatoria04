package prog.unidad04.practica406.libreria;

public class Fechaprueba {

	public static void main(String[] args) {
		
		Fecha fecha1 = new Fecha(1, 1, 2005);
		Fecha fecha2 = new Fecha(1, 1, 2004);
		
		System.out.println(fecha1.getDia());
		System.out.println(fecha1.getMes());
		System.out.println(fecha1.getAnyo());
		
		System.out.println(fecha1.esBisiesto());
		System.out.println(fecha2.esBisiesto());
		
		System.out.println(fecha1.aTexto());
		
		System.out.println(fecha1.diasTranscurridos());
		
		System.out.println(fecha2.diasEntre(fecha1));
		
		System.out.println(fecha1.compara(fecha2));
	}

}
