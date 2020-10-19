import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String guess = scanner.nextLine();
        switch(guess){
        case "scarf":
          System.out.println("You win!");break;
        case "scissor":
            System.out.println("You lose555~~~");break;
        case "stone":
            System.out.println("Win together!");break;
            default:
        System.out.println("unknown code");break;
        }
    }
}
