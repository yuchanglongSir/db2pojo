package com.gyguohua..impl;

import com.gyguohua.api..IViewProductEightFieldsService;
import com.gyguohua.model..ViewProductEightFields;
import com.gyguohua..mapper.ViewProductEightFieldsMapper;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Service Implementation:ViewProductEightFields
 * @author yuchanglong
 * @date 2018-4-2
 */
@Service
@Slf4j
public class ViewProductEightFieldsServiceImpl implements IViewProductEightFieldsService {

	@Autowired
	private ViewProductEightFieldsMapper viewProductEightFieldsMapper;
	
	/**
	 * 
    * 新增ViewProductEightFields
    * @param entity
	* @Title: saveViewProductEightFields
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void insertViewProductEightFields(ViewProductEightFields entity){
		viewProductEightFieldsMapper.insert(entity);
	};
	
	/**
	* 批量新增ViewProductEightFields
	* @param entity
	* @Title: batchSaveViewProductEightFields 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void batchInsertViewProductEightFields(List<ViewProductEightFields> entity){
		viewProductEightFieldsMapper.batchInsert(entity);
	};
	
	/**
	* 编辑ViewProductEightFields
	* @param entity
	* @Title: updateViewProductEightFields 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void updateViewProductEightFields(ViewProductEightFields entity){
		viewProductEightFieldsMapper.update(entity);
	};
	
	/**
	* 根据id删除ViewProductEightFields
	* @Title: deleteViewProductEightFieldsById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	 @Override
	public void deleteViewProductEightFieldsById(String id){
		viewProductEightFieldsMapper.deleteById(id);
	};
	
	/**
	* 根据id批量删除ViewProductEightFields
	* @Title: deleteViewProductEightFieldsByIds 
	* @param ids
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void deleteViewProductEightFieldsByIds(String ids){
		if (ids != null && !("").equals(ids)) {
            String[] idsArr = ids.split(",");
            viewProductEightFieldsMapper.deleteByIds(idsArr);
        }
	};
	
	/**
	* 根据id查询
	* @Title: findViewProductEightFieldsById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public ViewProductEightFields findViewProductEightFieldsById(String id){
		return viewProductEightFieldsMapper.findById(id);
	};
	
	/**
	* 查询全部
	* @Title: findViewProductEightFieldsAll
	* @return List<ViewProductEightFields>    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public List<ViewProductEightFields> findViewProductEightFieldsAll(ViewProductEightFields search){
		return viewProductEightFieldsMapper.findAll(search);
	};
	
}
