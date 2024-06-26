package me.n1ar4.jar.obfuscator.templates;

import me.n1ar4.jrandom.core.JRandom;
import me.n1ar4.log.LogManager;
import me.n1ar4.log.Logger;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class StringDecrypt {
    private static final Logger logger = LogManager.getLogger();
    public static String KEY = null;
    private static final String ALGORITHM = "AES";
    private static final Charset CHARSET = StandardCharsets.UTF_8;

    public static void changeKEY(String key) {
        if (key == null) {
            KEY = JRandom.getInstance().randomString(16);
            logger.info("设置随机 AES_KEY 为 " + KEY);
            return;
        }
        if (key.equals("Y4SuperSecretKey")) {
            logger.warn("默认 AES_KEY 是不安全的");
            KEY = JRandom.getInstance().randomString(16);
            logger.info("设置随机 AES_KEY 为 " + KEY);
        } else {
            if (key.length() == 16) {
                KEY = key;
                logger.info("change encrypt aes key to: {}", key);
            } else {
                logger.warn("AES_KEY 长度必须是 16 当前长度是 " + key.length());
                KEY = JRandom.getInstance().randomString(16);
                logger.info("设置随机 AES_KEY 为 " + KEY);
            }
        }
    }

    public static String encrypt(String input) {
        try {
            SecretKeySpec key = new SecretKeySpec(KEY.getBytes(CHARSET), ALGORITHM);
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            cipher.init(Cipher.ENCRYPT_MODE, key);
            byte[] encrypted = cipher.doFinal(input.getBytes(CHARSET));
            return new String(Base64.getEncoder().encode(encrypted), CHARSET);
        } catch (Exception e) {
            return null;
        }
    }

    @SuppressWarnings("unused")
    public static String decrypt(String encrypted) {
        try {
            SecretKeySpec key = new SecretKeySpec(KEY.getBytes(CHARSET), ALGORITHM);
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            cipher.init(Cipher.DECRYPT_MODE, key);
            byte[] data = encrypted.getBytes(CHARSET);
            byte[] original = cipher.doFinal(Base64.getDecoder().decode(data));
            return new String(original, CHARSET);
        } catch (Exception e) {
            return null;
        }
    }
}
