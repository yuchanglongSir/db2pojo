package com.gyguohua..mapper;

import com.gyguohua.model..Plat;
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
public interface PlatMapper {
		/**
	* 新增Plat
	* @param entity
	* @Title: savePlat
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void insert(Plat entity);
	
	/**
	* 批量新增Plat
	* @param list
	* @Title: batchSavePlat 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void batchInsert(List<Plat> list);
	
	/**
	* 编辑Plat
	* @param entity
	* @Title: updatePlat 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void update(Plat entity);
	
	/**
	* 根据id删除Plat
	* @param id
	* @Title: deleteById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteById(String id);
	
	/**
	* 根据id批量删除Plat
	* @param ids
	* @Title: deletePlatByIds 
	* @param ids
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteByIds(String [] ids);
	
	/**
	* 根据id查询
	* @param id
	* @Title: findPlatById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	Plat findById(String id);
	
	/**
	* 查询全部
	* @param search
	* @Title: findPlatAll
	* @return
	* @return List<Plat>    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	List<Plat> findAll(Plat search);
	
}