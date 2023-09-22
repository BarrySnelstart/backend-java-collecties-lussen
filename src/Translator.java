import java.util.Arrays;
import java.util.HashMap;

public class Translator {
    HashMap <Integer, String> numericAlpha = new HashMap <>();

    Translator(String[] alphabetic, Integer[] numeric) {
        for (int i = 0; i < Arrays.stream(alphabetic).count(); i++) {
            numericAlpha.put(numeric[i], alphabetic[i]);

//            Controlle of het werkt
//            System.out.println("Adding " + alphabetic[i] + " and " + numeric[i]);
//            System.out.println(numericAlpha);
        }
    }
    String Translate (Integer nummer){
        return numericAlpha.get(nummer);

    }

}


