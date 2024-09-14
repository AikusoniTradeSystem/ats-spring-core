package io.github.aikusonitradesystem.core.exception;

import io.github.aikusonitradesystem.core.common.BaseErrorCode;
import lombok.Getter;

@Getter
public class ATSRuntimeException extends RuntimeException implements BaseAtsException{
    private final BaseErrorCode errorCode;
    private final String errorAlias;

    /**
     * @param errorCode 에러코드를 넣는다.
     * @param errorAlias 에러 위치를 추적할 때 사용할만한 에러 별명을 넣는다.
     * @param message 에러 메시지를 넣는다.
     */
    public ATSRuntimeException(BaseErrorCode errorCode, String errorAlias, String message) {
        super(message);
        this.errorCode = errorCode;
        this.errorAlias = errorAlias;
    }
}
