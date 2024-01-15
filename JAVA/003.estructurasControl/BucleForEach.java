public class BucleForEach {
    public static void main(String[] args) {
        long[] calificaciones = {10, 8, 9, 5,3};

        // foreach

        for (long calificacion : calificaciones) {
            System.out.println(calificacion);
            
        }
        // Iterar de uno en uno
        for (int i = 0; i < calificaciones.length; i++) { 
            System.out.println(calificaciones[i]);
        }

        // para incrementar de 2 en 2, i+=2
        for (int i = 0; i < calificaciones.length; i+=2) {
            System.out.println(calificaciones[i]); 
            
        }
        
    }
}
