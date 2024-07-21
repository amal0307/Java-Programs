import java.util.Scanner;
//import java.io.*;
class calc
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int choice1;
        do
        {
        System.out.println("Enter first number");
        double a=input.nextDouble();
        System.out.println("Enter second number");
        double b=input.nextDouble();
        System.out.println("Enter operation");
        System.out.println("1.Addition 2.Subtraction 3.Multiplication 4.Division");
        int choice=input.nextInt();
        double c;
        switch(choice)
        {
            case 1:
            c=a+b;
            System.out.println("Sum is "+c);
            break;

            case 2:
            c=a-b;
            System.out.println("Difference is "+c);
            break;

            case 3:
            c=a*b;
            System.out.println("Product is "+c);
            break;

            case 4:
            c=a/b;
            System.out.println("Quotient is "+c);
            break;

            default:
            System.out.println("Invalid choice");
        }
        System.out.println("Do you want to continue?");
        choice1=input.nextInt();
    }while(choice1==1);
    }
}