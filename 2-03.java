//1
//Take in two numbers and an operator (+, -, *, /) and calculate the value.
import java.util.*;
public class four {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the two nubers: ");
        int a=in.nextInt(), b=in.nextInt(), result=0;
        System.out.println("Enter the operation: ");
        in.nextLine(); //op was being skipped because nextLine read the "Enter" from b=in.nextInt() as the "nextLine" to be read. an extra in.nextLine consumes the existing /n (newline)
        String op = in.nextLine();

        if(op.equals("*")){
            result=a*b;
        }
        else if(op.equals("/")){
            result=a/b;
        }
        else if(op.equals("+")){
            result=a+b;
        }
        else if(op.equals("-")){
            result=a-b;
        }
        System.out.println("The result is: "+result);
    }
}
//2
//Take 2 numbers as input and print the largest number.
import java.util.*;
public class five {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the two numbers:");
        int a = in.nextInt(), b = in.nextInt();
        int largest;
        if( a>b){
            largest=a;
            System.out.println("Largest: "+ a);
        }
        else if(b>a){
            largest=b;
            System.out.println("Largest: "+b);
        }
        else if(a==b){
            largest=0;
            System.out.println("The numbers are equal");
        }

    }
}

//3
//Input currency in rupees and output in USD.
import java.util.*;
public class six {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the currency in INR: ");
        int a = in.nextInt();
        int usd = a*80;
        System.out.println("The currency in USD is: "+ usd);
    }
}
