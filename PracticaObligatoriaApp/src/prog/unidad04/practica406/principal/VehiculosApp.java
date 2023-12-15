package prog.unidad04.practica406.principal;

import java.util.Scanner;

import prog.unidad04.practica406.libreria.Automovil;
import prog.unidad04.practica406.libreria.Fecha;
import prog.unidad04.practica406.libreria.Motocicleta;

public class VehiculosApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("PRÁCTICA DE EMILIO FERNÁNDEZ GALLARDO. GESTIÓN DE VEHÍCULOS");
    // Pedida de datos de automovil
    System.out
        .print("Introduce la matricula del automovil" + "(4 números, 0 o mas espacios y tres letras mayusculas): ");
    String matriculaAutomovil = sc.nextLine();
    System.out.print("Introduzca el día de la fecha de matriculación del automovil: ");
    int diaMatriculacionAutomovil = Integer.parseInt(sc.nextLine());
    System.out.print("Introduzca el mes de la fecha de matriculación del automovil: ");
    int mesMatriculacionAutomovil = Integer.parseInt(sc.nextLine());
    System.out.print("Introduzca el año de la fecha de matriculación del automovil: ");
    int añoMatriculacionAutomovil = Integer.parseInt(sc.nextLine());
    System.out.print("Introduzca el color del automovil: ");
    String colorAutomovil = sc.nextLine();
    System.out.print("Introduzca el número de plazas del vehículo: ");
    int plazasAutomovil = Integer.parseInt(sc.nextLine());

    // Pedida de datos de la moto
    System.out.println(
        "Introduce la matricula de la motocicleta" + "(4 números, 0 o mas espacios y tres letras mayusculas): ");
    String matriculaMoto = sc.nextLine();
    System.out.println("Introduzca el día de la fecha de matriculación del automovil: ");
    int diaMatriculacionMoto = Integer.parseInt(sc.nextLine());
    System.out.println("Introduzca el mes de la fecha de matriculación del automovil: ");
    int mesMatriculacionMoto = Integer.parseInt(sc.nextLine());
    System.out.println("Introduzca el año de la fecha de matriculación del automovil: ");
    int añoMatriculacionMoto = Integer.parseInt(sc.nextLine());
    System.out.print("Introduzca la cilindrada de la motocicleta: ");
    int cilindradaMoto = Integer.parseInt(sc.nextLine());

    // Creo la fecha del coche y el coche
    Fecha fechaMatriculacionCoche = new Fecha(diaMatriculacionAutomovil, mesMatriculacionAutomovil,
        añoMatriculacionAutomovil);
    Automovil coche = new Automovil(matriculaAutomovil, fechaMatriculacionCoche, colorAutomovil, plazasAutomovil);

    // Creo la fecha de la moto y la moto
    Fecha fechaMatriculacionMoto = new Fecha(diaMatriculacionMoto, mesMatriculacionMoto, añoMatriculacionMoto);
    Motocicleta moto = new Motocicleta(matriculaMoto, fechaMatriculacionMoto, cilindradaMoto);

    System.out.println("Datos de Automóvil: " + coche.aTexto());
    System.out.println("Datos de Motocicleta: " + moto.aTexto());

  }

  public String ConvertibleATexto() {
    return null;
  }

}
