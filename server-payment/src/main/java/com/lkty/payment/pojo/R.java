package com.lkty.payment.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class R<T> {
    private Integer code;
    private String msg;
    private T data;

    public R(Integer code, String message) {
        this(code, message, null);
    }
}
