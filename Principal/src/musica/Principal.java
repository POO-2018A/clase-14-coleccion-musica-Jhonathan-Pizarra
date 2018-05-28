package musica;
import java.util.*;

public class Principal {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        
        boolean terminar = false;
        int iterador = Artista.iterador; //Se irá aumentando conforme se vayan creando objetos
        int registro = Album.registro;
        System.out.print("¿De cuántos artistas vas a armar la colección?: ");
        int numeroArtistas = entrada.nextInt();
        Artista[] artist = new Artista[numeroArtistas]; //De esa manera le doy un tamaño fijo de artistas 
                
        do{
        System.out.println("MENU DE OPCIONES");
        System.out.println("1) Ingresar un nuevo artista");
        System.out.println("2) Ver la colección de música");
        System.out.println("3) Salir");
        System.out.print("Escoge una opción: ");
        int opcion = entrada.nextInt();
        System.out.println("");
        
        switch(opcion){
            case 1:
                //Crear un objeto...
                artist[iterador] = new Artista(); //Estado inicial del objeto Artista
             
                //Información del artista
                System.out.println("   INFORMACIÓN DEL ARTISTA  #"+(iterador+1));
                System.out.print("¿Cómo se llama el artista?: ");
                String nombreArtista = entrada.next();
                artist[iterador].setNombre(nombreArtista);
                
                //Ingresar fecha
                System.out.println("¿Cuál es la fecha de nacimiento?: ");
                int añoNacimiento; int mesNacimiento; int diaNacimiento;
                System.out.print("Año: ");
                añoNacimiento = entrada.nextInt();
                System.out.print("Mes: ");
                mesNacimiento = entrada.nextInt();
                System.out.print("Día: ");
                diaNacimiento = entrada.nextInt();
                artist[iterador].setFechaNacimiento(añoNacimiento, mesNacimiento, diaNacimiento);
                
                //Ingresar País
                System.out.print("¿De qué país es el artista?: ");
                String paisArtista = entrada.next();
                artist[iterador].setPais(paisArtista);
               
                //Si el iterador es 0, no tendrá con nada con que comparar...
                if(iterador == 0 ){
                    System.out.print("¿Cuántos albums vas a ingresar?: ");
                    int numeroAlbums = entrada.nextInt(); //Una coleccion de albums, para el iterador: 0
                    Album[] albums = new Album[numeroAlbums];
                    System.out.println("   INFORMACIÓN DEL ALBUM ");
                    System.out.println("Artista #"+(iterador+1));

                        for(int j=0; j<albums.length; j++){
                            albums[j] = new Album();
                    
                            System.out.println("Album: #"+(j+1));
                            System.out.print("Nombre del album: ");
                            String nombreAlbum = entrada.next();
                            albums[j].setNombre(nombreAlbum);

                            System.out.print("¿Cuántas canciones hay?: ");
                            int numeroCanciones = entrada.nextInt();
                            albums[j].setNumeroCanciones(numeroCanciones);
                            
                            System.out.print("¿Qué genero musical?: ");
                            String generoMusical = entrada.next();
                            albums[j].setGenero(generoMusical);
                            
                            System.out.println("");
                
                        }
                        //Colocar el arreglo de albums
                    artist[iterador].setAlbums(albums); 
                   
                
                registro++;
                }
                
                boolean similitud = false; //Variable que uso para saber si son similares o no
                
                for(int i=0; i<iterador; i++){ //<iterador para que no se compare consigo msmo el objeto
                if(artist[iterador].equals(artist[i])){ //No entra en la primera ejecucion porque 0 no es menor a 0, por eso puse ese if arriba
                    similitud = true;
                    System.out.println("Artista ya registrado!");
                    System.out.println("El artista: ["+iterador+"] y el artista: ["+i+"] son el mismo...");
                    System.out.print("¿Desea ingresar un nuevo album para ese artista? [Si=1];[No=0]: ");
                    int respuesta = entrada.nextInt();
                    
                   
                    if(respuesta == 1){
                     //Albumes del artista
                    System.out.print("¿Cuántos albums vas a ingresar?: ");
                    int numeroAlbums = entrada.nextInt();
                    Album[] albums = new Album[numeroAlbums];
                    System.out.println("   INFORMACIÓN DEL ALBUM ");
                    System.out.println("Artista #"+(iterador+1)); //Solo para saber la posicion
                   
                        for(int j=0; j<albums.length; j++){
                            albums[j] = new Album();
                    
                            System.out.println("Album #"+(j+1));
                            System.out.print("Nombre del album: ");
                            String nombreAlbum = entrada.next();
                            albums[j].setNombre(nombreAlbum);

                            System.out.print("¿Cuántas canciones hay?: ");
                            int numeroCanciones = entrada.nextInt();
                            albums[j].setNumeroCanciones(numeroCanciones);
                            
                            System.out.println("");
                
                        }
                        //Colocar el arreglo de albums
                    artist[iterador].setAlbums(albums); //En el artista [iterador] voy a ir colocando los albumes
                 
                    registro++;
                    }else if(respuesta == 0){
                        System.out.println("Ok");
                        break;
                    }
                
                
                   }
 
                }
                if(similitud == false){
                    for(int i=0; i<iterador; i++){
                    System.out.print("¿Cuántos albums vas a ingresar?: ");
                    int numeroAlbums = entrada.nextInt();
                    Album[] albums = new Album[numeroAlbums];
                    System.out.println("   INFORMACIÓN DEL ALBUM ");
                    System.out.println("Artista #"+(iterador+1));
                    
                        for(int j=0; j<albums.length; j++){
                            albums[j] = new Album();
                    
                            System.out.println("Album #"+(j+1));
                            System.out.print("Nombre del album: ");
                            String nombreAlbum = entrada.next();
                            albums[j].setNombre(nombreAlbum);

                            System.out.print("¿Cuántas canciones hay?: ");
                            int numeroCanciones = entrada.nextInt();
                            albums[j].setNumeroCanciones(numeroCanciones);
                            
                            System.out.println("");
                
                     }
                        //Colocar el arreglo de albums
                    artist[iterador].setAlbums(albums); //En el artista [i] voy a ir colocando los albumes
                  
                     registro++;
                    }
               
                }
                iterador++;
              
               
                if(iterador == artist.length){
                    System.out.println("");
                    System.out.println("¡AVISO!");
                    System.out.println("Numero máximo de artistas ingresados...");
                    
                }
                
                break;
            case 2:
                
                //TODO
                System.out.println("Información del Artista");
                for(int i=0; i<artist.length; i++){
                    System.out.println("Artista ["+(i+1)+"]; Nombre: "+artist[i].getNombre());
                    System.out.println("Artista ["+(i+1)+"]; Fecha de Nacimiento: "+artist[i].getFechaNacimiento());
                    System.out.println("Artista ["+(i+1)+"]; País de origen: "+artist[i].getPais());
               
                }
                System.out.println("");
                System.out.println("Información de los Albums");
                System.out.println("Registro: "+registro);
                
               for(int i=0; i<registro; i++){
                 
                    System.out.println("Album ["+(i+1)+")]; Nombre: "+artist[i].albums[i].getNombre());
                    System.out.println("Albums ["+(i+1)+")]; Canciones: "+artist[i].albums[i].getNumeroCanciones());
                    System.out.println("Albums ["+(i+1)+")]; Genros: "+artist[i].albums[i].getGenero());
                
                }
               
                break;
            case 3:
                terminar = true;
                break;
            default:
                System.out.println(" ");
                terminar = true;
                
                break;
        }
        
       
        }while(terminar !=true);
       
      
        
    }
    
}
