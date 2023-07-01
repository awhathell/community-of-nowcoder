package com.nowcoder.community.community;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * ClassName: loggerTest
 * Package: com.nowcoder.community.community
 * Description:
 *
 * @Author wmy
 * @Create 2023/7/1 11:27
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class loggerTest {

    private static final Logger logger= LoggerFactory.getLogger(loggerTest.class);

    @Test
    public void testLogger(){
        System.out.println(logger.getName());
        logger.debug("debug log");
        logger.info("info log");
        logger.warn("warn log");
        logger.error("error log");
    }

}
