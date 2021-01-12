package presentacion;
import dominio.Partidas;

public class VCrearPartida {
    private final Partidas adminPartidas;
    
    public VCrearPartida(Partidas admin){
        adminPartidas = admin;
    }
    
    public boolean CrearNuevaPartida(){
        Validacion validar = new Validacion();
        System.out.println("\n\tCREAR NUEVA PARTIDA");
        System.out.print("Ingresar Nombre: ");
        adminPartidas.CrearPartida(validar.inString());
        System.out.println("[1] Persona Vs Persona");
        System.out.println("[2] Persona Vs Maquina");
        System.out.println("Eleccion: ");
        
        switch(validar.inInt()){
            case 1: return false;                
            default: return true;
        }
    }
}
