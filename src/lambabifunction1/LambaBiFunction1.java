package lambabifunction1;

import java.util.function.BiFunction;

public class LambaBiFunction1 {


    public static void main(String[] args) {
        //recibe dos valores de string y retorna un string
        BiFunction<String,String,String> bi = (x,y) -> x + y;
        
        System.out.println(bi.apply("hola ", "mundo"));
        
    }
    
}
