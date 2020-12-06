package actividadCopeada;

/**
*
* @author Aaron
*/

//clase perro hereda de la clase animal e implementa la interface AccionesAnimales
public class empleado extends Persona implements Accionespersona{

//Atrubutos
private String Nombre;
private int NumeroTelefonico;
private String DireccionCasa;
private String Apodo;



//constructor

/*public Perro(int tamaño, int peso, String tipo_especie) {
super(tamaño, peso, tipo_especie);
}*/

public empleado(String Nombre, int NumeroTelefonico, String DireccionCasa, int tamaño, int peso, String tipo_especie) {
super(tamaño, peso, tipo_especie);//con la palabra reserva super se agrega el contructor de la clase padre
this.Nombre = Nombre;
this.NumeroTelefonico = NumeroTelefonico;
this.DireccionCasa = DireccionCasa;

}


//metodos de acceso
public String getNombre() {
return Nombre;
}

public void setNombre(String Nombre) {
this.Nombre = Nombre;
}

public int getNumeroTelefonico() {
return NumeroTelefonico;
}

public void setNumeroTelefonico(int NumeroTelefonico) {
this.NumeroTelefonico = NumeroTelefonico;
}

public String getDireccionCasa() {
return DireccionCasa;
}

public void setDireccionCasa(String DireccionCasa) {
this.DireccionCasa = DireccionCasa;
}

public void datosEmpleado(){

System.out.println("El Empleado se llama"+Nombre+" Su numero de telefono es"+NumeroTelefonico+" Vive en "+DireccionCasa);

} 



//metodos de la interface
//@Override
public String Apodo(String Apodo) {
// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
this.Apodo=Apodo;
return "Su apodo es"+Apodo;

}

//@Override
public int promedioActivo(int aniosTrabajo) {
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

return aniosTrabajo;
}


public void aniosTrabajo(){
System.out.println("El Empleado trabaja en promedio"+vida);
}
private int vida;

private String apodo;

void datosPersona() {
throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
}








}
