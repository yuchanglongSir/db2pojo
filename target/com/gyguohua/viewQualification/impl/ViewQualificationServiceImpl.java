package com.gyguohua..impl;

import com.gyguohua.api..IViewQualificationService;
import com.gyguohua.model..ViewQualification;
import com.gyguohua..mapper.ViewQualificationMapper;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Service Implementation:ViewQualification
 * @author yuchanglong
 * @date 2018-4-2
 */
@Service
@Slf4j
public class ViewQualificationServiceImpl implements IViewQualificationService {

	@Autowired
	private ViewQualificationMapper viewQualificationMapper;
	
	/**
	 * 
    * 新增ViewQualification
    * @param entity
	* @Title: saveViewQualification
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void insertViewQualification(ViewQualification entity){
		viewQualificationMapper.insert(entity);
	};
	
	/**
	* 批量新增ViewQualification
	* @param entity
	* @Title: batchSaveViewQualification 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void batchInsertViewQualification(List<ViewQualification> entity){
		viewQualificationMapper.batchInsert(entity);
	};
	
	/**
	* 编辑ViewQualification
	* @param entity
	* @Title: updateViewQualification 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void updateViewQualification(ViewQualification entity){
		viewQualificationMapper.update(entity);
	};
	
	/**
	* 根据id删除ViewQualification
	* @Title: deleteViewQualificationById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	 @Override
	public void deleteViewQualificationById(String id){
		viewQualificationMapper.deleteById(id);
	};
	
	/**
	* 根据id批量删除ViewQualification
	* @Title: deleteViewQualificationByIds 
	* @param ids
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void deleteViewQualificationByIds(String ids){
		if (ids != null && !("").equals(ids)) {
            String[] idsArr = ids.split(",");
            viewQualificationMapper.deleteByIds(idsArr);
        }
	};
	
	/**
	* 根据id查询
	* @Title: findViewQualificationById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public ViewQualification findViewQualificationById(String id){
		return viewQualificationMapper.findById(id);
	};
	
	/**
	* 查询全部
	* @Title: findViewQualificationAll
	* @return List<ViewQualification>    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public List<ViewQualification> findViewQualificationAll(ViewQualification search){
		return viewQualificationMapper.findAll(search);
	};
	
}
