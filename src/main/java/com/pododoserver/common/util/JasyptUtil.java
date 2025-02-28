package com.pododoserver.common.util;

import jakarta.annotation.PostConstruct;
import org.jasypt.util.text.AES256TextEncryptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class JasyptUtil {

    @Value("${jasypt.encryptor.password}")
    private String encryptionKey;

    private static final AES256TextEncryptor encryptor = new AES256TextEncryptor();

    @PostConstruct
    public void init() {
        if (encryptionKey == null || encryptionKey.isEmpty()) {
            throw new IllegalStateException("JASYPT_ENCRYPTOR_PASSWORD 환경 변수가 설정되지 않았습니다.");
        }
        encryptor.setPassword(encryptionKey);
    }

    // 암호화 메서드
    public static String encrypt(String plainText) {
        return encryptor.encrypt(plainText);
    }

    // 복호화 메서드
    public static String decrypt(String encryptedText) {
        return encryptor.decrypt(encryptedText);
    }
}

