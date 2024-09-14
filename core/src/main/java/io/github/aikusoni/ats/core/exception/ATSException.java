package io.github.aikusoni.ats.core.exception;

import io.github.aikusoni.ats.core.common.BaseErrorCode;
import io.github.aikusoni.ats.core.common.MessageCode;
import lombok.Getter;

@Getter
public class ATSException extends Exception implements BaseAtsException {
    private final BaseErrorCode errorCode;
    private final String errorAlias;

    /**
     * @param errorCode 에러코드를 넣는다.
     * @param errorAlias 에러 위치를 추적할 때 사용할만한 에러 별명을 넣는다.
     * @param message 에러 메시지를 넣는다.
     */
    public ATSException(BaseErrorCode errorCode, String errorAlias, String message) {
        super(message);
        this.errorCode = errorCode;
        this.errorAlias = errorAlias;
    }

    /**
     * @param errorCode 에러코드를 넣는다.
     * @param errorAlias 에러 위치를 추적할 때 사용할만한 에러 별명을 넣는다.
     * @param messageCode 에러 메시지 코드를 넣는다.
     */
    public ATSException(BaseErrorCode errorCode, String errorAlias, MessageCode messageCode) {
        super(messageCode.getMessage());
        this.errorCode = errorCode;
        this.errorAlias = errorAlias;
    }
}

