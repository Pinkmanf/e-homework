import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        Canteen gm = new Canteen();
        gm.name = "国民餐厅";
        gm.way = "请出示付款码....";
        gm.welcome1 = "欢迎来到国民饭店，这是今天的菜单:";
        gm.welcome2 = "请输入想要点餐的序号（空格键分割）";
        Dishes cp = new Dishes();
        cp.name1 = "辣子鸡丁";
        cp.name2 = "水煮肉片";
        cp.name3 = "糖醋里脊";
        cp.name4 = "干锅牛肉";
        cp.name5 = "干锅排骨";
        cp.number1 = 1;
        cp.number2 = 2;
        cp.number3 = 3;
        cp.number4 = 4;
        cp.number5 = 5;
        cp.price1 = 38;
        cp.price2 = 22;
        cp.price3 = 18;
        cp.price4 = 38;
        cp.price5 = 29;
        System.out.println(gm.welcome1);
        System.out.println(cp.number1 + "." + cp.name1 + " " + cp.price1 + "元");
        System.out.println(cp.number2 + "." + cp.name2 + " " + cp.price2 + "元");
        System.out.println(cp.number3 + "." + cp.name3 + " " + cp.price3 + "元");
        System.out.println(cp.number4 + "." + cp.name4 + " " + cp.price4 + "元");
        System.out.println(cp.number5 + "." + cp.name5 + " " + cp.price5 + "元");
        System.out.println(gm.welcome2);
        int number = scr.nextInt();
        System.out.println("你一共选择了:");
        switch (number) {
            case 1:
                System.out.println(cp.name1 + " " + cp.price1 + "元");
                System.out.println("共计" + cp.price1+"元");
                break;
            case 2:
                System.out.println(cp.name2 + " " + cp.price2 + "元");
                System.out.println("共计" + cp.price2+"元");
                break;
            case 3:
                System.out.println(cp.name3 + " " + cp.price3 + "元");
                System.out.println("共计" + cp.price3+"元");
                break;
            case 4:
                System.out.println(cp.name4 + " " + cp.price4 + "元");
                System.out.println("共计" + cp.price4+"元");
                break;
            case 5:
                System.out.println(cp.name5 + " " + cp.price5 + "元");
                System.out.println("共计" + cp.price5+"元");
                break;
        }
        System.out.println("还需要点什么菜么？");
        System.out.println(cp.number1 + "." + cp.name1 + " " + cp.price1 + "元");
        System.out.println(cp.number2 + "." + cp.name2 + " " + cp.price2 + "元");
        System.out.println(cp.number3 + "." + cp.name3 + " " + cp.price3 + "元");
        System.out.println(cp.number4 + "." + cp.name4 + " " + cp.price4 + "元");
        System.out.println(cp.number5 + "." + cp.name5 + " " + cp.price5 + "元");
        System.out.println(gm.welcome2);
        int n = scr.nextInt();
        System.out.println("你一共选择了:");

        switch (n) {
            case 1:
                System.out.println(cp.name1 + " " + cp.price1 + "元");
                switch (number) {
                    case 2:
                        System.out.println(cp.name2 + " " + cp.price2 + "元");
                        System.out.println("共计" + (cp.price1 + cp.price2) + "元");
                        break;
                    case 3:
                        System.out.println(cp.name3 + " " + cp.price3 + "元");
                        System.out.println("共计" + (cp.price1 + cp.price3) + "元");
                        break;
                    case 4:
                        System.out.println(cp.name4 + " " + cp.price4 + "元");
                        System.out.println("共计" + (cp.price1 + cp.price4) + "元");
                        break;
                    case 5:
                        System.out.println(cp.name5 + " " + cp.price5 + "元");
                        System.out.println("共计" + (cp.price1 + cp.price5)+"元");
                        break;
                }
                break;
            case 2:
                System.out.println(cp.name2 + " " + cp.price2 + "元");

                switch (number) {
                    case 1:
                        System.out.println(cp.name1 + " " + cp.price1 + "元");
                        System.out.println("共计" + (cp.price1 + cp.price2) + "元");
                        break;
                    case 3:
                        System.out.println(cp.name3 + " " + cp.price3 + "元");
                        System.out.println("共计" + (cp.price2 + cp.price3) + "元");
                        break;
                    case 4:
                        System.out.println(cp.name4 + " " + cp.price4 + "元");
                        System.out.println("共计" + (cp.price2 + cp.price4) + "元");
                        break;
                    case 5:
                        System.out.println(cp.name5 + " " + cp.price5 + "元");
                        System.out.println("共计" + (cp.price2 + cp.price5)+ "元");
                        break;
                }

                break;
            case 3:
                System.out.println(cp.name3 + " " + cp.price3 + "元");

                switch (number) {
                    case 2:
                        System.out.println(cp.name2 + " " + cp.price2 + "元");
                        System.out.println("共计" + (cp.price2 + cp.price3) + "元");
                        break;
                    case 1:
                        System.out.println(cp.name1 + " " + cp.price1 + "元");
                        System.out.println("共计" + (cp.price1 + cp.price3) + "元");
                        break;
                    case 4:
                        System.out.println(cp.name4 + " " + cp.price4 + "元");
                        System.out.println("共计" + (cp.price3 + cp.price4) + "元");
                        break;
                    case 5:
                        System.out.println(cp.name5 + " " + cp.price5 + "元");
                        System.out.println("共计" + (cp.price3 + cp.price5)+ "元");
                        break;
                }

                break;
            case 4:
                System.out.println(cp.name4 + " " + cp.price4 + "元");

                switch (number) {
                    case 2:
                        System.out.println(cp.name2 + " " + cp.price2 + "元");
                        System.out.println("共计" + (cp.price2 + cp.price4) + "元");
                        break;
                    case 3:
                        System.out.println(cp.name3 + " " + cp.price3 + "元");
                        System.out.println("共计" + (cp.price3 + cp.price4) + "元");
                        break;
                    case 1:
                        System.out.println(cp.name1 + " " + cp.price1 + "元");
                        System.out.println("共计" + (cp.price1 + cp.price4) + "元");
                        break;
                    case 5:
                        System.out.println(cp.name5 + " " + cp.price5 + "元");
                        System.out.println("共计" + (cp.price4 + cp.price5)+ "元");
                        break;
                }

                break;
            case 5:
                System.out.println(cp.name5 + " " + cp.price5 + "元");

                switch (number) {
                    case 2:
                        System.out.println(cp.name2 + " " + cp.price2 + "元");
                        System.out.println("共计" + (cp.price2 + cp.price5) + "元");
                        break;
                    case 3:
                        System.out.println(cp.name3 + " " + cp.price3 + "元");
                        System.out.println("共计" + (cp.price3 + cp.price5) + "元");
                        break;
                    case 4:
                        System.out.println(cp.name4 + " " + cp.price4 + "元");
                        System.out.println("共计" + (cp.price4 + cp.price5) + "元");
                        break;
                    case 1:
                        System.out.println(cp.name1 + " " + cp.price1 + "元");
                        System.out.println("共计" + (cp.price1 + cp.price5)+ "元");
                        break;
                }

                break;
        }
        System.out.println("请选择支付方式");
        System.out.println("1.支付宝");
        System.out.println("2.微信");
        System.out.println("3.人脸识别");
        int m= scr.nextInt();
        switch(m){
            case 1:
                System.out.println("请出示付款码....");break;
            case 2:
                System.out.println("请出示付款码....");break;
            case 3:
                System.out.println("请将人脸对准摄像头....");break;
        }
    }
}

class Canteen {
    public String name;
    public String way;
    public String welcome1;
    public String welcome2;
}

class Dishes {
    public String name1;
    public String name2;
    public String name3;
    public String name4;
    public String name5;
    public int number1;
    public int number2;
    public int number3;
    public int number4;
    public int number5;
    public int price1;
    public int price2;
    public int price3;
    public int price4;
    public int price5;
}