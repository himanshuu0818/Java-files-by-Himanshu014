        //  Name -> Himanshu
        //     Roll. No. -> 24/SCA/BCA/014

public class Reverse_number {
    public static void main(String[] args){
        int num = 1344;
        System.out.println("Original number : "+num);

        int reverse = 0;
        while(num > 0){
            int l_d = num%10;
             reverse = reverse*10 + l_d;
             num /= 10;

        }
        System.out.println("Reversed number : "+reverse);
    }
}
