package com.yj.auto.common;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class PageResult<T> {
    private Long total;
    private Integer page;
    private Integer pageSize;
    private List<T> dataList;

    public static <T> PageResult<T> buildResult(List<T> data,Long total,Integer page,Integer pageSize){
        return PageResult.<T>builder()
                .dataList(data)
                .total(total)
                .page(page)
                .pageSize(pageSize)
                .build();
    }

}
