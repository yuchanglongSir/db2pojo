package com.gyguohua.;

import java.util.List;
import com.gyguohua.model..Plat;
/**
 * Service Interface:Plat
 * @author yuchanglong
 * @date 2018-4-2
 */
public interface IPlatService  {

	/**
	* 新增Plat
	* @Title: savePlat
	* @param entity
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void insertPlat(Plat entity);
	
	/**
	* 批量新增Plat
	* @param list
	* @Title: batchSavePlat 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void batchInsertPlat(List<Plat> list);
	
	/**
	* 编辑Plat
	* @Title: updatePlat 
	* @param entity
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void updatePlat(Plat entity);
	
	/**
	* 根据id删除Plat
	* @Title: deletePlatById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deletePlatById(String id);
	
	/**
	* 根据id批量删除Plat
	* @Title: deletePlatByIds 
	* @param ids
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deletePlatByIds(String ids);
	
	/**
	* 根据id查询
	* @Title: findPlatById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	Plat findPlatById(String id);
	
	/**
	* 查询全部
	* @param search
	* @Title: findPlatAll
	* @return List<Plat>    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	List<Plat> findPlatAll(Plat search);
	
}