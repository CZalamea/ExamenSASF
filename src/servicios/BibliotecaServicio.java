package servicios;

import excepciones.CodigoDuplicadoException;
import modelos.Libro;
import modelos.Prestamo;

import java.util.Map;

public class BibliotecaServicio {

    private Map<String, Libro> libros;
    private Map<String, Prestamo> prestamos;

    public BibliotecaServicio(Map<String, Libro> libros, Map<String, Prestamo> prestamos) {
        this.libros = libros;
        this.prestamos = prestamos;
    }

    public void registrarLibro(String codigo, String titulo, String autor, String genero) throws CodigoDuplicadoException {
        if (libros.containsKey(codigo)) {
            throw new CodigoDuplicadoException("El código ya existe");
        }
        libros.put(codigo, new Libro(codigo, titulo, autor, genero));
    }

}
