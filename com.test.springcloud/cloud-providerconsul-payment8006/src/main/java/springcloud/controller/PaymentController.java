package springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class PaymentController {
    @Value("${server.port}")
    private String SERVER_PORT;

    @RequestMapping("/payment/consul")
    public String paymentConsul() {
        return "springcloud with consul :" + SERVER_PORT + "\t" + UUID.randomUUID().toString();
    }
}