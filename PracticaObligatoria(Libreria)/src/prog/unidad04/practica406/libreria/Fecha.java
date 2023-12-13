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

    switch (mes) {
    case 2:
      maximoDeDias = esBisiesto() ? 29 : 28;
      break;
    case 4:
    case 6:
    case 9:
    case 11:
      maximoDeDias = 30;
      break;
    default:
      maximoDeDias = 31;
    }
    return true;
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
    if ((this.anyo % 4 == 0 && this.anyo % 100 != 0)) {
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
    // Convierte tres enteros en una fecha
    LocalDate fechaInicial = LocalDate.of(ANYO_FECHA_INICIAL, MES_FECHA_INICIAL, DIA_FECHA_INICIAL);
    LocalDate fechaDada = LocalDate.of(this.anyo, this.mes, this.dia);

    // ChronoUnit cuenta los dias entre la fecha 1900 y la fecha del constructor.
    long diasTranscurridos = ChronoUnit.DAYS.between(fechaInicial, fechaDada);

    return diasTranscurridos;
  }

  /**
   * 
   * @param fecha - Otra fecha posterior a esta
   * @return Número de días transcurridos entre esta fecha y la proporcionada
   * @throws FechaException
   * 
   */
  public long diasEntre(Fecha fecha) {
    LocalDate fechaDada = LocalDate.of(this.anyo, this.mes, this.dia);
    LocalDate otraFecha = LocalDate.of(fecha.anyo, fecha.mes, fecha.dia);

    if (otraFecha.isBefore(fechaDada)) {
      throw new FechaException();
    }
    return ChronoUnit.DAYS.between(fechaDada, otraFecha);
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
