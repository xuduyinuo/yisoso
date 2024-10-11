package com.xudu.yisoso.datasource;

import java.util.List;

/**
 * @ClassName DataSource
 * @Description
 * @Author xudu
 * @Time 2024/9/10 15:09
 */
public interface DataSource<T> {

    /**
     * 搜索
     *
     * @param searchText 搜索词
     * @return 列表
     */
    List<T> doSearch(String searchText, long pageNum, long pageSize);
}
