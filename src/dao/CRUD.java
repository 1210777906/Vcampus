package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
/*
���õ���ɾ�Ĳ�ӿڣ�ʹ��ʱ�ȴ���ʵ����
 */
public class CRUD<T> {



    public void Query(String table) throws Exception {
        String sql = "select * from "+table;
        Connection conn = databaseConn.getConn();
        Statement stm = conn.createStatement();
        stm.executeQuery(sql);

    }

}
