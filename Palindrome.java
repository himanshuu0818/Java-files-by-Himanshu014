        //  Name -> Himanshu
        //     Roll. No. -> 24/SCA/BCA/014

public class Palindrome {
    public static void main(String[] args) {
        int n = 5665;
        int original_number = n;
        int reversed_number = 0;

        while(n > 0){
            int l_d = n%10;
            reversed_number = reversed_number*10 + l_d;
            n /= 10;
        }
        if(original_number == reversed_number){
            System.out.println("it is Palindrome number --");

        }
        else{
            System.out.println("Not Palindrome number --");
        }
        

    }
}