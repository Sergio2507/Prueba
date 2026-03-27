package proyectoback.metodos;
import java.util.ArrayList;
public class Division {
    public String Divide(String a, String b){
        Double respuesta=Double.parseDouble(a)/Double.parseDouble(b);
        return "El resultado de la division es: "+respuesta;
    }
    public String Divide(ArrayList<String> lista){
        Double respuesta=1.0;
        for (String numero : lista){
            respuesta/=Double.parseDouble(numero);
        }
        return "El resultado de la division es: "+respuesta;
    }
}
