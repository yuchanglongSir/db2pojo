package com.gyguohua..mapper;

import com.gyguohua.model..Medical;
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
public interface MedicalMapper {
		/**
	* 新增Medical
	* @param entity
	* @Title: saveMedical
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void insert(Medical entity);
	
	/**
	* 批量新增Medical
	* @param list
	* @Title: batchSaveMedical 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void batchInsert(List<Medical> list);
	
	/**
	* 编辑Medical
	* @param entity
	* @Title: updateMedical 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void update(Medical entity);
	
	/**
	* 根据id删除Medical
	* @param id
	* @Title: deleteById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteById(String id);
	
	/**
	* 根据id批量删除Medical
	* @param ids
	* @Title: deleteMedicalByIds 
	* @param ids
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteByIds(String [] ids);
	
	/**
	* 根据id查询
	* @param id
	* @Title: findMedicalById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	Medical findById(String id);
	
	/**
	* 查询全部
	* @param search
	* @Title: findMedicalAll
	* @return
	* @return List<Medical>    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	List<Medical> findAll(Medical search);
	
}