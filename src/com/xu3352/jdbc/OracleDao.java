package com.xu3352.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.xu3352.core.Column;
import com.xu3352.util.StringUtil;

/**
 * MySQL database Dao
 * @author yuchanglong
 */
public class OracleDao extends AbstractDaoSupport {
	
	@Override
	public List<String> queryAllTables() {
		return queryAllTables("select lower(tname) from tab where tabtype = 'TABLE' order by 1");
		//return queryAllTables("select lower(view_name) from user_views");
	}

	@Override
	public List<Column> queryColumns(String tableName) {
		List<Column> list = new ArrayList<Column>();
		try {
			checkDriver();
			Connection conn = getConn();
			String sql = 
					"select  lower(t1.column_name), lower(t1.data_type),  t2.comments " +
					" from  user_col_comments  t2  left  join  user_tab_columns  t1 " + 
					" on  t1.table_name  =  t2.table_name  and  t1.column_name  =  t2.column_name " + 
					" where  t1.table_name  =  upper('"+tableName+"')"; 
			ResultSet rs = createQuary(conn, sql);
			while (rs.next()) {
				String type = typesConvert(rs.getString(2));
				String javaStyle = StringUtil.javaStyle(rs.getString(1));
				String sqlType = rs.getString(2).toUpperCase();
				if(sqlType.equals("VARCHAR2")){
					sqlType = "VARCHAR";
				}
				if(sqlType.equals("NUMBER")){
					sqlType = "DOUBLE";
				}
				list.add(new Column(type, rs.getString(1), javaStyle, rs.getString(3),sqlType));
			}
			rs.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	@Override
	public String typesConvert(String mysqlType) {
		if (mysqlType.startsWith("varchar") || mysqlType.startsWith("char")) {
			return "String";
		} else if (mysqlType.startsWith("long")) {
			return "Integer";
		} else if (mysqlType.startsWith("number")) {
			return "Double";
		} else if (mysqlType.startsWith("date")) {
			return "Date";
		} 
		return mysqlType;
	}
	
	/**
	 * 测试入口
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractDaoSupport dao = new OracleDao();
		System.out.println(dao.queryAllTables());
		List<Column> list = dao.queryColumns("sys_city");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
