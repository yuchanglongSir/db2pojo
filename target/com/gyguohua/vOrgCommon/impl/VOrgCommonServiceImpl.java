package com.gyguohua..impl;

import com.gyguohua.api..IVOrgCommonService;
import com.gyguohua.model..VOrgCommon;
import com.gyguohua..mapper.VOrgCommonMapper;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Service Implementation:VOrgCommon
 * @author yuchanglong
 * @date 2018-4-2
 */
@Service
@Slf4j
public class VOrgCommonServiceImpl implements IVOrgCommonService {

	@Autowired
	private VOrgCommonMapper vOrgCommonMapper;
	
	/**
	 * 
    * 新增VOrgCommon
    * @param entity
	* @Title: saveVOrgCommon
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void insertVOrgCommon(VOrgCommon entity){
		vOrgCommonMapper.insert(entity);
	};
	
	/**
	* 批量新增VOrgCommon
	* @param entity
	* @Title: batchSaveVOrgCommon 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void batchInsertVOrgCommon(List<VOrgCommon> entity){
		vOrgCommonMapper.batchInsert(entity);
	};
	
	/**
	* 编辑VOrgCommon
	* @param entity
	* @Title: updateVOrgCommon 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void updateVOrgCommon(VOrgCommon entity){
		vOrgCommonMapper.update(entity);
	};
	
	/**
	* 根据id删除VOrgCommon
	* @Title: deleteVOrgCommonById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	 @Override
	public void deleteVOrgCommonById(String id){
		vOrgCommonMapper.deleteById(id);
	};
	
	/**
	* 根据id批量删除VOrgCommon
	* @Title: deleteVOrgCommonByIds 
	* @param ids
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void deleteVOrgCommonByIds(String ids){
		if (ids != null && !("").equals(ids)) {
            String[] idsArr = ids.split(",");
            vOrgCommonMapper.deleteByIds(idsArr);
        }
	};
	
	/**
	* 根据id查询
	* @Title: findVOrgCommonById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public VOrgCommon findVOrgCommonById(String id){
		return vOrgCommonMapper.findById(id);
	};
	
	/**
	* 查询全部
	* @Title: findVOrgCommonAll
	* @return List<VOrgCommon>    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public List<VOrgCommon> findVOrgCommonAll(VOrgCommon search){
		return vOrgCommonMapper.findAll(search);
	};
	
}
