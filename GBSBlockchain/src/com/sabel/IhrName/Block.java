package com.sabel.IhrName;
/**
 * @author König Michael
 */
public class Block {

    private int id;
    private double timestamp;
    private String daten;
    private String prevHash;
    private String selfHash;

    public Block(int id, double timestamp, String daten, String prevHash) {
        this.id = id;
        this.timestamp = timestamp;
        this.daten = daten;
        this.prevHash = prevHash;
        this.selfHash = Util.hashFunction(String.valueOf(id) + String.valueOf(timestamp) + daten + prevHash);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(double timestamp) {
        this.timestamp = timestamp;
    }

    public String getDaten() {
        return daten;
    }

    public void setDaten(String daten) {
        this.daten = daten;
    }

    public String getPrevHash() {
        return prevHash;
    }

    public void setPrevHash(String prevHash) {
        this.prevHash = prevHash;
    }

    public String getSelfHash() {
        return selfHash;
    }

    public void setSelfHash(String selfHash) {
        this.selfHash = selfHash;
    }
}
