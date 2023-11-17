package config;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomData {
    public static String RANDOM_EMAIL = RandomStringUtils.randomAlphabetic(10) + "@yandex.ru";
    public static String RANDOM_PASSWORD = RandomStringUtils.randomNumeric(6);
    public static String RANDOM_PASSWORD_WRONG = RandomStringUtils.randomNumeric(5);
    public static String RANDOM_NAME = RandomStringUtils.randomAlphabetic(10);
}
