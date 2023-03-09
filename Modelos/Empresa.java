
package Modelos;

public class Empresa {
    /*
        1. Generar las variables de la clase
        2. Insertar los constructores
        3. Insertar los métodos setter
        4. Insertar la función toString()
    */
    
    private String nombre;
    private String nit;
    private String direccion;

    public Empresa() {
    }

    public Empresa(String nombre, String nit, String direccion) {
        this.nombre = nombre;
        this.nit = nit;
        this.direccion = direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Empresa{" + "nombre=" + nombre + ", nit=" + nit + ", direccion=" + direccion + '}';
    }
    
    
    
}
