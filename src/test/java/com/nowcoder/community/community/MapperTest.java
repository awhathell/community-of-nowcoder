package com.nowcoder.community.community;


import com.nowcoder.community.community.dao.DiscussPostMapper;
import com.nowcoder.community.community.dao.UserMapper;
import com.nowcoder.community.community.entity.DiscussPost;
import com.nowcoder.community.community.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * ClassName: MapperTest
 * Package: com.nowcoder.community.community
 * Description:
 *
 * @Author wmy
 * @Create 2023/6/26 20:47
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class MapperTest {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private DiscussPostMapper disscussPostMapper;

    @Test
    public void testSelectUser() {
        User user = userMapper.selectById(150);
        System.out.println(user);
        user = userMapper.selectByName("liubei");
        System.out.println(user);
        user = userMapper.selectByEmail("nowcoder101@sina.com");
        System.out.println(user);
    }


    @Test
    public void testInsertUser(){
        User user=new User();
        user.setEmail("163.com");
        user.setPassword("123456");
        user.setSalt("123");
        int rows=userMapper.insertUser(user);
        System.out.println(rows);
        System.out.println(user.getId());

    }

    @Test
    public void testUpdateUser(){
        int row=userMapper.updatePassword(150,"12345");
        System.out.println(row);
    }

    @Test
    public void testSelectPost(){
        List<DiscussPost> list=disscussPostMapper.selectDiscussPosts(149,0,10);

        for(DiscussPost post:list){
            System.out.println(post);
        }

        int rows=disscussPostMapper.selectDiscussPostRows(149);
        System.out.println(rows);
    }






}
