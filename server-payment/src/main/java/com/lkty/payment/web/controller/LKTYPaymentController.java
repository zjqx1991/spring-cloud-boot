package com.lkty.payment.web.controller;


import com.lkty.payment.pojo.Payment;
import com.lkty.payment.pojo.R;
import com.lkty.payment.service.ILKTYPaymentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/payment")
public class LKTYPaymentController {

    @Resource
    private ILKTYPaymentService paymentService;

    @PostMapping("/create")
    public R<Payment> create(@RequestBody Payment payment) {
        return this.paymentService.create(payment);
    }


    @GetMapping("/{id}")
    public R<Payment> fetchById(@PathVariable("id") String id) {
        return this.paymentService.fetchById(id);
    }
}
