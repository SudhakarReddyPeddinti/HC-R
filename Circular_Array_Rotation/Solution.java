import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by sudhakar on 10/15/16.
 */
public class Solution {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int[] line1 = new int[3];
        for(int i=0; i<3; i++){
            line1[i]=input.nextInt();
        };

        int[] arrayElements = new int[line1[0]];
        for(int i=0; i<line1[0]; i++){
            arrayElements[i] = input.nextInt();
        };

        int[] queries = new int[line1[2]];
        for(int i=0; i<line1[2]; i++){
            queries[i]=input.nextInt();
        }

        int[] finalArrayElements = new int[line1[0]];

        // Rotate the array based on the line1[1]
        if(line1[1]<arrayElements.length){
            System.arraycopy(arrayElements,line1[0]-line1[1], finalArrayElements,0, line1[1]);
            System.arraycopy(arrayElements,0, finalArrayElements,line1[1], line1[0]-line1[1]);
            System.out.println("IF "+finalArrayElements);
        }
        else {
            int rotationValue = line1[1] % arrayElements.length;
            System.arraycopy(arrayElements,line1[0]-rotationValue, finalArrayElements,0, line1[1]);
            System.arraycopy(arrayElements,0, finalArrayElements,line1[1], line1[0]-line1[1]);
            System.out.println("ELSE "+finalArrayElements);
        }

        for(int i=0; i<queries.length; i++){
            System.out.println(finalArrayElements[queries[i]]);
        }
    }
}

