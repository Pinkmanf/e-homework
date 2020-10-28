import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        System.out.println(isEven(a));
    }
    static boolean isEven(int a) {
        if(a%2==0){
        return true;
        }
        return false;
    }
}



