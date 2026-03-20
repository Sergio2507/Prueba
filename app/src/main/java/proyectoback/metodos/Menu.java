package proyectoback.metodos;
import java.util.Scanner;
public class Menu {
    Scanner scanner = new Scanner(System.in);
    public void MostrarMenu(){  
        System.out.println("Que tipo de operacion desea realizar 1-Suma 2-Resta 3-Multiplicacion 4-Division 5-Potencia 6-Raiz 7-Factorial");  
        String op = scanner.next();
        switch(op){
            case "1" -> { 
             
                System.out.println("Cuantos numeros quiere sumar: ");
                // String numero=scanner.next();
                System.out.println("1. Dos numeros /2. N numeros");
                String cantidadDeNumeros = (scanner.next().equals("1")) ? new Operaciones().SumaD2(scanner) : new Operaciones().SumaDVarios(scanner);
                System.out.println(cantidadDeNumeros);
               /*if (numero.equals("1")) {
                    new Operaciones().SumaD2(scanner);
                } 
                if (numero.equals("2")) {
                    new Operaciones().SumaDVarios(scanner);
                    //Profe aqui no se por que no da, no me marca error pero no hace nada y segun yo esta como en la funcion de 2 numeros :( )
                } */
                    
            }
            case "2" ->{
                System.out.println("Cuantos numeros quiere restar: ");
                System.out.println("1. Dos numeros /2. N numeros");
                String cantidadDeNumeros = (scanner.next().equals("1")) ? new Operaciones().RestaD2(scanner) : new Operaciones().RestaDVarios(scanner);
                System.out.println(cantidadDeNumeros);
             }
            case "3" ->{
                System.out.println("Cuantos numeros quieres multiplicar");
                System.out.println("1.Dos numeros / 2. N numeros");
                String cantidadDeNumeros = (scanner.next().equals("1")) ? new Operaciones().MultiD2(scanner) : new Operaciones().MultiDVArios(scanner);
                System.out.println(cantidadDeNumeros);
            }
            }
        
        }
}
