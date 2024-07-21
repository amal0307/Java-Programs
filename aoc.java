//find area of circle
import java.util.Scanner;
import java.io.*;
class aoc
{
    public static void main(String args[])
    {
        int radius;
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter radius of circle");
        radius=scn.nextInt();
        double area=3.14*radius*radius;
        System.out.println("Area of circle is "+area);
    }
} 
