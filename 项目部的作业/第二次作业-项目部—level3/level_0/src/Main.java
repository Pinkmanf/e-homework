public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if(i==50){
                continue;//当i等于50的时候，提前结束本次循环，直接继续执行下次循环
            }
            System.out.println(i);//不打印50
        }
    }
}
