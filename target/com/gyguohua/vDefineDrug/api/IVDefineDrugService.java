package com.gyguohua.;

import java.util.List;
import com.gyguohua.model..VDefineDrug;
/**
 * Service Interface:VDefineDrug
 * @author yuchanglong
 * @date 2018-4-2
 */
public interface IVDefineDrugService  {

	/**
	* 新增VDefineDrug
	* @Title: saveVDefineDrug
	* @param entity
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void insertVDefineDrug(VDefineDrug entity);
	
	/**
	* 批量新增VDefineDrug
	* @param list
	* @Title: batchSaveVDefineDrug 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void batchInsertVDefineDrug(List<VDefineDrug> list);
	
	/**
	* 编辑VDefineDrug
	* @Title: updateVDefineDrug 
	* @param entity
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void updateVDefineDrug(VDefineDrug entity);
	
	/**
	* 根据id删除VDefineDrug
	* @Title: deleteVDefineDrugById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteVDefineDrugById(String id);
	
	/**
	* 根据id批量删除VDefineDrug
	* @Title: deleteVDefineDrugByIds 
	* @param ids
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteVDefineDrugByIds(String ids);
	
	/**
	* 根据id查询
	* @Title: findVDefineDrugById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	VDefineDrug findVDefineDrugById(String id);
	
	/**
	* 查询全部
	* @param search
	* @Title: findVDefineDrugAll
	* @return List<VDefineDrug>    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	List<VDefineDrug> findVDefineDrugAll(VDefineDrug search);
	
}