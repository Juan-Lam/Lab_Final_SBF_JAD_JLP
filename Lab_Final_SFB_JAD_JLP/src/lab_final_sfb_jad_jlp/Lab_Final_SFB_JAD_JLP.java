package lab_final_sfb_jad_jlp;

import java.util.Scanner;

public class Lab_Final_SFB_JAD_JLP {

    public static void main(String[] args) {
        Scanner leern = new Scanner(System.in);
        Scanner leerc = new Scanner(System.in);
        int opcion;
        String condicion;

        do {
            System.out.println("Menú");
            System.out.println("1. Micelanea de Juegos.");
            System.out.println("2. Procesos Matematicos.");
            System.out.println("3. Salir.");
            System.out.println("Seleccione una opción:");
            System.out.print("- ");
            opcion = leern.nextInt();
            while (opcion > 3 || opcion < 0) {
                System.out.println("opcion inválida.");
                System.out.println("Vuelva a intentar:");
                System.out.print("- ");
                opcion = leern.nextInt();
            }
            switch (opcion) {
                case 1:
                    do {
                        System.out.println("Micelanea de Juegos");
                        System.out.println("1. Conteniendo Virus.");
                        System.out.println("2. Punto y Fama para Hacking Ético.");
                        System.out.println("3. La Margarita.");
                        System.out.println("0. Regresar al menú principal");
                        System.out.print("Seleccione una opción: ");
                        opcion = leern.nextInt();
                        while (opcion < 0 || opcion > 3) {
                            System.out.println("opcion inválida.");
                            System.out.println("Vuelva a intentar:");
                            System.out.print("- ");
                            opcion = leern.nextInt();
                        }
                        switch (opcion) {
                            case 1:
                                do {
                                    System.out.println("Conteniendo virus");
                                    System.out.println("1. Jugar");
                                    System.out.println("2. Tutorial");
                                    System.out.println("3. Regresar.");
                                    System.out.println("0. Regresar al menú principal");
                                    System.out.println("Seleccione una opción:");
                                    opcion = leern.nextInt();
                                    while (opcion > 3 || opcion < 0) {
                                        System.out.println("opcion inválida.");
                                        System.out.println("Vuelva a intentar:");
                                        System.out.print("- ");
                                        opcion = leern.nextInt();
                                    }
                                    switch (opcion) {
                                        case 1:
                                            do {
                                                System.out.println("En construcción...");
                                                System.out.println("Desea volver a jugar? (si / no)");
                                                System.out.print("- ");
                                                condicion = leerc.next();
                                                condicion = condicion.toLowerCase();
                                                while (!condicion.equals("si") && !condicion.equals("no")) {
                                                    System.out.println("Opción inválida");
                                                    System.out.println("Vuelva a intentar:");
                                                    System.out.print("- ");
                                                    condicion = leerc.next();
                                                    condicion = condicion.toLowerCase();
                                                }
                                            } while (condicion.equals("si"));
                                            break;
                                        case 2:
                                            do {
                                                System.out.println("En construcción...");
                                                System.out.println("Perfecto, ya estás preparado/a para jugar!");
                                                System.out.println("ingresa '0' para volver al menú del juego");
                                                System.out.println("ingresa '1' para volver a hacer el tutorial");
                                                System.out.print("Seleccione una opción:");
                                                condicion = leerc.next();
                                                while (!condicion.equals("1") && !condicion.equals("0")) {
                                                    System.out.println("Opción inválida");
                                                    System.out.println("Vuelva a intentar:");
                                                    System.out.print("- ");
                                                    condicion = leerc.next();
                                                }
                                            } while (condicion.equals("1"));

                                    }
                                } while (opcion < 3 && opcion > 0);
                                break;
                            case 2:
                                do {
                                    System.out.println("Punto y Fama para Hacking Ético");
                                    System.out.println("1. Jugar");
                                    System.out.println("2. Tutorial");
                                    System.out.println("3. Regresar.");
                                    System.out.println("0. Regresar al menú principal");
                                    System.out.println("Seleccione una opción:");
                                    opcion = leern.nextInt();
                                    while (opcion > 3 || opcion < 0) {
                                        System.out.println("opcion inválida.");
                                        System.out.println("Vuelva a intentar:");
                                        System.out.print("- ");
                                        opcion = leern.nextInt();
                                    }
                                    switch (opcion) {
                                        case 1:
                                            do {
                                                System.out.println("En construcción...");
                                                System.out.println("Desea volver a jugar? (si / no)");
                                                System.out.print("- ");
                                                condicion = leerc.next();
                                                condicion = condicion.toLowerCase();
                                                while (!condicion.equals("si") && !condicion.equals("no")) {
                                                    System.out.println("Opción inválida");
                                                    System.out.println("Vuelva a intentar:");
                                                    System.out.print("- ");
                                                    condicion = leerc.next();
                                                    condicion = condicion.toLowerCase();
                                                }
                                            } while (condicion.equals("si"));
                                            break;
                                        case 2:
                                            do {
                                                System.out.println("En construcción...");
                                                System.out.println("Perfecto, ya estás preparado/a para jugar!");
                                                System.out.println("ingresa '0' para volver al menú del juego");
                                                System.out.println("ingresa '1' para volver a hacer el tutorial");
                                                System.out.print("Seleccione una opción:");
                                                condicion = leerc.next();
                                                while (!condicion.equals("1") && !condicion.equals("0")) {
                                                    System.out.println("Opción inválida");
                                                    System.out.println("Vuelva a intentar:");
                                                    System.out.print("- ");
                                                    condicion = leerc.next();
                                                }
                                            } while (condicion.equals("1"));

                                    }
                                } while (opcion < 3 && opcion > 0);
                                break;
                            case 3:
                                do {
                                    System.out.println("La Margarita");
                                    System.out.println("1. Jugar");
                                    System.out.println("2. Tutorial");
                                    System.out.println("3. Regresar.");
                                    System.out.println("0. Regresar al menú principal");
                                    System.out.println("Seleccione una opción:");
                                    opcion = leern.nextInt();
                                    while (opcion > 3 || opcion < 0) {
                                        System.out.println("opcion inválida.");
                                        System.out.println("Vuelva a intentar:");
                                        System.out.print("- ");
                                        opcion = leern.nextInt();
                                    }
                                    switch (opcion) {
                                        case 1:
                                            do {
                                                System.out.println("En construcción...");
                                                System.out.println("Desea volver a jugar? (si / no)");
                                                System.out.print("- ");
                                                condicion = leerc.next();
                                                condicion = condicion.toLowerCase();
                                                while (!condicion.equals("si") && !condicion.equals("no")) {
                                                    System.out.println("Opción inválida");
                                                    System.out.println("Vuelva a intentar:");
                                                    System.out.print("- ");
                                                    condicion = leerc.next();
                                                    condicion = condicion.toLowerCase();
                                                }
                                            } while (condicion.equals("si"));
                                            break;
                                        case 2:
                                            do {
                                                System.out.println("En construcción...");
                                                System.out.println("Perfecto, ya estás preparado/a para jugar!");
                                                System.out.println("ingresa '0' para volver al menú del juego");
                                                System.out.println("ingresa '1' para volver a hacer el tutorial");
                                                System.out.print("Seleccione una opción:");
                                                condicion = leerc.next();
                                                while (!condicion.equals("1") && !condicion.equals("0")) {
                                                    System.out.println("Opción inválida");
                                                    System.out.println("Vuelva a intentar:");
                                                    System.out.print("- ");
                                                    condicion = leerc.next();
                                                }
                                            } while (condicion.equals("1"));
                                    }
                                } while (opcion < 3 && opcion > 0);
                                break;
                        }
                    } while (opcion <= 3 && opcion > 0);
                    break;
            }
            
        } while (opcion >= 0);
        System.out.println("Gracias por usar nuestros servicios. Vuelva pronto!");
    }
}