package com.sabel.IhrName;

/**
 * @author König Michael
 */
public class Main {
    public static void main(String[] args) {
        String ihrName = "König";
        System.out.println(ihrName + ", SHA-256-Hashwert: " + Util.hashFunction(ihrName));
    }
}
