
package Clases;

/**
 *
 * @author Frael Campos
 */
public class Clientes {
   //Atributos
   
    private String id_tipo;
    private String n_cedula;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;

    public Clientes(String id_tipo, String nombre, String apellido, String direccion, String telefono) {
        this.id_tipo = id_tipo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    
     
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId_tipo() {
        return id_tipo;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    
    public String getN_cedula() {
        return n_cedula;
    }

    public void setN_cedula(String n_cedula) {
        this.n_cedula = n_cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

   
    
    
   
}
