package cn.coolwind.redis.web.dao;

import cn.coolwind.redis.core.entity.Test;

public interface TestDao {
    Test getById(int id);

    void updateTest(Test test);
}
