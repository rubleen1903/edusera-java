import java.util.Scanner;
public class grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks : ");
        int m = sc.nextInt();
        if( m >=10 && m<20)
        {
            System.out.println("Grade is D");
        }
        else if(m >= 20 && m<30 )
        {
            System.out.println("Grade is C");
        }
        else if( m >=30 && m <40)
        {
            System.out.println("Grade is B");
        }
        else {
            System.out.println("Grade is A");
        }

        System.out.println("Thank you!");
    }
}
