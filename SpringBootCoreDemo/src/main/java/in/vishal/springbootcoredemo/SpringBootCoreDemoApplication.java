package in.vishal.springbootcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootCoreDemoApplication {

     static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(SpringBootCoreDemoApplication.class, args);
        OrderService orderService = applicationContext.getBean(OrderService.class);
        orderService.processOrder();
    }
}
