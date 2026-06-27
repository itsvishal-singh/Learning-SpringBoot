package in.vishal.springbootcoredemo;

import org.springframework.context.annotation.Configuration;

@Configuration
public class PaymentService {
    public void pay(){
        System.out.println("Payment Done");
    }
}
