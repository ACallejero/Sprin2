
public class Main {
    public static void main(String[] args) {
        // Dimensiones de la picina 1
        int piscina1Largo = 300;
        int piscina1Ancho = 150;
        int piscina1Profundo = 20;

        // Dimensiones de la piscina 2
        int piscina2Largo = 300;
        int piscina2Ancho = 80;
        int piscina2Profundo = 35;

        // Calculamos las areas de las priscinas.
        // Piscina 1.
        int area1 = piscina1Ancho * piscina1Largo;
        // Piscina 2.
        int area2 = piscina2Ancho * piscina2Largo;

        // Calculamos el vilumen de las piscinas.
        // Psicina 1
        int volumen1 = piscina1Ancho * piscina1Profundo * piscina1Largo;
        // Piscina 2
        int volumen2= piscina2Ancho * piscina2Profundo * piscina2Largo;

        System.out.println("El area de la piscina 1 es = " + area1 + "cm.");
        System.out.println("El area de la piscina 2 es = " + area2 + "cm." + "\n");
        System.out.println("El voluem de agua de la piscina 1 es = " + volumen1 + "cm3.");
        System.out.println("El voluem de agua de la piscina 1 es = " + volumen2 + "cm3." + "\n");

        // Calculamos el largo y ancho de las dos piscinas juntas.
        int anchoJuntas = piscina1Ancho + piscina2Ancho;
        int areaJuntas = area1 + area2;
        System.out.println("El largo de las dos piscinas juntas es = " + piscina1Largo + "\n" + "Ya que las dos piscinas tienen " +
                "el mismo largo");
        System.out.println("El ancho de las dos piscinas juntas es = " + anchoJuntas + "\n");

        System.out.println("El area de las dos piscinas juntas es = " + areaJuntas);

        System.out.println("El volumet de las dos piscinas juntas es = " + (volumen1 + volumen2) + "cm3.\n");

        // Ahora intercambiamos datos.
        int intercambio = piscina1Profundo;
        piscina1Profundo = piscina2Profundo;
        piscina2Profundo = intercambio;

        int volumen1Cambiado = piscina1Ancho * piscina1Profundo * piscina1Largo;
        int volumen2Cambiado = piscina2Ancho * piscina2Profundo * piscina2Largo;

        System.out.println("El nuevo volimen de piscina 1 es = " + volumen1Cambiado + "cm3.");
        System.out.println("El nuevo volimen de piscina 2 es = " + volumen2Cambiado + "cm3.");







    }
}
