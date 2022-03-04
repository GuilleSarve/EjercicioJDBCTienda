package DAO;

import Entidades.Autor;
import java.util.List;

public class AutorDAO extends DAO {

    public void crear(Autor autor) throws Exception {
        try {
            em.getTransaction().begin();
            em.persist(autor);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new Exception("Error al persitir una persona");
        }
    }

    public void modificar(Autor autor) throws Exception {
        try {
            em.getTransaction().begin();
            em.merge(autor);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new Exception("Error al modificar una persona");
        }
    }

    public void eliminar(Autor autor) throws Exception {
        try {
            em.getTransaction().begin();
            em.remove(autor);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new Exception("Error al eliminar una persona");
        }
    }

    public Autor buscarPorId(Integer id) {
        return em.find(Autor.class, id);
    }

    public Autor buscarPorNombre(String nombre) {
        return em.find(Autor.class, nombre);
    }

    public List<Autor> listarAutores() {
        try {
            return em.createQuery("SELECT a FROM Autor a").getResultList();
        } catch (Exception e) {
            return null;
        }

    }
}
