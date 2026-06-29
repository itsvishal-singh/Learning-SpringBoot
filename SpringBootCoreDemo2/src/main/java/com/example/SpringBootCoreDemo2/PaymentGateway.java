package com.example.SpringBootCoreDemo2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PaymentGateway {
    private PaymentProperties paymentProperties;
    public PaymentGateway(PaymentProperties paymentProperties) {
        this.paymentProperties = paymentProperties;
    }
    public String getType(){
        return paymentProperties.getType();
    }
    public int getRetry(){
        return paymentProperties.getRetry();
    }
    public boolean isEnabled(){
        return paymentProperties.isEnabled();
    }
    public int getTimeout(){
        return paymentProperties.getTimeout();
    }

    public void print(){
        System.out.println(getType());
        System.out.println(getRetry());
        System.out.println(getTimeout());
        System.out.println(isEnabled());
    }


 // @Value
//    String type;
//    int retry;
//
//    public PaymentGateway(@Value("${paymentGateway.type}") String type,
//                          @Value("${paymentGateway.retry-count}") int retry) {
//        this.type = type;
//        this.retry = retry;
//    }
//
//    public String getType() {
//        return type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }
//
//    public int getRetry() {
//        return retry;
//    }
//
//    public void setRetry(int retry) {
//        this.retry = retry;
//    }

}
