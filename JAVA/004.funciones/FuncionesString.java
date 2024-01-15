public class FuncionesString {
    public static void main(String[] args) {

        String nombre = "Almudena developer";
        int nombreLongitud = nombre.length();
        System.out.println(nombreLongitud);

        char primeraLetra = nombre.charAt(0);
        char ultimaLetra = nombre.charAt(nombreLongitud -1);
        System.out.println(primeraLetra);
        System.out.println(ultimaLetra);

        boolean isDeveloper = nombre.contains("developer");
        if (isDeveloper) {

            int beginIndex = 0;
            //int endIndex = 8;
            int endIndex = nombre.indexOf(" ");
            String firstName = nombre.substring(beginIndex, endIndex);
            System.out.println(firstName + " es desarrollador sofware a jornada completa.");
        }
        System.out.println(nombre.startsWith("A")); // True
        System.out.println(nombre.endsWith("developer")); // True
        
    }
}
