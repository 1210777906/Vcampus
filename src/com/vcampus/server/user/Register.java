package com.vcampus.server.user;

import com.vcampus.dao.CRUD;

import java.util.List;
import java.util.Map;

public class Register {
    public String register(String username,String password) throws Exception {
        String sql   = "select * from tb_USR where studentID = '"+username+"'";
        List<Map<String,Object>> list = CRUD.Query(sql);
        if (!list.isEmpty()){
            return "���˻��ѱ�ע��";
        }else {
            String sql2 = "insert into tb_USR (studentID,password,type) values ('"+username+"','"+password+"',0)";
            //System.out.println(sql2);
            CRUD.update(sql2);
            return "ע��ɹ�";
        }
    }
    //��¼���и����⣬���ǵ�½�ɹ�������Ҫת��������򣬵�����Ҳ��Ǻ�����...������˵Ӧ��ת���û���Ӧ���߳�

}
