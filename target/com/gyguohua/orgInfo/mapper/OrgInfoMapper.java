package com.gyguohua..mapper;

import com.gyguohua.model..OrgInfo;
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
public interface OrgInfoMapper {
		/**
	* 新增OrgInfo
	* @param entity
	* @Title: saveOrgInfo
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void insert(OrgInfo entity);
	
	/**
	* 批量新增OrgInfo
	* @param list
	* @Title: batchSaveOrgInfo 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void batchInsert(List<OrgInfo> list);
	
	/**
	* 编辑OrgInfo
	* @param entity
	* @Title: updateOrgInfo 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void update(OrgInfo entity);
	
	/**
	* 根据id删除OrgInfo
	* @param id
	* @Title: deleteById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteById(String id);
	
	/**
	* 根据id批量删除OrgInfo
	* @param ids
	* @Title: deleteOrgInfoByIds 
	* @param ids
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteByIds(String [] ids);
	
	/**
	* 根据id查询
	* @param id
	* @Title: findOrgInfoById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	OrgInfo findById(String id);
	
	/**
	* 查询全部
	* @param search
	* @Title: findOrgInfoAll
	* @return
	* @return List<OrgInfo>    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	List<OrgInfo> findAll(OrgInfo search);
	
}