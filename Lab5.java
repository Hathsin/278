import java.util.Scanner;

public class Lab6 {

    public static double sum1(double n){
        if(n == 0){ //base case
            return 1;
        }
        else{ //recursive case
            return(sum1(n - 1) + Math.pow(2.0, n));
        }
    }

    public static double sum2(double n){
        if(n == 1){ //base case
            return 2;
        }
        else{ //recursive case
            return(sum2(n-1) + (n * (n + 1)));
        }
    }

    public static void sum3(){
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter the value of n: ");
        double n = (double) s.nextInt();
        System.out.println();
        s.close();
        System.out.println("The value of the 1st summation is " + sum1(n));
        System.out.println("The value of the 2nd summation is " + sum2(n));
    }

    public static void main(String[] args){
        sum3();
    }
}