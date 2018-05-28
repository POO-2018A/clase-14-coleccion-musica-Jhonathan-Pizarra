
package musica;

public class Album {
    
    //1) Atributos
    public static int registro = 0;
    
    private String nombre;
    private int añodeCreacion;
    private int numeroCanciones;
    //Genero genero;
    private String genero;

    //2) Metodo constructor
    public Album(){
    registro++;
    }
    
    //3) Metodos setter y getter (s)

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    
    
    public int getAñodeCreacion() {
        return añodeCreacion;
    }

    public void setAñodeCreacion(int añodeCreacion) {
        this.añodeCreacion = añodeCreacion;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroCanciones() {
        return numeroCanciones;
    }

    public void setNumeroCanciones(int numeroCanciones) {
        this.numeroCanciones = numeroCanciones;
    }
    
    
    
    
}
