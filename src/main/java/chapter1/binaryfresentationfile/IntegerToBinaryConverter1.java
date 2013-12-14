package chapter1.binaryfresentationfile;

import org.apache.log4j.Logger;

public class IntegerToBinaryConverter1 {
    static final Logger log = Logger.getLogger(IntegerToBinaryConverter1.class);

    public static void convert() {
        int number = 111;
        IntegerToBinaryConverter1 integerToBinaryConverter1 = new IntegerToBinaryConverter1();
        System.out.println(integerToBinaryConverter1.convert(number));

    }

    protected String convert(int number) {
        String s = "";
        return convert(number, s);
    }

    protected String convert(int number, String s) {
        int surplus = number % 2;
        s = surplus + s;
        if (number == 1) {
            return s;
        } else {
            return convert(number / 2, s);
        }
    }
}
