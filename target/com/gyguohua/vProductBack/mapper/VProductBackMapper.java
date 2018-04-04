package com.gyguohua..mapper;

import com.gyguohua.model..VProductBack;
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
public interface VProductBackMapper {
		/**
	* 新增VProductBack
	* @param entity
	* @Title: saveVProductBack
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void insert(VProductBack entity);
	
	/**
	* 批量新增VProductBack
	* @param list
	* @Title: batchSaveVProductBack 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void batchInsert(List<VProductBack> list);
	
	/**
	* 编辑VProductBack
	* @param entity
	* @Title: updateVProductBack 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void update(VProductBack entity);
	
	/**
	* 根据id删除VProductBack
	* @param id
	* @Title: deleteById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteById(String id);
	
	/**
	* 根据id批量删除VProductBack
	* @param ids
	* @Title: deleteVProductBackByIds 
	* @param ids
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteByIds(String [] ids);
	
	/**
	* 根据id查询
	* @param id
	* @Title: findVProductBackById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	VProductBack findById(String id);
	
	/**
	* 查询全部
	* @param search
	* @Title: findVProductBackAll
	* @return
	* @return List<VProductBack>    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	List<VProductBack> findAll(VProductBack search);
	
}