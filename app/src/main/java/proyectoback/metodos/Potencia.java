package proyectoback.metodos;
public class Potencia {
    public String Potenciar(String a){
        int numero =Integer.parseInt(a);
        return "El resultado de la potencia es "+Math.pow(numero, 2);
    }
    public String Potenciar(String a, String b){
        int numero=Integer.parseInt(a);
        return  "El resultado de la potencia es "+Math.pow(numero, 3);
    }
    public String Potenciar(String a, String b, boolean salir){
        int numero=Integer.parseInt(a);
        int potencia=Integer.parseInt(b);
        return "El resultado de la potencia es "+Math.pow(numero, potencia);
    }
}   
