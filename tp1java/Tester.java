package tp1java;

import java.util.Scanner;

public class Tester{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //solicitar el numero de empleados, es decir la longitud del array
        System.out.println("Digite la cantidad de empleados que desea ingresar: ");
        int cantEmpl = entrada.nextInt();
        
        //crea objetos para la clase empleados
        Empleado persona[] = new Empleado[cantEmpl];

        for (int i = 0; i < persona.length; i++) {
            System.out.println("---------------------------");
            System.out.println("Ingrese los datos del empleado "+(i+1));
            System.out.println("Ingrese numero de legajo:  ");
            int leg = entrada.nextInt();
            System.out.println("Ingrese la cantidad de horas de trabajo: ");
            int canthoras = entrada.nextInt();
            System.out.println("Ingrese el valor que cobra por hora: ");
            float valorhora = entrada.nextFloat();

            persona[i] = new Empleado(leg, canthoras, valorhora);
                       
            //System.out.println("\n"+persona[i].mostrarDatos()+"\n");
        }

        for (Empleado empleado : persona) {
            System.out.println("Legajo del empleado: " + empleado.getLegajo());
            System.out.println("Sueldo del empleado: "+ empleado.obtenerSueldo());
            System.out.println("---------------------------");
        }

        //System.out.println(persona[].mostrardatos);
        //legSueldo = entrada.nextInt();

        //System.out.println("Numero de legajo del empleado: "+empleado1.getLegajo());
        //System.out.println("Sueldo del empleado: $"+obtenerSueldo(empleado1.getCantHoras(), empleado1.getValorHora()));
        entrada.close();

    }
}