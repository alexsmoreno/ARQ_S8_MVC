package presentacion;
import java.util.Scanner;

public class Validacion {
    private final Scanner in = new Scanner(System.in);    
    public int inInt(){
        int entrada = 0;
        boolean valido = false;
        do {
            try {
                entrada = in.nextInt();             
                valido = true;                
            }catch (Exception e){
               this.mostrarError("Real");
            }
        }while (!valido);
        return entrada;
    }
    
    public String inString(){
        String cadena = "";
        boolean valido = false;
        do {
            try{
                String entrada = in.next();
                valido = true;  
            }catch (Exception e){
               this.mostrarError("String");
            }  
        } while (!valido);
        return cadena;
    }
    
    private void mostrarError(String formato){
        System.out.println("Error de Formato.. "+ "Ingrese un valor con formato: " + formato + "\n" );
    }
}
