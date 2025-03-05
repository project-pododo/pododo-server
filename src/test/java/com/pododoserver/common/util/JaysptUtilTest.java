package com.pododoserver.common.util;

import org.jasypt.encryption.pbe.PooledPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.SimpleStringPBEConfig;
import org.junit.jupiter.api.Test;

public class JaysptUtilTest {

    @Test
    void jasypt() {
        String url = "";
        String username = "";
        String password = "";

        System.out.println(jasyptEnc(url));
        System.out.println(jasyptEnc(username));
        System.out.println(jasyptEnc(password));
    }

    public String jasyptEnc(String VALUE) {
        String key = "pododo";
        PooledPBEStringEncryptor encryptor = new PooledPBEStringEncryptor();
        SimpleStringPBEConfig config = new SimpleStringPBEConfig();

        config.setPassword(key);
        config.setAlgorithm("PBEWithMD5AndDES");
        config.setKeyObtentionIterations(1000);
        config.setPoolSize(1);
        config.setProviderName("SunJCE");
        config.setSaltGeneratorClassName("org.jasypt.salt.RandomSaltGenerator");
        config.setStringOutputType("base64");

        encryptor.setConfig(config);
        return encryptor.encrypt(VALUE);
    }

}