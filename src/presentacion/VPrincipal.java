package presentacion;
import dominio.Partida;
import dominio.Partidas;
import java.util.ArrayList;

public class VPrincipal {
    private Partidas adminPartidas;
    
    public VPrincipal(Partidas admin){
        adminPartidas = admin;
    }
    
    public int eleccion(){
        Validacion validar = new Validacion();
        System.out.println("\tJan Ken Po");
        System.out.println("[0] Salir");
        System.out.println("[1] Nueva Partida");
        System.out.println("[2] Partidas Guardadas");
        System.out.println("Eleccion: ");
        return validar.inInt();
        
    }
    public void seleccionPartida(){
        Validacion validar = new Validacion();
        ArrayList<Partida> partidas = adminPartidas.ObtenerListaPartidas();
        System.out.println("\n\tPARTIDAS GUARDADAS");
        for (Partida x : partidas) {
            System.out.println("["+x.getId()+"] "+x.getNombre());
        }       
        Partida pa =null;
        while(pa==null){
            System.out.print("Eleccion: ");
            pa = adminPartidas.ObtenerPartida(validar.inInt());    
        }        
        System.out.println("Partida Econtrada...");
    }
    public void cerrar(){
        System.out.println("Juego cerrado");
    }
    
 
}
