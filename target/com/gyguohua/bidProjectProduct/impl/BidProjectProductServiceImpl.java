package com.gyguohua..impl;

import com.gyguohua.api..IBidProjectProductService;
import com.gyguohua.model..BidProjectProduct;
import com.gyguohua..mapper.BidProjectProductMapper;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Service Implementation:BidProjectProduct
 * @author yuchanglong
 * @date 2018-4-2
 */
@Service
@Slf4j
public class BidProjectProductServiceImpl implements IBidProjectProductService {

	@Autowired
	private BidProjectProductMapper bidProjectProductMapper;
	
	/**
	 * 
    * 新增BidProjectProduct
    * @param entity
	* @Title: saveBidProjectProduct
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void insertBidProjectProduct(BidProjectProduct entity){
		bidProjectProductMapper.insert(entity);
	};
	
	/**
	* 批量新增BidProjectProduct
	* @param entity
	* @Title: batchSaveBidProjectProduct 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void batchInsertBidProjectProduct(List<BidProjectProduct> entity){
		bidProjectProductMapper.batchInsert(entity);
	};
	
	/**
	* 编辑BidProjectProduct
	* @param entity
	* @Title: updateBidProjectProduct 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void updateBidProjectProduct(BidProjectProduct entity){
		bidProjectProductMapper.update(entity);
	};
	
	/**
	* 根据id删除BidProjectProduct
	* @Title: deleteBidProjectProductById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	 @Override
	public void deleteBidProjectProductById(String id){
		bidProjectProductMapper.deleteById(id);
	};
	
	/**
	* 根据id批量删除BidProjectProduct
	* @Title: deleteBidProjectProductByIds 
	* @param ids
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void deleteBidProjectProductByIds(String ids){
		if (ids != null && !("").equals(ids)) {
            String[] idsArr = ids.split(",");
            bidProjectProductMapper.deleteByIds(idsArr);
        }
	};
	
	/**
	* 根据id查询
	* @Title: findBidProjectProductById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public BidProjectProduct findBidProjectProductById(String id){
		return bidProjectProductMapper.findById(id);
	};
	
	/**
	* 查询全部
	* @Title: findBidProjectProductAll
	* @return List<BidProjectProduct>    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public List<BidProjectProduct> findBidProjectProductAll(BidProjectProduct search){
		return bidProjectProductMapper.findAll(search);
	};
	
}
