
package Servicios;

import Entidades.Producto;
import Persistencia.ProductoDAO;
import java.util.Collection;
import java.util.Scanner;


public class ServicioProducto {
    private ProductoDAO dao;
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public void menu(){
        String opcion=null;
do {
            System.out.println("seleccione una opcion\n"
                    + "a) Listado de todos los productos\n"
                    + "b) Listado de productos (nombre / precio)\n"
                    + "c) Productos entre 120 y 202\n"
                    + "d) Buscar y mostrar Portatiles\n"
                    + "e) Nombre y precio del producto mas barato\n"
                    + "f) Agregar un producto nuevo\n"
                    + "g) Agregar un nuevo fabricante\n"
                    + "h) Editar un producto\n"
                    + "i) Salir");
            opcion=leer.next();
        } while (!opcion.equalsIgnoreCase("i"));
    }
      public Collection<Producto> listarProducto() throws Exception {

        try {

            Collection<Producto> productos = dao.listarNombreProducto();

            return productos;
        } catch (Exception e) {
            throw e;
        }
    }
        public Collection<Producto> listarUsuario() throws Exception {
            
        try {
            Collection<Producto> productos= dao.listarProducto();
            return productos;
        } catch (Exception e) {
            throw e;
        }
    }
        
        public Collection<Producto> listarUsuarioPorPrecio() throws Exception {
            
        try {
            Collection<Producto> productos = dao.listarNombreyPrecioProducto();
            return productos;
        } catch (Exception e) {
            throw e;
        }
    }
        
        public Collection<Producto> listarUsuarioPortatiles() throws Exception {
            
        try {
            Collection<Producto> productos = dao.listarPortatil();
            return productos;
        } catch (Exception e) {
            throw e;
        }
    }

        public Collection<Producto> listarPrecioMenor() throws Exception {
            
        try {
            Collection<Producto> productos = dao.listarPrecioMasBajoProducto();
            return productos;
        } catch (Exception e) {
            throw e;
        }
    }        
        public void imprimirProductoPorNombre() throws Exception {

        try {
            //CREAMOS UNA LISTA Y LA INICIALIZAMOS CON LA LISTA QUE NOS DEVUELVE LISTARUSUARIO()
            Collection<Producto> usuarios = listarUsuario();

            //LOS IMPRIMIMOS
            if (usuarios.isEmpty()) {
                throw new Exception("No existen usuarios para imprimir");
            } else {
                for (Producto u : usuarios) {
                    System.out.println("Nombre: "+u.getNombre());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
        public void imprimirProductoPorNombreYPrecio() throws Exception {

        try {
            //CREAMOS UNA LISTA Y LA INICIALIZAMOS CON LA LISTA QUE NOS DEVUELVE LISTARUSUARIO()
            Collection<Producto> productos = listarProducto();

            //LOS IMPRIMIMOS
            if (productos.isEmpty()) {
                throw new Exception("No existen usuarios para imprimir");
            } else {
                for (Producto u : productos) {
                    System.out.println("Nombre: "+ u.getNombre() + "Precio: " + u.getPrecio());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }
           
        public void imprimirProductoPorPrecio() throws Exception {

        try {
            //CREAMOS UNA LISTA Y LA INICIALIZAMOS CON LA LISTA QUE NOS DEVUELVE LISTARUSUARIO()
            Collection<Producto> productos = listarProductoPorPrecio();

            //LOS IMPRIMIMOS
            if (usuarios.isEmpty()) {
                throw new Exception("No existen usuarios para imprimir");
            } else {
                for (Producto u : usuarios) {
                    System.out.println(u);
                }
            }
        } catch (Exception e) {
            throw e;
        }
    } 
        
       public void imprimirProductoPortatil() throws Exception {

        try {
            //CREAMOS UNA LISTA Y LA INICIALIZAMOS CON LA LISTA QUE NOS DEVUELVE LISTARUSUARIO()
            Collection<Producto> productos = listarPortatil();

            //LOS IMPRIMIMOS
            if (productos.isEmpty()) {
                throw new Exception("No existen usuarios para imprimir");
            } else {
                for (Producto u : productos) {
                    System.out.println(u);
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }
       
        public void imprimirProductoBarato() throws Exception {

        try {
            //CREAMOS UNA LISTA Y LA INICIALIZAMOS CON LA LISTA QUE NOS DEVUELVE LISTARUSUARIO()
            Collection<Producto> usuarios = listarPrecioMenor();

            //LOS IMPRIMIMOS
            if (usuarios.isEmpty()) {
                throw new Exception("No existen usuarios para imprimir");
            } else {
                for (Producto u : usuarios) {
                    System.out.println(u);
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }
public void crearProducto(Integer codigo, String nombre,Double precio,Integer codFabricante) throws Exception {

        try {
            //Validamos
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre ");
            }

//            if (precio == null || precio.) {
//                throw new Exception("Debe indicar la clave");
//            }
//            if (clave.length() < 8) {
//                throw new Exception("La clave no puede tener menos de 8 caracteres");
//            }
//            if (buscarUsuarioPorCorreoElectronico(correoElectronico) != null) {
//                throw new Exception("Ya existe un usuario con el correo electrónico indicado " + correoElectronico);
//            }

            //Creamos el usuario
            Producto producto = new Producto();
            producto.setNombre(nombre);
            producto.setPrecio(precio);
            producto.setCodigoFabricante(codFabricante);
            
            dao.guardarProducto(producto);
        } catch (Exception e) {
            throw e;
        }
    }
}
//a) Lista el nombre de todos los productos que hay en la tabla producto.
//b) Lista los nombres y los precios de todos los productos de la tabla producto.
//c) Listar aquellos productos que su precio esté entre 120 y 202.
//d) Buscar y listar todos los Portátiles de la tabla producto.
//e) Listar el nombre y el precio del producto más barato.
//f) Ingresar un producto a la base de datos.
//g) Ingresar un fabricante a la base de datos
//h) Editar un producto con datos a elección.