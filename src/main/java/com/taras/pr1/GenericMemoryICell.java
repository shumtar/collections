package com.taras.pr1;

/**
 * Created with IntelliJ IDEA.
 * User: taras
 * Date: 11/28/13
 * Time: 5:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class GenericMemoryICell<Type> {
    Type t;

    Type read() {
        return t;
    }

    void write(Type t){
        this.t=t;
    }
}
