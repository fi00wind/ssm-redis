package cn.coolwind.redis.web.service;

import cn.coolwind.redis.core.entity.Test;
import cn.coolwind.redis.web.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    @Autowired
    private TestDao testDao;

    public Test getById(int id) {
        return testDao.getById(id);
    }

    public void update(Test test) {
        testDao.updateTest(test);
    }
}
