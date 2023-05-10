import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите значения:");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        if ((a < (c + b) && c < (a + b) && b < (c + a))) {
            double cosA = (b * b + c * c - a * a) / (2 * b *c);
            double cosB = (a * a + c * c - b * b) / (2 * a * c);
            double cosC = (a * a + b * b - c * c) / (2 * a * b);
            double maxCos = Math.max(cosA,Math.max(cosB,cosC));
            double maxAn = Math.toDegrees(Math.acos(maxCos));
            System.out.println("Треугольник существует");
            System.out.println("Наибольший внешний угол:" + maxAn + " " + "градусов");
        } else {
            System.out.println("Треугольник не существует");
        }
    }
}