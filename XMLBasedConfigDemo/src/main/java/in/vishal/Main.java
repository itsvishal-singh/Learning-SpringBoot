package in.vishal;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("appConfig.xml");
        // Get Bean by id/name
//        OrderService orderService = (OrderService) applicationContext.getBean("orderService");
        // Get Bean by type
//        OrderService orderService = applicationContext.getBean(OrderService.class);
//
//        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);
//
//        orderService.placeOrder();
        UserService userService = applicationContext.getBean(UserService.class);
        applicationContext.close();
    }
}