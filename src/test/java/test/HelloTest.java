package test;

import com.hello.Application;
import com.hello.controller.Hello;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


/**
 * 单元测试类demo
 */
@SpringBootTest(classes = Application.class)
public class HelloTest {
    @Test
    void hellotest(){
        Hello hello = new Hello();
        hello.sayHello();
    }
}
