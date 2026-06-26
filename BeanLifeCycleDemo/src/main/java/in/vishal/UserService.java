package in.vishal;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component("userBean")
public class UserService /*implements BeanNameAware, ApplicationContextAware*/ {
//    public UserService(){
//        System.out.println("UserService Constructor Called");
//    }
//
//    @Override
//    public void setBeanName(String name) { // callback method
//        System.out.println("Bean name is " + name);
//    }
//    public String getBean(){
//        return "UserBean";
//    }
//
//    @Override
//    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
//        System.out.println("ApplicationContext name is " + applicationContext.getClass());
//    }
}
