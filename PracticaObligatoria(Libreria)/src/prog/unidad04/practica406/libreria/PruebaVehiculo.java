package prog.unidad04.practica406.libreria;

public class PruebaVehiculo {

  public static void main(String[] args) {
  	
  	Fecha fecha1 = new Fecha(1,1,2005);
    
    Vehiculo coche1 = new Vehiculo("1234 ABC", fecha1);
    Vehiculo coche2 = new Vehiculo("1234ABC", fecha1);

    System.out.println(coche1.getMatricula());
    System.out.println(coche1.getFechaMatriculacion().aTexto());
    System.out.println(Vehiculo.getVehiculosMatriculados());
  }

}
