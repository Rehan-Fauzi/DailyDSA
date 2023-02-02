//1.
//Write a program to print whether a number is even or odd, also take input from the user.
import java.util.*;
public class one {

    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt();
        System.out.println(check(a));
        System.out.println(check(b));

    }
    public static String check(int num){
        String Answer;
        if(num%2==0){
            Answer = "Even";
        }
        else{
            Answer = "Odd";
        }
        return Answer;
    }
}

//2.
//Take name as input and print a greeting message for that particular name.
import java.util.*;
public class two {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = in.nextLine();
        System.out.println("Hello "+ name);
    }
}

//3.
//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.*;
public class three {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the principal, time and rate: ");
        int p = in.nextInt(), t = in.nextInt();
        float r = in.nextFloat();
        int ans = (int)(p*r*t);
        float answer = p*r*t;
        System.out.println("Rounded amount: "+ans);
        System.out.println("Exact amount: "+answer);
    }

}

