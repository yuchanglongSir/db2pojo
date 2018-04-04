package com.gyguohua.;

import java.util.List;
import com.gyguohua.model..Saler;
/**
 * Service Interface:Saler
 * @author yuchanglong
 * @date 2018-4-2
 */
public interface ISalerService  {

	/**
	* 新增Saler
	* @Title: saveSaler
	* @param entity
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void insertSaler(Saler entity);
	
	/**
	* 批量新增Saler
	* @param list
	* @Title: batchSaveSaler 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void batchInsertSaler(List<Saler> list);
	
	/**
	* 编辑Saler
	* @Title: updateSaler 
	* @param entity
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void updateSaler(Saler entity);
	
	/**
	* 根据id删除Saler
	* @Title: deleteSalerById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteSalerById(String id);
	
	/**
	* 根据id批量删除Saler
	* @Title: deleteSalerByIds 
	* @param ids
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteSalerByIds(String ids);
	
	/**
	* 根据id查询
	* @Title: findSalerById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	Saler findSalerById(String id);
	
	/**
	* 查询全部
	* @param search
	* @Title: findSalerAll
	* @return List<Saler>    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	List<Saler> findSalerAll(Saler search);
	
}