package math.problems;
import java.io.*;

public class MakePyramid {
    public static void main(String[] args) {

        /*   Implement a large Pyramid of stars in the screen with java.

                              *
                             * *
                            * * *
                           * * * *
                          * * * * *
                         * * * * * *

        */
        for (int i = 0; i < 6; i++) {
            for (int h = 0; h < 10 - i; h++) {
                System.out.print(" ");
            }
            for (int l = 0; l <= i; l++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
