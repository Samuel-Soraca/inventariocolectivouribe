package org.example.samuelsoraca;

import java.util.Scanner;

public class inventario {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner keyEnter = new Scanner(System.in);
        Integer menuOpcion=null;

        String ANSI_AZUL = "\u001B[32m";

        System.out.println(ANSI_AZUL + "\n ******************************");
        System.out.println("*********📩Grupo uribe📩*********");
        System.out.println("******************************");

        String ANSI_RESET = "\u001B[0m";

        String ANSI_VERDE = "\u001B[35m";

        System.out.println(ANSI_VERDE + "\n👋Bienvenido a gestor de prendas...👋\n");
        System.out.println("¿Que quieres realizar?");
        System.out.println("1 - GUARDAR UNA PRENDA ✔");
        System.out.println("2 - MOSTRAR EL INVENTARIO DE PRENDAS 📦");
        System.out.println("3 - MODIFICAR LOS DATOS DE UNA PRENDA✍");
        System.out.println("4 - BORRAR UNA PRENDA DEL SISTEMA 🗑");
        System.out.println("5 - SALIR❌");
    }

}
