import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Impresora impresora = new Impresora();

        boolean salida = false;

        System.out.println("\n\t==================");
        System.out.println("\tBienvenido usuario");
        System.out.println("\t==================\n");

        while (!salida) {

            System.out.println("\n\t=======================");
            System.out.println("\tUsuario que desea hacer");
            System.out.println("\t=======================\n");

            System.out.println("1. Encender impresora");
            System.out.println("2. Apagar impresora");
            System.out.println("3. Añadir trabajo");
            System.out.println("4. Ver lista de trabajos");
            System.out.println("5. Imprimir");
            System.out.println("6. Salir");

            String option = scanner.nextLine();

            switch (option) {
                case "1":
                    impresora.encenderImpresora();
                    break;

                case "2":
                    impresora.apagarImpresora();
                    break;

                case "3":
                    impresora.añadirTrabajo();
                    break;

                case "4":
                    impresora.verTrabajos();
                    break;

                case "5":
                    impresora.imprimir();
                    break;

                case "6":
                    System.out.println("\nSaliendo del programa...");
                    salida = true;
                    break;
            }
        }
    }
}
