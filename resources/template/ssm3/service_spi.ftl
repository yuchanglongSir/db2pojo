package com.${project}.${group};

import java.util.List;
import com.${project}.model.${group}.${class_name};
/**
 * Service Interface:${class_name}
 * @author ${author}
 * @date ${sysDate?date}
 */
public interface I${class_name}Service  {

	/**
	* 新增${class_name}
	* @Title: save${class_name}
	* @param entity
	* @return void    返回类型 
	* @date ${sysDate?date}
	* @user by yuchanglong
	 */
	void insert${class_name}(${class_name} entity);
	
	/**
	* 批量新增${class_name}
	* @param list
	* @Title: batchSave${class_name} 
	* @return void    返回类型 
	* @date ${sysDate?date}
	* @user by yuchanglong
	 */
	void batchInsert${class_name}(List<${class_name}> list);
	
	/**
	* 编辑${class_name}
	* @Title: update${class_name} 
	* @param entity
	* @return void    返回类型 
	* @date ${sysDate?date}
	* @user by yuchanglong
	 */
	void update${class_name}(${class_name} entity);
	
	/**
	* 根据id删除${class_name}
	* @Title: delete${class_name}ById 
	* @param id
	* @return void    返回类型 
	* @date ${sysDate?date}
	* @user by yuchanglong
	 */
	void delete${class_name}ById(String id);
	
	/**
	* 根据id批量删除${class_name}
	* @Title: delete${class_name}ByIds 
	* @param ids
	* @return void    返回类型 
	* @date ${sysDate?date}
	* @user by yuchanglong
	 */
	void delete${class_name}ByIds(String ids);
	
	/**
	* 根据id查询
	* @Title: find${class_name}ById 
	* @param id
	* @return void    返回类型 
	* @date ${sysDate?date}
	* @user by yuchanglong
	 */
	${class_name} find${class_name}ById(String id);
	
	/**
	* 查询全部
	* @param search
	* @Title: find${class_name}All
	* @return List<${class_name}>    返回类型 
	* @date ${sysDate?date}
	* @user by yuchanglong
	 */
	List<${class_name}> find${class_name}All(${class_name} search);
	
}