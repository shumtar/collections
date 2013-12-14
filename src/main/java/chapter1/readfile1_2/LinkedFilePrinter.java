package chapter1.readfile1_2;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * User: taras
 * Date: 11/30/13
 * Time: 1:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class LinkedFilePrinter {
    static final Logger log = Logger.getLogger(LinkedFilePrinter.class);

    public static void perform() throws IOException {
        BasicConfigurator.configure();
        log.info("start main method");
        parceFile1("file1.txt");
    }

    private static void parceFile1(String a) throws IOException {
        String dirPath = "resources/chapter1/readfile1_2/";
        File file = new File(dirPath.concat(a));
        log.debug(file);
        fileReader(file);
    }

    private static void fileReader(File file) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        try {
            String line = br.readLine();
            while (line != null) {
                if (line.startsWith("#include")) {
                    String[] split = line.split(" ");
                    log.debug(split[1]);
                    parceFile1(split[1]);
                } else {
                    System.out.println(line);
                }
                line = br.readLine();
            }
        } finally {
            br.close();
        }
    }
}
