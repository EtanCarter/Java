import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Первое: ");
        int begin = sc.nextInt();
        System.out.println("Второе: ");
        int step = sc.nextInt();
        System.out.println("Третье: ");
        int quantityStep = sc.nextInt();
        String result = "";
        int number = begin;
        for (int i = 0; i < quantityStep - 1; i += 1) {
            result += number + step + ", ";
            number = number + step;
        }
        System.out.println(begin + ", " + result);
    }
}