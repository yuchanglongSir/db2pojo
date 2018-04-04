package com.xu3352.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.xu3352.config.DbConfig;
import com.xu3352.config.SetupConfig;
import com.xu3352.core.Column;

/**
 * JDBC Support of databases
 * @author yuchanglong
 */
public abstract class AbstractDaoSupport {
	protected static String driverName = ""; 	// Load the JDBC driver
	protected static String url = ""; 		// a JDBC url
	protected static String username = "";
	protected static String password = "";
	
	// init config
	static {
		DbConfig dbConfig = SetupConfig.getInstance().getDbConfig();
		driverName = dbConfig.getDriverClass();
		url = dbConfig.getUrl();
		username = dbConfig.getUsername();
		password = dbConfig.getPassword();
	}
	
	/**
	 * create a new dao instance. default:mysql
	 * @author yuchanglong
	 * @return
	 */
	public static AbstractDaoSupport getInstance() {
		if (driverName.contains("oracle")) {
			return new OracleDao();
		}
		return new MysqlDao();
	}
	
	/**
	 * query all table name
	 * @author yuchanglong
	 * @param nativeSql
	 * @return
	 */
	public List<String> queryAllTables(String nativeSql) {
		List<String> list = new ArrayList<String>();
		try {
			checkDriver();
			Connection conn = getConn();
			ResultSet rs = createQuary(conn, nativeSql);
			while (rs.next()) {
				list.add(rs.getString(1));
			}
			rs.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	/**
	 * query all table name
	 * @author yuchanglong
	 * @return
	 */
	public abstract List<String> queryAllTables();
	
	/**
	 * 通用接口:获取表所有列信息,JDBC查询的结果集处理<br/>
	 * SQL:select * from  <b>表名</b> where 1!=1
	 * @author yuchanglong
	 * @param tableName
	 * @return
	 */
	public abstract List<Column> queryColumns(String tableName);
	
	/**
	 * 数据列类型转换成Java类型
	 * @author yuchanglong
	 * @param sqlType
	 * @return
	 */
	public abstract String typesConvert(String sqlType);
	
	/**
	 * 结果集ResultSet
	 * @param conn
	 * @param sql
	 * @return Statement
	 * @throws SQLException
	 */
	protected ResultSet createQuary(Connection conn, String sql) throws SQLException {
		return conn.createStatement().executeQuery(sql);
	}
	
	/**
	 * 数据库连接Connection
	 * @return Connection
	 * @throws SQLException
	 */
	protected Connection getConn() throws SQLException {
		return (Connection) DriverManager.getConnection(url, username, password);
	}
	
	/**
	 * 检查是否有驱动
	 */
	protected void checkDriver() {
		try {
			Class.forName(driverName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
