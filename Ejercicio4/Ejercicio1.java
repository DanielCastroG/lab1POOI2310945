
package Ejercicio4;


public class Ejercicio1 {
    public static void main(String[] args) {
        int numA=-6;
        int numB=-8;
        
        if (numA>=0 && numB>=0 || numA<0 && numB<0){
            System.out.println("True");
        }else{
            System.out.println("numA y numB tienen diferente signo");
        }
    }
}
