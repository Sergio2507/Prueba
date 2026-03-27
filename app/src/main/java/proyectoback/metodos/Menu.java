package proyectoback.metodos;

import java.util.Scanner;
public class Menu {
    Scanner scanner = new Scanner(System.in);
    public void MostrarMenu(){ 
        boolean salir=true; 
        while (salir){
        System.out.println("Que tipo de operacion desea realizar 1-Suma 2-Resta 3-Multiplicacion 4-Division 5-Potencia 6-Raiz 7-Factorial");  
        System.out.println("Ingrese un 0 para salir");
        String op = scanner.next();
        switch(op){
            case "0" ->{
                System.out.println("Saludos");
                salir=false;
            }
            case "1" -> { 
                System.out.println("Cuantos numeros quiere sumar: ");
                System.out.println("1. Dos numeros /2. N numeros");
                String cantidadDeNumeros = (scanner.next().equals("1")) ? new Operaciones().SumaD2(scanner) : new Operaciones().SumaDVarios(scanner);
                System.out.println(cantidadDeNumeros);
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
            case "4" ->{
                System.out.println("Cuantos numeros quieres dividir");
                System.out.println("1.Dos numeros / 2.N numeros");
                String Numeros=(scanner.next().equals("1")) ? new Operaciones().DivD2(scanner) : new Operaciones().DiviDVarios(scanner);
                System.out.println(Numeros);
            }
            case "5" ->{
                System.out.println("Que tipo de potencia quieres realizar");
                System.out.println("1.Cuadrado / 2.Cubo / 3.A la N");
                String Numeros=(scanner.next().equals("1")) ? new Operaciones().Potencia2(scanner) : (scanner.next().equals("2")) ? new Operaciones().Potencia3(scanner) : new Operaciones().PotenciaN(scanner);
                System.out.println(Numeros);
            }
            case "6" ->{
                System.out.println("Que tipo de raíz quieres hacer?");
                System.out.println("1.Cuadrada / 2.Cubica / 3.A la N");
                String Numeros=(scanner.next().equals("1")) ? new Operaciones().RaizCua(scanner) : (scanner.next().equals("2")) ? new Operaciones().RaizCub(scanner) : new Operaciones().RaizN(scanner);
                System.out.println(Numeros);
            }
            case "7" ->{
                System.out.println("Ingresa el numero del factorial");
                String Numero=scanner.next();
                Operaciones operacion = new Operaciones();
                String respuesta=operacion.Factor(Numero);
                System.out.println(respuesta);                
            }   
            }
        }
        }
}