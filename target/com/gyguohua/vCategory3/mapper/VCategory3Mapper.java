package com.gyguohua..mapper;

import com.gyguohua.model..VCategory3;
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
public interface VCategory3Mapper {
		/**
	* 新增VCategory3
	* @param entity
	* @Title: saveVCategory3
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void insert(VCategory3 entity);
	
	/**
	* 批量新增VCategory3
	* @param list
	* @Title: batchSaveVCategory3 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void batchInsert(List<VCategory3> list);
	
	/**
	* 编辑VCategory3
	* @param entity
	* @Title: updateVCategory3 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void update(VCategory3 entity);
	
	/**
	* 根据id删除VCategory3
	* @param id
	* @Title: deleteById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteById(String id);
	
	/**
	* 根据id批量删除VCategory3
	* @param ids
	* @Title: deleteVCategory3ByIds 
	* @param ids
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteByIds(String [] ids);
	
	/**
	* 根据id查询
	* @param id
	* @Title: findVCategory3ById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	VCategory3 findById(String id);
	
	/**
	* 查询全部
	* @param search
	* @Title: findVCategory3All
	* @return
	* @return List<VCategory3>    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	List<VCategory3> findAll(VCategory3 search);
	
}