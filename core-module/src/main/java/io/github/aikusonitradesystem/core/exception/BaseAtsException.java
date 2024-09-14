package io.github.aikusonitradesystem.core.exception;

import io.github.aikusonitradesystem.core.common.BaseErrorCode;

public interface BaseAtsException {
    BaseErrorCode getErrorCode();
    String getErrorAlias();
    String getMessage();
}
