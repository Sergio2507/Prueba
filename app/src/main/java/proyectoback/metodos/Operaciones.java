package proyectoback.metodos;
import java.util.Scanner;
public class Operaciones {
    public String SumaD2(Scanner scanner){
        System.out.println("Ingresa el primer numero");
        String numero1=scanner.next();
        System.out.println("Ingresa el segundo numero");
        String numero2=scanner.next();
        return new Suma().Sumar(numero1, numero2);
    }
    public String SumaDVarios(Scanner scanner){
        System.out.println("Ingresa cuantos números deseas sumar");
        int cantidad=scanner.nextInt();
        String[] numeros= new String[cantidad];
        for (int i=0 ; i<=cantidad-1 ; i++){
            System.out.println("Ingresa el numero");
            numeros[i]=scanner.next();
        }
        return new Suma().Sumar(numeros);
    }
    public String RestaD2(Scanner scanner){
        System.out.println("Ingresa el primer numero");
        String numero1= scanner.next();
        System.out.println("Ingresa el segundo numero");
        String numero2=scanner.next();
        return new Restar().Resta(numero1, numero2);
    }
    public String RestaDVarios(Scanner scanner){
        System.out.println("Ingresa cuantos numeros quieres restar");
        int cantidad=scanner.nextInt();
        String [] numeros=new String[cantidad];
        for (int i=0 ; i<=cantidad-1; i++){
            System.out.println("Ingresa el numero");
            numeros[i]=scanner.next();
        }
        return new Restar().Resta(numeros);
    }
    public String MultiD2(Scanner scanner){
        System.out.println("Ingresa el primer numero");
        String numero1=scanner.next();
        System.out.println("Ingresa el segundo numero");
        String numero2=scanner.next();
        return new Multiplicar().Multiplica(numero1, numero2);
    }
    public String MultiDVArios(Scanner scanner){
        System.out.println("Ingresa cuantos numeros deseas multiplicar");
        int cantidad=scanner.nextInt();
        String [] numeros= new String[cantidad];
        for (int i =0; i < cantidad-1; i++) {
            System.out.println("Ingresa el numero");
            numeros[i]=scanner.next();
        }
        return new Multiplicar().Multiplica(numeros);
    }

}
