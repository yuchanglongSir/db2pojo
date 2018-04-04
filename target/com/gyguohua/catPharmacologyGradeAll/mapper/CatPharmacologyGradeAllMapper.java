package com.gyguohua..mapper;

import com.gyguohua.model..CatPharmacologyGradeAll;
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
public interface CatPharmacologyGradeAllMapper {
		/**
	* 新增CatPharmacologyGradeAll
	* @param entity
	* @Title: saveCatPharmacologyGradeAll
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void insert(CatPharmacologyGradeAll entity);
	
	/**
	* 批量新增CatPharmacologyGradeAll
	* @param list
	* @Title: batchSaveCatPharmacologyGradeAll 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void batchInsert(List<CatPharmacologyGradeAll> list);
	
	/**
	* 编辑CatPharmacologyGradeAll
	* @param entity
	* @Title: updateCatPharmacologyGradeAll 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void update(CatPharmacologyGradeAll entity);
	
	/**
	* 根据id删除CatPharmacologyGradeAll
	* @param id
	* @Title: deleteById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteById(String id);
	
	/**
	* 根据id批量删除CatPharmacologyGradeAll
	* @param ids
	* @Title: deleteCatPharmacologyGradeAllByIds 
	* @param ids
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteByIds(String [] ids);
	
	/**
	* 根据id查询
	* @param id
	* @Title: findCatPharmacologyGradeAllById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	CatPharmacologyGradeAll findById(String id);
	
	/**
	* 查询全部
	* @param search
	* @Title: findCatPharmacologyGradeAllAll
	* @return
	* @return List<CatPharmacologyGradeAll>    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	List<CatPharmacologyGradeAll> findAll(CatPharmacologyGradeAll search);
	
}