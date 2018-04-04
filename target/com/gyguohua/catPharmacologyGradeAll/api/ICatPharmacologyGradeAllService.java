package com.gyguohua.;

import java.util.List;
import com.gyguohua.model..CatPharmacologyGradeAll;
/**
 * Service Interface:CatPharmacologyGradeAll
 * @author yuchanglong
 * @date 2018-4-2
 */
public interface ICatPharmacologyGradeAllService  {

	/**
	* 新增CatPharmacologyGradeAll
	* @Title: saveCatPharmacologyGradeAll
	* @param entity
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void insertCatPharmacologyGradeAll(CatPharmacologyGradeAll entity);
	
	/**
	* 批量新增CatPharmacologyGradeAll
	* @param list
	* @Title: batchSaveCatPharmacologyGradeAll 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void batchInsertCatPharmacologyGradeAll(List<CatPharmacologyGradeAll> list);
	
	/**
	* 编辑CatPharmacologyGradeAll
	* @Title: updateCatPharmacologyGradeAll 
	* @param entity
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void updateCatPharmacologyGradeAll(CatPharmacologyGradeAll entity);
	
	/**
	* 根据id删除CatPharmacologyGradeAll
	* @Title: deleteCatPharmacologyGradeAllById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteCatPharmacologyGradeAllById(String id);
	
	/**
	* 根据id批量删除CatPharmacologyGradeAll
	* @Title: deleteCatPharmacologyGradeAllByIds 
	* @param ids
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteCatPharmacologyGradeAllByIds(String ids);
	
	/**
	* 根据id查询
	* @Title: findCatPharmacologyGradeAllById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	CatPharmacologyGradeAll findCatPharmacologyGradeAllById(String id);
	
	/**
	* 查询全部
	* @param search
	* @Title: findCatPharmacologyGradeAllAll
	* @return List<CatPharmacologyGradeAll>    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	List<CatPharmacologyGradeAll> findCatPharmacologyGradeAllAll(CatPharmacologyGradeAll search);
	
}