package com.gyguohua.;

import java.util.List;
import com.gyguohua.model..VStandardProduct;
/**
 * Service Interface:VStandardProduct
 * @author yuchanglong
 * @date 2018-4-2
 */
public interface IVStandardProductService  {

	/**
	* 新增VStandardProduct
	* @Title: saveVStandardProduct
	* @param entity
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void insertVStandardProduct(VStandardProduct entity);
	
	/**
	* 批量新增VStandardProduct
	* @param list
	* @Title: batchSaveVStandardProduct 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void batchInsertVStandardProduct(List<VStandardProduct> list);
	
	/**
	* 编辑VStandardProduct
	* @Title: updateVStandardProduct 
	* @param entity
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void updateVStandardProduct(VStandardProduct entity);
	
	/**
	* 根据id删除VStandardProduct
	* @Title: deleteVStandardProductById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteVStandardProductById(String id);
	
	/**
	* 根据id批量删除VStandardProduct
	* @Title: deleteVStandardProductByIds 
	* @param ids
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteVStandardProductByIds(String ids);
	
	/**
	* 根据id查询
	* @Title: findVStandardProductById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	VStandardProduct findVStandardProductById(String id);
	
	/**
	* 查询全部
	* @param search
	* @Title: findVStandardProductAll
	* @return List<VStandardProduct>    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	List<VStandardProduct> findVStandardProductAll(VStandardProduct search);
	
}