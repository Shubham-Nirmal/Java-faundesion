import java.util.Scanner;

public class CheckNo {
    public static void main(String[] args) {
        System.out.println("Enter No ");

        Scanner sc = new Scanner(System.in);

        int no  = sc.nextInt();

        if (no > 0 ) {
            System.out.println("positive");
        } else if (no < 0 ){

            System.out.println("Negtive");
        }else {
            System.out.println("Zero");
        }
    }
}
