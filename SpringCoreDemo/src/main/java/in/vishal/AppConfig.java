package in.vishal;

import in.vishal.payment.CardPayment;
import in.vishal.payment.PaymentService;
import in.vishal.payment.UPIPayment;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("in.vishal")
public class AppConfig {
    @Bean
    public User createUser(){
        return new User("Vishal", 24);
    }
    @Bean
    @Primary
    public PaymentService createCardPayment(){
        return new CardPayment();
    }
    @Bean

    public PaymentService createUPIPayment(){
        return new UPIPayment();
    }
    @Bean
    public OrderService createOrderService(PaymentService paymentService){
        return new OrderService(paymentService );
    }

}
