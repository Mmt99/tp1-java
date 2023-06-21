import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class testergpt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Empleado> empleados = new ArrayList<>();

        boolean agregarEmpleado = true;
        while (agregarEmpleado) {
            // Solicitar los datos del empleado al usuario
            System.out.print("Ingrese el legajo del empleado: ");
            int legajo = scanner.nextInt();
            System.out.print("Ingrese la cantidad de horas trabajadas: ");
            int horasTrabajadas = scanner.nextInt();
            System.out.print("Ingrese el valor de la hora: ");
            double valorHora = scanner.nextDouble();

            // Crear un objeto de la clase Empleado usando el constructor con un parámetro
            Empleado empleado = new Empleado(legajo);

            // Modificar la cantidad de horas y el valor de la hora usando los métodos establecer
            empleado.establecerHorasTrabajadas(horasTrabajadas);
            empleado.establecerValorHora(valorHora);

            // Agregar el empleado a la lista
            empleados.add(empleado);

            // Preguntar al usuario si desea agregar otro empleado
            System.out.print("¿Desea agregar otro empleado? (S/N): ");
            String respuesta = scanner.next();
            agregarEmpleado = respuesta.equalsIgnoreCase("S");
            /*equalsIgnorecase compara 2 strings ignorando entre mayus y minus, 
            etorna true si los strigs son iguales de lo contrario false */
        }

        // Mostrar la información de todos los empleados
        for (Empleado empleado : empleados) {
            System.out.println("Legajo del empleado: " + empleado.obtenerLegajo());
            System.out.println("Sueldo del empleado: " + empleado.calcularSueldo());
            System.out.println("---------------------------");
        }
        scanner.close();
    }
    
}

class Empleado {
    private int legajo;
    private int horasTrabajadas;
    private double valorHora;

    public Empleado(int legajo) {
        this.legajo = legajo;
    }

    public void establecerHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public void establecerValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int obtenerLegajo() {
        return legajo;
    }

    public double calcularSueldo() {
        return horasTrabajadas * valorHora;
    }
}
