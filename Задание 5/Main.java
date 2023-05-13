import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите числа");
        Scanner scanner1 = new Scanner(System.in);
        String usersText = scanner1.nextLine();
        System.out.println("Сумма квадратов: " + sumSquare.transformation(usersText));
    }
}

