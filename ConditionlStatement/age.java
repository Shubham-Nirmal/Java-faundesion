import java.util.Scanner;

public class age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age  = sc.nextInt();
        if (age <= 12 ) {
            System.out.println("child ");
        }else if(age > 12 &&  age < 18 ){
                  System.out.println("Teeaneger ");
        } else{
            System.out.println("Adult");
        }
    }
}
