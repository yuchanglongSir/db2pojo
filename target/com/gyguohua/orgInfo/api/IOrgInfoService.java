package com.gyguohua.;

import java.util.List;
import com.gyguohua.model..OrgInfo;
/**
 * Service Interface:OrgInfo
 * @author yuchanglong
 * @date 2018-4-2
 */
public interface IOrgInfoService  {

	/**
	* 新增OrgInfo
	* @Title: saveOrgInfo
	* @param entity
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void insertOrgInfo(OrgInfo entity);
	
	/**
	* 批量新增OrgInfo
	* @param list
	* @Title: batchSaveOrgInfo 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void batchInsertOrgInfo(List<OrgInfo> list);
	
	/**
	* 编辑OrgInfo
	* @Title: updateOrgInfo 
	* @param entity
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void updateOrgInfo(OrgInfo entity);
	
	/**
	* 根据id删除OrgInfo
	* @Title: deleteOrgInfoById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteOrgInfoById(String id);
	
	/**
	* 根据id批量删除OrgInfo
	* @Title: deleteOrgInfoByIds 
	* @param ids
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteOrgInfoByIds(String ids);
	
	/**
	* 根据id查询
	* @Title: findOrgInfoById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	OrgInfo findOrgInfoById(String id);
	
	/**
	* 查询全部
	* @param search
	* @Title: findOrgInfoAll
	* @return List<OrgInfo>    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	List<OrgInfo> findOrgInfoAll(OrgInfo search);
	
}