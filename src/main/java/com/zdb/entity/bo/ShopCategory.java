package com.zdb.entity.bo;

import java.util.Date;

import lombok.Data;

/**
 * <p>
 *
 * </p>
 *
 * @author zhaodb 2022/12/27
 * @since 3.0.1
 */
@Data
public class ShopCategory {

    private Long shopCategoryId;
    private String shopCategoryName;
    private String shopCategoryDesc;
    private String shopCategoryImg;
    private Integer priority;
    private Date createTime;
    private Date lastEditTime;
    private ShopCategory parent;

}
