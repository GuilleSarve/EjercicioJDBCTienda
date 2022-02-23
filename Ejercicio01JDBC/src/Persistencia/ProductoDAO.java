package Persistencia;


import Entidades.Producto;
import java.util.ArrayList;
import java.util.Collection;

public final class ProductoDAO extends DAO {

    public void guardarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe indicar el producto");
            }

            String sql = "INSERT INTO Usuario (nombre, precio,codigoFabricante)"
                    + "VALUES ( '" + producto.getNombre() + "' , '" + producto.getPrecio() +"' , '"+producto.getCodigoFabricante()+"' );";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public void modificarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe indicar el producto que desea modificar");
            }

            String sql = "UPDATE Producto SET "
                    + "nombre = '" + producto.getPrecio()+ "' WHERE codigo = '" + producto.getCodigo() + "'";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public void eliminarProducto(Integer codigo) throws Exception {
        try {

            String sql = "DELETE FROM Producto WHERE codigo = '" + codigo + "'";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public Producto buscarProductoPorNombre(String nombre) throws Exception {
        try {

            String sql = "SELECT * FROM Producto "
                    + " WHERE nombre = '" + nombre + "'";

            consultarBase(sql);

            Producto producto = null;
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
            }
            desconectarBase();
            return producto;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public Producto buscarUsuarioPorCodigo(Integer codigo) throws Exception {
        try {

            String sql = "SELECT * FROM Producto "
                    + " WHERE codigo = '" + codigo + "'";

            consultarBase(sql);

            Producto producto = null;
            while (resultado.next()) {
                  producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
            }
            desconectarBase();
            return producto;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public Collection<Producto> listarProducto() throws Exception {
        try {
            String sql = "SELECT *  FROM Producto ";

            consultarBase(sql);

            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }
     public Collection<Producto> listarNombreProducto() throws Exception {
        try {
            String sql = "SELECT nombre  FROM Producto; ";

            consultarBase(sql);

            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
//                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(1));
//                producto.setPrecio(resultado.getDouble(3));
//                producto.setCodigoFabricante(resultado.getInt(4));
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }
     public Collection<Producto> listarNombreyPrecioProducto() throws Exception {
        try {
            String sql = "SELECT nombre,precio  FROM Producto ";

            consultarBase(sql);

            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
//                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(1));
                producto.setPrecio(resultado.getDouble(2));
//                producto.setCodigoFabricante(resultado.getInt(4));
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }
     public Collection<Producto> listarEntreProducto() throws Exception {
        try {
            String sql = "SELECT *  FROM Producto WHERE precio BETWEEN 120 AND 202 ";
//SELECT * FROM Alumnos WHERE edad BETWEEN 21 AND 40;

            consultarBase(sql);

            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }
     public Collection<Producto> listarPortatil() throws Exception {
        try {
            String sql = "SELECT *  FROM Producto WHERE nombre LIKE '%Portatil%'";

            consultarBase(sql);

            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }
     public Collection<Producto> listarPrecioMasBajoProducto() throws Exception {
        try {
            String sql = "SELECT nombre,min(precio)  FROM Producto ";

            consultarBase(sql);

            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
//                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(1));
                producto.setPrecio(resultado.getDouble(2));
//                producto.setCodigoFabricante(resultado.getInt(4));
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
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