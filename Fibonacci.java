        //  Name -> Himanshu
        //     Roll. No. -> 24/SCA/BCA/014

public class Fibonacci {
    public static void mymethod(int num1, int num2, int series){
        System.out.println("Fibonacci Series : ");
            for(int i = 0; i < series; i++){
                 System.out.print(num1+ " ");

                int temp = num1+num2;
                    num1 = num2;
                    num2 = temp;

                   
            }
    }
    public static void main(String[] args){
        int series = 10;

        int num1 = 0;
        int num2 = 1;

        mymethod(num1, num2, series);
    }
}