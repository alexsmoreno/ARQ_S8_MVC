
package presentacion;

import dominio.Partidas;

public class CCrearPartida {
    private final Partidas admin;
    private final VCrearPartida vcrearpartida;
    
    public CCrearPartida(Partidas partidas){
        admin = partidas;
        vcrearpartida = new VCrearPartida(admin);
    }
    public void controlar(){
        vcrearpartida.CrearNuevaPartida();
        admin.getPartida().setOponentes();
    }
    
}
