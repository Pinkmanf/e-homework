import java.util.*;

public class Matrix {
    public static void main(String[] args) {
        int a;
        System.out.printf("请为对称矩阵输入行列数:");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        int b = 0;
        int[] shu = new int[a * a];
        int[] su = new int[a * a];
        for (; b < a * a; b++) {
            shu[b] = (int) (Math.random() * 10 + 1);
        }
        b = 0;
        System.out.println("随机对称矩阵A:");
        for (; b < a * a; b++) {
            System.out.printf("%d ", shu[b]);
            if (b % a == a - 1)
                System.out.printf("\n");
        }
        int c = 0;
        for (; c < a * a; c++) {
            su[c] = (int) (Math.random() * 10 + 1);
        }
        c = 0;
        System.out.println("随机对称矩阵B:");
        for (; c < a * a; c++) {
            System.out.printf("%d ", su[c]);
            if (c % a == a - 1)
                System.out.printf("\n");
        }
        System.out.println("相乘后的对称矩阵:");
        System.out.print((shu[0]*su[0]+shu[1]*su[2])+" ");
        System.out.println(shu[0]*su[1]+shu[1]*su[3]);
        System.out.print((shu[2]*su[0]+shu[3]*su[2])+" ");
        System.out.println(shu[2]*su[1]+shu[2]*su[3]);
        System.out.println("此矩阵对角线的和为:"+(shu[0]*su[0]+shu[1]*su[2]+shu[2]*su[1]+shu[2]*su[3]));
    }
}
