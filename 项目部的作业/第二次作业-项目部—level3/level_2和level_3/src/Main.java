import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String str = new String("acbdw,12695,47AasIDX,");
        StringTokenizer token = new StringTokenizer(str, " ,");//拆分字符串
        String[] array = new String[3];
        int i = 0;
        while (token.hasMoreTokens()) {
            array[i] = token.nextToken();
            i++;
        }
        for (int j = 0; j < array.length; j++) {
            System.out.println(isNumber(array[j]));//判断数字
        }
        for (int j = 0; j < array.length; j++) {
            System.out.println(isCapital(array[j]));//判断大小写
        }
        for (int j = 0; j < array.length; j++) {
            System.out.println(turnCapital(array[j]));//输出转换后的大写
        }
        for (int j = 0; j < array.length; j++) {//排序
            if (isLetterName(array[j])) {
                System.out.println(Sort(array[j]));
            } else {
                break;
            }
        }
    }

    public static Boolean isNumber(String str) {
        char[] array = str.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] < '0' || array[i] > '9') {
                return false;
            }
        }
        return true;
    }

    public static Boolean isCapital(String str) {
        char[] array = str.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 'Z' && array[i] > 'A') {
                return true;
            }
        }
        return false;
    }

    public static char[] turnCapital(String str) {
        char[] array = str.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 'a' && array[i] <= 'z') {
                array[i] -= 32;
                if (array[i] >= 'Z') {
                    array[i] += 26;
                }
            }
        }
        return array;
    }

    public static boolean isLetterName(String str) {
        char[] array = str.toCharArray();
        boolean isLetter = false;
        for (int i = 0; i < array.length; i++) {
            isLetter = (array[i] >= 'a' && array[i] <= 'z') || (array[i] >= 'A' && array[i] <= 'Z');
            if (isLetter) {
                return true;
            }
        }
        return false;
    }

    public static char[] Sort(String str) {
        char[] array = str.toCharArray();
        for (int i = 0; i < array.length; i++) {
            Arrays.sort(array);
        }
        return array;
    }
}


