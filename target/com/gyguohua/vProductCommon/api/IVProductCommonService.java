package com.gyguohua.;

import java.util.List;
import com.gyguohua.model..VProductCommon;
/**
 * Service Interface:VProductCommon
 * @author yuchanglong
 * @date 2018-4-2
 */
public interface IVProductCommonService  {

	/**
	* 新增VProductCommon
	* @Title: saveVProductCommon
	* @param entity
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void insertVProductCommon(VProductCommon entity);
	
	/**
	* 批量新增VProductCommon
	* @param list
	* @Title: batchSaveVProductCommon 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void batchInsertVProductCommon(List<VProductCommon> list);
	
	/**
	* 编辑VProductCommon
	* @Title: updateVProductCommon 
	* @param entity
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void updateVProductCommon(VProductCommon entity);
	
	/**
	* 根据id删除VProductCommon
	* @Title: deleteVProductCommonById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteVProductCommonById(String id);
	
	/**
	* 根据id批量删除VProductCommon
	* @Title: deleteVProductCommonByIds 
	* @param ids
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteVProductCommonByIds(String ids);
	
	/**
	* 根据id查询
	* @Title: findVProductCommonById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	VProductCommon findVProductCommonById(String id);
	
	/**
	* 查询全部
	* @param search
	* @Title: findVProductCommonAll
	* @return List<VProductCommon>    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	List<VProductCommon> findVProductCommonAll(VProductCommon search);
	
}