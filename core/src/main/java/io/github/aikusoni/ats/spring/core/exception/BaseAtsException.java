package io.github.aikusoni.ats.spring.core.exception;

import io.github.aikusoni.ats.spring.core.common.BaseErrorCode;

public interface BaseAtsException {
    BaseErrorCode getErrorCode();
    String getErrorAlias();
    String getMessage();
}
