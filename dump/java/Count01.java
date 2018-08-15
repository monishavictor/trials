import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Count01 {
    public static void main(String args[] ) throws Exception {
        int T, N, count1, count0;
        String input, binString;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());

        while (T > 0) {
            N = Integer.parseInt(br.readLine());
            input = br.readLine();
            String[] arr = input.split(" ");
            count1 = 0;
            count0 = 0;
            while (N > 0) {
                if (arr[N-1].equals("1")) {
                    count1++;
                }
                else {
                    count0++;
                }
                N--;
            }
            if (count1 % 3 != 0) {
                System.out.println("-1");
            }
            else {
                // System.out.println(count1);
                // System.out.println(count0);
                // System.out.println(count1);
                binString = String.join("", Collections.nCopies(count1/3, "1"));
                binString += String.join("", Collections.nCopies(count0/3, "0"));
                // System.out.println(binString);
                System.out.println(Integer.parseInt(binString, 2));
            }
            T--;
        }

    }
}
