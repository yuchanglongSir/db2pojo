package com.gyguohua..impl;

import com.gyguohua.api..IVStandardProductService;
import com.gyguohua.model..VStandardProduct;
import com.gyguohua..mapper.VStandardProductMapper;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Service Implementation:VStandardProduct
 * @author yuchanglong
 * @date 2018-4-2
 */
@Service
@Slf4j
public class VStandardProductServiceImpl implements IVStandardProductService {

	@Autowired
	private VStandardProductMapper vStandardProductMapper;
	
	/**
	 * 
    * 新增VStandardProduct
    * @param entity
	* @Title: saveVStandardProduct
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void insertVStandardProduct(VStandardProduct entity){
		vStandardProductMapper.insert(entity);
	};
	
	/**
	* 批量新增VStandardProduct
	* @param entity
	* @Title: batchSaveVStandardProduct 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void batchInsertVStandardProduct(List<VStandardProduct> entity){
		vStandardProductMapper.batchInsert(entity);
	};
	
	/**
	* 编辑VStandardProduct
	* @param entity
	* @Title: updateVStandardProduct 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void updateVStandardProduct(VStandardProduct entity){
		vStandardProductMapper.update(entity);
	};
	
	/**
	* 根据id删除VStandardProduct
	* @Title: deleteVStandardProductById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	 @Override
	public void deleteVStandardProductById(String id){
		vStandardProductMapper.deleteById(id);
	};
	
	/**
	* 根据id批量删除VStandardProduct
	* @Title: deleteVStandardProductByIds 
	* @param ids
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void deleteVStandardProductByIds(String ids){
		if (ids != null && !("").equals(ids)) {
            String[] idsArr = ids.split(",");
            vStandardProductMapper.deleteByIds(idsArr);
        }
	};
	
	/**
	* 根据id查询
	* @Title: findVStandardProductById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public VStandardProduct findVStandardProductById(String id){
		return vStandardProductMapper.findById(id);
	};
	
	/**
	* 查询全部
	* @Title: findVStandardProductAll
	* @return List<VStandardProduct>    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public List<VStandardProduct> findVStandardProductAll(VStandardProduct search){
		return vStandardProductMapper.findAll(search);
	};
	
}
