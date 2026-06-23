package in.vishal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        OrderService orderService = applicationContext.getBean(OrderService.class);
        orderService.placeOrder();

    }
}