package ejercicio2;

public class NewMain {
    
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        
        String resultado = calculadora.Calculadora((x,y)->" :" + (x*y), 20,10);
        
        System.out.println("El resultado es "+resultado);
    }
    
}
