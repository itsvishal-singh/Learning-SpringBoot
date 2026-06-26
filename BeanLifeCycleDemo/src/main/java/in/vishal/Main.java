package in.vishal;

//import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
//        OrderService orderService = applicationContext.getBean(OrderService.class);
//        orderService.placeOrder();
//        AppConfig appConfig = applicationContext.getBean(AppConfig.class);
//        appConfig.demo();
        CartService cartService = applicationContext.getBean(CartService.class);
        System.out.println(cartService.getValue(1));
        applicationContext.close();
    }
}