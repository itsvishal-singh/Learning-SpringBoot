package in.vishal.springbootcoredemo;

import org.springframework.context.annotation.Configuration;

@Configuration
public class OrderService {
    private PaymentService paymentService;
    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
    public void processOrder() {
        paymentService.pay();
        System.out.println("Order processing...");
    }
}
