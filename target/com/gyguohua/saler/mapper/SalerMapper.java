package com.gyguohua..mapper;

import com.gyguohua.model..Saler;
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
public interface SalerMapper {
		/**
	* 新增Saler
	* @param entity
	* @Title: saveSaler
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void insert(Saler entity);
	
	/**
	* 批量新增Saler
	* @param list
	* @Title: batchSaveSaler 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void batchInsert(List<Saler> list);
	
	/**
	* 编辑Saler
	* @param entity
	* @Title: updateSaler 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void update(Saler entity);
	
	/**
	* 根据id删除Saler
	* @param id
	* @Title: deleteById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteById(String id);
	
	/**
	* 根据id批量删除Saler
	* @param ids
	* @Title: deleteSalerByIds 
	* @param ids
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteByIds(String [] ids);
	
	/**
	* 根据id查询
	* @param id
	* @Title: findSalerById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	Saler findById(String id);
	
	/**
	* 查询全部
	* @param search
	* @Title: findSalerAll
	* @return
	* @return List<Saler>    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	List<Saler> findAll(Saler search);
	
}