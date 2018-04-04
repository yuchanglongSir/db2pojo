package com.gyguohua..impl;

import com.gyguohua.api..IVProductBackService;
import com.gyguohua.model..VProductBack;
import com.gyguohua..mapper.VProductBackMapper;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Service Implementation:VProductBack
 * @author yuchanglong
 * @date 2018-4-2
 */
@Service
@Slf4j
public class VProductBackServiceImpl implements IVProductBackService {

	@Autowired
	private VProductBackMapper vProductBackMapper;
	
	/**
	 * 
    * 新增VProductBack
    * @param entity
	* @Title: saveVProductBack
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void insertVProductBack(VProductBack entity){
		vProductBackMapper.insert(entity);
	};
	
	/**
	* 批量新增VProductBack
	* @param entity
	* @Title: batchSaveVProductBack 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void batchInsertVProductBack(List<VProductBack> entity){
		vProductBackMapper.batchInsert(entity);
	};
	
	/**
	* 编辑VProductBack
	* @param entity
	* @Title: updateVProductBack 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void updateVProductBack(VProductBack entity){
		vProductBackMapper.update(entity);
	};
	
	/**
	* 根据id删除VProductBack
	* @Title: deleteVProductBackById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	 @Override
	public void deleteVProductBackById(String id){
		vProductBackMapper.deleteById(id);
	};
	
	/**
	* 根据id批量删除VProductBack
	* @Title: deleteVProductBackByIds 
	* @param ids
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void deleteVProductBackByIds(String ids){
		if (ids != null && !("").equals(ids)) {
            String[] idsArr = ids.split(",");
            vProductBackMapper.deleteByIds(idsArr);
        }
	};
	
	/**
	* 根据id查询
	* @Title: findVProductBackById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public VProductBack findVProductBackById(String id){
		return vProductBackMapper.findById(id);
	};
	
	/**
	* 查询全部
	* @Title: findVProductBackAll
	* @return List<VProductBack>    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public List<VProductBack> findVProductBackAll(VProductBack search){
		return vProductBackMapper.findAll(search);
	};
	
}
