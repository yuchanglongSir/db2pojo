package com.${project}.model.${group};

<#if (hasDateColumn)>
import java.util.Date;
</#if>
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 * POJO:${class_name}
 * 
 * @author ${author}
 * @date ${sysDate?date}
 */
 @ApiModel(value = "${class_name}", description = "xxx对象")
@Data
public class ${class_name} {
	
	<#list table_column as c>
	<#if (c.remark?exists && c.remark!="")>
	 	/**
		 *  ${c.remark}
		 */
	 </#if>
		@ApiModelProperty(value = "<#if (c.remark?exists && c.remark!="")>${c.remark?trim}</#if>", name = "${c.nameJ}")
		private ${c.type}	${c.nameJ};		
	</#list>

}
