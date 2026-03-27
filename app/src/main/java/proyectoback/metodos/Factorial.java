package proyectoback.metodos;

public class Factorial {
    public String Fact(String a){
        int cantidad=Integer.parseInt(a);
        double respuesta=1;
        for (int i=2 ; i<=cantidad ; i++){
            respuesta*=i;
        }
        return "El resultado del factorial es: "+respuesta;
    }
}
