package com.company.cubashare.service;



import com.company.cubashare.dao.UserInfoDao;
import com.company.cubashare.entity.UserInfo;
import com.haulmont.cuba.core.Persistence;
import com.haulmont.cuba.core.Transaction;
import com.haulmont.cuba.core.global.AppBeans;
import org.apache.ibatis.session.SqlSession;
import org.hibernate.validator.internal.util.logging.Log_$logger;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service(RestTestService.NAME)
public class RestTestServiceBean implements RestTestService {

    @Inject
    private Logger log;

    @Inject
    Persistence persistence;

    @Inject
    UserInfoDao userInfoDao;


    @Override
    public void restTest(String request) {
        log.info("request: {}, hot", request);

        /*try (Transaction tx = persistence.createTransaction()) {
            SqlSession sqlSession = AppBeans.get("sqlSession");
            UserInfo order = (UserInfo) sqlSession.selectList("com.company.cubashare.entity.UserInfo.getUser");
            log.info("userinfo: {}, email: {}", order.getUsername(), order.getEmail());
            tx.commit();
        }*/

        List<UserInfo> userList = userInfoDao.getUser();
        for (UserInfo u: userList) {
            log.info("username: {}, email：{}", u.getUsername(), u.getEmail());
        }

    }
}