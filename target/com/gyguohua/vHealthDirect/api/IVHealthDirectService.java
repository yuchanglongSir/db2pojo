package com.gyguohua.;

import java.util.List;
import com.gyguohua.model..VHealthDirect;
/**
 * Service Interface:VHealthDirect
 * @author yuchanglong
 * @date 2018-4-2
 */
public interface IVHealthDirectService  {

	/**
	* 新增VHealthDirect
	* @Title: saveVHealthDirect
	* @param entity
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void insertVHealthDirect(VHealthDirect entity);
	
	/**
	* 批量新增VHealthDirect
	* @param list
	* @Title: batchSaveVHealthDirect 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void batchInsertVHealthDirect(List<VHealthDirect> list);
	
	/**
	* 编辑VHealthDirect
	* @Title: updateVHealthDirect 
	* @param entity
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void updateVHealthDirect(VHealthDirect entity);
	
	/**
	* 根据id删除VHealthDirect
	* @Title: deleteVHealthDirectById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteVHealthDirectById(String id);
	
	/**
	* 根据id批量删除VHealthDirect
	* @Title: deleteVHealthDirectByIds 
	* @param ids
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteVHealthDirectByIds(String ids);
	
	/**
	* 根据id查询
	* @Title: findVHealthDirectById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	VHealthDirect findVHealthDirectById(String id);
	
	/**
	* 查询全部
	* @param search
	* @Title: findVHealthDirectAll
	* @return List<VHealthDirect>    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	List<VHealthDirect> findVHealthDirectAll(VHealthDirect search);
	
}