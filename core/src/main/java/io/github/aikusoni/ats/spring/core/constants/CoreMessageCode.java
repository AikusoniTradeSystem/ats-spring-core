package io.github.aikusoni.ats.spring.core.constants;

import io.github.aikusoni.ats.spring.core.common.MessageCode;

/**
 * 메시지 정의
 */
public interface CoreMessageCode {
    MessageCode LANGUAGE = MessageCode.of("core.language");
    MessageCode LANGUAGE_DISPLAY = MessageCode.of("core.language.display");
    MessageCode TEST = MessageCode.of("core.test");
    MessageCode TEST_DEFAULT = MessageCode.of("core.test.default");
}
