package com.example.testmybatis;

import com.example.testmybatis.Mapper.UserMapper;
import com.example.testmybatis.entity.User;
import com.example.testmybatis.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class TestmybatisApplicationTests {

    @Test
   public void testGetUserList() {
        //第一步：获得SqlSession对象
        SqlSession sqlSession= MyBatisUtils.getSqlSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        List<User> userList=userMapper.getUserList();
        for (User user : userList){
            System.out.println(user);
        }
        //关闭SqlSession
        sqlSession.close();
    }

}
