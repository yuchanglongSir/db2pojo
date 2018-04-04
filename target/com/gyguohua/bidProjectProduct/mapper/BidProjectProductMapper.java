package com.gyguohua..mapper;

import com.gyguohua.model..BidProjectProduct;
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
public interface BidProjectProductMapper {
		/**
	* 新增BidProjectProduct
	* @param entity
	* @Title: saveBidProjectProduct
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void insert(BidProjectProduct entity);
	
	/**
	* 批量新增BidProjectProduct
	* @param list
	* @Title: batchSaveBidProjectProduct 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void batchInsert(List<BidProjectProduct> list);
	
	/**
	* 编辑BidProjectProduct
	* @param entity
	* @Title: updateBidProjectProduct 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void update(BidProjectProduct entity);
	
	/**
	* 根据id删除BidProjectProduct
	* @param id
	* @Title: deleteById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteById(String id);
	
	/**
	* 根据id批量删除BidProjectProduct
	* @param ids
	* @Title: deleteBidProjectProductByIds 
	* @param ids
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteByIds(String [] ids);
	
	/**
	* 根据id查询
	* @param id
	* @Title: findBidProjectProductById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	BidProjectProduct findById(String id);
	
	/**
	* 查询全部
	* @param search
	* @Title: findBidProjectProductAll
	* @return
	* @return List<BidProjectProduct>    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	List<BidProjectProduct> findAll(BidProjectProduct search);
	
}