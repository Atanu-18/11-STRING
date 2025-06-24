//Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 
// Example : 
// original = 'eabcdef' ; result = 'iabcdif'
// Original = 'xyz' ; result = 'xyz'

import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String src = sc.next();
        String result = "";

        for (int i = 0; i < src.length(); i++) {
            if (src.charAt(i) == 'e' || src.charAt(i) == 'E') {
                result += 'i';
            }else {
                result += src.charAt(i);
            }
        }

        System.out.println(result);

        sc.close();
    }
}
