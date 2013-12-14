package chapter1.permutter;

import org.apache.log4j.Logger;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: taras
 * Date: 12/4/13
 * Time: 12:36 AM
 * To change this template use File | Settings | File Templates.
 */
public class CharPermutter {
    static final Logger log = Logger.getLogger(CharPermutter.class);
    int n=0;
    public void permute(String s){

        //System.out.println(s);
        n=1;
        log.debug(s);
        permute(s.toCharArray(),0,s.length()-1);
    }
    private void permute(char []string,int start,int end){
            if(start==end)return;

        for(int i=start+1;i<=end;i++){
            char[] arr= Arrays.copyOf(string,string.length);
            char a=arr[start];
            char b=arr[i];
            arr[start]=b;
            arr[i]=a;
            ++n;
            log.debug(arr);
            //System.out.println(arr);
        }

        permute(string,++start,end);
    }

    int count(String s){
        permute(s);
        return n;
    }
}
