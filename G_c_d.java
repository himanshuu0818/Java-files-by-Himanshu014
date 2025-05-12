
         // Name -> Himanshu
        // Roll No. -> 24/SCA/BCA/014
        
public class G_c_d {
    public static void main(String[] args){
        int num1 = 23;
        int num2 = 124;
        int gcd = 1;

        for(int i = 1; i <= num1 && i <= num2; i++){
            if(num1 % i == 0 && num2 % i == 0){
                gcd = i;
            }
        }
        System.out.println("GCD of number : "+(num1+num2+gcd));
    }
}
