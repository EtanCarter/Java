import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первую строку: ");
        String str = sc.nextLine();
        System.out.println("Введите вторую строку: ");
        String secondS = sc.nextLine();
        if (check(str, secondS)) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }

    private static boolean check(String firstStr, String secondStr) {
        return firstStr.endsWith(secondStr);
    }
}