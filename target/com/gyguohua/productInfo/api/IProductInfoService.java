package com.gyguohua.;

import java.util.List;
import com.gyguohua.model..ProductInfo;
/**
 * Service Interface:ProductInfo
 * @author yuchanglong
 * @date 2018-4-2
 */
public interface IProductInfoService  {

	/**
	* 新增ProductInfo
	* @Title: saveProductInfo
	* @param entity
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void insertProductInfo(ProductInfo entity);
	
	/**
	* 批量新增ProductInfo
	* @param list
	* @Title: batchSaveProductInfo 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void batchInsertProductInfo(List<ProductInfo> list);
	
	/**
	* 编辑ProductInfo
	* @Title: updateProductInfo 
	* @param entity
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void updateProductInfo(ProductInfo entity);
	
	/**
	* 根据id删除ProductInfo
	* @Title: deleteProductInfoById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteProductInfoById(String id);
	
	/**
	* 根据id批量删除ProductInfo
	* @Title: deleteProductInfoByIds 
	* @param ids
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteProductInfoByIds(String ids);
	
	/**
	* 根据id查询
	* @Title: findProductInfoById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	ProductInfo findProductInfoById(String id);
	
	/**
	* 查询全部
	* @param search
	* @Title: findProductInfoAll
	* @return List<ProductInfo>    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	List<ProductInfo> findProductInfoAll(ProductInfo search);
	
}