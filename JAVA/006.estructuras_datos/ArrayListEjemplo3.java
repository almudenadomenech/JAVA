import java.util.ArrayList;

public class ArrayListEjemplo3 {
    public static void main(String[] args) {
        
        // Crear una lista de productos
        ArrayList <String> productos = new ArrayList<>();
        productos.add("iPhone 15");
        productos.add("iPhone 13");
        productos.add("iPhone 9");
        productos.add("iPhone 10");
        productos.add("iPhone 12");

        // Modificar el producto llamado iPhone 15 y ponerle iPhone 15 Plus

        // Averiguar el indice del elemento "iPhone 15" utilizando indexOf
       int index = productos.indexOf("iPhone 15");
        
        // set
        String nuevo = "iPhone 15 Plus";
        String antiguoIPhone = productos.set(index, nuevo);

        for (String producto : productos) {
            System.out.println(producto);
            
        }
        
    }
    
}
