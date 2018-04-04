package com.gyguohua.;

import java.util.List;
import com.gyguohua.model..BidProjectProduct;
/**
 * Service Interface:BidProjectProduct
 * @author yuchanglong
 * @date 2018-4-2
 */
public interface IBidProjectProductService  {

	/**
	* 新增BidProjectProduct
	* @Title: saveBidProjectProduct
	* @param entity
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void insertBidProjectProduct(BidProjectProduct entity);
	
	/**
	* 批量新增BidProjectProduct
	* @param list
	* @Title: batchSaveBidProjectProduct 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void batchInsertBidProjectProduct(List<BidProjectProduct> list);
	
	/**
	* 编辑BidProjectProduct
	* @Title: updateBidProjectProduct 
	* @param entity
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void updateBidProjectProduct(BidProjectProduct entity);
	
	/**
	* 根据id删除BidProjectProduct
	* @Title: deleteBidProjectProductById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteBidProjectProductById(String id);
	
	/**
	* 根据id批量删除BidProjectProduct
	* @Title: deleteBidProjectProductByIds 
	* @param ids
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteBidProjectProductByIds(String ids);
	
	/**
	* 根据id查询
	* @Title: findBidProjectProductById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	BidProjectProduct findBidProjectProductById(String id);
	
	/**
	* 查询全部
	* @param search
	* @Title: findBidProjectProductAll
	* @return List<BidProjectProduct>    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	List<BidProjectProduct> findBidProjectProductAll(BidProjectProduct search);
	
}