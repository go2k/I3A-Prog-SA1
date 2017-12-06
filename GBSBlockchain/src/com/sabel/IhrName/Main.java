package com.sabel.IhrName;

import java.sql.SQLException;
import java.util.List;

/**
 * @author König Michael
 */
public class Main {
    public static void main(String[] args) throws SQLException {
        String ihrName = "König";
        System.out.println(ihrName + ", SHA-256-Hashwert: " + Util.hashFunction(ihrName));


        GBSBlockchain gbsBlockchain = new GBSBlockchain();
        gbsBlockchain.listeAusgeben();


    }
}
