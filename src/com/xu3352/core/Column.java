package com.xu3352.core;

import java.util.List;

/**
 * 数据库列实体
 * 
 * @author yuchanglong
 * @date 2012-2-16
 */
public class Column {
	
	/**
	 * 列数据类型
	 */
	private String type;
	/**
	 * sql类型
	 */
	private String sqlType;
	/**
	 * 字段名
	 */
	private String name;
	/**
	 * 字段名：java风格，驼峰式
	 */
	private String nameJ;
	
	/**
	 * 字段备注、注释
	 */
	private String remark;

	/**
	 * 默认构造
	 */
	public Column() {
	}

	/**
	 * 构造
	 * @param type 
	 * @param name 
	 * @param nameJ 
	 */
	public Column(String type, String name, String nameJ,String sqlType) {
		this.type = type;
		this.name = name;
		this.nameJ = nameJ;
		this.sqlType =sqlType;
	}
	
	/**
	 * 全构造
	 * @param type
	 * @param name
	 * @param nameJ
	 * @param remark
	 */
	public Column(String type, String name, String nameJ, String remark,String sqlType) {
		this.type = type;
		this.name = name;
		this.nameJ = nameJ;
		this.remark = remark;
		this.sqlType = sqlType;
	}

	/**
	 * 获取Type
	 * @return String
	 */
	public String getType() {
		return type;
	}

	/**
	 * 设置Type
	 * @param type
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * 获取列名
	 * @return String
	 */
	public String getName() {
		return name;
	}

	/**
	 * 设置列名
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取javastyle列
	 * @return String
	 */
	public String getNameJ() {
		return nameJ;
	}

	/**
	 * 设置javastyle列
	 * @param name
	 */
	public void setNameJ(String nameJ) {
		this.nameJ = nameJ;
	}

	/**
	 * 获取备注
	 * @return String
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * 设置备注
	 * @param name
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	/**
	 * 列里是否包含某个类型了
	 * @author yuchanglong
	 * @date 2016-1-8
	 * @param columns
	 * @param type
	 * @return
	 */
	public static boolean typeContains(List<Column> columns, String type) {
		for (Column c : columns) {
			if (c.type.equals(type)) return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Column [type=" + type + ", name=" + name + ", nameJ=" + nameJ + ", remark=" + remark + "]";
	}

	public String getSqlType() {
		return sqlType;
	}

	public void setSqlType(String sqlType) {
		this.sqlType = sqlType;
	}

}
