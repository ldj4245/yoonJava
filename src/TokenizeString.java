import java.util.Arrays;
import java.util.StringTokenizer;

public class TokenizeString {
    public static void main(String[] args) {
        StringTokenizer st2 = new StringTokenizer("12 + 36 - 8 / 2 = 44", "+-/= ");


        while(st2.hasMoreTokens()){
            System.out.print(st2.nextToken());
        }


    }
}
