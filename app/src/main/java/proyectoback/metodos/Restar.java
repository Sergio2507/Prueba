package proyectoback.metodos;

public class Restar {
    public String Resta(String a, String b){
        Double respuesta=Double.parseDouble(a)-Double.parseDouble(b);
        return "El resultado de la resta es: "+respuesta;
    }
    public String Resta(String numeros[]){
    Double respuesta=0.0;
    for (String numero : numeros){  
        respuesta-=Double.parseDouble(numero);
    }
    return "El resultado de la resta es: "+respuesta;
    }
}
