import com.ricky.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {

    @Test
    public void demo1() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserService userService = ac.getBean(UserService.class);
        System.out.println(userService);
        userService.add();
    }

}
