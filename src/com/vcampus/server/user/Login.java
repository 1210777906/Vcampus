package com.vcampus.server.user;

import com.vcampus.dao.CRUD;

import java.util.List;
import java.util.Map;
/*
֮���԰ѵ�¼��ע��ֿ�������Ϊ�Ҿ��õ�¼�Ѷ�Զ����ע�ᣬ��½��Ҫ��ת�����������զ��������������
Ŀǰд��Ҳ����ֻ���ж�
 */
public class Login {
    public boolean login(String username,String password) throws Exception {
        String sql   = "select * from tb_USR where studentID = '"+username+"' and password = '"+password+"'";
        List<Map<String,Object>> list = CRUD.Query(sql);
        if(!list.isEmpty()){
            return true;
        }else {
            return false;
        }
    }
}
