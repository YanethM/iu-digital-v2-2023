
package Modelos;


public abstract class Empleado {
    /*
        1. Generar las variables de la clase
        2. Insertar los constructores
        3. Insertar los métodos setter() y las funciones getter()
        4. Insertar la función toString()
    */
    private String nombreCompleto;
    private String documento;
    private float valorHora;

    public Empleado() {
    }

    public Empleado(String nombreCompleto, String documento, float valorHora) {
        this.nombreCompleto = nombreCompleto;
        this.documento = documento;
        this.valorHora = valorHora;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getDocumento() {
        return documento;
    }

    public float getValorHora() {
        return valorHora;
    }
    
    

    @Override
    public String toString() {
        return "Empleado{" + "nombreCompleto=" + nombreCompleto + ", documento=" + documento + ", valorHora=" + valorHora + '}';
    }
}
