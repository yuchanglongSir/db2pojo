package com.gyguohua..impl;

import com.gyguohua.api..IVProductCommonService;
import com.gyguohua.model..VProductCommon;
import com.gyguohua..mapper.VProductCommonMapper;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Service Implementation:VProductCommon
 * @author yuchanglong
 * @date 2018-4-2
 */
@Service
@Slf4j
public class VProductCommonServiceImpl implements IVProductCommonService {

	@Autowired
	private VProductCommonMapper vProductCommonMapper;
	
	/**
	 * 
    * 新增VProductCommon
    * @param entity
	* @Title: saveVProductCommon
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void insertVProductCommon(VProductCommon entity){
		vProductCommonMapper.insert(entity);
	};
	
	/**
	* 批量新增VProductCommon
	* @param entity
	* @Title: batchSaveVProductCommon 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void batchInsertVProductCommon(List<VProductCommon> entity){
		vProductCommonMapper.batchInsert(entity);
	};
	
	/**
	* 编辑VProductCommon
	* @param entity
	* @Title: updateVProductCommon 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void updateVProductCommon(VProductCommon entity){
		vProductCommonMapper.update(entity);
	};
	
	/**
	* 根据id删除VProductCommon
	* @Title: deleteVProductCommonById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	 @Override
	public void deleteVProductCommonById(String id){
		vProductCommonMapper.deleteById(id);
	};
	
	/**
	* 根据id批量删除VProductCommon
	* @Title: deleteVProductCommonByIds 
	* @param ids
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void deleteVProductCommonByIds(String ids){
		if (ids != null && !("").equals(ids)) {
            String[] idsArr = ids.split(",");
            vProductCommonMapper.deleteByIds(idsArr);
        }
	};
	
	/**
	* 根据id查询
	* @Title: findVProductCommonById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public VProductCommon findVProductCommonById(String id){
		return vProductCommonMapper.findById(id);
	};
	
	/**
	* 查询全部
	* @Title: findVProductCommonAll
	* @return List<VProductCommon>    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public List<VProductCommon> findVProductCommonAll(VProductCommon search){
		return vProductCommonMapper.findAll(search);
	};
	
}
