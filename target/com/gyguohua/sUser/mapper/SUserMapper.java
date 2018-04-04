package com.gyguohua.user.mapper;

import com.gyguohua.model.user.SUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
/**
 * Service Interface:Users
 * @author yuchanglong
 * @date 2018-4-2
 */
 @Component
@Mapper
public interface SUserMapper {
		/**
	* 新增SUser
	* @param entity
	* @Title: saveSUser
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void insert(SUser entity);
	
	/**
	* 批量新增SUser
	* @param list
	* @Title: batchSaveSUser 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void batchInsert(List<SUser> list);
	
	/**
	* 编辑SUser
	* @param entity
	* @Title: updateSUser 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void update(SUser entity);
	
	/**
	* 根据id删除SUser
	* @param id
	* @Title: deleteById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteById(String id);
	
	/**
	* 根据id批量删除SUser
	* @param ids
	* @Title: deleteSUserByIds 
	* @param ids
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteByIds(String [] ids);
	
	/**
	* 根据id查询
	* @param id
	* @Title: findSUserById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	SUser findById(String id);
	
	/**
	* 查询全部
	* @param search
	* @Title: findSUserAll
	* @return
	* @return List<SUser>    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	List<SUser> findAll(SUser search);
	
}