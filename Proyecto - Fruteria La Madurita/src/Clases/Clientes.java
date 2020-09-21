
package Clases;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Frael Campos
 */
public class Clientes {
   //Atributos
   
    private String id;
    private String n_cedula;
    private String nombre;
    private String direccion;
    private String num_cell;
    

    //

    public Clientes(String nombre, String id, String n_cedula, String direccion, String num_cell) {
        this.nombre = nombre;
        this.id = id;
        this.n_cedula = n_cedula;
        this.direccion = direccion;
        this.num_cell = num_cell;
    }

    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getNum_cell() {
        return num_cell;
    }

    public void setNum_cell(String num_cell) {
        this.num_cell = num_cell;
    }
    
    
   
}
