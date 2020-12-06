
package actividadCopeada;

/**
 *
 * @author Aaron
 */
public class Persona {
    
    
    //Atrubutos 
    private int altura;
    private int peso;
    private String color_cabello;

    //Constructor
    public Persona(int tamaño, int peso, String color_cabello) {
        this.altura = tamaño;
        this.peso = peso;
        this.color_cabello = color_cabello;
    }
    
    //Metodos de acceso

    public int getaltura() {
        return altura;
    }

    public void setaltura(int altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getcolor_cabello() {
        return color_cabello;
    }

    public void setcolor_cabello(String color_cabello) {
        this.color_cabello = color_cabello;
    }
    
    //Metodo
    
    public String dameDatosPersona(){
    
    return "color de cabello: "+color_cabello+" Peso: "+peso+"kg "+ "Estatura: "+altura+"Centimetros";
    }

    String getpeso() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

