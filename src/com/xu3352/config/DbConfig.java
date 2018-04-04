package com.xu3352.config;

/**
 * JDBC数据库连接配置
 * @author yuchanglong
 */
public class DbConfig {
	private String driverClass;
	private String username;
	private String password;
	private String url;

	public String getDriverClass() {
		return driverClass;
	}

	public void setDriverClass(String driverClass) {
		this.driverClass = driverClass;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "{driverClass=" + driverClass + ", username=" + username + ", password=" + password + ", url="
				+ url + "}";
	}
}
