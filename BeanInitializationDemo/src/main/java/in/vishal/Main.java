package in.vishal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext= new AnnotationConfigApplicationContext(AppConfig.class);
        OrderService orderService= applicationContext.getBean(OrderService.class);
//        System.out.println("Vishal");
        orderService.placeOrder();
//        PaymentService paymentService= applicationContext.getBean(PaymentService.class);
        
    }
 }