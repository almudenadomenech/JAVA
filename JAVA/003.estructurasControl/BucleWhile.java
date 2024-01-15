public class BucleWhile {
    public static void main(String[] args) {
        
        int contador = 0;
        while (contador < 10) {
            contador ++;
            System.out.println(contador);
        }

        // Utilizar bucle para encontrar a Wally
        String[] nombres = {"Juan", "Almu", "Wally", "Bob"};

        // while found
        // While break
        boolean encontrado = false; // false por defecto
        int count = 0;
        while (count < nombres.length) {
            boolean resultado= nombres[count] == "Wally";
            System.out.println(nombres[count] + " igual Wally es " + resultado);
            count ++;

            if(resultado){
                System.out.println("Has encontrado a Wally");
                break;
            } else {
                System.out.println("Sigue buscando");
            }
        }

        // count 0 < 4
        // count 1 < 4
        // count 2 < 4
        // count 3 < 4
        // count 4 < 4 se incumple
    }
}
