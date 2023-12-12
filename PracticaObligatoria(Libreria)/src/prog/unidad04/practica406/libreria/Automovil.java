package prog.unidad04.practica406.libreria;

import prog.unidad04.practica406.libreria.Vehiculo;

 public class Automovil implements ConvertibleATexto {
   
   protected int plazas;
   protected  String color;
   public static final String COLOR_AZUL = "azul";
   public static final String COLOR_NEGRO = "negro";
   public static final String COLOR_BLANCO = "blanco";
   
   public Automovil(String matricula, Fecha fechaMatriculacion, String color, int plazas) {
     this.color = COLOR_AZUL;
     this.color = COLOR_NEGRO;
     this.color = COLOR_BLANCO;
     this.plazas = plazas;
   }
   
   /**
    * Obtiene el color del automovil
    * @return Color del automovil
    */
   public String getColor() {
     return color;
   }
   
   /**
    * Obtiene el número de plazas del automóvil
    * @return Número de plazas del automóvil
    */
   public int getPlazas() {
     return plazas;
   }
    
  /**
   * Obtiene una representación en texto del automóvil El formato es Matricula: 
   * MMMM, Fecha Matriculacion: FFFF, Color: CCCC, Num. Plazas: PPPPP donde MMMM es la matricula, 
   * FFFF es la fecha de matriculacion, CCCC es el color, PPPP es el número de plazas
   * @return Cadena con la información del objeto en formato texto
   */
  @Override
  public String aTexto() {
    // TODO Auto-generated method stub
    return null;
  }

}
