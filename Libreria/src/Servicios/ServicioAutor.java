
package Servicios;

import DAO.AutorDAO;
import Entidades.Autor;
import java.util.List;


public class ServicioAutor {
  private AutorDAO pdao = new AutorDAO();
    
    public Autor crearAutor(Autor a) throws Exception{
        
        validaciones(a);
        
        pdao.crear(a);
        return a;
    }
    
    public void eliminar(Autor a) throws Exception{
        pdao.eliminar(a);
    }
    public void modificar(Autor a) throws Exception{
        pdao.modificar(a);
    }
    
    public void validaciones(Autor a ) throws Exception{ 
        if (a.getNombre()==null || a.getNombre().isEmpty()) {
            throw new Exception("Ingresaste un nombre nulo o vacio");
        }

        }
  
    
    public Autor buscarPorId(Integer id){
        return pdao.buscarPorId(id);
    }
    
    public Autor buscarPorDNI(String nombre){
        return pdao.buscarPorNombre(nombre);
    }
    
    public List<Autor> listarAutores(){
        return pdao.listarAutores();
    }
    
}
