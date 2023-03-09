
package semana4_68;

import Operaciones.OperacionesEmpleado;
import Operaciones.OperacionesEmpresa;

public class Main {


    public static void main(String[] args) {
        OperacionesEmpresa instOperEmp = new OperacionesEmpresa();
        OperacionesEmpleado instOperEmpleado = new OperacionesEmpleado();
        
        //System.out.println(instOperEmp.crearEmpresas());
        System.out.println(instOperEmpleado.obtenerNombreEmpresa());
        instOperEmp.listarEmpresas();

        
        instOperEmpleado.crearEmpleados();
    }
    
}
