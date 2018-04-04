package ${package_path};

<#if (hasDateColumn)>import java.util.Date;</#if>
import com.plat.common.search.BaseSearch;

/**
 * POJO Search:${class_name}
 * 
 * @author ${author}
 * @date ${sysDate?date}
 */
public class ${class_name}Search extends BaseSearch {
	
	<#list table_column as c>
	private ${c.type}	${c.nameJ};		<#if (c.remark?exists && c.remark!="")> /* ${c.remark} */ </#if>
	</#list>

	// Constructor
	public ${class_name}Search() {
	}
	
	/**
	 * full Constructor
	 */
	public ${class_name}Search(<#list table_column as c>${c.type} ${c.nameJ}<#if c_has_next>, </#if></#list>) {
		<#list table_column as c>
		this.${c.nameJ} = ${c.nameJ};
		</#list>
	}

	// getter && setter
	// 在setter方法最后加上"return this;"并把返回参数改为${class_name}可以实现连缀设置属性
	<#list table_column as c>
	public ${c.type} get${c.nameJ?cap_first}() {
		return ${c.nameJ};
	}

	public ${class_name}Search set${c.nameJ?cap_first}(${c.type} ${c.nameJ}) {
		this.${c.nameJ} = ${c.nameJ};
		return this;
	}
	
	</#list>
}