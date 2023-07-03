import java.util.Scanner;


public class Lab2{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        Integer[] vals = new Integer[10];
        System.out.print("Please enter 10 different integers: ");
        vals[0] = obj.nextInt();
        vals[1] = obj.nextInt();
        vals[2] = obj.nextInt();
        vals[3] = obj.nextInt();
        vals[4] = obj.nextInt();
        vals[5] = obj.nextInt();
        vals[6] = obj.nextInt();
        vals[7] = obj.nextInt();
        vals[8] = obj.nextInt();
        vals[9] = obj.nextInt();
        
        for (int x : vals){
            if(!(!(x < 0) || (x % 2 == 0))){
                System.out.println("a) False");
                break;
            }
            else{
                if (x == vals[9]){
                    System.out.println("a) True");
                }
            }
        }

        for (int x : vals){
            if(!(x < 0) || (x % 2 == 0)){
                System.out.println("b) True");
                break;
            }
            else{
                if (x == vals[9]){
                    System.out.println("b) False");
                }
            }
        }
        
        for (int x : vals){
            if(x < 0 && x % 2 == 0){
                System.out.println("c) True");
                break;
            }
            else{
                if (x == vals[9]){
                    System.out.println("c) False");
                }
            }
        }

        for (int x : vals){
            if(!(!(x % 3 == 1) || (x % 5 == 0))){
                System.out.println("d) False");
                break;
            }
            else{
                if (x == vals[9]){
                    System.out.println("d) True");
                }
            }
        }
//
        for (int x : vals){
            if(!(x % 3 == 1) || (x % 5 == 0)){
                System.out.println("e) True");
                break;
            }
            else{
                if (x == vals[9]){
                    System.out.println("e) False");
                }
            }
        }
        obj.close();
    }
}