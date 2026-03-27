package proyectoback.metodos;
import java.util.ArrayList;
public class Restar {
    public String Resta(String a, String b){
        Double respuesta=Double.parseDouble(a)-Double.parseDouble(b);
        return "El resultado de la resta es: "+respuesta;
    }
    public String Resta(ArrayList<String>lista){
    Double respuesta=0.0;
    for (String numero : lista){  
        respuesta-=Double.parseDouble(numero);
    }
    return "El resultado de la resta es: "+respuesta;
    }
}
