import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class parking {
    public static void main(String args[] ) throws Exception {

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();                // Reading input from STDIN
        String inpArr[];
        inpArr = input.split(" ");

        int N, M, P;
        N = Integer.parseInt(inpArr[0]);
        M = Integer.parseInt(inpArr[1]);
        P = Integer.parseInt(inpArr[2]);

        System.out.println(N + "::" + M + "::" + P);

        input = br.readLine();
        inpArr = input.split(" ");

        HashMap<Integer, Integer> capacity = new HashMap<>();
        int i = 0;
        for (i = 0; i < N; i++) {
          capacity.put(i + 1, Integer.parseInt(inpArr[i]));
        }

        System.out.println(capacity);

        for (i = 0; i < M; i++) {
          input = br.readLine();
          inpArr = input.split(" ");
          
        }

    }
}
