            // Name -> Himanshu
            // Roll. No. -> 24/SCA/BCA/014

import java.util.*;

public class Nested_switch{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        
        System.out.println("1. BCA ");
        System.out.println("2. B.Tech ");
        System.out.print("Choose Your Course : ");

        int course = obj.nextInt();

        switch(course){
            case 1: {
                
                System.out.println("\n1. AI & ML ");
                System.out.println("2. Data Science \n");
                System.out.println("Choose Specialization with BCA :\n");

                int bca = obj.nextInt();
                
                switch(bca){
                    case 1: {
                    System.out.println("You Selected : AI & ML ");
                    break;
                    }
                    case 2: {
                        System.out.println("You Selected : Data Science ");
                        break;
                    }
                    default: {
                        System.out.println("Invalid Specialization in BCA ------");
                    }
                }
                break;
            }
            case 2: {
                
                System.out.println("\n1. Computer Science Engineering (CSE) ");
                System.out.println("2. Mechnical Engineering ");
                System.out.println("3. Electrical Engineering \n");
                System.out.println("Choose Specialization with B.Tech :\n");

                int b_tech = obj.nextInt();

                switch(b_tech){
                    case 1: {
                        System.out.println("You Selected : Computer Science Engineering (CSE) ");
                        break;
                    }
                    case 2: {
                        System.out.println("You Selected : Mechnical Engineering ");
                        break;
                    }
                    case 3: {
                        System.out.println("You Selected : Electrical Engineering ");
                        break;
                    }
                    default: {
                        System.out.println("Invalid Specialization in B.Tech ------");
                    }
                }
                break;
            }
            default: {
                System.out.println("Invalid Course -----------");
            }
        }
    }
}