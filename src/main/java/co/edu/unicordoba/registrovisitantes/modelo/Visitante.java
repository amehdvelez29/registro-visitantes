package co.edu.unicordoba.registrovisitantes.modelo;
import co.edu.unicordoba.registrovisitantes.util.TextoUtil;




public class Visitante {

    // ESTADO DE INSTANCIA
    private final int id;
    private final String nombre;
    private final int edad;

    // ESTADO DE CLASE
    private static int totalCreados;

    // CONSTANTE DE CLASE
    public static final int EDAD_MINIMA = 18;

    // BLOQUE STATIC
    static {
        totalCreados = 0;
    }

    // CONSTRUCTOR
    public Visitante(String nombre, int edad) {
        totalCreados++;

        this.id = totalCreados;
        this.nombre = TextoUtil.normalizarNombre(nombre);
        this.edad = edad;
    }

    // MÉTODO DE INSTANCIA
    public boolean esMayorDeEdad() {
        return this.edad >= EDAD_MINIMA;
    }
    // MÉTODO DE CLASE
    public static int getTotalCreados() {
        return totalCreados;
    }

    // GETTER DEL ID
    public int getId() {
        return id;
    }

    // GETTER DEL NOMBRE
    public String getNombre() {
        return nombre;
    }

    // GETTER DE LA EDAD
    public int getEdad() {
        return edad;
    }
}
