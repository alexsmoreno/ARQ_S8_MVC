package dominio;
import java.util.ArrayList;

public class Partidas {
    private final ArrayList<Partida>listaPartidas =new ArrayList();
    private Partida partida;

    public Partida CrearPartida(String nombre){
        int id = this.listaPartidas.size();
        this.partida = new Partida(id,nombre);
        this.listaPartidas.add(partida);
        return partida;
    }

    private boolean GuardarPartida(){
        //Coneccion con presentador a la logica de negocio
        return false;
    }

    public Partida getPartida() {
        return partida;
    }

    private boolean CancelarPartida(){
        try{
            this.partida = null;
            return true;
        }catch(Exception e){        
            return false;
        }
    }

    public Partida ObtenerPartida(int id){
        for (Partida p : listaPartidas) {
            if (p.getId()== id) {
                this.partida= p;
            }
        }
        return null;
    }
    public ArrayList ObtenerListaPartidas(){
        return this.listaPartidas;
    }

}
