package com.gyguohua.;

import java.util.List;
import com.gyguohua.model..Medical;
/**
 * Service Interface:Medical
 * @author yuchanglong
 * @date 2018-4-2
 */
public interface IMedicalService  {

	/**
	* 新增Medical
	* @Title: saveMedical
	* @param entity
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void insertMedical(Medical entity);
	
	/**
	* 批量新增Medical
	* @param list
	* @Title: batchSaveMedical 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void batchInsertMedical(List<Medical> list);
	
	/**
	* 编辑Medical
	* @Title: updateMedical 
	* @param entity
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void updateMedical(Medical entity);
	
	/**
	* 根据id删除Medical
	* @Title: deleteMedicalById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteMedicalById(String id);
	
	/**
	* 根据id批量删除Medical
	* @Title: deleteMedicalByIds 
	* @param ids
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteMedicalByIds(String ids);
	
	/**
	* 根据id查询
	* @Title: findMedicalById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	Medical findMedicalById(String id);
	
	/**
	* 查询全部
	* @param search
	* @Title: findMedicalAll
	* @return List<Medical>    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	List<Medical> findMedicalAll(Medical search);
	
}