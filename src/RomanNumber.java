import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class RomanNumber {

    private final static TreeMap<Integer, String> mapToRoman = new TreeMap<Integer, String>();
    private final static Map<String, Integer> mapToArabian = new HashMap<String, Integer>();

    static {

        /*
        mapToRoman.put(1000, "M");
        mapToRoman.put(900, "CM");
        mapToRoman.put(500, "D");
        mapToRoman.put(400, "CD");*/
        mapToRoman.put(100, "C");
        mapToRoman.put(90, "XC");
        mapToRoman.put(50, "L");
        mapToRoman.put(40, "XL");
        mapToRoman.put(10, "X");
        mapToRoman.put(9, "IX");
        mapToRoman.put(5, "V");
        mapToRoman.put(4, "IV");
        mapToRoman.put(1, "I");

        mapToArabian.put("I",1);
        mapToArabian.put("II",2);
        mapToArabian.put("III",3);
        mapToArabian.put("IV",4);
        mapToArabian.put("V",5);
        mapToArabian.put("VI",6);
        mapToArabian.put("VII",7);
        mapToArabian.put("VIII",8);
        mapToArabian.put("IX",9);
        mapToArabian.put("X",10);

    }

    public static String toRoman(int number) {
        int l =  mapToRoman.floorKey(number);
        if ( number == l ) {
            return mapToRoman.get(number);
        }
        return mapToRoman.get(l) + toRoman(number-l);
    }

    public static int toArabian(String roman){
        return mapToArabian.get(roman);
    }

}
