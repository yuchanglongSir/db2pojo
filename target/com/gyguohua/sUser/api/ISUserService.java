package com.gyguohua.user;

import java.util.List;
import com.gyguohua.model.user.SUser;
/**
 * Service Interface:SUser
 * @author yuchanglong
 * @date 2018-4-2
 */
public interface ISUserService  {

	/**
	* 新增SUser
	* @Title: saveSUser
	* @param entity
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void insertSUser(SUser entity);
	
	/**
	* 批量新增SUser
	* @param list
	* @Title: batchSaveSUser 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void batchInsertSUser(List<SUser> list);
	
	/**
	* 编辑SUser
	* @Title: updateSUser 
	* @param entity
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void updateSUser(SUser entity);
	
	/**
	* 根据id删除SUser
	* @Title: deleteSUserById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteSUserById(String id);
	
	/**
	* 根据id批量删除SUser
	* @Title: deleteSUserByIds 
	* @param ids
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteSUserByIds(String ids);
	
	/**
	* 根据id查询
	* @Title: findSUserById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	SUser findSUserById(String id);
	
	/**
	* 查询全部
	* @param search
	* @Title: findSUserAll
	* @return List<SUser>    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	List<SUser> findSUserAll(SUser search);
	
}