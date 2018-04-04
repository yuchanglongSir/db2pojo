package com.gyguohua..mapper;

import com.gyguohua.model..ViewQualification;
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
public interface ViewQualificationMapper {
		/**
	* 新增ViewQualification
	* @param entity
	* @Title: saveViewQualification
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void insert(ViewQualification entity);
	
	/**
	* 批量新增ViewQualification
	* @param list
	* @Title: batchSaveViewQualification 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void batchInsert(List<ViewQualification> list);
	
	/**
	* 编辑ViewQualification
	* @param entity
	* @Title: updateViewQualification 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void update(ViewQualification entity);
	
	/**
	* 根据id删除ViewQualification
	* @param id
	* @Title: deleteById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteById(String id);
	
	/**
	* 根据id批量删除ViewQualification
	* @param ids
	* @Title: deleteViewQualificationByIds 
	* @param ids
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteByIds(String [] ids);
	
	/**
	* 根据id查询
	* @param id
	* @Title: findViewQualificationById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	ViewQualification findById(String id);
	
	/**
	* 查询全部
	* @param search
	* @Title: findViewQualificationAll
	* @return
	* @return List<ViewQualification>    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	List<ViewQualification> findAll(ViewQualification search);
	
}