import java.util.Scanner;
public class simple_calc {

public static void main(String[] args) {
    
    System.out.println("gebe eine zahl ein");
    Scanner eingabe = new Scanner(System.in);
    int zahl1 = eingabe.nextInt();
    
    System.out.println("gebe eine weitere zahl ein");
    Scanner eingabe2 = new Scanner(System.in);
    int zahl2 = eingabe2.nextInt();
    
    System.out.println("welche operation");
    Scanner eingabe3 = new Scanner(System.in);
    String operator = eingabe3.next();
    //char operatorchar = operator;
    
    System.out.println(zahl1 + " " + operator + " " + zahl2);
    
    double ergebnis = 0;

    switch (operator) {
        case "+":
            ergebnis = zahl1 + zahl2;
            break;
        case "-":
            ergebnis = zahl1 - zahl2;
            break;
        case "*":
            ergebnis = zahl1 * zahl2;
            break;
        case "/":
            ergebnis = zahl1 / zahl2;
            break;
        default:
            System.out.println("illegal operand");
    }
    
    System.out.println(ergebnis);


    }
    
}
