package com.sabel.IhrName;
/**
 * @author König Michael
 */
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class BlockService {

    private Connection connection;
    private PreparedStatement preparedStatementReadAll;

    public BlockService() throws SQLException {
        connection = DriverManager.getConnection("jdbc:sqlite://D:\\KoenigMichael\\I3A-Prog-SA1\\Blockchain.db");
        preparedStatementReadAll = connection.prepareStatement("select id, timestamp, data, prev_hash, self_hash from block order by id");

    }

    public List<Block> getAllBlocks() throws SQLException {
        ResultSet rs = preparedStatementReadAll.executeQuery();
        List<Block> list = new ArrayList<Block>();
        while (rs.next()) {
            list.add(new Block(rs.getInt("id"), rs.getDouble("timestamp"), rs.getString("data"), rs.getString("prev_hash")));
        }
        return list;
    }
}
