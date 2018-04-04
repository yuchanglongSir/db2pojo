package com.gyguohua.;

import java.util.List;
import com.gyguohua.model..VOrgCommon;
/**
 * Service Interface:VOrgCommon
 * @author yuchanglong
 * @date 2018-4-2
 */
public interface IVOrgCommonService  {

	/**
	* 新增VOrgCommon
	* @Title: saveVOrgCommon
	* @param entity
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void insertVOrgCommon(VOrgCommon entity);
	
	/**
	* 批量新增VOrgCommon
	* @param list
	* @Title: batchSaveVOrgCommon 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void batchInsertVOrgCommon(List<VOrgCommon> list);
	
	/**
	* 编辑VOrgCommon
	* @Title: updateVOrgCommon 
	* @param entity
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void updateVOrgCommon(VOrgCommon entity);
	
	/**
	* 根据id删除VOrgCommon
	* @Title: deleteVOrgCommonById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteVOrgCommonById(String id);
	
	/**
	* 根据id批量删除VOrgCommon
	* @Title: deleteVOrgCommonByIds 
	* @param ids
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteVOrgCommonByIds(String ids);
	
	/**
	* 根据id查询
	* @Title: findVOrgCommonById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	VOrgCommon findVOrgCommonById(String id);
	
	/**
	* 查询全部
	* @param search
	* @Title: findVOrgCommonAll
	* @return List<VOrgCommon>    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	List<VOrgCommon> findVOrgCommonAll(VOrgCommon search);
	
}