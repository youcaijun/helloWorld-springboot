package test;

import com.hello.Application;
import com.hello.app.redisClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;


/**
 * redis单元测试类
 */
@SpringBootTest(classes = Application.class)
public class redisTest {

    /**
     * 测试获取配置,必须注入对应的类方可使用对应的value值
     */
    @Autowired
    private redisClient client;

    @Autowired
    private Environment env;

    @Test
    void getSeting(){
        String host = env.getProperty("redis.host");
        String port = env.getProperty("redis.port");
        System.out.println(host);
        System.out.println(port);
//        System.out.println(client.getHost());
//        System.out.println(client.getPort());
    }
    @Test
    void pong(){
        String ping = client.ping();
        client.set("name","张三");
        System.out.println(client.get("name"));
        client.close();

    }
}
