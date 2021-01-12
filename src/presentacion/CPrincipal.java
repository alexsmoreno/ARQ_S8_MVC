package presentacion;

import dominio.Partidas;

public class CPrincipal {
    private final Partidas admin;
    private final VPrincipal vprincipal;
    
    public CPrincipal(){
        admin = new Partidas();
        vprincipal = new VPrincipal(admin);
    }
    public void controlar(){
        boolean estado = true;
        while(estado){
            switch(vprincipal.eleccion()){
                case 0:
                    vprincipal.cerrar();
                    estado = false;
                    break;
                case 1:
                    conCrearPartida();                    
                    break;
                case 2:
                    vprincipal.seleccionPartida();
                    conJugarPartida();
                    break;     
            }
        }
    }
    public void conCrearPartida(){
        CCrearPartida cnuevaPartida = new CCrearPartida(admin);
        cnuevaPartida.controlar();
    }
    public void conJugarPartida(){
        CJugarPartida cjugarPartida = new CJugarPartida(admin);
        cjugarPartida.controlar();
    }
    
}
