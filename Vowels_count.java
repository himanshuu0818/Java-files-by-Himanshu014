        //  Name -> Himanshu
        //     Roll. No. -> 24/SCA/BCA/014

import java.util.*;
public class Vowels_count {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the any String : ");
        String str = obj.nextLine();

        str = str.toLowerCase();

        int vowels = 0;

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' ||ch == 'o' || ch == 'u'){
                vowels++;
            }
        }
        System.out.println("numbers of vowels int the string "+vowels);
    }
}
