package com.pododoserver.common.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BaseResDTO<T> {

    private T body;
}
