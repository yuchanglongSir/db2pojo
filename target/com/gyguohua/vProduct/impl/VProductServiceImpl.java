package com.gyguohua..impl;

import com.gyguohua.api..IVProductService;
import com.gyguohua.model..VProduct;
import com.gyguohua..mapper.VProductMapper;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Service Implementation:VProduct
 * @author yuchanglong
 * @date 2018-4-2
 */
@Service
@Slf4j
public class VProductServiceImpl implements IVProductService {

	@Autowired
	private VProductMapper vProductMapper;
	
	/**
	 * 
    * 新增VProduct
    * @param entity
	* @Title: saveVProduct
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void insertVProduct(VProduct entity){
		vProductMapper.insert(entity);
	};
	
	/**
	* 批量新增VProduct
	* @param entity
	* @Title: batchSaveVProduct 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void batchInsertVProduct(List<VProduct> entity){
		vProductMapper.batchInsert(entity);
	};
	
	/**
	* 编辑VProduct
	* @param entity
	* @Title: updateVProduct 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void updateVProduct(VProduct entity){
		vProductMapper.update(entity);
	};
	
	/**
	* 根据id删除VProduct
	* @Title: deleteVProductById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	 @Override
	public void deleteVProductById(String id){
		vProductMapper.deleteById(id);
	};
	
	/**
	* 根据id批量删除VProduct
	* @Title: deleteVProductByIds 
	* @param ids
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void deleteVProductByIds(String ids){
		if (ids != null && !("").equals(ids)) {
            String[] idsArr = ids.split(",");
            vProductMapper.deleteByIds(idsArr);
        }
	};
	
	/**
	* 根据id查询
	* @Title: findVProductById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public VProduct findVProductById(String id){
		return vProductMapper.findById(id);
	};
	
	/**
	* 查询全部
	* @Title: findVProductAll
	* @return List<VProduct>    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public List<VProduct> findVProductAll(VProduct search){
		return vProductMapper.findAll(search);
	};
	
}
