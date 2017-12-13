package com.sabel.IhrName;
/**
 * @author König Michael
 */
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GBSBlockchain {

    private BlockService blockService;
    private Block block;
    private List<Block> list;
    private List<Block> sortedList;

    public GBSBlockchain() throws SQLException {

        BlockService blockService = new BlockService();
        list = blockService.getAllBlocks();
        sortedList = new ArrayList<>();

        for (Block b : list) {
            if (b.getPrevHash().equals("0")) {
                block = b;
            }
        }

        sortedList.add(block);
        sucheNachfolger(block);

//        for (Block b : list) {
//            System.out.println(b.getPrevHash() + "   " + b.getSelfHash());
//        }

    }

    public void sucheNachfolger(Block block) {
        for (Block aktuellerBlock : list) {
            if (aktuellerBlock.getPrevHash().equals(block.getSelfHash())) {
                sortedList.add(aktuellerBlock);
                sucheNachfolger(aktuellerBlock);
            }
        }
    }

    public void listeAusgeben() {

        for (Block b : sortedList) {
            System.out.print(b.getDaten() + " ");
        }
        System.out.println("");
    }

}
