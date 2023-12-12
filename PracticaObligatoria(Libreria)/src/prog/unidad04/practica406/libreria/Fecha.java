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
		//Convierte tres enteros en una fecha
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
	 * 
	 */
	public long diasEntre(Fecha fecha) {
		LocalDate fechaDada = LocalDate.of(this.anyo, this.mes, this.dia);
		LocalDate otraFecha = LocalDate.of(fecha.anyo, fecha.mes, fecha.dia);

		//ChronoUnit cuenta los dias entre la fecha 1900 y la fecha del constructor
		//Utilizo valor absoluto para que siempre de positivo
		long diasEntre = Math.abs(ChronoUnit.DAYS.between(fechaDada, otraFecha));

		return diasEntre;
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

		//Calculamos los dias que hay desde el inicio del calendario con cada fecha, y despues las comparamos entre ellas
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
		return String.format("%d/%02d/%02d", this.anyo, this.mes, this.dia);
	}

}
