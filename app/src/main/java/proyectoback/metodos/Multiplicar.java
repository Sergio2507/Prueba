package proyectoback.metodos;
import java.util.ArrayList;
public class Multiplicar {
    public String Multiplica(String a, String b){
        Double respuesta=Double.parseDouble(a)*Double.parseDouble(b);
        return "El resultado de la multiplicacion es: "+respuesta;
    }
    public String Multiplica(ArrayList<String>lista){
        Double respuesta=1.0;
        for (String numero : lista){
            respuesta*=Double.parseDouble(numero);
        }
        return "El resultado de la multiplicacion es: "+respuesta;
    }
}  
