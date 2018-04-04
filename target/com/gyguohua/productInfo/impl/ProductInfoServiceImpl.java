package com.gyguohua..impl;

import com.gyguohua.api..IProductInfoService;
import com.gyguohua.model..ProductInfo;
import com.gyguohua..mapper.ProductInfoMapper;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Service Implementation:ProductInfo
 * @author yuchanglong
 * @date 2018-4-2
 */
@Service
@Slf4j
public class ProductInfoServiceImpl implements IProductInfoService {

	@Autowired
	private ProductInfoMapper productInfoMapper;
	
	/**
	 * 
    * 新增ProductInfo
    * @param entity
	* @Title: saveProductInfo
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void insertProductInfo(ProductInfo entity){
		productInfoMapper.insert(entity);
	};
	
	/**
	* 批量新增ProductInfo
	* @param entity
	* @Title: batchSaveProductInfo 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void batchInsertProductInfo(List<ProductInfo> entity){
		productInfoMapper.batchInsert(entity);
	};
	
	/**
	* 编辑ProductInfo
	* @param entity
	* @Title: updateProductInfo 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void updateProductInfo(ProductInfo entity){
		productInfoMapper.update(entity);
	};
	
	/**
	* 根据id删除ProductInfo
	* @Title: deleteProductInfoById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	 @Override
	public void deleteProductInfoById(String id){
		productInfoMapper.deleteById(id);
	};
	
	/**
	* 根据id批量删除ProductInfo
	* @Title: deleteProductInfoByIds 
	* @param ids
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void deleteProductInfoByIds(String ids){
		if (ids != null && !("").equals(ids)) {
            String[] idsArr = ids.split(",");
            productInfoMapper.deleteByIds(idsArr);
        }
	};
	
	/**
	* 根据id查询
	* @Title: findProductInfoById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public ProductInfo findProductInfoById(String id){
		return productInfoMapper.findById(id);
	};
	
	/**
	* 查询全部
	* @Title: findProductInfoAll
	* @return List<ProductInfo>    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public List<ProductInfo> findProductInfoAll(ProductInfo search){
		return productInfoMapper.findAll(search);
	};
	
}
