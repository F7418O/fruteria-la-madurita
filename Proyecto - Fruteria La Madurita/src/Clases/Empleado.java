
package Clases;

/**
 *
 * @author Frael Campos
 */
public class Empleado {
   
    private String nombre;
    private String apellido;
    private String fecha_na;
    private String e_mail;
    private String cedula;
    private String contraseña;
    private String ve_contraseña;
    private String direccion;
    private String telefono;
    private String celular;
    private String rol;

    public Empleado(final String nombres, final String apellidos, final String fecha_na, 
            final String e_mail, final String cedula, final String contraseña,
            final String ve_contraseña, final String direccion, final String telefono, final String celular,
            final String rol) {
        this.nombre = nombres;
        this.apellido = apellidos;
        this.fecha_na = fecha_na;
        this.e_mail = e_mail;
        this.cedula = cedula;
        this.contraseña = contraseña;
        this.ve_contraseña = ve_contraseña;
        this.direccion = direccion;
        this.telefono = telefono;
        this.celular = celular;
        this.rol = rol;
    }
    
    

    public String getNombres() {
        return nombre;
    }

    public void setNombres(final String nombres) {
        this.nombre = nombres;
    }

    public String getApellidos() {
        return apellido;
    }

    public void setApellidos(final String apellidos) {
        this.apellido = apellidos;
    }

    public String getFecha_na() {
        return fecha_na;
    }

    public void setFecha_na(final String fecha_na) {
        this.fecha_na =fecha_na;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(final String e_mail) {
        this.e_mail = e_mail;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(final String cedula) {
        this.cedula = cedula;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(final String contraseña) {
        this.contraseña = contraseña;
    }

    public String getVe_contraseña() {
        return ve_contraseña;
    }

    public void setVe_contraseña(final String ve_contraseña) {
        this.ve_contraseña = ve_contraseña;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(final String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(final String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(final String celular) {
        this.celular = celular;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(final String rol) {
        this.rol = rol;
    }
    
    
    
}
