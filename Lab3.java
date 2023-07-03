import java.util.*;

public class Lab3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int func = 1;
        int oto = 0;
        int onto = 0;
        int numBi = 0;
        boolean bi = true;

        System.out.print("The program will generate all functions from X={a,b,c} to Y={1,...,n}.\nPlease enter the value of n: ");
        int n = scanner.nextInt();
        
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                for(int k = 1; k <= n; k++){
                    System.out.print("f(a)=" + i + "   f(b)=" + j + "   f(c)=" + k + "\nf" + func + " is ");
                    func++;
                    if((i==j)||(j==k)||(i==k)){
                        System.out.print("not ");
                        oto--;
                        bi = false;
                    }
                    System.out.print("one-to-one, ");
                    oto++;
                    if((n > 3) || !((n == 1) || (3 < i+j+k && i+j+k < 6) || ((n == 3)&&(i+j+k == 6)))){
                        System.out.print("not ");
                        onto--;
                        bi = false;
                    }
                    System.out.print("onto, and ");
                    onto++;
                    if(!bi){
                        System.out.print("not ");
                        numBi--;
                    }
                    System.out.println("a bijection");
                    numBi++;
                    bi = true;
                }
            }
        }
        func--;
        System.out.println("There are " + func + " functions total.\n" + oto + " of them are one-to-one.\n" + onto + " of them are onto.\n" + numBi + " of them are bijections.");

        scanner.close();
        
    }
}
