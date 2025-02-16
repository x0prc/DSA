import java.util.*;
import java.lang.*;

public class binaryStrings {
    public static String toString(char[] a) {
        String string = new String(a);
        return string;
    }

    static void generate(int k, char[] ch, int n) {

        if (n == k) {
 
            System.out.print(toString(ch)+" ");
            return;

        }

        if (ch[n - 1] == '0') {
            ch[n] = '0';
            generate(k, ch, n + 1);
            ch[n] = '1';
            generate(k, ch, n + 1);
        }

        if (ch[n - 1] == '1') {

            ch[n] = '0';
          

            generate(k, ch, n + 1);

        }
    }

    static void fun(int k) {

        if (k <= 0) {
            return;
        }

        char[] ch = new char[k];
      
        ch[0] = '0';
      
        generate(k, ch, 1);

        ch[0] = '1';
        generate(k, ch, 1);

    }

    public static void main(String args[]) {

        int k = 3;
      
        fun(k);
      
   
    }
}
