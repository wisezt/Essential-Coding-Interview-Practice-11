import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Solution {
    public static void main(String[] args) {

        int[][] bombs = {{0, 0}, {1, 2}, {3, 3}, {6, 6}};


        int[][] theArray = mineSweeper(bombs, 8, 8);


        for (int[] x : theArray) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }


    }


    public static int[][] mineSweeper(int[][] bombs, int num_rows, int num_cols) {

        int[][] result = new int[num_rows][num_cols];


        // initial the field
        for (int i = 0; i < num_rows; i++) {

            for (int j = 0; j < num_cols; j++) {


                result[i][j] = 0;


            }


        }


        // put mines

        for (int i = 0; i < bombs.length; i++) {

            int theRow = bombs[i][0];
            int theCol = bombs[i][1];


            result[theRow][theCol] = -1;

            for (int j = -1; j < 2; j++) {

                int theRoundMineRow = j + theRow;

                for (int h = -1; h < 2; h++) {


                    int theRoundMineCol = h + theCol;

                    if (theRoundMineRow >= 0 &&
                            theRoundMineRow < num_rows &&
                            theRoundMineCol >= 0 &&
                            theRoundMineCol < num_cols


                    ) {
                        System.out.print(" " + theRoundMineRow + "" + theRoundMineCol + " ");


                        if ((result[theRoundMineRow][theRoundMineCol] != -1)) {
                            result[theRoundMineRow][theRoundMineCol]++;


                            System.out.print(" " + theRoundMineRow + "" + theRoundMineCol + " ");
                        }

                    }


                }


                System.out.println();

            }


        }


        return result;


    }


    public static int[][] click(int[][] theField, int[] clickedPoint) {

        int[][] result = theField;

        List<int[]> checkList = new ArrayList<>();
        checkList.add(clickedPoint);

        int theRow;
        int thrCol;

        whileLoop:
        while (checkList.size() > 0) {

            theRow = checkList.get(0);
            thrCol = checkList.get(0);


            if (result[theRow][theCol] == 0) {
                result[theRow][theCol] = -2;

                for (int theCheckedRow = theRow - 1; theCheckedRow < theRow + 1; theCheckedRow++) {

                    for (int theCheckedCol = theCol - 1; theCheckedCol < theCol + 1; theCheckedCol++) {


                        int[] checPoint = {theCheckedRow, theCheckedCol};

                        checkList.add(checkPoint);


                    }


                }
                checkList.remove(0);


            } else {

                return result;

            }
        }


        return result;


    }

}
