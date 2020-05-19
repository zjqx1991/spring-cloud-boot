package com.lkty.payment.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lkty.payment.pojo.Payment;
import com.lkty.payment.pojo.R;

public interface ILKTYPaymentService extends IService<Payment> {

    R<Payment> create(Payment payment);

    R<Payment> fetchById(String id);
}
