package ${package_path};

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.plat.common.action.SystemAction;
import com.${project}.${class_name?uncap_first}.pojo.${class_name};
import com.${project}.${class_name?uncap_first}.search.${class_name}Search;
import com.${project}.${class_name?uncap_first}.service.spi.I${class_name}Service;

/**
 * Controller of ${class_name}
 * @author ${author}
 * @date ${sysDate?date}
 */
public class ${class_name}Action extends SystemAction {
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private I${class_name}Service ${class_name?uncap_first}Service;
	private ${class_name} ${class_name?uncap_first};
	private List<${class_name}> ${class_name?uncap_first}List;
	private ${class_name}Search ${class_name?uncap_first}Search;
	
	private String jumpUrl = "${class_name}List";
	
	/**
	 * 列表
	 */
	public String list() {
		try {
			${class_name?uncap_first}List = ${class_name?uncap_first}Service.findAll(${class_name}.class);
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
		return SUCCESS;
	}

	/**
	 * 条件分页
	 */
	public String page() {
		try {
			pageResult = ${class_name?uncap_first}Service.findPageResult(${class_name}.class, get${class_name}Search());
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
		return SUCCESS;
	}

	/**
	 * 添加
	 */
	public String add() {
		try {
			${class_name?uncap_first}Service.save(${class_name?uncap_first});
			this.newResult("添加成功", getJumpUrl(jumpUrl));
		} catch (Exception e) {
			e.printStackTrace();
			this.newResult("添加失败!");
		}
		return JSONRESULT;
	}
	
	/**
	 * 修改
	 */
	public String edit() {
		try {
			${class_name?uncap_first}Service.update(${class_name?uncap_first});
			this.newResult("修改成功", getJumpUrl(jumpUrl));
		} catch (Exception e) {
			e.printStackTrace();
			this.newResult("修改失败!");
		}
		return JSONRESULT;
	}
	
	/**
	 * 删除
	 */
	public String del() {
		try {
			${class_name?uncap_first}Service.delete(${class_name}.class, ${class_name?uncap_first}.getId());
			this.newResult("删除成功", getJumpUrl(jumpUrl));
		} catch (Exception e) {
			e.printStackTrace();
			this.newResult("删除失败!");
		}
		return JSONRESULT;
	}
	
	// getter && setter
	public ${class_name} get${class_name}() {
		return ${class_name?uncap_first};
	}

	public void set${class_name}(${class_name} ${class_name?uncap_first}) {
		this.${class_name?uncap_first} = ${class_name?uncap_first};
	}
	
	public List<${class_name}> get${class_name}List() {
		return ${class_name?uncap_first}List;
	}

	public void set${class_name}List(List<${class_name}> ${class_name?uncap_first}List) {
		this.${class_name?uncap_first}List = ${class_name?uncap_first}List;
	}
	
	public ${class_name}Search get${class_name}Search() {
		return ${class_name?uncap_first}Search;
	}
	
	public void set${class_name}Search(${class_name}Search ${class_name?uncap_first}Search) {
		final int pageSize = 15;
		if (${class_name?uncap_first}Search == null) {
			${class_name?uncap_first}Search = new ${class_name}Search();
			${class_name?uncap_first}Search.setPageSize(pageSize);
		}
		${class_name?uncap_first}Search.setCurrentPage(pageResult.getCurrentPage());
		this.${class_name?uncap_first}Search = ${class_name?uncap_first}Search;
	}
}
