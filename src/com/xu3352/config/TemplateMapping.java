package com.xu3352.config;

/**
 * 模板文件的生成路径映射关系
 * @author yuchanglong
 */
public class TemplateMapping {
	private String template;
	private String dir;
	private String suffix = "java";		// default java
	private String packagePath;			// default calc from dir
	private String rpadding = "";		// padding the end of file name 
	private String lpadding = "";		// padding the start of file name 
	
	
	/**
	 * if packagePath is null, calculate result value of dir filed
	 * @author yuchanglong
	 * @param project
	 * @param modelName
	 * @return
	 */
	public String buildPackage(String project, String modelName) {
		if (packagePath != null && !packagePath.trim().isEmpty()) {
			return packagePath.replaceAll("\\$\\{project\\}", project).replaceAll("\\$\\{model\\}", modelName);
		}
		return buildDir(project, modelName).replaceAll("[\\/]", ".");
	}
	
	/**
	 * replace parameter of '${project}' and '${model}'
	 * @author yuchanglong
	 * @param project
	 * @param modelName
	 * @return
	 */
	public String buildDir(String project, String modelName) {
		return dir.replaceAll("\\$\\{project\\}", project).replaceAll("\\$\\{model\\}", modelName);
	}
	
	public String buildDir(String project) {
		return dir.replaceAll("\\$\\{project\\}", project);
	}

	public String getTemplate() {
		return template;
	}

	public void setTemplate(String template) {
		this.template = template;
	}

	public String getDir() {
		return dir;
	}

	public void setDir(String dir) {
		this.dir = dir;
	}

	public String getPackagePath() {
		return packagePath;
	}

	public void setPackagePath(String packagePath) {
		this.packagePath = packagePath;
	}

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public String getRpadding() {
		return rpadding;
	}

	public void setRpadding(String rpadding) {
		this.rpadding = rpadding;
	}

	public String getLpadding() {
		return lpadding;
	}

	public void setLpadding(String lpadding) {
		this.lpadding = lpadding;
	}

	@Override
	public String toString() {
		return "{template=" + template + ", dir=" + dir + ", suffix=" + suffix + ", lpadding="
				+ lpadding + ", rpadding=" + rpadding + "}";
	}
}
