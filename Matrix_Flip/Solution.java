import java.lang.reflect.Array;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int q = input.nextInt();

        List<Integer> arrayQueues = new ArrayList<Integer>();
        for (int m=0; m<q; m++) {
            int n = input.nextInt();

            int rowMax = 2 * n;
            int colMax = 2 * n;

            Integer score = 0;
            int[][] arrayStore = new int[2 * n][2 * n];
            for (int i = 0; i < (2 * n); i++) {
                for (int j = 0; j < (2 * n); j++) {
                    arrayStore[i][j] = input.nextInt();
                }
            }

            int[][] finalArray = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {

                    finalArray[i][j] = arrayStore[i][j];

                    int rowflip_row = rowMax - i - 1;
                    int rowflip_col = j;

                    finalArray[i][j] =
                            finalArray[i][j] = finalArray[i][j] > arrayStore[rowflip_row][rowflip_col] ? finalArray[i][j] : arrayStore[rowflip_row][rowflip_col];

                    int colflip_row = i;
                    int colflip_col = colMax - j - 1;

                    finalArray[i][j] = finalArray[i][j] > arrayStore[colflip_row][colflip_col] ? finalArray[i][j] : arrayStore[colflip_row][colflip_col];

                    int diagflip_row = rowMax - i - 1;
                    int diagflip_col = colMax - j - 1;

                    finalArray[i][j] = finalArray[i][j] > arrayStore[diagflip_row][diagflip_col] ? finalArray[i][j] : arrayStore[diagflip_row][diagflip_col];

                    score += finalArray[i][j];
                }
            }
            arrayQueues.add(score);
        }

        for(int m=0; m<q; m++){
            System.out.println(arrayQueues.get(m));
        }
    }
}
