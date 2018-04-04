package com.gyguohua.;

import java.util.List;
import com.gyguohua.model..VProductBack;
/**
 * Service Interface:VProductBack
 * @author yuchanglong
 * @date 2018-4-2
 */
public interface IVProductBackService  {

	/**
	* 新增VProductBack
	* @Title: saveVProductBack
	* @param entity
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void insertVProductBack(VProductBack entity);
	
	/**
	* 批量新增VProductBack
	* @param list
	* @Title: batchSaveVProductBack 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void batchInsertVProductBack(List<VProductBack> list);
	
	/**
	* 编辑VProductBack
	* @Title: updateVProductBack 
	* @param entity
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void updateVProductBack(VProductBack entity);
	
	/**
	* 根据id删除VProductBack
	* @Title: deleteVProductBackById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteVProductBackById(String id);
	
	/**
	* 根据id批量删除VProductBack
	* @Title: deleteVProductBackByIds 
	* @param ids
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteVProductBackByIds(String ids);
	
	/**
	* 根据id查询
	* @Title: findVProductBackById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	VProductBack findVProductBackById(String id);
	
	/**
	* 查询全部
	* @param search
	* @Title: findVProductBackAll
	* @return List<VProductBack>    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	List<VProductBack> findVProductBackAll(VProductBack search);
	
}