import java.util.Scanner;

public class Main {
    private static final char[] letters = {'а','о','у','ы','э' ,'е' ,'ё' ,'и' ,'ю' ,'я'};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = sc.nextLine();

        String result = "";
        int check = 0;
        char checkLine;
        for (int i = 0; i < str.length(); i++) {
            check = 0;
            checkLine = str.charAt(i);
            for (int j = 0; j < letters.length; j++) {
                if (checkLine == letters[j]) {
                    check++;
                    break;
                }
            }
            if (check == 0) {
                result = result + checkLine;
            }
        }
        System.out.println(result);
    }
}
