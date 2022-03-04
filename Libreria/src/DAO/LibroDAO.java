package DAO;

import static Entidades.Autor_.nombre;
import Entidades.Libro;
import java.util.List;

public class LibroDAO extends DAO {

    public void crear(Libro libro) throws Exception {
        try {
            em.getTransaction().begin();
            em.persist(libro);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new Exception("Error al persitir una persona");
        }
    }

    public void modificar(Libro libro) throws Exception {
        try {
            em.getTransaction().begin();
            em.merge(libro);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new Exception("Error al modificar una persona");
        }
    }

    public void eliminar(Libro libro) throws Exception {
        try {
            em.getTransaction().begin();
            em.remove(libro);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new Exception("Error al eliminar una persona");
        }
    }
public List<Libro> listarLibros() {
        try {
             return em.createQuery("SELECT l FROM Libro l").getResultList();
        } catch (Exception e) {
            return null;
        }
       
    }
    public Libro buscarPorIsbn(Long isbn) {
        return em.find(Libro.class, isbn);
    }

    public Libro buscarPorTitulo(String titulo) {
        return (Libro) em.createQuery("SELECT l FROM Libro l WHERE l.titulo = :titulo").setParameter("titulo", titulo).getSingleResult();

    }

    public Libro buscarPorAutor(String autor) {
        return (Libro) em.createQuery("SELECT l FROM Libro l JOIN l.autor a WHERE a.nombre = :nombre").setParameter("nombre", autor).getSingleResult();

    }
     public Libro buscarPorEditorial(String editorial) {
        return (Libro) em.createQuery("SELECT l FROM Libro l JOIN l.editorial e WHERE e.nombre = :nombre").setParameter("nombre", editorial).getSingleResult();

    } 
}
//9) Búsqueda de un libro por ISBN.
//10) Búsqueda de un libro por Título.
//11) Búsqueda de un libro/s por nombre de Autor.
//12) Búsqueda de un libro/s por nombre de Editorial.
