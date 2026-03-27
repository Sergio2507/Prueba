package proyectoback.metodos;
public class Raiz {
    public String Rai(String a){
        Double numero=Double.parseDouble(a);
        return "El resulrado de la raiz es: "+Math.sqrt(numero);
    }
    public String Rai(String a, String b){
        Double numero=Double.parseDouble(a);
        return "El resultado de la raíz es: "+Math.cbrt(numero);
    }
    public String Rai(String a, String b, boolean v){
        Double numero1=Double.parseDouble(a);
        Double numero2=Double.parseDouble(b);
        return "El resultado de la raíz es: "+Math.pow(numero1 , 1.0 /numero2);
    }
}
