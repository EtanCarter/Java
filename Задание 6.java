import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int a = n.nextInt();
        int c=0;
        for(int i =1; i<=a;i++){
            if(a%i==0){
                c++;
            }
        }
        if (c==2){
            System.out.println("Число простое");}
        else {
            System.out.println("Число не простое");}
    }
}