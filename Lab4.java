import java.util.*;


public class Lab4 {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        System.out.print("Please enter values of a, b, c, and M in this order: ");
        
        
        int a = obj.nextInt();
        int b = obj.nextInt();
        int c = obj.nextInt();
        int m = obj.nextInt();


        int c1 = (a * c + b) % m;
        int c2 = (a * c1 + b) % m;

        System.out.println("The first 100 elements of the sequence: ");
        System.out.print(c + " ");
        for(int i = 2; i <= 100; i++){
            c = (a * c + b) % m;
            System.out.print(c + " ");
            if(i % 10 == 0){
                System.out.println();
            }
        }

        while(c1 != c2){ 
            c1 = (a * c1 + b) % m;
            c2 = (a * c2 + b) % m;
            c2 = (a * c2 + b) % m;
        }
        c1 = (a * c1 + b) % m;
        int count = 1;
        while(c1 != c2){
            c1 = (a * c1 + b) % m;
            count++;
        }

        System.out.println("\n\nCycle length is " + count);


        obj.close();
    }
}