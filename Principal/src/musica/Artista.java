
package musica;
import java.util.*;

public class Artista {
    
    //1)Atributos
    public static int iterador = 0;
  
    private String nombre;
    private Date fechaNacimiento;
    private String pais;
    Album[] albums;

    //Constrrucotr vacio
    public Artista() { 
   //Cada vez que se cree un objeto, el iterador ganará +1,
        iterador++;
   
    }

    public Album[] getAlbums() {
        return albums;
    }

    public void setAlbums(Album[] albums) {
        this.albums = albums;
    }


    
    //Metodos Setter y Getter(s)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(int year, int month, int day) {
        GregorianCalendar calendario = new GregorianCalendar(year, month-1, day);
        this.fechaNacimiento = calendario.getTime();
        
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
    
    
    //@Override
    //Sobreescribir método "Equals"
    public boolean equals(Object obj){
    
        final Artista otroArtista = (Artista)obj; //¿Qué está pasando aquí?... Hacemos uns casting de Artista al objeto obj
        //Condiciones de comparacación
        if(this.nombre.equals(otroArtista.nombre)){
            if(this.fechaNacimiento.equals(otroArtista.fechaNacimiento)){
                if(this.pais.equals(otroArtista.pais)){
                    
                    return true;
                }
            }  
           
        }
    
        //De lo contrario, si no se cumplen...
        return false;
    }
   
    //Sobreescribir el método ToString
    @Override
    public String toString(){
    
        return "Nombre: "+this.nombre+" FechadeNacimiento: "+this.fechaNacimiento+" Pais: "+this.pais+" Albums: "+this.albums;
    }
    
}
