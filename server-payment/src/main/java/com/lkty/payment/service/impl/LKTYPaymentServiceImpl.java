package com.lkty.payment.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lkty.payment.mapper.IPaymentMapper;
import com.lkty.payment.pojo.Payment;
import com.lkty.payment.pojo.R;
import com.lkty.payment.service.ILKTYPaymentService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;


@Service
public class LKTYPaymentServiceImpl extends ServiceImpl<IPaymentMapper, Payment> implements ILKTYPaymentService {



    public R<Payment> create(Payment payment) {
        if (payment == null) {
            return new R(1, "参数错误");
        }
        int insert = this.baseMapper.insert(payment);
        if (insert != 1) {
            return new R(2, "保存失败");
        }
        return new R(200, "保存成功", payment);
    }

    public R<Payment> fetchById(String id) {
        if (StringUtils.isBlank(id)) {
            return new R(1, "参数错误");
        }
        Payment payment = this.baseMapper.selectById(id);
        return new R(200, "获取成功", payment);
    }

}
