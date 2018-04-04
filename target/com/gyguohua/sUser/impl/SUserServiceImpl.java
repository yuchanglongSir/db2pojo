package com.gyguohua.user.impl;

import com.gyguohua.api.user.ISUserService;
import com.gyguohua.model.user.SUser;
import com.gyguohua.user.mapper.SUserMapper;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Service Implementation:SUser
 * @author yuchanglong
 * @date 2018-4-2
 */
@Service
@Slf4j
public class SUserServiceImpl implements ISUserService {

	@Autowired
	private SUserMapper sUserMapper;
	
	/**
	 * 
    * 新增SUser
    * @param entity
	* @Title: saveSUser
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void insertSUser(SUser entity){
		sUserMapper.insert(entity);
	};
	
	/**
	* 批量新增SUser
	* @param entity
	* @Title: batchSaveSUser 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void batchInsertSUser(List<SUser> entity){
		sUserMapper.batchInsert(entity);
	};
	
	/**
	* 编辑SUser
	* @param entity
	* @Title: updateSUser 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void updateSUser(SUser entity){
		sUserMapper.update(entity);
	};
	
	/**
	* 根据id删除SUser
	* @Title: deleteSUserById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	 @Override
	public void deleteSUserById(String id){
		sUserMapper.deleteById(id);
	};
	
	/**
	* 根据id批量删除SUser
	* @Title: deleteSUserByIds 
	* @param ids
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void deleteSUserByIds(String ids){
		if (ids != null && !("").equals(ids)) {
            String[] idsArr = ids.split(",");
            sUserMapper.deleteByIds(idsArr);
        }
	};
	
	/**
	* 根据id查询
	* @Title: findSUserById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public SUser findSUserById(String id){
		return sUserMapper.findById(id);
	};
	
	/**
	* 查询全部
	* @Title: findSUserAll
	* @return List<SUser>    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public List<SUser> findSUserAll(SUser search){
		return sUserMapper.findAll(search);
	};
	
}
