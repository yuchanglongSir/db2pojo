package com.gyguohua.;

import java.util.List;
import com.gyguohua.model..Product;
/**
 * Service Interface:Product
 * @author yuchanglong
 * @date 2018-4-2
 */
public interface IProductService  {

	/**
	* 新增Product
	* @Title: saveProduct
	* @param entity
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void insertProduct(Product entity);
	
	/**
	* 批量新增Product
	* @param list
	* @Title: batchSaveProduct 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void batchInsertProduct(List<Product> list);
	
	/**
	* 编辑Product
	* @Title: updateProduct 
	* @param entity
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void updateProduct(Product entity);
	
	/**
	* 根据id删除Product
	* @Title: deleteProductById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteProductById(String id);
	
	/**
	* 根据id批量删除Product
	* @Title: deleteProductByIds 
	* @param ids
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteProductByIds(String ids);
	
	/**
	* 根据id查询
	* @Title: findProductById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	Product findProductById(String id);
	
	/**
	* 查询全部
	* @param search
	* @Title: findProductAll
	* @return List<Product>    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	List<Product> findProductAll(Product search);
	
}