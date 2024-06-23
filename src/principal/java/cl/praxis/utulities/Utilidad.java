package cl.praxis.utulities;

import java.util.Scanner;

public class Utilidad {


    public static void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }


    public static void pausarPantalla() {
        System.out.println("Presiona Enter para continuar...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }

    public static void mostrarMensaje() {
        System.out.println("\n"+
                "***=========Bienvenido al sistema de gestion de clientes de la pasteleria 'Bon Bon Jovi'=========***\n"+
                           "***=========****************************************************************************=========***\n");
    }


}
