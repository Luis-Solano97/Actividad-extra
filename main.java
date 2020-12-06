

package actividadCopeada;

/
 *
 * @author Aaron
 */
public class Main {

    /
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona miEmpleadoNuevo = new Persona(170, 80, "Oso");//creacion de objeto de tipo Persona
        
        System.out.println("Datos Empleado "+miEmpleadoNuevo.dameDatosPersona ());
        miEmpleadoNuevo.setPeso(20);
        System.out.println("La altura del empleado es: "+miEmpleadoNuevo.getpeso());
        System.out.println("Datos Empleado "+miEmpleadoNuevo.dameDatosPersona());
        
        empleado miEmpleadoLuis = new empleado("Luis", 51265, "Valle de chalco", 1, 14, "persona");//creacion de un objeto tipo Empleado
        
        miEmpleadoLuis.datosPersona();
        
        System.out.println("Apodo"+miEmpleadoLuis.Apodo("Oso"));//uso del metodo de la interface
        
        System.out.println("Mi Empleado trabaja "+miEmpleadoLuis.promedioActivo(30)+"Años :/");
        
        
        
        
    }
    
}

