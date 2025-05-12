         // Name -> Himanshu
        // Roll No. -> 24/SCA/BCA/014
        
import java.util.*;
public class Prime_number {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the any number : ");
        int num = obj.nextInt();

        boolean isprime ;
        System.out.println("Prime number up to "+num);
        for(int i = 2; i <= num; i++){
            isprime = true;
            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    isprime = false;
                    break;
                }

            }
            if(isprime){
                System.out.println(i);
            }
            
        }




    }
}
