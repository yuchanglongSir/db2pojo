package com.gyguohua..impl;

import com.gyguohua.api..IOrgInfoService;
import com.gyguohua.model..OrgInfo;
import com.gyguohua..mapper.OrgInfoMapper;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Service Implementation:OrgInfo
 * @author yuchanglong
 * @date 2018-4-2
 */
@Service
@Slf4j
public class OrgInfoServiceImpl implements IOrgInfoService {

	@Autowired
	private OrgInfoMapper orgInfoMapper;
	
	/**
	 * 
    * 新增OrgInfo
    * @param entity
	* @Title: saveOrgInfo
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void insertOrgInfo(OrgInfo entity){
		orgInfoMapper.insert(entity);
	};
	
	/**
	* 批量新增OrgInfo
	* @param entity
	* @Title: batchSaveOrgInfo 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void batchInsertOrgInfo(List<OrgInfo> entity){
		orgInfoMapper.batchInsert(entity);
	};
	
	/**
	* 编辑OrgInfo
	* @param entity
	* @Title: updateOrgInfo 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void updateOrgInfo(OrgInfo entity){
		orgInfoMapper.update(entity);
	};
	
	/**
	* 根据id删除OrgInfo
	* @Title: deleteOrgInfoById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	 @Override
	public void deleteOrgInfoById(String id){
		orgInfoMapper.deleteById(id);
	};
	
	/**
	* 根据id批量删除OrgInfo
	* @Title: deleteOrgInfoByIds 
	* @param ids
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void deleteOrgInfoByIds(String ids){
		if (ids != null && !("").equals(ids)) {
            String[] idsArr = ids.split(",");
            orgInfoMapper.deleteByIds(idsArr);
        }
	};
	
	/**
	* 根据id查询
	* @Title: findOrgInfoById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public OrgInfo findOrgInfoById(String id){
		return orgInfoMapper.findById(id);
	};
	
	/**
	* 查询全部
	* @Title: findOrgInfoAll
	* @return List<OrgInfo>    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public List<OrgInfo> findOrgInfoAll(OrgInfo search){
		return orgInfoMapper.findAll(search);
	};
	
}
