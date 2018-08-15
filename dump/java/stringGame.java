import java.util.*;

class stringGame {
    public static void main(String args[] ) throws Exception {
        // Scanner s = new Scanner(System.in);
        // String input = s.nextLine();
        // System.out.println(input);
        
        // String len = s.nextLine();
        // int K = Integer.parseInt(len);
        // System.out.println(K);

        String input = "hackerearth";
        int K = 3;
        
        int length = input.length();
        System.out.println(length);

        int i = 0;
        while(i < length - K + 1) {
            String substr = input.substring(0, K);
            System.out.println(substr);
            System.out.println(input);

            i++;
        }

    }
}
