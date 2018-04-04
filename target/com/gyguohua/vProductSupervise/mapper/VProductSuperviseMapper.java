package com.gyguohua..mapper;

import com.gyguohua.model..VProductSupervise;
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
public interface VProductSuperviseMapper {
		/**
	* 新增VProductSupervise
	* @param entity
	* @Title: saveVProductSupervise
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void insert(VProductSupervise entity);
	
	/**
	* 批量新增VProductSupervise
	* @param list
	* @Title: batchSaveVProductSupervise 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void batchInsert(List<VProductSupervise> list);
	
	/**
	* 编辑VProductSupervise
	* @param entity
	* @Title: updateVProductSupervise 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void update(VProductSupervise entity);
	
	/**
	* 根据id删除VProductSupervise
	* @param id
	* @Title: deleteById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteById(String id);
	
	/**
	* 根据id批量删除VProductSupervise
	* @param ids
	* @Title: deleteVProductSuperviseByIds 
	* @param ids
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteByIds(String [] ids);
	
	/**
	* 根据id查询
	* @param id
	* @Title: findVProductSuperviseById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	VProductSupervise findById(String id);
	
	/**
	* 查询全部
	* @param search
	* @Title: findVProductSuperviseAll
	* @return
	* @return List<VProductSupervise>    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	List<VProductSupervise> findAll(VProductSupervise search);
	
}