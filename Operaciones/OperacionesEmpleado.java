package Operaciones;

import Modelos.EmpleadoAdmin;
import Modelos.EmpleadoDesarrollador;
import Modelos.Empresa;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OperacionesEmpleado implements IOperacionesEmpleados {

    private String nombreEmpOper;
    private String documentoEmpOper;
    private float valorHoraEmpOper;
    private EmpleadoDesarrollador empleadoDev;
    private EmpleadoAdmin empleadoAdmin;
    
    OperacionesEmpresa operEmpresa = new OperacionesEmpresa();
    Scanner entradaDatos = new Scanner(System.in);
    
    List<EmpleadoDesarrollador> listaDesarrolladores = new ArrayList<EmpleadoDesarrollador>();
    List<EmpleadoAdmin> listaAdministrativos = new ArrayList<EmpleadoAdmin>();
    List<String> nombreEmpresas = new ArrayList<String>();
    
    public List<String> obtenerNombreEmpresa(){
        List<Empresa> empresas = new ArrayList<Empresa>();
        empresas = operEmpresa.crearEmpresas();
        for (int i = 0; i < empresas.size(); i++) {
            nombreEmpresas.add(empresas.get(i).getNombre());
        }
        return nombreEmpresas;
    }
    
    @Override
    public void crearEmpleados() {
        
        System.out.println("\n**********************************************************");
        System.out.println("                   Crear empleados");
        System.out.println("A qué empresa los deseas añadir " + nombreEmpresas);
        System.out.println("Cuántos empleados deseas crear?");
        int cantEmpleados = entradaDatos.nextInt();
        
        System.out.println("\nSelecciona el perfil del empleado:\n           1. Administrador\n           2. Desarrollador");
        int tipoEmpleado = entradaDatos.nextInt();
        entradaDatos.nextLine();
        
        if (tipoEmpleado == 1) {
            System.out.println("Vas a crear " + cantEmpleados +" empleado(s)");
            for (int i = 1; i <= cantEmpleados; i++) {
                System.out.println("\n          >> Empleado N°" + i);
                empleadoAdmin = new EmpleadoAdmin();
                
                System.out.println("Nombre completo: ");
                nombreEmpOper = entradaDatos.nextLine();
                System.out.println("Documento: ");
                documentoEmpOper = entradaDatos.nextLine();
                System.out.println("Valor hora: ");
                valorHoraEmpOper = entradaDatos.nextFloat();
                entradaDatos.nextLine();
                empleadoAdmin.setNombreCompleto(nombreEmpOper);
                empleadoAdmin.setDocumento(documentoEmpOper);
                empleadoAdmin.setValorHora(valorHoraEmpOper);
                
                listaAdministrativos.add(empleadoAdmin);
            }
            System.out.println(listaDesarrolladores);
        } else {
            System.out.println("Vas a crear " + cantEmpleados +" empleado(s)");
            for (int i = 1; i <= cantEmpleados; i++) {
                System.out.println("\n          >> Empleado N°" + i);
                empleadoDev = new EmpleadoDesarrollador();
                
                System.out.println("Nombre completo: ");
                nombreEmpOper = entradaDatos.nextLine();
                System.out.println("Documento: ");
                documentoEmpOper = entradaDatos.nextLine();
                System.out.println("Valor hora: ");
                valorHoraEmpOper = entradaDatos.nextFloat();
                entradaDatos.nextLine();
                empleadoDev.setNombreCompleto(nombreEmpOper);
                empleadoDev.setDocumento(documentoEmpOper);
                empleadoDev.setValorHora(valorHoraEmpOper);
                
                listaDesarrolladores.add(empleadoDev);
            }
            System.out.println(listaDesarrolladores);
        }
    }

}
