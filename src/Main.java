import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int age = 0;

        System.out.print("Enter your age: ");
        age = in.nextInt();
        in.nextLine();

        if(age >= 21)
        {
            System.out.println("You're 21 years old or older, you get a paper wristband!");
        }
    }
}