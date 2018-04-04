package com.gyguohua.;

import java.util.List;
import com.gyguohua.model..ViewProductEightFields;
/**
 * Service Interface:ViewProductEightFields
 * @author yuchanglong
 * @date 2018-4-2
 */
public interface IViewProductEightFieldsService  {

	/**
	* 新增ViewProductEightFields
	* @Title: saveViewProductEightFields
	* @param entity
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void insertViewProductEightFields(ViewProductEightFields entity);
	
	/**
	* 批量新增ViewProductEightFields
	* @param list
	* @Title: batchSaveViewProductEightFields 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void batchInsertViewProductEightFields(List<ViewProductEightFields> list);
	
	/**
	* 编辑ViewProductEightFields
	* @Title: updateViewProductEightFields 
	* @param entity
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void updateViewProductEightFields(ViewProductEightFields entity);
	
	/**
	* 根据id删除ViewProductEightFields
	* @Title: deleteViewProductEightFieldsById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteViewProductEightFieldsById(String id);
	
	/**
	* 根据id批量删除ViewProductEightFields
	* @Title: deleteViewProductEightFieldsByIds 
	* @param ids
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteViewProductEightFieldsByIds(String ids);
	
	/**
	* 根据id查询
	* @Title: findViewProductEightFieldsById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	ViewProductEightFields findViewProductEightFieldsById(String id);
	
	/**
	* 查询全部
	* @param search
	* @Title: findViewProductEightFieldsAll
	* @return List<ViewProductEightFields>    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	List<ViewProductEightFields> findViewProductEightFieldsAll(ViewProductEightFields search);
	
}