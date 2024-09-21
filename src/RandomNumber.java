import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class RandomNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int num2 = sc.nextInt();

        // 두 수 사이의 랜덤 숫자를 10개 생성
        IntStream.range(0, 10).forEach(i -> {
            int lowerBound = Math.min(num, num2);  // 작은 값
            int upperBound = Math.max(num, num2);  // 큰 값

            // num과 num2 사이의 범위에서 랜덤 숫자 생성
            int random = rand.nextInt(upperBound - lowerBound + 1) + lowerBound;

            System.out.println(random);
        });
    }
}
