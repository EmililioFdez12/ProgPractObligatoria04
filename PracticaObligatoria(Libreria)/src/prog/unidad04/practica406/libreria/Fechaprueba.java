package prog.unidad04.practica406.libreria;

public class Fechaprueba {

	public static void main(String[] args) {
		
	 
    Fecha fecha2 = new Fecha(29,2,2021);
   
		System.out.println(fecha2.getDia());
		System.out.println(fecha2.getMes());
		System.out.println(fecha2.getAnyo());

    System.out.println(fecha2.aTexto());
    
//		System.out.println(fecha1.esBisiesto());
	
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
		
	}

}
