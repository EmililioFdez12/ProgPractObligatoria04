package prog.unidad04.practica406.libreria;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Clase que representa una Fecha a partir del 1/1/1900
 */
public class Fecha implements ConvertibleATexto {

  private static int DIA_FECHA_INICIAL = 1;
  private static int MES_FECHA_INICIAL = 1;
  private static int ANYO_FECHA_INICIAL = 1900;

  private int dia;
  private int mes;
  private int anyo;

  public Fecha(int dia, int mes, int anyo) {
    if (!comprobarFecha(dia, mes, anyo)) {
      throw new IllegalArgumentException();
    }
      this.dia = dia;
      this.mes = mes;
      this.anyo = anyo;
    

  }

  private boolean comprobarFecha(int dia, int mes, int anyo) {
    if (dia < 1 || mes < 1 || mes > 12 || anyo < 1900) {
      return false;
    }
      int maximoDeDias;

      if (mes == 2) {
          if(esBisiesto()) {
            maximoDeDias = 29;
          } else {
            maximoDeDias = 28;
          }
      } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
          maximoDeDias = 30;
      } else {
          maximoDeDias = 31;
      }

      return dia <= maximoDeDias;
  }


  /**
   * Obtiene el dia
   * 
   * @return Dia de la fecha
   */
  public int getDia() {
    return dia;
  }

  /**
   * Obtiene el mes
   * 
   * @return Mes de la fecha
   */
  public int getMes() {
    return mes;
  }

  /**
   * Obtiene el año
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
    return (this.anyo % 4 == 0 && this.anyo % 100 != 0) || (this.anyo % 400 == 0);
  }

  private boolean comprobarEsBisiesto(int anyo) {
    return (anyo % 4 == 0 && anyo % 100 != 0) || (anyo % 400 == 0);
}


  /**
   * Obtiene el numero de dias transcurridos entre la fecha y la fecha de inicio
   * del calendario (1/1/1900)
   * 
   * @return Número de días transcurridos entre esta fecha y la fecha de inicio
   *         del calendario
   */
  public long diasTranscurridos() {
    long totalDias = 0;

    for (int i = 1900; i < anyo; i++) {
        if (comprobarEsBisiesto(i)) {
            totalDias += 366;
        } else {
            totalDias += 365;
        }
    }

    for (int i = 1; i < mes; i++) {
        if (i == 2) {
            if (comprobarEsBisiesto(anyo)) {
                totalDias += 29;
            } else {
                totalDias += 28;
            }
        } else if (i == 4 || i == 6 || i == 9 || i == 11) {
            totalDias += 30;
        } else {
            totalDias += 31;
        }
    }

    totalDias += (dia - 1);

    return totalDias;
}

  /**
   * 
   * @param fecha - Otra fecha posterior a esta
   * @return Número de días transcurridos entre esta fecha y la proporcionada
   * @throws FechaException
   * 
   */
  public long diasEntre(Fecha fecha) {
    Fecha fecha1 = new Fecha(dia,mes,anyo);
    long diasFecha1 = fecha1.diasTranscurridos();
    
    return diasFecha1;
    
  }

  /**
   * Compara esta fecha con otra
   * 
   * @param fecha Fecha con la que se quiere comparar ésta
   * @return
   */
  public int compara(Fecha fecha) {
    LocalDate fechaDada = LocalDate.of(this.anyo, this.mes, this.dia);
    LocalDate otraFecha = LocalDate.of(fecha.anyo, fecha.mes, fecha.dia);
    LocalDate fechaInicial = LocalDate.of(ANYO_FECHA_INICIAL, MES_FECHA_INICIAL, DIA_FECHA_INICIAL);

    // Calculamos los dias que hay desde el inicio del calendario con cada fecha, y
    // despues las comparamos entre ellas
    long fechaConstructor = Math.abs(ChronoUnit.DAYS.between(fechaDada, fechaInicial));
    long fechaOtra = Math.abs(ChronoUnit.DAYS.between(otraFecha, fechaInicial));

    if (fechaConstructor < fechaOtra) {
      return -1;
    } else if (fechaConstructor == fechaOtra) {
      return 0;
    } else {
      return 1;
    }

  }

  @Override
  public String aTexto() {
    if (this.mes == 1) {
      return String.format("%d de enero de %02d", this.dia, this.anyo);
    } else if (this.mes == 2) {
      return String.format("%d de febrero de %02d", this.dia, this.anyo);
    } else if (this.mes == 3) {
      return String.format("%d de marzo de %02d", this.dia, this.anyo);
    } else if (this.mes == 4) {
      return String.format("%d de abril de %02d", this.dia, this.anyo);
    } else if (this.mes == 5) {
      return String.format("%d de mayo de %02d", this.dia, this.anyo);
    } else if (this.mes == 6) {
      return String.format("%d de junio de %02d", this.dia, this.anyo);
    } else if (this.mes == 7) {
      return String.format("%d de julio de %02d", this.dia, this.anyo);
    } else if (this.mes == 8) {
      return String.format("%d de agosto de %02d", this.dia, this.anyo);
    } else if (this.mes == 9) {
      return String.format("%d de septiembre de %02d", this.dia, this.anyo);
    } else if (this.mes == 10) {
      return String.format("%d de octubre de %02d", this.dia, this.anyo);
    } else if (this.mes == 11) {
      return String.format("%d de noviembre de %02d", this.dia, this.anyo);
    } else if (this.mes == 12) {
      return String.format("%d de diciembre de %02d", this.dia, this.anyo);
    } else {
      throw new IllegalArgumentException();
    }

  }

}
