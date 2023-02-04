//1
//To calculate Fibonacci Series up to n numbers.

import java.util.*;
public class one {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) { //try block to stop resource leak at scanner
            System.out.println("Enter the n: ");
            int n = in.nextInt();
            System.out.println(Fibonacci(n));
        }
    }
    public static int Fibonacci(int n){
        int a = 1, y=0;
        int fib = 0;
        for(int i=1; i<=n; i++){
            fib = a + y;
            y=a;
            a=fib; // a becomes the current fib number to be added to the new "a" aka y. 
                  //Adding these gives the next Fib
        }
        return fib;
    }
}

//2
//To find out whether the given String is Palindrome or not.

import java.util.*;
public class two {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String text = in.nextLine();
        System.out.println(Palin(text)); 
    }
    public static String Palin(String text){
        String check ="";
        int n=text.length();
        boolean res = true;
        for(int i=0; i<n; i++){ //By putting i<=n, it throws up errors when the string is a palindrome
           if(text.charAt(i)!=text.charAt(n-i-1)){
            res = false;
            break;
           }
           else if(text.charAt(i)==text.charAt(n-i-1)){
            res = true;
           }
        }
        if(res){
            check = "It is a palindrome";
        }
        else if(!res){
            check = "It is not a palindrome";
        }
        return check;
    }
}
