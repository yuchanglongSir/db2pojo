package com.gyguohua..mapper;

import com.gyguohua.model..ViewProductEightFields;
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
public interface ViewProductEightFieldsMapper {
		/**
	* 新增ViewProductEightFields
	* @param entity
	* @Title: saveViewProductEightFields
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void insert(ViewProductEightFields entity);
	
	/**
	* 批量新增ViewProductEightFields
	* @param list
	* @Title: batchSaveViewProductEightFields 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void batchInsert(List<ViewProductEightFields> list);
	
	/**
	* 编辑ViewProductEightFields
	* @param entity
	* @Title: updateViewProductEightFields 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void update(ViewProductEightFields entity);
	
	/**
	* 根据id删除ViewProductEightFields
	* @param id
	* @Title: deleteById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteById(String id);
	
	/**
	* 根据id批量删除ViewProductEightFields
	* @param ids
	* @Title: deleteViewProductEightFieldsByIds 
	* @param ids
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteByIds(String [] ids);
	
	/**
	* 根据id查询
	* @param id
	* @Title: findViewProductEightFieldsById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	ViewProductEightFields findById(String id);
	
	/**
	* 查询全部
	* @param search
	* @Title: findViewProductEightFieldsAll
	* @return
	* @return List<ViewProductEightFields>    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	List<ViewProductEightFields> findAll(ViewProductEightFields search);
	
}