package Operaciones;

import Modelos.Empresa;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OperacionesEmpresa implements IOperacionesEmpresa {

    
    /*
        1. Implementar la interfaz
        2. Implementar los métodos abstractos de la interfaz
        3. Crear una función que permita añadir empresas en el sistema
        4. Crear instancia de la librería Scanner
        5. Instanciar el modelo Empresa
        6. Crear ArrayList para almacenar 1 o varias empresas
        7. Función que permite crear empresas y retorna la información de estas
        8. Crear el constructor vacío de la clase
     */
    private String nombreEmpresaOper;
    private String nitEmpresaOper;
    private String direccionEmpresaOper;
    Scanner entradaDatos = new Scanner(System.in);
    private Empresa empresa;
    List<Empresa> listaEmpresas = new ArrayList<Empresa>();

    public OperacionesEmpresa() {
    }
    
    public List<Empresa> crearEmpresas(){
        System.out.println("--------------------------------------------------------------------");
        System.out.println("                    >> Registrar empresas <<");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("\nCúantas empresas deseas crear?");
        int cantEmpresas = entradaDatos.nextInt();
        entradaDatos.nextLine();
        for (int i = 1; i <= cantEmpresas; i++) {
            empresa = new Empresa();
            System.out.println("            Empresa n° " + i);
            
            System.out.println("Nombre empresa:");
            nombreEmpresaOper = entradaDatos.nextLine();
            
            System.out.println("NIT:");
            nitEmpresaOper = entradaDatos.nextLine();
            
            System.out.println("Dirección:");
            direccionEmpresaOper = entradaDatos.nextLine();
            
            empresa.setNombre(nombreEmpresaOper);
            empresa.setNit(nitEmpresaOper);
            empresa.setDireccion(direccionEmpresaOper);
            
            listaEmpresas.add(empresa);
        }
        return listaEmpresas;
    }
    
    
    @Override
    public void listarEmpresas() {
        System.out.println("\n                    >> Información empresas <<");
        System.out.println("--------------------------------------------------------------------");
        for (int i = 0; i < listaEmpresas.size(); i++) {
            //System.out.println(listaEmpresas.get(i));
            System.out.println(listaEmpresas.get(i).getNombre());
        }
    }

    @Override
    public void listarEmpleadosPorEmpresa() {
    }

}
