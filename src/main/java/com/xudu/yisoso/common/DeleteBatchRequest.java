package com.xudu.yisoso.common;

import lombok.Data;

import java.util.List;

@Data
public class DeleteBatchRequest {

    List<Integer> ids;
}