import java.util.Scanner;

public class Documento {
    private String nombre;
    private String tamaño;

    public Documento() {
    }

    public Documento(String nombre, String tamaño) {
        this.nombre = nombre;
        this.tamaño = tamaño;
    }

    public Documento generarDocumento() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el nombre del trabajo");
        nombre = scanner.nextLine();

        System.out.println("Ahora introduce el tamaño");
        tamaño = scanner.nextLine();

        Documento trabajo = new Documento(nombre, tamaño);

        return trabajo;
    }

    @Override
    public String toString() {
        return "Trabajo --> " +
                "nombre = '" + nombre +
                "  |  tamaño = '" + tamaño;
    }
}
