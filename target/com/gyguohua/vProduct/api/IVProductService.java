package com.gyguohua.;

import java.util.List;
import com.gyguohua.model..VProduct;
/**
 * Service Interface:VProduct
 * @author yuchanglong
 * @date 2018-4-2
 */
public interface IVProductService  {

	/**
	* 新增VProduct
	* @Title: saveVProduct
	* @param entity
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void insertVProduct(VProduct entity);
	
	/**
	* 批量新增VProduct
	* @param list
	* @Title: batchSaveVProduct 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void batchInsertVProduct(List<VProduct> list);
	
	/**
	* 编辑VProduct
	* @Title: updateVProduct 
	* @param entity
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void updateVProduct(VProduct entity);
	
	/**
	* 根据id删除VProduct
	* @Title: deleteVProductById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteVProductById(String id);
	
	/**
	* 根据id批量删除VProduct
	* @Title: deleteVProductByIds 
	* @param ids
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteVProductByIds(String ids);
	
	/**
	* 根据id查询
	* @Title: findVProductById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	VProduct findVProductById(String id);
	
	/**
	* 查询全部
	* @param search
	* @Title: findVProductAll
	* @return List<VProduct>    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	List<VProduct> findVProductAll(VProduct search);
	
}