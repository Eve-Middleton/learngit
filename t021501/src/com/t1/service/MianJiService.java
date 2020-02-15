package com.t1.service;

import com.t1.dao.domain.MianJi;
import com.t1.dao.impl.MianJiDAOimpl;

public class MianJiService {
    public int getMianJi(int id) {
        MianJiDAOimpl jxdao = new MianJiDAOimpl();

        MianJi jxmj = jxdao.select(id);
        int mj = jxmj.getChang() * jxmj.getKuan();
        return mj;
    }
}
