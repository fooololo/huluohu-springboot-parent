package com.huluohu.learning.springboot.n2.core.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.io.File;

/**
 * Company        :   mamahao.com
 * author         :   guxiaolong
 * Date           :   2016/5/19
 * Time           :   15:32
 * Description    :
 */
@ConfigurationProperties(prefix = "custom.tomcat.ssl")
public class TomcatSSLProperties {
	private boolean ssl = true;
	private Integer port = 8443;
	private boolean secure = true;
	private String schema = "https";
	private File keyStore;
	private String keyPassword;
	private String keyStorePassword;
	private String keyStoreType = "JKS";
	private String keyAlias = "";

	public boolean isSsl() {
		return ssl;
	}

	public void setSsl(boolean ssl) {
		this.ssl = ssl;
	}

	public Integer getPort() {
		return port;
	}

	public void setPort(Integer port) {
		this.port = port;
	}

	public boolean isSecure() {
		return secure;
	}

	public void setSecure(boolean secure) {
		this.secure = secure;
	}

	public String getSchema() {
		return schema;
	}

	public void setSchema(String schema) {
		this.schema = schema;
	}

	public File getKeyStore() {
		return keyStore;
	}

	public void setKeyStore(File keyStore) {
		this.keyStore = keyStore;
	}

	public String getKeyStorePassword() {
		return keyStorePassword;
	}

	public void setKeyStorePassword(String keyStorePassword) {
		this.keyStorePassword = keyStorePassword;
	}

	public String getKeyStoreType() {
		return keyStoreType;
	}

	public void setKeyStoreType(String keyStoreType) {
		this.keyStoreType = keyStoreType;
	}

	public String getKeyPassword() {
		return keyPassword;
	}

	public void setKeyPassword(String keyPassword) {
		this.keyPassword = keyPassword;
	}

	public String getKeyAlias() {
		return keyAlias;
	}

	public void setKeyAlias(String keyAlias) {
		this.keyAlias = keyAlias;
	}
}
