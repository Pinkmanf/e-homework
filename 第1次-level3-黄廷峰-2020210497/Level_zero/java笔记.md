# java笔记

## 数组快速排序

```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] ns = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
        Arrays.sort(ns);
        System.out.println(Arrays.toString(ns));
    }
}
```

## 快速遍历数组

```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] ns = { 1, 1, 2, 3, 5, 8 };
        System.out.println(Arrays.toString(ns));
    }
}
```

## 输入数组

```java
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Scanner scr=new Scanner(System.in);
        int n=2;
        int[] ns=new int[n];
        for (int i = 0; i < n; i++) {
            ns[i] = scr.nextInt();
        }
            System.out.println(Arrays.toString(ns));
    }
}

```

## 随机方阵

```Java
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
    }
}    
```

