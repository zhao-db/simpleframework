package com.zdb.entity.dto;

import lombok.Data;

/**
 * <p>
 *
 * </p>
 *
 * @author zhaodb 2022/12/28
 * @since 3.0.1
 */
@Data
public class Result<T>{

    private int code;

    private String msg;

    private T data;

}
