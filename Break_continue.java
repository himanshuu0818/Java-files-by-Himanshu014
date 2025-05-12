        //  Name -> Himanshu
        //     Roll. No. -> 24/SCA/BCA/014

public class Break_continue {
    public static void main(String[] args){
        System.out.println("Using Break-Statement in a Loop ----");
        for(int i = 1; i <= 10; i++){
            if(i == 5){
                break;
            }
            System.out.println(i);
        }
        System.out.println("Using Continue-Statement in a loop ----");
        for(int i = 1; i <= 10; i++){
            if(i == 5){
                continue;
            }
            System.out.println(i);
        }
    }
}
