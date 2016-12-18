import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CTLSolution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] scores = new int[n];
        for(int scores_i=0; scores_i < n; scores_i++){
            scores[scores_i] = in.nextInt();
        }
        int m = in.nextInt();
        int[] alice = new int[m];
        for(int alice_i=0; alice_i < m; alice_i++){
            alice[alice_i] = in.nextInt();
        }
        // your code goes here
        TreeMap<Integer, Integer> rankMap = new TreeMap();
        if(alice[0]>scores[0]){
            for(int alice_counter=0; alice_counter<m; alice_counter++){
                System.out.println(1);
            }
        }else{
            int rank = 1;
            for(int rank_i=0; rank_i<n; rank_i++){
                if(!rankMap.containsKey(Integer.valueOf(scores[rank_i]))){
                    rankMap.put(Integer.valueOf(scores[rank_i]),Integer.valueOf(rank));
                    rank++;
                }
                if(scores[rank_i]<alice[0])
                    break;
            }
        }
        for(int getRank_i=0; getRank_i<m; getRank_i++){
            if(rankMap.containsKey(Integer.valueOf(alice[getRank_i]))){
                System.out.println(rankMap.get(Integer.valueOf(alice[getRank_i])));
            }else{
                Map.Entry<Integer,Integer> val = rankMap.ceilingEntry(Integer.valueOf(alice[getRank_i]));
                if(val!=null) {
                    System.out.println(val.getValue() + 1);
                }else{
                    System.out.println(1);
                }
            }
        }

    }
}
