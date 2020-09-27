package Clases;

/**
 *
 * @author Frael Campos
 */
public class Proveedores {

    private String empresa;
    private String contacto;
    private String direccion;
    private String telefono;


    public Proveedores(String empresa, String contacto, String direccion, String telefono) {
        this.empresa = empresa;
        this.contacto = contacto;
        this.direccion = direccion;
        this.telefono = telefono;
        
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

        
}
