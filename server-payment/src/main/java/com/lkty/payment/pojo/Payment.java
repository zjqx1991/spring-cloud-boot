package com.lkty.payment.pojo;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
@TableName("t_payment")
public class Payment implements Serializable {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    private String orderId;
}
