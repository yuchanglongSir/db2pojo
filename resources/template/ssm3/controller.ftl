package com.${project}.controller.${group};

import java.util.List;
import java.util.Date;

import com.yxd.baseservice.yxdbootstarter.pagehelper.NeedPage;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



import com.${project}.model.${group}.${class_name};
import com.${project}.api.${group}.I${class_name}Service;

/**
 * Controller of ${class_name}
 * @author ${author}
 * @date ${sysDate?date}
 */
@Api(tags={"XXX操作接口"})
@RestController
@Slf4j
@RequestMapping("/${class_name?uncap_first}")
public class ${class_name}Controller {
	
	@Autowired
	private I${class_name}Service ${class_name?uncap_first}ServiceImpl;
	
	/**
     * 注解
     *
     */
    @ApiOperation("xxx查询接口")
    @GetMapping(value = "/list")
    @NeedPage
	public List<${class_name}> getList(${class_name} search){
		return ${class_name?uncap_first}ServiceImpl.find${class_name}All(search);
	}
	/**
     * 注解
     *
     */
    @ApiOperation("插入xxx接口")
    @PostMapping(value = "/insert${class_name}")
	public String insert${class_name}(${class_name} entity) {
		${class_name?uncap_first}ServiceImpl.insert${class_name}(entity);
		return "操作成功";
	}
	/**
     * 注解
     *
     */
    @ApiOperation("更新xxx接口")
    @PutMapping(value = "/update${class_name}")
	public String update${class_name}(${class_name} entity) {
		${class_name?uncap_first}ServiceImpl.update${class_name}(entity);
		return "操作成功";
	}
	
	/**
     * 	多个用逗号隔开（英文逗号）例如：1,2,3
     *
     */
    @ApiOperation("删除xxx接口")
    @DeleteMapping(value = "/delete${class_name}ByIds")
	public String del(String ids) {
		${class_name?uncap_first}ServiceImpl.delete${class_name}ByIds(ids);
		return "操作成功";
	}
}
