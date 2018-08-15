import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Hshmap {
    public static void main(String args[] ) throws Exception {
        int T, N;
        String input;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        int curMax = 0;
        String curFestival = new String();
        HashMap<String, List<Integer>> map = new HashMap<>();
        List<Integer> purchase = new ArrayList<Integer>();
        int newSpent = 0, i;

        while (T > 0) {
            N = Integer.parseInt(br.readLine());
            map = new HashMap<>();
            curMax = 0; 
            curFestival = "";
            while(N > 0) {
                input = br.readLine();
                String[] arr = input.split(" ");
                purchase = map.get(arr[0]);
                Integer pur = Integer.parseInt(arr[1]);
                newSpent = 0;
                if (purchase != null) {
                    if (purchase.size() == 3) {
                        purchase.remove(0);
                    }
                    purchase.add(pur);
                    Collections.sort(purchase);
                    for (i = 0; i < purchase.size(); i++) {
                        newSpent += purchase.get(i);
                    }
                    map.put(arr[0], purchase);
                }
                else {
                    purchase = new ArrayList<Integer>();
                    purchase.add(pur);
                    map.put(arr[0], purchase);
                    newSpent = pur;
                }

                if (newSpent > curMax) {
                    curMax = newSpent;
                    curFestival = arr[0];
                }
                else if (newSpent == curMax) {
                    if (arr[0].compareTo(curFestival) < 0) {
                        curFestival = arr[0];
                    }
                }
                N--;
            }
            System.out.println(curFestival + " " + curMax);
            T--;
        }

    }
}
