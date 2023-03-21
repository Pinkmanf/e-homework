import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int[] ns = {
                15, 25, 10, 30, 40, 20, 50
        };
        for (int i = 0; i < ns.length - 1; i++) {
            for (int j = 0; j < ns.length - i - 1; j++) {
                if (ns[j] > ns[j + 1]) {
                    int tmp = ns[j];
                    ns[j] = ns[j + 1];
                    ns[j + 1] = tmp;
                }
            }
        }
        System.out.println("冒泡排序后的结果:");
        for (int n : ns) {
            System.out.print(n + " ");
        }
        System.out.println("请输入一个待插入的数:");
        int a = scr.nextInt();
        int[] np = {15, 25, 10, 30, 40, 20, 50, a};
        for (int i = 0; i < np.length - 1; i++) {
            for (int j = 0; j < np.length - i - 1; j++) {
                if (np[j] > np[j + 1]) {
                    int t = np[j];
                    np[j] = np[j + 1];
                    np[j + 1] = t;
                }
            }
        }
        System.out.print("插入数字(" + a + ")后的数组为:");
        for (int b : np) {
            System.out.print(b + " ");
        }
    }
}

