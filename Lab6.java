import java.util.Scanner;

public class Lab6 {
    

    public static boolean isIncomplete(int[] mask){
        for(int i : mask){
            if(i==0){
                return true;
            }
        }
        return false;
    }


    public static void subsets(int[] S, int size, int r){
    	int count = 1;
    	boolean before = false;
    	boolean tst = true;
        int mask[] = new int[size];
        for(int i = 0; i < size; i++){
            if (i<r){
                mask[i] = 1;
            }
            else{
                mask[i] = 0;
            }
        }
        while(tst){
            System.out.print("Subset " + count + ": {");
            for(int i = 0; i < size; i++){
                if(mask[i] == 1){
                    if(before){
                        System.out.print(",");
                    }
                    System.out.print(S[i]);
                    before = true;
                }
            }
            before = false;
            count++;
            System.out.println("}");
            tst = next(mask, r);
            
        }
    }


    public static boolean next(int mask[], int n){
        int i;
        int count = 0;
        for(i = mask.length - 1; i >= 0; i--){
        	if(mask[i] == 1) {
        		if(i == mask.length - 1) {
        			count++;
        			continue;
        		}
        		if(mask[i + 1] == 1) {
        			count ++;
        			continue;
        		}
        		mask[i] = 0;
        		mask[i + 1] = 1;
        		for(int j = i + 2; j < mask.length; j++) {
        			if(count != 0) {
        				mask[j] = 1;
       					count--;
       				}
       				else {
       					mask[j] = 0;
       				}
       			}
       		return true;
        	}    
        }
        return false;
    }




    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter the size of set S: ");
        int size = s.nextInt();
        s.nextLine();
        System.out.print("Please enter S: ");
        String S_hold = s.nextLine();
        String[] Str = S_hold.split(" ");
        int[] S = new int[size];
        for(int i = 0; i < size; i++){
            S[i] = Integer.valueOf(Str[i]);
        }
        System.out.print("Please enter r: ");
        int r = s.nextInt();
        s.close();

        subsets(S, size, r);

    }
}