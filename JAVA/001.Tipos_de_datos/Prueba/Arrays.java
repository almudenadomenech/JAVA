
public class Arrays {
    public static void main(String[] args) {

        // Array es una estructura de datos

        int[] numeros = new int[5]; 
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        System.out.println(numeros.length);
        System.out.println(numeros[2]); // posicion 2

        String[] nombres = new String [3];
        nombres[0] = "Almu";
        nombres[1] = "Susana";
        nombres[2] = "Gema";

        // más directo, asigna y crea a la vez
        double[] precios = { 2.07, 4.99, 10.22};
        System.out.println(precios[0]);
        System.out.println();

        
        
    }
}
