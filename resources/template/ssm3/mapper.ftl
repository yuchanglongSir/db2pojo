package com.${project}.${group}.mapper;

import com.${project}.model.${group}.${class_name};
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
/**
 * Service Interface:Users
 * @author ${author}
 * @date ${sysDate?date}
 */
 @Component
@Mapper
public interface ${class_name}Mapper {
		/**
	* 新增${class_name}
	* @param entity
	* @Title: save${class_name}
	* @return void    返回类型 
	* @date ${sysDate?date}
	* @user by yuchanglong
	 */
	void insert(${class_name} entity);
	
	/**
	* 批量新增${class_name}
	* @param list
	* @Title: batchSave${class_name} 
	* @return void    返回类型 
	* @date ${sysDate?date}
	* @user by yuchanglong
	 */
	void batchInsert(List<${class_name}> list);
	
	/**
	* 编辑${class_name}
	* @param entity
	* @Title: update${class_name} 
	* @return void    返回类型 
	* @date ${sysDate?date}
	* @user by yuchanglong
	 */
	void update(${class_name} entity);
	
	/**
	* 根据id删除${class_name}
	* @param id
	* @Title: deleteById 
	* @param id
	* @return void    返回类型 
	* @date ${sysDate?date}
	* @user by yuchanglong
	 */
	void deleteById(String id);
	
	/**
	* 根据id批量删除${class_name}
	* @param ids
	* @Title: delete${class_name}ByIds 
	* @param ids
	* @return void    返回类型 
	* @date ${sysDate?date}
	* @user by yuchanglong
	 */
	void deleteByIds(String [] ids);
	
	/**
	* 根据id查询
	* @param id
	* @Title: find${class_name}ById 
	* @param id
	* @return void    返回类型 
	* @date ${sysDate?date}
	* @user by yuchanglong
	 */
	${class_name} findById(String id);
	
	/**
	* 查询全部
	* @param search
	* @Title: find${class_name}All
	* @return
	* @return List<${class_name}>    返回类型 
	* @date ${sysDate?date}
	* @user by yuchanglong
	 */
	List<${class_name}> findAll(${class_name} search);
	
}