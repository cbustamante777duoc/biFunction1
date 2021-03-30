
package ejercicio2;

import java.util.function.BiFunction;


public class Calculadora {
    //func recibe 2 paramentros y retorna un string 
    public String Calculadora(BiFunction<Integer,Integer,String> bi, 
            Integer para1,Integer para2){
    
     return  bi.apply(para1, para2);
    }
       
}
