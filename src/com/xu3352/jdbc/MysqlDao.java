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
public class MysqlDao extends AbstractDaoSupport {
	
	@Override
	public List<String> queryAllTables() {
		return queryAllTables("select * from pg_tables where schemaname ='public'");
	}

	@Override
	public List<Column> queryColumns(String tableName) {
		List<Column> list = new ArrayList<Column>();
		try {
			checkDriver();
			Connection conn = getConn();
			ResultSet rs = createQuary(conn, "select col.*,des.description FROM information_schema.columns col LEFT JOIN pg_description des ON col.table_name::regclass = des.objoid AND col.ordinal_position = des.objsubid WHERE table_schema = 'public' AND table_name = '"+tableName+"' ORDER BY ordinal_position");
			while (rs.next()) {
				String type = typesConvert(rs.getString(28));
				String javaStyle = StringUtil.javaStyle(rs.getString(4));
				list.add(new Column(type, rs.getString(4), javaStyle,rs.getString(45)));
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
		if (mysqlType.startsWith("varchar") || mysqlType.startsWith("longtext") || mysqlType.startsWith("text")) {
			return "String";
		} else if (mysqlType.startsWith("int4") || mysqlType.startsWith("int2") || mysqlType.startsWith("bigint") || mysqlType.startsWith("tinyint") || mysqlType.startsWith("smallint")) {
			return "Integer";
		} else if (mysqlType.startsWith("double") || mysqlType.startsWith("float") || mysqlType.startsWith("numeric")) {
			return "Double";
		} else if (mysqlType.startsWith("date") || mysqlType.startsWith("time")) {
			return "Date";
		} else if (mysqlType.startsWith("bool")) {
			return "boolean";
		} 
		return mysqlType;
	}
	
	/**
	 * 测试入口
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractDaoSupport dao = new MysqlDao();
		List<Column>tables = dao.queryColumns("tb_lable");
		System.out.println(tables);
//		List<Column> list = dao.queryColumns(tables.get(0));
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
	}
}
