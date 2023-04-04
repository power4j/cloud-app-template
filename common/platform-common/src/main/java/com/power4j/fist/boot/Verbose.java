package com.power4j.fist.boot;

import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.lang.Nullable;

import java.io.PrintStream;

/**
 * @author CJ (power4j@outlook.com)
 * @since 1.0
 */
@Slf4j
@UtilityClass
public class Verbose {

	// @formatter:off
	public static final String[] BOOT_ENV_KEYS = {
			"SPRING_PROFILES",
			"NACOS_HOST","NACOS_PORT","NACOS_USER","NACOS_NAMESPACE","NACOS_GROUP",
			"CONFIG_SRV_URL","CONFIG_LABEL","CONFIG_PROFILE",
			"DB_HOST","DB_PORT","DB_NAME",
			"REDIS_HOST","REDIS_PORT","REDIS_DB"
	};
	// @formatter:on

	public void printBootEnv(PrintStream stream) {
		for (String key : BOOT_ENV_KEYS) {
			stream.printf("ENV: %s = %s%n", StringUtils.rightPad(key, 30), getEnv(key));
		}
	}

	@Nullable
	String getEnv(@Nullable String key) {
		if (key == null) {
			return null;
		}
		try {
			return System.getenv(key);
		}
		catch (Exception e) {
			log.warn("Read environment({}) fail,error : {} ", key, e.getMessage());
			return null;
		}
	}

}
