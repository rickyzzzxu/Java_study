import com.ricky.aop.User;
import com.ricky.config.SpringConfig;
import com.ricky.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {

    @Test
    public void demo1() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserService userService = ac.getBean(UserService.class);
        System.out.println(userService);
        userService.add();
    }

    @Test
    public void demo2() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = ac.getBean(UserService.class);
        System.out.println(userService);
        userService.add();
    }

    @Test
    public void demo3() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        User user = ac.getBean(User.class);
        user.add();
    }

}
