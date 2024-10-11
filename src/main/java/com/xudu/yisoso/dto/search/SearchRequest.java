package com.xudu.yisoso.dto.search;

import com.xudu.yisoso.common.PageRequest;
import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName SearchRequest
 * @Description 搜索请求
 * @Author xudu
 * @Time 2024/9/10 8:35
 */
@Data
public class SearchRequest extends PageRequest implements Serializable {

    /**
     * 搜索词
     */
    private String searchText;

    /**
     * 搜索类型
     */
    private String Type;

    private static final long serialVersionUID = 1L;
}
