package ${package_path};

<#if (hasDateColumn)>
import java.util.Date;
</#if>
import com.plat.common.pojo.BaseEntity;
import com.${project}.${class_name?uncap_first}.pojo.${class_name};

/**
 * POJO:${class_name}
 * 
 * @author ${author}
 * @date ${sysDate?date}
 */
 @SuppressWarnings("serial")
public class ${class_name} extends BaseEntity {
	
	<#list table_column as c>
	<#if (c.name!="id")>private ${c.type}	${c.nameJ};		<#if (c.remark?exists && c.remark!="")> /* ${c.remark} */ </#if></#if>
	</#list>

	// Constructor
	public ${class_name}() {
	}
	
	/**
	 * full Constructor
	 */
	public ${class_name}(<#list table_column as c>${c.type} ${c.nameJ}<#if c_has_next>, </#if></#list>) {
		<#list table_column as c>
		<#if (c.name!="id")>this.${c.nameJ} = ${c.nameJ};<#else>setId(id);</#if>
		</#list>
	}

	// getter && setter
	// 在setter方法最后加上"return this;"并把返回参数改为${class_name}可以实现连缀设置属性
	<#list table_column as c><#if (c.name!="id")>
	public ${c.type} get${c.nameJ?cap_first}() {
		return ${c.nameJ};
	}

	public ${class_name} set${c.nameJ?cap_first}(${c.type} ${c.nameJ}) {
		this.${c.nameJ} = ${c.nameJ};
		return this;
	}
	
	</#if></#list>
	@Override
	public String toString() {
		return "${class_name} [" + <#list table_column as c>"<#if (c_index>=1)>, </#if>${c.nameJ}=" + <#if (c.name!="id")>${c.nameJ}<#else>getId()</#if> + </#list> "]";
	}
}
