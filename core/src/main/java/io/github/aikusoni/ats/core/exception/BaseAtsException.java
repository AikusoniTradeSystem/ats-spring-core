package io.github.aikusoni.ats.core.exception;

import io.github.aikusoni.ats.core.common.BaseErrorCode;

public interface BaseAtsException {
    BaseErrorCode getErrorCode();
    String getErrorAlias();
    String getMessage();
}
