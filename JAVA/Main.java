package JAVA;

public class Main {
    public static void main(String[] args) {
        int numero1 = 5;
        int numero2 = 10;


// 1. ACCEDER A METODOS  static. Se accede a través de la clase
       int resultado1 = ClaculadoraBasica.suma(numero1, numero2);
       System.out.println(resultado1);

       double resultado2 = ClaculadoraBasica.suma(10.5, 20.5);

       double[] calificaciones = {5, 7, 9, 5, 3, 8};
       double media = CalculadoraAvanzada.media(calificaciones);

       String numero5 = String.valueOf(5);

// 2. ACCEDER A MÉTODOS NO static. Se accede a través de un objeto/variable.
       String texto = new String("Hola mundo");
       texto.length();
       String frase = "Hola muy buenas";
       frase.isEmpty();
    }
    
}
