package in.vishal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class PaymentService {
    @Autowired
    OrderService orderService;
//    public PaymentService(OrderService orderService){
//        this.orderService = orderService;
//    }
    public void pay() {
        System.out.println("Payment Done");

//        not its responsibility
//        orderService.getOrderDetails();
    }
}
