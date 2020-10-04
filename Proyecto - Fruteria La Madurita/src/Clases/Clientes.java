
package Clases;

/**
 *
 * @author Frael Campos
 */
public class Clientes {
   //Atributos
   
    private int id_tipo;
    private int n_cedula;
    private String nombre;
    private String apellido;
    private int telefono;

    public Clientes(int id_tipo, int cedula,String nombre, String apellido,  int telefono) {
        this.n_cedula= cedula;
        this.id_tipo = id_tipo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }
    
    public Clientes(){
    
    }
    
     
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId_tipo() {
        return id_tipo;
    }

    public String getApellido() {
        return apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    
    public int getN_cedula() {
        return n_cedula;
    }

    public void setN_cedula(int n_cedula) {
        this.n_cedula = n_cedula;
    }

    public void setId_tipo(int id_tipo) {
        this.id_tipo = id_tipo;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

   

   
    
    
   
}
