package com.xu3352.util;

import java.io.File;

import com.xu3352.config.Group;
import com.xu3352.config.SetupConfig;
import com.xu3352.config.TemplateMapping;

/**
 * 工具类
 * @author yuchanglong
 */
public class MyUtils {
	/**
	 * config instance
	 */
	private static SetupConfig config = SetupConfig.getInstance();
	
	/**
	 * freemarker template file path
	 * @author yuchanglong
	 * @date 2016-1-30
	 * @param m
	 * @return
	 */
	public static String getTemplatePath(TemplateMapping m) {
		return config.getTemplateDir() + File.separator + m.getTemplate();
	}

	/**
	 * witch group contains tableName
	 * @author yuchanglong
	 * @date 2016-2-28
	 * @param tableName
	 * @return
	 */
	public static String getGroupName(String tableName) {
		Group[] groups = config.getGroups();
		String name = null;
		for (Group g : groups) {
			name = g.findGroupName(tableName);
			if (name != null) return name;
		}
		return null;
	}
	
	/**
	 * model name of project.(default: group name and tableName in java style )
	 * @author yuchanglong
	 * @date 2016-1-8
	 * @param tableName
	 * @return
	 */
	public static String getModelName(String tableName, String separator) {
		String g = getGroupName(tableName);
		if (g == null) {
			return StringUtil.javaStyleOfTableName(tableName);
		}
		return g + separator + StringUtil.javaStyleOfTableName(tableName);
	}
	
	/**
	 * generate output file path.
	 * @author yuchanglong
	 * @date 2016-1-7
	 * @param m
	 * @param tableName
	 * @return
	 */
	public static String getOutPutPath(TemplateMapping m, String tableName) {
		String path = SetupConfig.USER_DIR + SetupConfig.SEPARATOR 
				+ "target" + SetupConfig.SEPARATOR 
				+ m.buildDir(config.getProject(), getModelName(tableName, "/")) + SetupConfig.SEPARATOR;
		path += m.getLpadding() + StringUtil.className(tableName) + m.getRpadding() + "." + m.getSuffix();
		mkdir(path);
		return path;
	}
	
	/**
	 * mkdir by path if not exist
	 * @author yuchanglong
	 * @date 2016-1-7
	 * @param filePath
	 */
	public static void mkdir(String filePath) {
		int index = filePath.lastIndexOf("\\");
		int index2 = filePath.lastIndexOf("/");
		if (index + index2 == -2) return;
		index = index > index2 ? index : index2;
		if (index != -1 && !new File(filePath.substring(0, index)).exists()) {
			System.out.println("mkdir - "+ filePath.substring(0, index) );
			new File(filePath.substring(0, index)).mkdirs();
		}
	}
	
	/**
	 * project + group + tableName
	 * @author yuchanglong
	 * @date 2016-2-28
	 * @return
	 */
	public static String buildModelPackage(String tableName) {
		return config.getProject() + "." +getModelName(tableName, ".");
	}
}
