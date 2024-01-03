package RandomNumberGenerator-Java;
import java.util.Random;
import java.util.Scanner;

public class random_number_generator {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Minimum: ");
        int minNum = scanner.nextInt();

        System.out.print("Maximum: ");
        int maxNum = scanner.nextInt();

        System.out.println(getRandomNumber(minNum, maxNum, random));

        scanner.close();
    }

    public static int getRandomNumber(int minNum, int maxNum, Random random) {
        return random.nextInt(maxNum - minNum + 1) + minNum;
    }
}
