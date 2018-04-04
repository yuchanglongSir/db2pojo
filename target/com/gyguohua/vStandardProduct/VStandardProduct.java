package com.gyguohua.model.;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 * POJO:VStandardProduct
 * 
 * @author yuchanglong
 * @date 2018-4-2
 */
 @ApiModel(value = "VStandardProduct", description = "xxx对象")
@Data
public class VStandardProduct {
	
		@ApiModelProperty(value = "", name = "mfAbbr")
		private String	mfAbbr;		
		@ApiModelProperty(value = "", name = "mfName")
		private String	mfName;		
		@ApiModelProperty(value = "", name = "unit")
		private String	unit;		
		@ApiModelProperty(value = "", name = "wrapName")
		private String	wrapName;		
		@ApiModelProperty(value = "", name = "doseageFormName")
		private String	doseageFormName;		
		@ApiModelProperty(value = "", name = "qualityName")
		private String	qualityName;		
		@ApiModelProperty(value = "", name = "searchMf")
		private String	searchMf;		
		@ApiModelProperty(value = "", name = "searchProduct")
		private String	searchProduct;		
		@ApiModelProperty(value = "", name = "productId")
		private String	productId;		
		@ApiModelProperty(value = "", name = "medicalName")
		private String	medicalName;		
		@ApiModelProperty(value = "", name = "tradeName")
		private String	tradeName;		
		@ApiModelProperty(value = "", name = "productCode")
		private String	productCode;		
		@ApiModelProperty(value = "", name = "standardSpec")
		private String	standardSpec;		
		@ApiModelProperty(value = "", name = "spec")
		private String	spec;		
		@ApiModelProperty(value = "", name = "mfId")
		private String	mfId;		

}
