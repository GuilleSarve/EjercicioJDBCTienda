package DAO;

import Entidades.Editorial;
import java.util.List;

public class EditorialDAO extends DAO {

    public void crear(Editorial editorial) throws Exception {
        try {
            em.getTransaction().begin();
            em.persist(editorial);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new Exception("Error al persitir una persona");
        }
    }

    public void modificar(Editorial editorial) throws Exception {
        try {
            em.getTransaction().begin();
            em.merge(editorial);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new Exception("Error al modificar una persona");
        }
    }

    public void eliminar(Editorial editorial) throws Exception {
        try {
            em.getTransaction().begin();
            em.remove(editorial);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new Exception("Error al eliminar una persona");
        }
    }

    public Editorial buscarPorId(Integer id) {
        return em.find(Editorial.class, id);
    }
 public Editorial buscarPorNombre(String nombre) {
        return em.find(Editorial.class, nombre);
    }
 public List<Editorial> listarEditorial() {
        try {
             return em.createQuery("SELECT e FROM Editorial e").getResultList();
        } catch (Exception e) {
            return null;
        }
       
    }
}
