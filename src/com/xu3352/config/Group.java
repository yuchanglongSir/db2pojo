package com.xu3352.config;

/**
 * 数据表按规则分组
 * @author zx.wang
 * @date 2016-2-28
 */
public class Group {
	
	private String name;
	private String prefix;		// 前缀,tableName.startsWith(p)

	/**
	 * 根据前缀查看某个表是否属于改组,是的话返回组名
	 * @author yuchanglong
	 * @return
	 */
	public String findGroupName(String tableName) {
		String[] ps = prefix.split(",");
		for (String s : ps) {
			if (tableName.startsWith(s)) return this.name;
		}
		return null;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	@Override
	public String toString() {
		return "{name=" + name + ", prefix=" + prefix + "}";
	}
}
