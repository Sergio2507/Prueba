package proyectoback.metodos;
import java.util.ArrayList;
import java.util.Scanner;
public class Operaciones {
    ArrayList<String> lista = new ArrayList<>();
    
    public String SumaD2(Scanner scanner){
        System.out.println("Ingresa el primer numero");
        String numero1=scanner.next();
        System.out.println("Ingresa el segundo numero");
        String numero2=scanner.next();
        return new Suma().Sumar(numero1, numero2);
    }
    public String SumaDVarios(Scanner scanner){
        boolean salir =true;
        while (salir){
            System.out.println("Ingresa un 0 para terminar");
            System.out.println("Ingresa el numero");
            String numero=scanner.next();
            if (numero.equals("0")){
                System.out.println("Saliendo");
                salir=false;
            }
            lista.add(numero);
        }
        lista.removeLast();
        return new Suma().Sumar(lista);
    }
    public String RestaD2(Scanner scanner){
        System.out.println("Ingresa el primer numero");
        String numero1= scanner.next();
        System.out.println("Ingresa el segundo numero");
        String numero2=scanner.next();
        return new Restar().Resta(numero1, numero2);
    }
    public String RestaDVarios(Scanner scanner){
        boolean salir=true;
        while (salir){
            System.out.println("Ingresa un 0 para terminar");
            System.out.println("Ingresa el numero");
            String numero=scanner.next();
            if (numero.equals("0")){
                System.out.println("Saliendo");
                salir=false;
            }
            lista.add(numero);
        }
         lista.removeLast();
        return new Restar().Resta(lista);
    }
    public String MultiD2(Scanner scanner){
        System.out.println("Ingresa el primer numero");
        String numero1=scanner.next();
        System.out.println("Ingresa el segundo numero");
        String numero2=scanner.next();
        return new Multiplicar().Multiplica(numero1, numero2);
    }
    public String MultiDVArios(Scanner scanner){
        boolean salir=true;
        while (salir){
            System.out.println("Ingresa un 0 para terminar");
            System.out.println("Ingresa el numero");
            String numero=scanner.next();
            if (numero.equals("0")){
                System.out.println("Saliendo");
                salir=false;
            }
            lista.add(numero);
        }
         lista.removeLast();
        return new Multiplicar().Multiplica(lista);
    }
    public String DivD2(Scanner scanner){
        System.out.println("Ingresa el primer numero");
        String numero1=scanner.next();
        System.out.println("Ingresa el segundo numero");
        String numero2=scanner.next();
        return new Division().Divide(numero1, numero2);
    }
    public String DiviDVarios(Scanner scanner){
       boolean salir=true;
        while (salir){
            System.out.println("Ingresa un 0 para terminar");
            System.out.println("Ingresa el numero");
            String numero=scanner.next();
            if (numero.equals("0")){
                System.out.println("Saliendo");
                salir=false;
            }
            lista.add(numero);
        }
         lista.removeLast();
        return new Division().Divide(lista);
    }
    public String Potencia2(Scanner scanner){
        System.out.println("Ingresa el numero");
        String numero=scanner.next();
        if (numero.equals("0")){
            System.out.println("Numero no valido");
        }
        return new Potencia().Potenciar(numero);
    }
    public String Potencia3(Scanner scanner){
        System.out.println("Ingresa el numero");
        String numero=scanner.next();
        String b="";
        if (numero.equals("0")){
            System.out.println("Numero no valido");
        }
        return new Potencia().Potenciar(numero, b);
    }
    public String PotenciaN(Scanner scanner){
        System.out.println("ingresa el numero base");
        String numero=scanner.next();
        System.out.println("Ingresa el valor de la potencia");
        String p=scanner.next();
        boolean x=true;
        if (numero.equals("0") || p.equals("0")){
            System.out.println("Numero no valido");
        }
        return new Potencia().Potenciar(numero, p, x);
    }
    public String RaizCua(Scanner scanner){
        System.out.println("Ingresa el numero base");
        String numero=scanner.next();
        if (numero.equals("0")){
            System.out.println("Numero no valido");
        }
        return new Raiz().Rai(numero);
    }
    public String RaizCub(Scanner scanner){
        System.out.println("Ingresa el numero base");
        String numero=scanner.next();
        String x="";
        if (numero.equals("0")){
            System.out.println("Numero no valido");
        }
        return new Raiz().Rai(numero, x);
    }
    public String RaizN(Scanner scanner){
        System.out.println("Ingresa el numero base");
        String base=scanner.next();
        System.out.println("Ingresa el numero de la raíz");
        String n=scanner.next();
        boolean v=true;
        if (base.equals("0") || n.equals("0")){
            System.out.println("Numero no valido");
        }
        return new Raiz().Rai(base, n, v);
    }
    public String Factor(String a){
        int n=Integer.parseInt(a);
        if(n==0){
            System.out.println("Numero no valido");
        }
        return new Factorial().Fact(a);
    }
}