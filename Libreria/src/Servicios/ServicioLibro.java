
package Servicios;

import DAO.LibroDAO;
import Entidades.Libro;
import java.util.List;


public class ServicioLibro {
private  LibroDAO pdao = new LibroDAO();

    
    public Libro crearLibro(Libro l) throws Exception{
        
        validaciones(l);
        
        pdao.crear(l);
        return l;
    }
    
    public void eliminar(Libro l) throws Exception{
        pdao.eliminar(l);
    }
    public void modificar(Libro l) throws Exception{
        pdao.modificar(l);
    }
       public List<Libro> listarLibros(){
        return pdao.listarLibros();
    }  
    public void validaciones(Libro l ) throws Exception{ 
        if (l.getIsbn()==null || l.getIsbn()<=0) {
            throw new Exception("Ingresaste un ISBN nulo o vacio");
        }
        
        if (l.getTitulo()==null || l.getTitulo().isEmpty()) {
            throw new Exception("El Titulo es invalido");
        }if (l.getAnio()==null) {
            throw new Exception("Año invalido");
        } if (l.getEjemplares()==null || l.getEjemplares()<=0) {
            throw new Exception("Cantidad de ejemplares invalida");
        }  if (l.getEjemplaresPrestados()==null || l.getEjemplares()<=0) {
            throw new Exception("Cantidad de ejemplares invalida");
        } if (l.getEjemplaresRestantes()==null || l.getEjemplares()<=0) {
            throw new Exception("Cantidad de ejemplares invalida");
        }if (l.getAutor().getNombre()==null || l.getAutor().getNombre().isEmpty()) {
            throw new Exception("El nombre autor es invalido");
        } if (l.getEditorial().getNombre()==null || l.getEditorial().getNombre().isEmpty()) {
            throw new Exception("El Titulo es invalido");
        } 
}
  public Libro buscarPorIsbn(Long isbn){
        return pdao.buscarPorIsbn(isbn);
    }
    
    public Libro buscarPorTitulo(String titulo){
        return pdao.buscarPorTitulo(titulo);
    }
      public Libro buscarPorAutor(String autor){
        return pdao.buscarPorAutor(autor);
    }
  public Libro buscarPorEditroial(String editorial){
        return pdao.buscarPorEditorial(editorial);
    }
}