package cn.coolwind.redis.web.dao;

import cn.coolwind.redis.core.entity.Test2;
import org.apache.ibatis.annotations.Param;

public interface Test2Dao {
    Test2 getById(int id);

    void updateTest(Test2 test);

    void insert(@Param("name") String name, @Param("value") String value);

}
