package presentacion;

import dominio.Partidas;


class CJugarPartida {
    private final Partidas admin;
    private final VJugarPartida vjugarpartida;
    
    public CJugarPartida(Partidas partidas){
        admin = partidas;
        vjugarpartida = new VJugarPartida(admin);
    }
    void controlar() {
        while(admin.getPartida().getnPartidas()<5){
            
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
