//Code By: Bethina Dileep
package Java_2Darray;
import java.util.*;
public class TwoDarray {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        int row = obj.nextInt();
        int col = obj.nextInt();
        int index = obj.nextInt();

        int[][] twoarr = new int[row][col];

        //input
        //rows
        for(int i=0; i<row; i++){
            //columns
            for(int j=0; j<col; j++) {
                twoarr[i][j] = obj.nextInt();
            }
        }

        //search for the index of the number
        //int index = obj.nextInt();
        for(int k=0; k<row; k++) {
            for(int l=0; l<col; l++) {
                if(twoarr[k][l] == index) {
                    System.out.println(k+" "+l);
                }
            }
        }
        System.out.println();

        //output
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                System.out.print(twoarr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
