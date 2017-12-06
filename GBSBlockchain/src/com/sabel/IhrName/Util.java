package com.sabel.IhrName;
/**
 * @author König Michael
 */

import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Util {

    public static String hashFunction(String toHash) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            return DatatypeConverter.printHexBinary(md.digest(toHash.getBytes()));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(hashFunction("hallo"));
    }
}
