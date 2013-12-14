package chapter1.proftask1;

import org.apache.log4j.Logger;
import org.apache.log4j.Priority;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: taras
 * Date: 11/30/13
 * Time: 1:24 AM
 * To change this template use File | Settings | File Templates.
 */
public class DataPreparator {
    static final Logger log = Logger.getLogger(DataPreparator.class);
    public static final String NUMBERS_SER = "resources//chapter1//proftask1//numbers.ser";

    public static void prepareListData() {
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            int simpleNumber = (int) r.nextInt(100);
            list.add(simpleNumber);
        }
        writeObject(list);
    }

    public static int[] getNumbersFromFile() {

        try (
                InputStream file = new FileInputStream(NUMBERS_SER);
                InputStream buffer = new BufferedInputStream(file);
                ObjectInput input = new ObjectInputStream(buffer);
        ) {
            ArrayList<Integer> list = (ArrayList<Integer>) input.readObject();

            int[] arrList = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                arrList[i] = list.get(i);
            }
            return arrList;

            //System.out.println("Recovered Quark: " + quarkRead);
        } catch (ClassNotFoundException ex) {
            log.log(Priority.WARN, "Cannot perform input. Class not found.", ex);
        } catch (IOException ex) {
            log.log(Priority.WARN, "Cannot perform input.", ex);
        }
        return null;
    }

    private static void writeObject(Object quarks) {
        try (
                OutputStream file = new FileOutputStream(NUMBERS_SER);
                OutputStream buffer = new BufferedOutputStream(file);
                ObjectOutput output = new ObjectOutputStream(buffer);
        ) {
            output.writeObject(quarks);
        } catch (IOException ex) {
            log.log(Priority.WARN, "Cannot perform output.", ex);
        }
    }

}
