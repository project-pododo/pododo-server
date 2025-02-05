package com.pododoserver.common.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Getter
@AllArgsConstructor
public enum BaseMsg {

    // 10000 ~ 19999 기본 메세지
    SUCCESS_OK("10000", "성공"),

    // todo 메세지 추가

    ;

    private static final Map<String,BaseMsg> map = Stream.of(values())
            .collect(Collectors.toMap(BaseMsg::getCode, Function.identity()));

    public static BaseMsg getBaseMsg(String code) {
        return map.get(code);
    }

    private final String code;
    private final String msg;
}
