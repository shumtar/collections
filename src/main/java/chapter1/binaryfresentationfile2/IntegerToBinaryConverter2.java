package chapter1.binaryfresentationfile2;

/**
 * Created with IntelliJ IDEA.
 * User: taras
 * Date: 12/1/13
 * Time: 12:19 AM
 * To change this template use File | Settings | File Templates.
 */
public class IntegerToBinaryConverter2 {


    private BooleanSimulator booleanSimulator = new BooleanSimulator();

    public static void convert() {
        IntegerToBinaryConverter2 integerToBinaryConverter2=new IntegerToBinaryConverter2();
        System.out.println(integerToBinaryConverter2.convert(2));
    }
    public String convert(int numberToConvert) {
        return convert(numberToConvert,booleanSimulator);
    }
    private String convert(int numberToConvert,BooleanSimulator booleanSimulator) {
        double division=(double)numberToConvert/Integer.parseInt(booleanSimulator.getNumber(),2);
        if(division==1.0){
           return booleanSimulator.getNumber();
        }
        return convert(numberToConvert,booleanSimulator.addOne());
    }
}
