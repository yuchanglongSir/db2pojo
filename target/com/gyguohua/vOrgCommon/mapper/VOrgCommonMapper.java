package com.gyguohua..mapper;

import com.gyguohua.model..VOrgCommon;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
/**
 * Service Interface:Users
 * @author yuchanglong
 * @date 2018-4-2
 */
 @Component
@Mapper
public interface VOrgCommonMapper {
		/**
	* 新增VOrgCommon
	* @param entity
	* @Title: saveVOrgCommon
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void insert(VOrgCommon entity);
	
	/**
	* 批量新增VOrgCommon
	* @param list
	* @Title: batchSaveVOrgCommon 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void batchInsert(List<VOrgCommon> list);
	
	/**
	* 编辑VOrgCommon
	* @param entity
	* @Title: updateVOrgCommon 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void update(VOrgCommon entity);
	
	/**
	* 根据id删除VOrgCommon
	* @param id
	* @Title: deleteById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteById(String id);
	
	/**
	* 根据id批量删除VOrgCommon
	* @param ids
	* @Title: deleteVOrgCommonByIds 
	* @param ids
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteByIds(String [] ids);
	
	/**
	* 根据id查询
	* @param id
	* @Title: findVOrgCommonById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	VOrgCommon findById(String id);
	
	/**
	* 查询全部
	* @param search
	* @Title: findVOrgCommonAll
	* @return
	* @return List<VOrgCommon>    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	List<VOrgCommon> findAll(VOrgCommon search);
	
}