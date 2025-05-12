        // Name -> Himanshu
        // Roll No. -> 24/SCA/BCA/014

public class Sum_and_Average{
    public static void main(String[] args){
        if(args.length == 0){
            System.out.println("Please provide number as command line arguments.");
            return;
        }
        int sum = 0;
         for (String arg : args) {
               try {
               int num = Integer.parseInt(arg);
                  sum += num;
               } 
               
        catch (NumberFormatException e) {
            System.out.println(arg + " is not a valid integer.");
                return;
            }
                }
        double average = (double) sum / args.length;
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
 }
}
    
