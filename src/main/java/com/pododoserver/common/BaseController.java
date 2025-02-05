package com.pododoserver.common;

import com.pododoserver.common.constant.BaseMsg;
import com.pododoserver.common.dto.BaseResDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.WebRequest;

public class BaseController {

    // todo public <T> ResponseEntity 정의 -> 헤더 정의

    public <T> ResponseEntity<BaseResDTO<T>> getResOK (WebRequest webReq, BaseMsg baseMsg, T body) {
        return ResponseEntity.ok(new BaseResDTO<>(body));
    }

    public <T> ResponseEntity<BaseResDTO<T>> getResOK (WebRequest webReq, BaseMsg baseMsg) {
        return ResponseEntity.ok(new BaseResDTO<>(null));
    }
}
