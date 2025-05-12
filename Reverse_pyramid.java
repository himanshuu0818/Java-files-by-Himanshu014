         // Name -> Himanshu
        // Roll No. -> 24/SCA/BCA/014
        
public class Reverse_pyramid {
    public static void main(String[] args){
        int num = 5;

        for(int i = num; i >= 1; i--){
            for(int j = 1; j <= num -i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= 2*i - 1; k++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
