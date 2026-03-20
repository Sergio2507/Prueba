package proyectoback.metodos;

public class Multiplicar {
    public String Multiplica(String a, String b){
        Double respuesta=Double.parseDouble(a)*Double.parseDouble(b);
        return "El resultado de la multiplicacion es: "+respuesta;
    }
    public String Multiplica(String numeros[]){
        Double respuesta=0.0;
        for (String numero : numeros){
            respuesta*=Double.parseDouble(numero);
        }
        return "El resultado de la multiplicacion es: "+respuesta;
    }
}  
