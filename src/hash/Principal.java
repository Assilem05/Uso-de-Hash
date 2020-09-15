package hash;

import seg.*;

public class Principal {
    public static void main(String[] args) {
        
        try{
          System.out.println(Cripto.md5("Um texto ai"));
          System.out.println(Cripto.sha256("Um texto ai"));
          System.out.println(Cripto.sha512("Um texto ai"));
        }
        
        catch(Exception e){
            
        }
    }
}
