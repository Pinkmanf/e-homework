public class Main {
    public static void main(String[] args) {
        int i=0;
        do{
            i++;
            if(i == 50){
                continue;
            }
            System.out.println(i);
        }while(i<=99);
    }
}
