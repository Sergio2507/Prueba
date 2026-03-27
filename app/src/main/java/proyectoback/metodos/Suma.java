package proyectoback.metodos;
import java.util.ArrayList;
public class Suma {
    public String Sumar(String a, String b){
        Double respuesta=Double.parseDouble(a)+Double.parseDouble(b); 
        return "El resultado de la suma es: "+respuesta;
} 
    public String Sumar(ArrayList<String> lista){
        Double respuesta=0.0;
        for (String numero : lista) {  
            respuesta+=Double.parseDouble(numero);   
        }
        return "El resultado de la suma es: "+respuesta;
    }
}
