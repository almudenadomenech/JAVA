import java.util.Scanner;

public class LeerDatos {
    public static void main(String[] args) {
        
        // Clase Scanner
        // TipoDato identificador = new TipoDato();
  
        Scanner scanner= new Scanner(System.in);

        System.out.println("Introduce tu nombre: ");
        String nombre = scanner.nextLine(); // Leer texto
        System.out.println("Tu nombre es: " + nombre);

        System.out.println("Introduce tu apellido: ");
        String apellido = scanner.nextLine(); // Leer texto
        System.out.println("Tu apellido es: " + apellido);

        System.out.println("Introduce tu edad: ");
        int edad = scanner.nextInt();
        System.out.println("Tu edad es: " + edad);

        System.out.println("¿Introduce si esta dado de alta en SS? (true/false): ");
        boolean respuesta = scanner.nextBoolean();
        // Problema, nextBoolean solo lee el booleano y no lee
        // el salto de linea que introduce el usuario
        // Por tanto debemos consumir ese salto de línea pendiente
        scanner.nextLine(); 
        System.out.println("Tu respuesta es: " + respuesta);

        
        System.out.println("Introduce si esta dado de alta en Java (si/no)");
        String isRegistradoJava = scanner.nextLine();
        boolean isRegistradoJavaCurso = false;
        if (isRegistradoJava.equals("si") )
            isRegistradoJavaCurso = true;       
    }
}
