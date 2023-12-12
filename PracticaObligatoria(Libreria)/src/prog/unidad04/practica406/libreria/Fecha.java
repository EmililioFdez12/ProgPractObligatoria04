package prog.unidad04.practica406.libreria;

import java.time.LocalDate;
import java.util.Date;

public class Fecha implements ConvertibleATexto {

  private static int DIA_FECHA_INICIAL = 1;
  private static int MES_FECHA_INICIAL = 1;
  private static int ANYO_FECHA_INICIAL = 1900;

  private int dia;
  private int mes;
  private int anyo;

  public Fecha(int dia, int mes, int anyo) {
    this.dia = dia;
    this.mes = mes;
    this.anyo = anyo;
  }

  /**
   * 
   * @return Dia de la fecha
   */
  public int getDia() {
    return dia;
  }

  /**
   * 
   * @return Mes de la fecha
   */
  public int getMes() {
    return mes;
  }

  /**
   * 
   * @return Año de la fecha
   */
  public int getAnyo() {
    return anyo;
  }

  /**
   * Devuelve si el año es bisiesto o no
   * 
   * @return true si es bisiesto, false si no
   */
  public boolean esBisiesto() {
    if ((this.anyo % 4) == 0) {
      return true;
    } else {
      return false;
    }
  }

  /**
   * Obtiene el numero de dias transcurridos entre la fecha y la fecha de inicio
   * del calendario (1/1/1900)
   * 
   * @return Número de días transcurridos entre esta fecha y la fecha de inicio
   *         del calendario
   */
  public long diasTranscurridos() {
    LocalDate fechaInicial = LocalDate.of(ANYO_FECHA_INICIAL, MES_FECHA_INICIAL, DIA_FECHA_INICIAL);
    LocalDate fechaDada = LocalDate.of(this.anyo, this.mes, this.dia);

    long diasTranscurridos = fechaInicial.until(fechaDada).getDays();

    return diasTranscurridos;
  }

  /**
   * 
   * @param fecha - Otra fecha posterior a esta
   * @return Número de días transcurridos entre esta fecha y la proporcionada
   * 
   */
  public long diasEntre(Fecha fecha) {
    LocalDate fechaDada = LocalDate.of(this.anyo, this.mes, this.dia);
    LocalDate otraFecha = LocalDate.of(fecha.anyo, fecha.mes, fecha.dia);

    long diasEntre = otraFecha.until(fechaDada).getDays();

    return diasEntre;
  }
  
//  public int compara(Fecha fecha) {
//    LocalDate fechaDada = LocalDate.of(this.anyo, this.mes, this.dia);
//    LocalDate otraFecha = LocalDate.of(fecha.anyo, fecha.mes, fecha.dia);
//    LocalDate fechaInicial = LocalDate.of(ANYO_FECHA_INICIAL, MES_FECHA_INICIAL, DIA_FECHA_INICIAL);
//    
//   int fechaConstructor = fechaInicial.until(fechaDada).getDays();
//   int fechaOtra = fechaInicial.until(fechaOtra).getDays();
//     
//   if(fechaConstructor < fechaOtra) {
//     return -1;
//   } else if (fechaConstructor == fechaOtra) {
//     return 0;
//   } else {
//     return 1;
//   }
//   
//  }
  

  @Override
  public String aTexto() {
    // TODO Auto-generated method stub
    return null;
  }

}
