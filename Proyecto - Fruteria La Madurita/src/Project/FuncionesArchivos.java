package Project;

import Clases.Cajonproducto;
import Clases.Empleado;
import Clases.Proveedores;
import Clases.Producto;
import Clases.Clientes;
import Clases.Facturacion;
import Clases.Pedidos;
import Clases.Producto_stock;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class FuncionesArchivos {

    public static void agregarCliente(Connection con, Clientes cliente) throws IOException, SQLException {
        PreparedStatement pst = null;
        String consulta = "Insert into cliente (id_cliente, id_tipo , nombre, apellido , telefono)"
                + "values(?,?,?,?,?)";
        try {
            pst = con.prepareStatement(consulta);
            pst.setInt(1, cliente.getId_tipo());
            pst.setString(2, cliente.getNombre());
            pst.setString(3, cliente.getApellido());
            pst.setInt(4, cliente.getTelefono());
            pst.execute();
            

            System.out.print("Guardado correctamente");

        } catch (SQLException e) {
            System.out.print("Error" + e);
        }
        finally{
            pst.close();
        }
    }
    

    public static void mostrarClientes(Connection con, JTable tabla) {

        String[] filas = new String[5];
        String[] columnas = {"ID CLIENTE", "ID TIPO", "NOMBRE", "APELLIDO", "TELEFONO"};
        DefaultTableModel model = new DefaultTableModel(null, columnas);

        String consulta = "select * from cliente order by id_cliente";

        Statement st = null;
        ResultSet rs = null;

        try {
            st = con.createStatement();
            rs = st.executeQuery(consulta);
            while (rs.next()) {
                for (int i = 0; i < 5; i++) {
                    filas[i] = rs.getString(i + 1);
                }
                model.addRow(filas);
            }
            tabla.setModel(model);
        } catch (SQLException e) {
            System.out.print(" No se pudo enlistar");
        }

    }
    
    
    public List<Clientes> select(String sql) {
        List <Clientes> lstCliente=null;
        
        Connection conex=null;
        try {
           lstCliente=new ArrayList<Clientes>();
            conex=Conexion.getConnection();
            
            String sqls="select id_clientes,identificacion,nombre,apellido,estado from clientes "+sql;
            Statement st= conex.createStatement();
            
            ResultSet rs=st.executeQuery(sqls);
            while(rs.next()){
                Cliente c=new Cliente();
                c.setCedula(rs.getInt("id_clientes"));
                c.setIdentificacion(rs.getInt("identificacion"));
                c.setNombre(rs.getString("nombre"));
                c.setApellido(rs.getString("apellido"));
                c.setEstado(rs.getString("estado"));
                lstCliente.add(c);
            }
            
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally{
            try {
                conex.close();
            } catch (SQLException ex) {
                Logger.getLogger(ClienteImp.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return lstCliente;
        
    }
    

    
    public static void eliminarCliente(Connection con, int id_cliente) throws SQLException {
        PreparedStatement pst = null;
        String consulta = "delete from cliente where id_cliente =?";

        try {
            pst = con.prepareStatement(consulta);
            pst.setInt(1, id_cliente);
            pst.execute();
            

            System.out.print("Cliente eliminado correctamente");
        } catch (Exception e) {
            System.out.print(" No se pudo eliminar cliente");
        }
        finally{
            pst.close();
        }
    }

    public static void modificarCliente(Connection con, Clientes cl) throws SQLException {
        PreparedStatement pst = null;
        String consulta = "update cliente set id_tipo= ?, nombre=?, apellido=?"
                + ",telefono=? "
                + "where id_cliente= ?";

        try {
            pst = con.prepareStatement(consulta);
            pst.setInt(1, cl.getId_tipo());
            pst.setString(2, cl.getNombre());
            pst.setString(3, cl.getApellido());
            pst.setInt(4, cl.getTelefono());
            pst.setInt(5, cl.getN_cedula());
            pst.execute();
            
            System.out.print(" Datos actualizados correctamente");
        } catch (SQLException e) {
            System.out.print(" " + e.getMessage());
        }finally{
            pst.close();
        }

    }
//fin cliente
    //Empleado
    public static Empleado buscarEmpleado(Connection con, int dni, String pass){
        Empleado empl=null;
        String []emp = new String[6];
        Statement st = null;
        ResultSet rs= null;
        String consulta= "select * from empleado_ where dni_empleado="+dni+" and contraseña='"+pass+"'";
        
        try{
            st = con.createStatement();
            rs = st.executeQuery(consulta);
            
           while(rs.next()){ 
               for(int i=0; i<6; i++){
               emp[i]= rs.getString(i+1);
            }
           }
           empl= new Empleado(Integer.parseInt(emp[1]),Integer.parseInt(emp[0]), emp[2], emp[3],Integer.parseInt(emp[4]), emp[5]);
            
        }catch(SQLException e){
            System.out.println(" Error" +e);
        }
 
        return empl;
    }
    
    public static void crearEmpleado(Connection con, Empleado empleado) throws IOException {
        PreparedStatement pst = null;
        String consulta = "Insert into empleado(dni_empleado, id_rol , nombre, apellido , telefono ,contraseña)"
                + "values(?,?,?,?,?,?)";
        try {
            pst = con.prepareStatement(consulta);
            pst.setInt(1, empleado.getDni());
            pst.setInt(2, empleado.getId_rol());
            pst.setString(3, empleado.getNombre());
            pst.setString(4, empleado.getApellido());
            pst.setInt(5, empleado.getTelefono());
            pst.setString(6, empleado.getContraseña());
            pst.execute();
            pst.close();

            System.out.print("Guardado correctamente");

        } catch (SQLException e) {
            System.out.print("Error" + e);
        }
    }

    public static void eliminarEmpleado(Connection con, int id_emple) {
        PreparedStatement pst = null;
        String consulta = "delete from empleado where id_empleado =?";

        try {
            pst = con.prepareStatement(consulta);
            pst.setInt(1, id_emple);
            pst.execute();
            pst.close();

            System.out.print("Empleado eliminado correctamente");
        } catch (SQLException e) {
            System.out.print(" No se pudo eliminar empleado");
        }
    }

    public static void mostrarEmpleados(Connection con, JTable tabla) {
        String[] filas = new String[6];
        String[] columnas = {"ID EMPLEADO", "ID ROL", "CEDULA", "NOMBRE", "APELLIDO", "TELEFONO"};
        DefaultTableModel model = new DefaultTableModel(null, columnas);

        String consulta = "select * from empleado order by id_empleado";

        Statement st = null;
        ResultSet rs = null;

        try {
            st = con.createStatement();
            rs = st.executeQuery(consulta);
            while (rs.next()) {
                for (int i = 0; i < 6; i++) {
                    filas[i] = rs.getString(i + 1);
                }
                model.addRow(filas);
            }
            tabla.setModel(model);
        } catch (SQLException e) {
            System.out.print(" No se pudo enlistar");
        }
    }

    //fin empleado
    //Producto
    public static void ingresarProducto(Connection con, Producto producto) throws SQLException {
        PreparedStatement pst = null;
        String consulta = "Insert into producto(id_producto, nombre_producto , fecha_entrada , peso)"
                + "values(?,?,?,?,?)";
        
        try {
            pst = con.prepareStatement(consulta);
            pst.setInt(1, producto.getId());
            pst.setString(2, producto.getNom_prod());
            pst.setString(3, producto.getFecha_ingreso());
            pst.setInt(4, producto.getPeso_prod());
            pst.execute();
            
            System.out.print("Guardado correctamente");

        } catch (SQLException e) {
            System.out.print("Error" + e);
        }finally{
            pst.close();
        }
    }
    
    public static void modificarProducto(Connection con, Producto ps) throws SQLException {
        PreparedStatement pst = null;
        String consulta = "update producto set  nombre = ?, peso=?, fecha=?"
                + ",id_proveedor =? "
                + "where id_producto = ?";

        try {
            pst = con.prepareStatement(consulta);
            
            pst.setString(1, ps.getNom_prod());
            pst.setInt(2, ps.getPeso_prod());
            pst.setString(3, ps.getFecha_ingreso());
            pst.setInt(4, ps.getProveedor());
            pst.setInt(5, ps.getId());
            
            pst.execute();
            
            System.out.print(" Datos actualizados correctamente");
        } catch (SQLException e) {
            System.out.print(" " + e.getMessage());
        }finally{
            pst.close();
        }

    }

    public static void ingresarStock(Connection con, Producto_stock ps) {
        PreparedStatement pst = null;
        String consulta = "Insert into producto_stock(id_producto, cantidad, precio_unit)"
                + "values(?,?,?)";
        try {
            pst = con.prepareStatement(consulta);
            pst.setInt(1, ps.getId());
            pst.setInt(2, ps.getCantidad());
            pst.setFloat(3, ps.getPrecio_unit());
            pst.execute();
            pst.close();

            System.out.print("Guardado correctamente");

        } catch (SQLException e) {
            System.out.print("Error" + e);
        }
    }

    public static void acutlizarStock(Connection con, Producto_stock ps) {
        PreparedStatement pst = null;
        String consulta = "update producto_stock set cantidad= ?, precio_unit = ? "
                + "where id_producto = ?";

        try {
            pst = con.prepareStatement(consulta);
            pst.setInt(1, ps.getCantidad());
            pst.setInt(2, ps.getCantidad());
            pst.setFloat(3, ps.getPrecio_unit());
            pst.execute();
            pst.close();
            System.out.print(" Datos actualizados correctamente");
        } catch (SQLException e) {
            System.out.print(" " + e.getMessage());
        }

    }
    
    //muestraProducto_stock
    public static void mostrarInventario(Connection con, JTable tabla) {
        String[] filas = new String[3];
        String[] columnas = {"ID PRODUCTO", "CANTIDAD", "PRECIO UNITARIO"};
        DefaultTableModel model = new DefaultTableModel(null, columnas);

        String consulta = "select * from producto_stock order by id_producto";

        Statement st = null;
        ResultSet rs = null;

        try {
            st = con.createStatement();
            rs = st.executeQuery(consulta);
            while (rs.next()) {
                for (int i = 0; i < 3; i++) {
                    filas[i] = rs.getString(i + 1);
                }
                model.addRow(filas);
            }
            tabla.setModel(model);
        } catch (SQLException e) {
            System.out.print(" No se pudo enlistar");
        }

    }
public static void mostrarProductoConProv(Connection con, JTable tabla) {
        String[] filas = new String[6];
        String[] columnas = {"ID PRODUCTO", "NOMBRE", "PESO", "FECHA", "ID_PROVEEDOR", "PROVEEDOR"};
        DefaultTableModel model = new DefaultTableModel(null, columnas);

        String consulta = "select *, pp.id_proveedor, pv.nombre from producto p, proveedor_producto pp, "
                + "where p.id_procuto=pp.id_producto and pp.id_proveedor=pv.id_proveedor order by id_producto";

        Statement st = null;
        ResultSet rs = null;

        try {
            st = con.createStatement();
            rs = st.executeQuery(consulta);
            while (rs.next()) {
                for (int i = 0; i < 6; i++) {
                    filas[i] = rs.getString(i + 1);
                }
                model.addRow(filas);
            }
            tabla.setModel(model);
        } catch (SQLException e) {
            System.out.print(" No se pudo enlistar");
        }

    }
    
    public static void eliminarProducto(Connection con, int id) throws SQLException {
        PreparedStatement pst = null;
        String consulta = "delete from producto where id_producto =?";

        try {
            pst = con.prepareStatement(consulta);
            pst.setInt(1, id);
            pst.execute();
           

            System.out.print("Producto eliminado correctamente");
        } catch (Exception e) {
            System.out.print(" No se pudo eliminar producto");
        }finally{
             pst.close();
        }
    }

//fin producto
    // Poveedor_producto
    public static void ingresaProve_producto(Connection con, Producto p) throws SQLException {
        PreparedStatement pst = null;
        String consulta = "insert into proveedor_producto(id_proveedor, id_producto) values (?,?)";

        try {
            pst = con.prepareStatement(consulta);
            pst.setInt(1, p.getProveedor());
            pst.setInt(2, p.getId());
            pst.execute();
            
            System.out.print("Datos ingresados");
        } catch (Exception e) {
            System.out.print("No se pudo ingresar datos");
        }finally{
            pst.close();
        }

    }

    //Proveedor
    public static void ingresarProveedor(Connection con, Proveedores prov) throws SQLException {
        PreparedStatement pst = null;
        String consulta = "Insert into proveedor(id_proveedor, empresa, nombre_contacto, direccion, telefono, dias_entrega)"
                + "values(?,?,?,?,?,?)";
        try {
            pst = con.prepareStatement(consulta);
            pst.setInt(1, prov.getId());
            pst.setString(2, prov.getEmpresa());
            pst.setString(3, prov.getContacto());
            pst.setString(4, prov.getDireccion());
            pst.setInt(5, prov.getTelefono());
            pst.setString(6, prov.getDias_entrega());
            pst.execute();
            
            System.out.print("Guardado correctamente");

        } catch (SQLException e) {
            System.out.print("Error " + e);
        }finally{
            pst.close();
        }
    }

    public static void mostrarProveedores(Connection con, JTable tabla) {
        String[] filas = new String[6];
        String[] columnas = {"ID PROVEEDOR", "NOMBRE EMPRESA", "CONTACTO", "DIRECCION", "TELEFONO", "DIAS ENTREGA"};
        DefaultTableModel model = new DefaultTableModel(null, columnas);

        String consulta = "select * from proveedor order by id_proveedor";

        Statement st = null;
        ResultSet rs = null;

        try {
            st = con.createStatement();
            rs = st.executeQuery(consulta);
            while (rs.next()) {
                for (int i = 0; i < 6; i++) {
                    filas[i] = rs.getString(i + 1);
                }
                model.addRow(filas);
            }
            tabla.setModel(model);
        } catch (SQLException e) {
            System.out.print(" No se pudo enlistar");
        }

    }

    public static void eliminarProveedor(Connection con, String id) throws SQLException {
        PreparedStatement pst = null;
        String consulta = "delete from proveedor where id_proveedor =?";

        try {
            pst = con.prepareStatement(consulta);
            pst.setInt(1, Integer.parseInt(id));
            pst.execute();
           
            System.out.print("Proveedor eliminado correctamente");
        } catch (SQLException e) {
            System.out.print(" No se pudo eliminar proveedor");
        }finally{
             pst.close();
        }
    }
    
     public static void modificarProveedor(Connection con, Proveedores ps) throws SQLException {
        PreparedStatement pst = null;
        String consulta = "update proveedor set  empresa = ?, nombre_cantacto=?, direccion=?"
                + ",telefono=? ,dias_entrega=? "
                + "where id_proveedor = ?";

        try {
            pst = con.prepareStatement(consulta);
            
            pst.setString(1, ps.getEmpresa());
            pst.setString(2, ps.getContacto());
            pst.setString(3, ps.getDireccion());
            pst.setInt(4, ps.getTelefono());
            pst.setString(5, ps.getDias_entrega());
            pst.setInt(6, ps.getId());
            pst.execute();
            
            System.out.print(" Datos actualizados correctamente");
        } catch (SQLException e) {
            System.out.print(" " + e.getMessage());
        }finally{
            pst.close();
        }

    }

    //Pedido
    public static void crearPedido(Connection con, Pedidos pds) {
        PreparedStatement pst = null;
        String consulta = "Insert into pedidos (id_pedido, descripcion, id_cliente, fecha_pedido, fecha_entrega, id_pago)"
                + "values(?,?,?,?,?,?)";
        try {
            pst = con.prepareStatement(consulta);
            pst.setInt(1, pds.getId_pedido());
            pst.setString(2, pds.getDescripcion());
            pst.setInt(3, pds.getCod_cliente());
            pst.setString(4, pds.getFecha_pedido());
            pst.setString(5, pds.getFecha_entrega());
            pst.setInt(6, pds.getForma_pago());//
            pst.execute();
            pst.close();

            System.out.print("Guardado correctamente");

        } catch (SQLException e) {
            System.out.print("Error " + e);
        }
    }
    
    public static void mostrarPedidos(Connection con, JTable tabla) {
        String[] filas = new String[6];
        String[] columnas = {"ID PEDIDO","DESCRIPCION", "CLIENTE", "FECHA PEDIDO", "FECHA ENTREGA", "FORMA PAGO"};
        DefaultTableModel model = new DefaultTableModel(null, columnas);

        String consulta = "select * from pedidos order by id_pedido";

        Statement st = null;
        ResultSet rs = null;

        try {
            st = con.createStatement();
            rs = st.executeQuery(consulta);
            while (rs.next()) {
                for (int i = 0; i < 6; i++) {
                    filas[i] = rs.getString(i + 1);
                }
                model.addRow(filas);
            }
            tabla.setModel(model);
        } catch (SQLException e) {
            System.out.print(" No se pudo enlistar");
        }

    }
    
      public static void eliminarPedido(Connection con, int id) {
        PreparedStatement pst = null;
        String consulta = "delete from pedidos where id_pedido =?";

        try {
            pst = con.prepareStatement(consulta);
            pst.setInt(1, id);
            pst.execute();
            pst.close();

            System.out.print("Pedido eliminado correctamente");
        } catch (SQLException e) {
            System.out.print(" No se pudo eliminar pedido");
        }
    }

    //Cajonproducto
    public static void crearCajonproducto(Connection con, Cajonproducto cj) {
        PreparedStatement pst = null;
        String consulta = "Insert into cajonproducto(id_cajonproducto, nombre, descripcion, precio)"
                + "values(?,?,?,?)";

        try {
            pst = con.prepareStatement(consulta);
            pst.setInt(1, cj.getId());
            pst.setString(2, cj.getNombre());
            pst.setString(3, cj.getDescripcion());
            pst.setFloat(4, cj.getPrecio());
            pst.execute();
            pst.close();

            System.out.print("Guardado correctamente");

        } catch (SQLException e) {
            System.out.print("Error " + e);
        }
    }

    //Producto_cajon
    public static void ingresaProducto_Cajon(Connection con, int id_cj,int id_prod) throws SQLException {
        PreparedStatement pst = null;
        String sql = "insert into producto_cajon (id_cajonproducto, id_producto) " + "values(?,?)";

        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, id_cj);
            pst.setInt(2, id_prod);
            pst.execute();
            
            System.out.print("Guardado Correctamente");
        } catch (Exception e) {
            System.out.print("" + e.getMessage());
        }
        finally{
            pst.close();
        }
    }
    ///// Ventana AgregarProducto
    public static void mostrarCajon_producto(Connection con, JTable tabla) {
        String[] filas = new String[5];
        String[] columnas = {"ID CAJON", "NOMBRE ", "DESCRIPCION",  "PRECIO", "CANTIDAD DE PRODUCTOS"};
        DefaultTableModel model = new DefaultTableModel(null, columnas);

        String consulta = "select * , count(p.id_producto) from cajonproducto cj inner join"
                + "producto_cajon p on  cj.id_cajonproducto=p.id_cajonproducto  group by cj.nombre";

        Statement st = null;
        ResultSet rs = null;

        try {
            st = con.createStatement();
            rs = st.executeQuery(consulta);
            while (rs.next()) {
                for (int i = 0; i < 5; i++) {
                    filas[i] = rs.getString(i + 1);
                }
                model.addRow(filas);
            }
            tabla.setModel(model);
        } catch (SQLException e) {
            System.out.print(" No se pudo enlistar");
        }

    }

    // Eliminar producto del cajon
    public static void eliminarProducto_Cajon(Connection con, int producto) {
        PreparedStatement pst = null;
        String consulta = "delete from producto_cajon where id_producto= ?";

        try {
            pst = con.prepareStatement(consulta);
            pst.setInt(1, producto);
            pst.execute();
            pst.close();

            System.out.print("Producto eliminado del cajon correctamente");
        } catch (Exception e) {
            System.out.print(" No se pudo eliminar producto");
        }
    }
    
    public static void mostrarCajon(Connection con, JTable tabla) {
        String[] filas = new String[4];
        String[] columnas = {"ID_CAJON", "NOMBRE CAJON", "DESCRIPCION", "PRECIO"};
        DefaultTableModel model = new DefaultTableModel(null, columnas);

        String consulta = "select * FROM CAJONPRODUCTO";

        Statement st = null;
        ResultSet rs = null;

        try {
            st = con.createStatement();
            rs = st.executeQuery(consulta);
            while (rs.next()) {
                for (int i = 0; i < 4; i++) {
                    filas[i] = rs.getString(i + 1);
                }
                model.addRow(filas);
            }
            tabla.setModel(model);
        } catch (SQLException e) {
            System.out.print(" No se pudo enlistar");
        }

    }

    //facturacion
    public static void ingresarFactura(Connection con, Facturacion fa) throws SQLException {
        PreparedStatement pst = null;
        String consulta = "insert into factura( id_factura, id_vendedor, id_cliente, total_pagar) "
                + "values(?,?,?,?)";

        pst = con.prepareStatement(consulta);
        pst.setInt(1, fa.getId_factu());
        pst.setInt(2, fa.getId_vendedor());
        pst.setInt(3, fa.getId_clien());
        pst.setInt(4, fa.getTotal_pagar());
        pst.execute();
        pst.close();
    }

    //Detalle_factura
    public static void ingresarDetalleFactura(Connection con, Facturacion fa) throws SQLException {
        PreparedStatement pst = null;
        String consulta = "insert into detalle_factura( id_factura, cantidad_cajon , id_cajonproducto, cantidad_total) "
                + "values(?,?,?,?)";

        pst = con.prepareStatement(consulta);
        pst.setInt(1, fa.getId_factu());
        pst.setInt(2, fa.getCantidad_cajon());
        pst.setInt(3, fa.getId_cajonproducto());
        pst.setInt(4, fa.getCantidad_total());
        pst.execute();
        pst.close();
    }

    public static boolean validaCedula(String x) {
        int suma = 0;
        if (x.length() == 9) {
            return false;
        } else {
            int a[] = new int[x.length() / 2];
            int b[] = new int[(x.length() / 2)];
            int c = 0;
            int d = 1;
            for (int i = 0; i < x.length() / 2; i++) {
                a[i] = Integer.parseInt(String.valueOf(x.charAt(c)));
                c = c + 2;
                if (i < (x.length() / 2) - 1) {
                    b[i] = Integer.parseInt(String.valueOf(x.charAt(d)));
                    d = d + 2;
                }
            }

            for (int i = 0; i < a.length; i++) {
                a[i] = a[i] * 2;
                if (a[i] > 9) {
                    a[i] = a[i] - 9;
                }
                suma = suma + a[i] + b[i];
            }
            int aux = suma / 10;
            int dec = (aux + 1) * 10;
            if ((dec - suma) == Integer.parseInt(String.valueOf(x.charAt(x.length() - 1)))) {
                return true;
            } else if (suma % 10 == 0 && x.charAt(x.length() - 1) == '0') {
                return true;
            } else {
                return false;
            }

        }
    }
}
