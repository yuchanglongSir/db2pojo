package com.gyguohua.model.;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 * POJO:ViewProductEightFields
 * 
 * @author yuchanglong
 * @date 2018-4-2
 */
 @ApiModel(value = "ViewProductEightFields", description = "xxx对象")
@Data
public class ViewProductEightFields {
	
		@ApiModelProperty(value = "", name = "nameChn")
		private String	nameChn;		
		@ApiModelProperty(value = "", name = "tradeName")
		private String	tradeName;		
		@ApiModelProperty(value = "", name = "doseageFormNameChn")
		private String	doseageFormNameChn;		
		@ApiModelProperty(value = "", name = "spec")
		private String	spec;		
		@ApiModelProperty(value = "", name = "standRate")
		private Double	standRate;		
		@ApiModelProperty(value = "", name = "metricNameChn")
		private String	metricNameChn;		
		@ApiModelProperty(value = "", name = "useUnit")
		private String	useUnit;		
		@ApiModelProperty(value = "", name = "wrapNameChn")
		private String	wrapNameChn;		
		@ApiModelProperty(value = "", name = "orgName")
		private String	orgName;		
		@ApiModelProperty(value = "", name = "ppId")
		private String	ppId;		
		@ApiModelProperty(value = "", name = "catProjectId")
		private String	catProjectId;		
		@ApiModelProperty(value = "", name = "projectOrgId")
		private String	projectOrgId;		
		@ApiModelProperty(value = "", name = "state")
		private String	state;		
		@ApiModelProperty(value = "", name = "auditResult")
		private String	auditResult;		
		@ApiModelProperty(value = "", name = "manufactureId")
		private String	manufactureId;		
		@ApiModelProperty(value = "", name = "metricId")
		private String	metricId;		

}
