
package Clases;

public class Empleado {
    private int id_rol;
    private int dni;
    private String nombre;
    private String apellido;
    private int telefono;
    private String contraseña;

    public Empleado(int id_rol, int dni, String nombre, String apellido, int telefono, String contraseña) {
        this.id_rol = id_rol;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.contraseña = contraseña;
    }
    
    public Empleado(){}
    public int getId_rol() {
        return id_rol;
    }

    public int  getDni(){
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getContraseña() {
        return contraseña;
    }
    
    
}
