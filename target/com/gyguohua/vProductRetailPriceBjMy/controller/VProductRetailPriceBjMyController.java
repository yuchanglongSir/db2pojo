package com.gyguohua.controller.;

import java.util.List;
import java.util.Date;

import com.yxd.baseservice.yxdbootstarter.pagehelper.NeedPage;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



import com.gyguohua.model..VProductRetailPriceBjMy;
import com.gyguohua.api..IVProductRetailPriceBjMyService;

/**
 * Controller of VProductRetailPriceBjMy
 * @author yuchanglong
 * @date 2018-4-2
 */
@Api(tags={"XXX操作接口"})
@RestController
@Slf4j
@RequestMapping("/vProductRetailPriceBjMy")
public class VProductRetailPriceBjMyController {
	
	@Autowired
	private IVProductRetailPriceBjMyService vProductRetailPriceBjMyServiceImpl;
	
	/**
     * 注解
     *
     */
    @ApiOperation("xxx查询接口")
    @GetMapping(value = "/list")
    @NeedPage
	public List<VProductRetailPriceBjMy> getList(VProductRetailPriceBjMy search){
		return vProductRetailPriceBjMyServiceImpl.findVProductRetailPriceBjMyAll(search);
	}
	/**
     * 注解
     *
     */
    @ApiOperation("插入xxx接口")
    @PostMapping(value = "/insertVProductRetailPriceBjMy")
	public String insertVProductRetailPriceBjMy(VProductRetailPriceBjMy entity) {
		vProductRetailPriceBjMyServiceImpl.insertVProductRetailPriceBjMy(entity);
		return "操作成功";
	}
	/**
     * 注解
     *
     */
    @ApiOperation("更新xxx接口")
    @PutMapping(value = "/updateVProductRetailPriceBjMy")
	public String updateVProductRetailPriceBjMy(VProductRetailPriceBjMy entity) {
		vProductRetailPriceBjMyServiceImpl.updateVProductRetailPriceBjMy(entity);
		return "操作成功";
	}
	
	/**
     * 	多个用逗号隔开（英文逗号）例如：1,2,3
     *
     */
    @ApiOperation("删除xxx接口")
    @DeleteMapping(value = "/deleteVProductRetailPriceBjMyByIds")
	public String del(String ids) {
		vProductRetailPriceBjMyServiceImpl.deleteVProductRetailPriceBjMyByIds(ids);
		return "操作成功";
	}
}
