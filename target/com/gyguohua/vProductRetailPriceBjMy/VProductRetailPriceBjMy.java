package com.gyguohua.model.;

import java.util.Date;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 * POJO:VProductRetailPriceBjMy
 * 
 * @author yuchanglong
 * @date 2018-4-2
 */
 @ApiModel(value = "VProductRetailPriceBjMy", description = "xxx对象")
@Data
public class VProductRetailPriceBjMy {
	
		@ApiModelProperty(value = "", name = "零售价")
		private Double	零售价;		
		@ApiModelProperty(value = "", name = "公告价")
		private Double	公告价;		
		@ApiModelProperty(value = "", name = "enableFlag")
		private String	enableFlag;		
		@ApiModelProperty(value = "", name = "productId")
		private String	productId;		
		@ApiModelProperty(value = "", name = "物价文号")
		private String	物价文号;		
		@ApiModelProperty(value = "", name = "lastInsuredDrugNubmer")
		private String	lastInsuredDrugNubmer;		
		@ApiModelProperty(value = "", name = "insuredDrugNubmer")
		private String	insuredDrugNubmer;		
		@ApiModelProperty(value = "", name = "公告药品名称")
		private String	公告药品名称;		
		@ApiModelProperty(value = "", name = "公告剂型")
		private String	公告剂型;		
		@ApiModelProperty(value = "", name = "执行日期")
		private Date	执行日期;		
		@ApiModelProperty(value = "", name = "结束日期")
		private Date	结束日期;		
		@ApiModelProperty(value = "", name = "单独定价")
		private String	单独定价;		
		@ApiModelProperty(value = "", name = "priceid")
		private String	priceid;		
		@ApiModelProperty(value = "", name = "productName")
		private String	productName;		
		@ApiModelProperty(value = "", name = "relateFactoryFlag")
		private String	relateFactoryFlag;		
		@ApiModelProperty(value = "", name = "公告生产企业")
		private String	公告生产企业;		
		@ApiModelProperty(value = "", name = "优质优价")
		private String	优质优价;		
		@ApiModelProperty(value = "", name = "公告规格包装")
		private String	公告规格包装;		
		@ApiModelProperty(value = "", name = "公告单位")
		private String	公告单位;		
		@ApiModelProperty(value = "", name = "priceType")
		private String	priceType;		
		@ApiModelProperty(value = "", name = "备注")
		private String	备注;		
		@ApiModelProperty(value = "", name = "t")
		private String	t;		

}
