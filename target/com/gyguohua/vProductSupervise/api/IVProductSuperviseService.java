package com.gyguohua.;

import java.util.List;
import com.gyguohua.model..VProductSupervise;
/**
 * Service Interface:VProductSupervise
 * @author yuchanglong
 * @date 2018-4-2
 */
public interface IVProductSuperviseService  {

	/**
	* 新增VProductSupervise
	* @Title: saveVProductSupervise
	* @param entity
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void insertVProductSupervise(VProductSupervise entity);
	
	/**
	* 批量新增VProductSupervise
	* @param list
	* @Title: batchSaveVProductSupervise 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void batchInsertVProductSupervise(List<VProductSupervise> list);
	
	/**
	* 编辑VProductSupervise
	* @Title: updateVProductSupervise 
	* @param entity
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void updateVProductSupervise(VProductSupervise entity);
	
	/**
	* 根据id删除VProductSupervise
	* @Title: deleteVProductSuperviseById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteVProductSuperviseById(String id);
	
	/**
	* 根据id批量删除VProductSupervise
	* @Title: deleteVProductSuperviseByIds 
	* @param ids
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteVProductSuperviseByIds(String ids);
	
	/**
	* 根据id查询
	* @Title: findVProductSuperviseById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	VProductSupervise findVProductSuperviseById(String id);
	
	/**
	* 查询全部
	* @param search
	* @Title: findVProductSuperviseAll
	* @return List<VProductSupervise>    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	List<VProductSupervise> findVProductSuperviseAll(VProductSupervise search);
	
}