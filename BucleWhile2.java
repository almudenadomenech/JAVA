public class BucleWhile2 {
    

    public static void main(String[] args) {
        String[] nombres = {"Juan", "Almu", "Wally", "Bob"};

        // Se usa esta variable dentro del bucle while
        boolean encontrado = false; 
        int count = 0;

        while (count < nombres.length) {
            encontrado= nombres[count] == "Wally"; // Devuelva un boolean

            System.out.println(nombres[count] + " igual Wally es " + encontrado);
            count ++;

            if(encontrado){
                System.out.println("Has encontrado a Wally");
                break;
            } else {
                System.out.println("Sigue buscando");
            }
        }

       // Ahora si se puede usar la variables fuera del bucle porque se creo fuera
       System.out.println(encontrado);
    
    }
}
