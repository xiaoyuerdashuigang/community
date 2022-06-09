package com.pudongdevelopmentbank.community.dao.impl;

import com.pudongdevelopmentbank.community.dao.AlphaDao;
import org.springframework.stereotype.Repository;

@Repository("alphaHibernate")
public class AlphaDaoHibernateImpl implements AlphaDao {
    @Override
    public String select() {
        return "Hibernate";
    }
}
