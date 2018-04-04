package com.gyguohua..impl;

import com.gyguohua.api..IVCategory3Service;
import com.gyguohua.model..VCategory3;
import com.gyguohua..mapper.VCategory3Mapper;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Service Implementation:VCategory3
 * @author yuchanglong
 * @date 2018-4-2
 */
@Service
@Slf4j
public class VCategory3ServiceImpl implements IVCategory3Service {

	@Autowired
	private VCategory3Mapper vCategory3Mapper;
	
	/**
	 * 
    * 新增VCategory3
    * @param entity
	* @Title: saveVCategory3
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void insertVCategory3(VCategory3 entity){
		vCategory3Mapper.insert(entity);
	};
	
	/**
	* 批量新增VCategory3
	* @param entity
	* @Title: batchSaveVCategory3 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void batchInsertVCategory3(List<VCategory3> entity){
		vCategory3Mapper.batchInsert(entity);
	};
	
	/**
	* 编辑VCategory3
	* @param entity
	* @Title: updateVCategory3 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void updateVCategory3(VCategory3 entity){
		vCategory3Mapper.update(entity);
	};
	
	/**
	* 根据id删除VCategory3
	* @Title: deleteVCategory3ById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	 @Override
	public void deleteVCategory3ById(String id){
		vCategory3Mapper.deleteById(id);
	};
	
	/**
	* 根据id批量删除VCategory3
	* @Title: deleteVCategory3ByIds 
	* @param ids
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void deleteVCategory3ByIds(String ids){
		if (ids != null && !("").equals(ids)) {
            String[] idsArr = ids.split(",");
            vCategory3Mapper.deleteByIds(idsArr);
        }
	};
	
	/**
	* 根据id查询
	* @Title: findVCategory3ById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public VCategory3 findVCategory3ById(String id){
		return vCategory3Mapper.findById(id);
	};
	
	/**
	* 查询全部
	* @Title: findVCategory3All
	* @return List<VCategory3>    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public List<VCategory3> findVCategory3All(VCategory3 search){
		return vCategory3Mapper.findAll(search);
	};
	
}
