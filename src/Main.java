import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String line = reader.readLine();
            String[] mass = line.split(" ");
            if(mass.length > 3) throw new IOException("incorrect data format");

            if(isArabian(line.substring(0,1))){

                int a = Integer.parseInt(mass[0]);
                int b = Integer.parseInt(mass[2]);
                if(a > 10 || b > 10) throw new IOException("incorrect data format");

                switch (mass[1]){
                    case "+": System.out.println(a+b); return;
                    case "-": System.out.println(a-b); return;
                    case "/": System.out.println(a/b); return;
                    case "*": System.out.println(a*b); return;
                    default: throw new IOException("incorrect data format");
                }
            }
            else{
                int a = RomanNumber.toArabian(mass[0]);
                int b = RomanNumber.toArabian(mass[2]);

                switch (mass[1]){
                    case "+": System.out.println(RomanNumber.toRoman(a+b)); return;
                    case "-": System.out.println(RomanNumber.toRoman(a-b)); return;
                    case "/": System.out.println(RomanNumber.toRoman(a/b)); return;
                    case "*": System.out.println(RomanNumber.toRoman(a*b)); return;
                    default: throw new IOException("incorrect data format");
                }

            }
        }
        catch (IOException e) {
           e.printStackTrace();
        }
    }
    private static boolean isArabian(String c){
        try {
            Integer.parseInt(c);
            return true;
        }catch (NumberFormatException e){
            return false;
        }

    }
}
