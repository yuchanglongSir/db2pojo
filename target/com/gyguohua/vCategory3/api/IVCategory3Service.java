package com.gyguohua.;

import java.util.List;
import com.gyguohua.model..VCategory3;
/**
 * Service Interface:VCategory3
 * @author yuchanglong
 * @date 2018-4-2
 */
public interface IVCategory3Service  {

	/**
	* 新增VCategory3
	* @Title: saveVCategory3
	* @param entity
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void insertVCategory3(VCategory3 entity);
	
	/**
	* 批量新增VCategory3
	* @param list
	* @Title: batchSaveVCategory3 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void batchInsertVCategory3(List<VCategory3> list);
	
	/**
	* 编辑VCategory3
	* @Title: updateVCategory3 
	* @param entity
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void updateVCategory3(VCategory3 entity);
	
	/**
	* 根据id删除VCategory3
	* @Title: deleteVCategory3ById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteVCategory3ById(String id);
	
	/**
	* 根据id批量删除VCategory3
	* @Title: deleteVCategory3ByIds 
	* @param ids
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteVCategory3ByIds(String ids);
	
	/**
	* 根据id查询
	* @Title: findVCategory3ById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	VCategory3 findVCategory3ById(String id);
	
	/**
	* 查询全部
	* @param search
	* @Title: findVCategory3All
	* @return List<VCategory3>    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	List<VCategory3> findVCategory3All(VCategory3 search);
	
}