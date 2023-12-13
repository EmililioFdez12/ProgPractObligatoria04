package prog.unidad04.practica406.libreria;

public class Fechaprueba {

	public static void main(String[] args) {
		
	  Fecha fecha1 =  new Fecha(2,2,2020);
    Fecha fecha2 = new Fecha(10,2,2010);
		
//		System.out.println(fecha1.aTexto());
//		
//		System.out.println(fecha1.getDia());
//		System.out.println(fecha1.getMes());
//		System.out.println(fecha1.getAnyo());
//    System.out.println(fecha1.aTexto());
//    System.out.println(fecha2.aTexto());
    
//		System.out.println(fecha1.esBisiesto());
		System.out.println(fecha1.esBisiesto());
		System.out.println(fecha2.esBisiesto());
		
//		System.out.println(fecha1.aTexto());
//		
//		System.out.println(fecha1.diasTranscurridos());
//		
//		try {
//      System.out.println(fecha1.diasEntre(fecha2));
//    } catch (FechaException e) {
//      
//      e.printStackTrace();
//    }
		
		System.out.println(fecha1.compara(fecha2));
	}

}
