        //  Name -> Himanshu
        //     Roll. No. -> 24/SCA/BCA/014

public class Exception_example {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println("Result : " + result);

            int[] arr = {1, 2, 3};
            System.out.println("Value of array : " + arr[3]);
        }

        catch (ArithmeticException e) {
            System.out.println("Can not divide by Zero --- ");
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Array index --- ");
        }

        catch (Exception e) {
            System.out.println("Caught General Exception: " + e.getMessage());
        }

        System.out.println("Program continues after handling exceptions.");
    }
}
