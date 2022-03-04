package libreria;

import Entidades.Autor;
import Entidades.Editorial;
import Entidades.Libro;
import Servicios.ServicioAutor;
import Servicios.ServicioEditorial;
import Servicios.ServicioLibro;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Guille
 */
public class Libreria {
//private   Long isbn;
//private String titulo;
//private Integer anio;
//private Integer ejemplares;
//private Integer ejemplaresPrestados;
//private Integer ejemplaresRestantes;
//private Boolean alta;
//private Autor autor;
//private Editorial editorial;

    public static void main(String[] args) {
        try {
            ServicioAutor sa = new ServicioAutor();
            ServicioEditorial se = new ServicioEditorial();
            ServicioLibro sl = new ServicioLibro();
            Autor a = new Autor("Emanuel Furia Nocturna");
            sa.crearAutor(a);
            Editorial e = new Editorial("Chulengo");
            se.crearEditorial(e);
            Libro l = new Libro(123123L, "La camara loca", 1999, 1, 0, 1, true, a, e);
            sl.crearLibro(l);
            System.out.println(sl.buscarPorTitulo("La camara loca").toString());
            System.out.println(l);
            System.out.println(sl.buscarPorIsbn(123123L));
            System.out.println(sl.buscarPorAutor("Emanuel Furia Nocturna"));
            System.out.println(sl.buscarPorEditroial("Chulengo"));
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

}
