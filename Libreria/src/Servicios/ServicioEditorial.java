
package Servicios;

import DAO.EditorialDAO;
import Entidades.Editorial;
import java.util.List;


public class ServicioEditorial {
  private EditorialDAO pdao = new EditorialDAO();
    
    public Editorial crearEditorial(Editorial e) throws Exception{
        
        validaciones(e);
        
        pdao.crear(e);
        return e;
    }
    
    public void eliminar(Editorial e) throws Exception{
        pdao.eliminar(e);
    }
    public void modificar(Editorial e) throws Exception{
        pdao.modificar(e);
    }
    
    public void validaciones(Editorial e ) throws Exception{ 
        if (e.getNombre()==null ||e.getNombre().isEmpty()) {
            throw new Exception("Ingresaste un nombre nulo o vacio");
        }     
      
    }
    
    public Editorial buscarPorId(Integer id){
        return pdao.buscarPorId(id);
    }
    
    public Editorial buscarPorDNI(String nombre){
        return pdao.buscarPorNombre(nombre);
    }
    
    public List<Editorial> listarEditorial(){
        return pdao.listarEditorial();
    }
    
}
