import java.util.Arrays;
import java.util.Scanner;
public  class Main {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        int[] cell = new int[3];
        for (int i = 0; i < cell.length; i++) {
            cell[i] = 0;
        }
        while (true) {
            System.out.println("Введите 999 для выхода:");
            int number = scan.nextInt();
            if (number == 999) {
                break;

            } if (cell[0] == 0) {
                cell[0] = number;

            } else if (cell[1] == 0) {
                cell[1] = number;

            } else if (cell[2] == 0) {
                cell[2] = number;

            } else if (cell[0] < cell[1] && cell[0] < cell[2]) {
                cell[0] = number;

            } else if (cell[1] < cell[2] && cell[1] < cell[0]) {
                cell[1] = number;

            } else if (cell[2] < cell[1] && cell[2] < cell[0]) {
                cell[2] = number;

            } else if (cell[0] == cell[1] && cell[0] == cell[2]) {
                cell[0] = number;

            } else if (cell[0] == cell[1]) {
                cell[0] = number;

            } else if (cell[1] == cell[2]) {
                cell[1] = number;

            } else if (cell[2] == cell[0]) {
                cell[2] = number;
            }
        System.out.println(Arrays.toString(cell));
        }
    }
}
//Единственная проблема была, что когда все ячейки равны, программа не могла понять куда вставлять число, поэтому пришлось сделать столько перебора.