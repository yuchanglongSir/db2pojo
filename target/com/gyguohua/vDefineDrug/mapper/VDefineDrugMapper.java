package com.gyguohua..mapper;

import com.gyguohua.model..VDefineDrug;
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
public interface VDefineDrugMapper {
		/**
	* 新增VDefineDrug
	* @param entity
	* @Title: saveVDefineDrug
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void insert(VDefineDrug entity);
	
	/**
	* 批量新增VDefineDrug
	* @param list
	* @Title: batchSaveVDefineDrug 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void batchInsert(List<VDefineDrug> list);
	
	/**
	* 编辑VDefineDrug
	* @param entity
	* @Title: updateVDefineDrug 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void update(VDefineDrug entity);
	
	/**
	* 根据id删除VDefineDrug
	* @param id
	* @Title: deleteById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteById(String id);
	
	/**
	* 根据id批量删除VDefineDrug
	* @param ids
	* @Title: deleteVDefineDrugByIds 
	* @param ids
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteByIds(String [] ids);
	
	/**
	* 根据id查询
	* @param id
	* @Title: findVDefineDrugById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	VDefineDrug findById(String id);
	
	/**
	* 查询全部
	* @param search
	* @Title: findVDefineDrugAll
	* @return
	* @return List<VDefineDrug>    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	List<VDefineDrug> findAll(VDefineDrug search);
	
}