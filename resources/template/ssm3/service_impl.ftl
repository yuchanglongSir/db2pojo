package com.${project}.${group}.impl;

import com.${project}.api.${group}.I${class_name}Service;
import com.${project}.model.${group}.${class_name};
import com.${project}.${group}.mapper.${class_name}Mapper;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Service Implementation:${class_name}
 * @author ${author}
 * @date ${sysDate?date}
 */
@Service
@Slf4j
public class ${class_name}ServiceImpl implements I${class_name}Service {

	@Autowired
	private ${class_name}Mapper ${class_name?substring(0,1)?lower_case}${class_name?substring(1)}Mapper;
	
	/**
	 * 
    * 新增${class_name}
    * @param entity
	* @Title: save${class_name}
	* @return void    返回类型 
	* @date ${sysDate?date}
	* @user by ${author}
	 */
	@Override
	@Transactional(rollbackFor = Exception.class)
	public void insert${class_name}(${class_name} entity){
		${class_name?substring(0,1)?lower_case}${class_name?substring(1)}Mapper.insert(entity);
	}
	
	/**
	* 批量新增${class_name}
	* @param entity
	* @Title: batchSave${class_name} 
	* @return void    返回类型 
	* @date ${sysDate?date}
	* @user by ${author}
	 */
	@Override
	@Transactional(rollbackFor = Exception.class)
	public void batchInsert${class_name}(List<${class_name}> entity){
		${class_name?substring(0,1)?lower_case}${class_name?substring(1)}Mapper.batchInsert(entity);
	}
	
	/**
	* 编辑${class_name}
	* @param entity
	* @Title: update${class_name} 
	* @return void    返回类型 
	* @date ${sysDate?date}
	* @user by ${author}
	 */
	@Override
	@Transactional(rollbackFor = Exception.class)
	public void update${class_name}(${class_name} entity){
		${class_name?substring(0,1)?lower_case}${class_name?substring(1)}Mapper.update(entity);
	}
	
	/**
	* 根据id删除${class_name}
	* @Title: delete${class_name}ById 
	* @param id
	* @return void    返回类型 
	* @date ${sysDate?date}
	* @user by ${author}
	 */
	 @Override
	 @Transactional(rollbackFor = Exception.class)
	public void delete${class_name}ById(String id){
		${class_name?substring(0,1)?lower_case}${class_name?substring(1)}Mapper.deleteById(id);
	}
	
	/**
	* 根据id批量删除${class_name}
	* @Title: delete${class_name}ByIds 
	* @param ids
	* @return void    返回类型 
	* @date ${sysDate?date}
	* @user by ${author}
	 */
	@Override
	@Transactional(rollbackFor = Exception.class)
	public void delete${class_name}ByIds(String ids){
		if (ids != null && !("").equals(ids)) {
            String[] idsArr = ids.split(",");
            ${class_name?substring(0,1)?lower_case}${class_name?substring(1)}Mapper.deleteByIds(idsArr);
        }
	}
	
	/**
	* 根据id查询
	* @Title: find${class_name}ById 
	* @param id
	* @return void    返回类型 
	* @date ${sysDate?date}
	* @user by ${author}
	 */
	@Override
	public ${class_name} find${class_name}ById(String id){
		return ${class_name?substring(0,1)?lower_case}${class_name?substring(1)}Mapper.findById(id);
	}
	
	/**
	* 查询全部
	* @Title: find${class_name}All
	* @return List<${class_name}>    返回类型 
	* @date ${sysDate?date}
	* @user by ${author}
	 */
	@Override
	public List<${class_name}> find${class_name}All(${class_name} search){
		return ${class_name?substring(0,1)?lower_case}${class_name?substring(1)}Mapper.findAll(search);
	}
	
}
