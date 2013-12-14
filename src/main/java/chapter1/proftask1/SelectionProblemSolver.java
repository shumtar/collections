package chapter1.proftask1;

import org.apache.log4j.Logger;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * User: taras
 * Date: 11/30/13
 * Time: 12:32 AM
 * To change this template use File | Settings | File Templates.
 */
public class SelectionProblemSolver {
    static final Logger log = Logger.getLogger(SelectionProblemSolver.class);

    public static void solve() throws FileNotFoundException {
        //DataPreparator.prepareListData();
        int[] array = DataPreparator.getNumbersFromFile();
        for (int i : array) System.out.print(i + " ");
        System.out.println();

        int size = array.length;
        int index = size / 2 -1;
        System.out.println(index);
        while (size != 0) {
            size--;
            for (int i = 0; i < size; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
             }
        }
        for(int i=0;i<array.length;i++){
            if(i%10==0){
                System.out.println();
                System.out.print(i+".  ");
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println(array[index]);

    }


}