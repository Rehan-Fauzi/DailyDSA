//1
//Factorial function for number n
import java.util.*;;
public class test {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int x = in.nextInt();
        System.out.println("The factorial is: " + Fact(x));
    }
    // Factorial function, last accurate output at fact 12.
    // Max number in one int reached, starts modding next values
    // Visit https://www.geeksforgeeks.org/recursive-program-to-find-factorial-of-a-large-number/?ref=rp
    public static int Fact(int n){
        int result = 1;
        for(int i=1; i<=n; i++){
            result *= i;
        }
        return result;
    }
}

//2
//Average of N numbers
import java.util.*;;
public class test {
   public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    System.out.println("Enter the amount of numbers, then the digits: ");
    int x = in.nextInt();
    int sum = 0, avg = 0;
    // without the lhs it throws up "not initialised" error
    // doesnt work without the "x" as array size
    int[] n=new int[x]; 
    for(int i=0; i<x;i++){
        int value = in.nextInt();
        n[i]= value; 
        sum = sum + n[i];
    }
    avg = sum/x ; 
    System.out.println("The average is: " + avg);
   }
}

//3
//Find the discounted the price
import java.util.*;
public class test {
   public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    System.out.println("Enter the discount: ");
    float disc = in.nextFloat();
    System.out.println("Enter the price: ");
    float price = in.nextFloat();
    disc = disc/100;
    price = (price)-(price*disc);
    System.out.println("The discounted price is: "+price);
    in.close();
   }
}

//4
//Find the power of a base number
import java.util.*;
public class test {
   public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    System.out.println("Enter the base number: ");
    long b = in.nextLong();
    // Casting incompatible types
    int base = (int)(b); 
    System.out.println("Enter the power: ");
    int pow = in.nextInt();
    for(int i=1; i<=pow; i++){
        b = b*base;
    }
    System.out.println("The answer is: "+ b);
    }
}






