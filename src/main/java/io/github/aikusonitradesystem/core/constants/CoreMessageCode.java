package io.github.aikusonitradesystem.core.constants;

import io.github.aikusonitradesystem.core.common.MessageCode;

import static io.github.aikusonitradesystem.core.common.MessageCode.of;

/**
 * 메시지 정의
 */
public interface CoreMessageCode {
    MessageCode LANGUAGE = of("core.language");
    MessageCode LANGUAGE_DISPLAY = of("core.language.display");
    MessageCode TEST = of("core.test");
    MessageCode TEST_DEFAULT = of("core.test.default");
}
