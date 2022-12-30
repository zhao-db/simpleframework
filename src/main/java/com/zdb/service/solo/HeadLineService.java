package com.zdb.service.solo;

import java.util.List;

import com.zdb.entity.bo.HeadLine;
import com.zdb.entity.dto.Result;

/**
 * <p>
 *
 * </p>
 *
 * @author zhaodb 2022/12/28
 * @since 3.0.1
 */
public interface HeadLineService {

    Result<Boolean> addHeadLine(HeadLine headLine);

    Result<Boolean> removeHeadLine(Long headLineId);

    Result<Boolean> modifyHeadLine(HeadLine headLine);

    Result<HeadLine> queryHeadLineById(Long headLineId);

    Result<List<HeadLine>> queryHeadLine(HeadLine headLineCondition, int pageIndex, int pageSize);
}
