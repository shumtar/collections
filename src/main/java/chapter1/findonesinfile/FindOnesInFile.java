package chapter1.findonesinfile;

/**
 * Created with IntelliJ IDEA.
 * User: taras
 * Date: 12/4/13
 * Time: 12:11 AM
 * To change this template use File | Settings | File Templates.
 */
public class FindOnesInFile {

    public int count(int i){
        if(i==1){
            return 1;
        }else if(i==0){
            return 0;
        }
        if(i%2==0){
            return count(i/2);
        }

        return ((i%2==0)?0:1) + count(i/2);
    }
}
