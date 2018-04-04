package com.gyguohua..mapper;

import com.gyguohua.model..VHealthDirect;
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
public interface VHealthDirectMapper {
		/**
	* 新增VHealthDirect
	* @param entity
	* @Title: saveVHealthDirect
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void insert(VHealthDirect entity);
	
	/**
	* 批量新增VHealthDirect
	* @param list
	* @Title: batchSaveVHealthDirect 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void batchInsert(List<VHealthDirect> list);
	
	/**
	* 编辑VHealthDirect
	* @param entity
	* @Title: updateVHealthDirect 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void update(VHealthDirect entity);
	
	/**
	* 根据id删除VHealthDirect
	* @param id
	* @Title: deleteById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteById(String id);
	
	/**
	* 根据id批量删除VHealthDirect
	* @param ids
	* @Title: deleteVHealthDirectByIds 
	* @param ids
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteByIds(String [] ids);
	
	/**
	* 根据id查询
	* @param id
	* @Title: findVHealthDirectById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	VHealthDirect findById(String id);
	
	/**
	* 查询全部
	* @param search
	* @Title: findVHealthDirectAll
	* @return
	* @return List<VHealthDirect>    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	List<VHealthDirect> findAll(VHealthDirect search);
	
}