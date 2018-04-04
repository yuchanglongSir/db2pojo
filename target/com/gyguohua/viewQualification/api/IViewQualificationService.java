package com.gyguohua.;

import java.util.List;
import com.gyguohua.model..ViewQualification;
/**
 * Service Interface:ViewQualification
 * @author yuchanglong
 * @date 2018-4-2
 */
public interface IViewQualificationService  {

	/**
	* 新增ViewQualification
	* @Title: saveViewQualification
	* @param entity
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void insertViewQualification(ViewQualification entity);
	
	/**
	* 批量新增ViewQualification
	* @param list
	* @Title: batchSaveViewQualification 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void batchInsertViewQualification(List<ViewQualification> list);
	
	/**
	* 编辑ViewQualification
	* @Title: updateViewQualification 
	* @param entity
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void updateViewQualification(ViewQualification entity);
	
	/**
	* 根据id删除ViewQualification
	* @Title: deleteViewQualificationById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteViewQualificationById(String id);
	
	/**
	* 根据id批量删除ViewQualification
	* @Title: deleteViewQualificationByIds 
	* @param ids
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteViewQualificationByIds(String ids);
	
	/**
	* 根据id查询
	* @Title: findViewQualificationById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	ViewQualification findViewQualificationById(String id);
	
	/**
	* 查询全部
	* @param search
	* @Title: findViewQualificationAll
	* @return List<ViewQualification>    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	List<ViewQualification> findViewQualificationAll(ViewQualification search);
	
}