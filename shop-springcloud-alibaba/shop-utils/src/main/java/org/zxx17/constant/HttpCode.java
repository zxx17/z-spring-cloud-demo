package org.zxx17.constant;

import lombok.Getter;

@Getter
public enum HttpCode {

    SUCCESS(200, "成功"),

    FAILURE(500, "失败");

    final int code;
    final String msg;

    HttpCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }


}
