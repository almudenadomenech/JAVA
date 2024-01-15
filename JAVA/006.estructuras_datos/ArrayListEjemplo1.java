import java.util.ArrayList;

public class ArrayListEjemplo1 {
    public static void main(String[] args) {
        
        String nombre = new String("Hola");

        ArrayList caja1 = new ArrayList();
        caja1.add("Hola");
        caja1.add(100);
        caja1.add(true);

        ArrayList caja2 = new ArrayList();
        caja2.add("Lámpara");
        caja2.add(500.32);
        caja2.add(false);

        ArrayList<Double> precios = new ArrayList<>();
        precios.add(500.33);
        // precios.add("Producto nuevo"); // No deja agregar String porque es de tipo Double


        ArrayList<String> email = new ArrayList<>();
        email.add("usuario1@gamil.com");
        email.add("usuario2@gamil.com");

        ArrayList<Boolean> respuesta = new ArrayList<>();
        respuesta.add(true);
        respuesta.add(false);
        
        ArrayList<Integer> edades = new ArrayList<>();
        edades.add(45);
        edades.add(19);


        

    }
    
}
