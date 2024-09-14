package io.github.aikusonitradesystem.core.common;

import java.util.Locale;

public record MessageCode(String messageCode) {

    public String getMessage() {
        return MessageUtils.m(messageCode());
    }

    public String getMessage(Object[] args) {
        return MessageUtils.m(messageCode(), args);
    }

    public String getMessage(Object[] args, Locale locale) {
        return MessageUtils.m(messageCode(), args, locale);
    }

    public String getMessage(Locale locale) {
        return MessageUtils.m(messageCode(), null, locale);
    }

    public static MessageCode of(String messageCode) {
        return new MessageCode(messageCode);
    }
}

