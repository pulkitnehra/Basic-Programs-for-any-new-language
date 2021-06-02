package Set1.Basics;

import java.util.Scanner;

public class countVowel {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(count(str));

    }

    static int count(String str){

        int count = 0;
        for (int i = 0; i <str.length()-1; i++){
            char ch = str.charAt(i);
            if(ch == 'a'|| ch == 'A'||ch == 'o'||ch == 'O'||ch == 'i'||ch == 'I'||ch == 'e'||ch == 'E'||ch == 'u'||ch == 'U'){
                count++;
            }
        }
        return count;
    }

}
