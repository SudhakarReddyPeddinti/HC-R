import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner input = new Scanner(System.in);
        int tests = input.nextInt();

        while(input.hasNext()){
            String line =  input.next();
            verifyAnagram(line);
        };
    }

    public static void verifyAnagram(String anagram){
        int len = anagram.length();
        if(len%2 == 0 && len>0){

            String leftString = anagram.substring(0,(len/2));
            String rightString = anagram.substring(len-(len/2));

            Map<String,Integer> leftKeyVal = new HashMap<String, Integer>();
            Map<String,Integer> rightKeyVal = new HashMap<String, Integer>();

            for(int i=0; i<leftString.length(); i++)
            {
                leftKeyVal.put(String.valueOf(leftString.charAt(i)) ,leftKeyVal.getOrDefault(String.valueOf(leftString.charAt(i)), 0)+1);
            }

            for(int i=0; i<rightString.length(); i++)
            {
                rightKeyVal.put(String.valueOf(rightString.charAt(i)) ,rightKeyVal.getOrDefault(String.valueOf(rightString.charAt(i)), 0)+1);
            }


            final Integer[] positions = {0};
            Map<String,Integer> lengthyString = leftKeyVal.size()>rightKeyVal.size()? leftKeyVal : rightKeyVal;
            Map<String,Integer> searchString = leftKeyVal.size()>rightKeyVal.size()? rightKeyVal : leftKeyVal;

            lengthyString.forEach((i,k) -> {
                Integer rightPosi = searchString.getOrDefault(i,0);
                if(k>rightPosi){
                    positions[0] += k-rightPosi;
                }
            });

            System.out.println(positions[0]);

        }else{
            System.out.println("-1");
        }
    }
}

