package co.edu.unicordoba.registrovisitantes.util;

public class TextoUtil {
    private TextoUtil() {
        throw new UnsupportedOperationException(
                "Esta clase no debe ser instanciada"
        );
    }

    public static String normalizarNombre(String texto) {

        if (texto == null || texto.isBlank()) {
            return "SIN NOMBRE";
        }

        String[] palabras = texto
                .trim()
                .toLowerCase()
                .split("\\s+");

        StringBuilder resultado = new StringBuilder();

        for (String palabra : palabras) {
            resultado
                    .append(Character.toUpperCase(palabra.charAt(0)))
                    .append(palabra.substring(1))
                    .append(" ");
        }

        return resultado.toString().trim();
    }
}
