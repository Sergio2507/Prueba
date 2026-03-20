package proyectoback.metodos;

public class Suma {
    public String Sumar(String a, String b){
        Double respuesta=Double.parseDouble(a)+Double.parseDouble(b); 
        return "El resultado de la suma es: "+respuesta;
} 
    public String Sumar(String numeros[]){
        Double respuesta=0.0;
        for (String numero : numeros) {
            respuesta+=Double.parseDouble(numero);   
        }
        return "El resultado de la suma es: "+respuesta;
    }
}
