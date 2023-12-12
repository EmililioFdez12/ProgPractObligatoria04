package prog.unidad04.practica406.libreria;

public class Vehiculo  { // implements ConvertibleATexto

  protected int Fecha;
  protected String matricula;
  
  protected static int vehiculosMatriculados = 0;

  
  protected Vehiculo(String matricula, Fecha fechaMatriculacion) {
    if(validarMatricula(matricula) == true) {
        vehiculosMatriculados++;
        this.matricula = matricula; 
      }     
    
  }
  
  public Fecha getFechaMatriculacion() {
    return null;
    
  }
  
  
  public String getMatricula() {
    return matricula;
    
  }
  
  public static int getVehiculosMatriculados() {
    return vehiculosMatriculados;
  }
  
  private boolean validarMatricula(String matricula){
        // Expresión regular para el formato NNNN AAA
        String expresionRegular = "\\d{4}\\s*[A-Z]{3}";
        return matricula.matches(expresionRegular);
    }               

}
