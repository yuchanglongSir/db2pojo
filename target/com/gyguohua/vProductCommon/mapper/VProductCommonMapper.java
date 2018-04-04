package com.gyguohua..mapper;

import com.gyguohua.model..VProductCommon;
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
public interface VProductCommonMapper {
		/**
	* 新增VProductCommon
	* @param entity
	* @Title: saveVProductCommon
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void insert(VProductCommon entity);
	
	/**
	* 批量新增VProductCommon
	* @param list
	* @Title: batchSaveVProductCommon 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void batchInsert(List<VProductCommon> list);
	
	/**
	* 编辑VProductCommon
	* @param entity
	* @Title: updateVProductCommon 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void update(VProductCommon entity);
	
	/**
	* 根据id删除VProductCommon
	* @param id
	* @Title: deleteById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteById(String id);
	
	/**
	* 根据id批量删除VProductCommon
	* @param ids
	* @Title: deleteVProductCommonByIds 
	* @param ids
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteByIds(String [] ids);
	
	/**
	* 根据id查询
	* @param id
	* @Title: findVProductCommonById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	VProductCommon findById(String id);
	
	/**
	* 查询全部
	* @param search
	* @Title: findVProductCommonAll
	* @return
	* @return List<VProductCommon>    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	List<VProductCommon> findAll(VProductCommon search);
	
}