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
public class HeadLine {
    private Long lineId;
    private String lineName;
    private String lineLink;
    private String lineImg;
    private Integer priority;
    private Integer enableStatus;
    private Date createTime;
    private Date lastEditTime;

}
