package com.gyguohua.model.;

import java.util.Date;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 * POJO:Medical
 * 
 * @author yuchanglong
 * @date 2018-4-2
 */
 @ApiModel(value = "Medical", description = "xxx对象")
@Data
public class Medical {
	
		@ApiModelProperty(value = "", name = "medicalName")
		private String	medicalName;		
		@ApiModelProperty(value = "", name = "englishName")
		private String	englishName;		
		@ApiModelProperty(value = "", name = "modeName")
		private String	modeName;		
		@ApiModelProperty(value = "", name = "medicalSpec")
		private String	medicalSpec;		
		@ApiModelProperty(value = "", name = "standSpecRate")
		private Double	standSpecRate;		
		@ApiModelProperty(value = "", name = "enableFlag")
		private String	enableFlag;		
		@ApiModelProperty(value = "", name = "spellAbbr")
		private String	spellAbbr;		
		@ApiModelProperty(value = "", name = "nameWb")
		private String	nameWb;		
		@ApiModelProperty(value = "", name = "prescription")
		private String	prescription;		
		@ApiModelProperty(value = "", name = "nationalInsuranceDrug")
		private String	nationalInsuranceDrug;		
		@ApiModelProperty(value = "", name = "nationalBasicDrug")
		private String	nationalBasicDrug;		
		@ApiModelProperty(value = "", name = "createUser")
		private String	createUser;		
		@ApiModelProperty(value = "", name = "createDate")
		private Date	createDate;		
		@ApiModelProperty(value = "", name = "createPlat")
		private String	createPlat;		
		@ApiModelProperty(value = "", name = "createOrg")
		private String	createOrg;		
		@ApiModelProperty(value = "", name = "lastUpdateUser")
		private String	lastUpdateUser;		
		@ApiModelProperty(value = "", name = "lastUpdateDate")
		private Date	lastUpdateDate;		
		@ApiModelProperty(value = "", name = "lastUpdatePlat")
		private String	lastUpdatePlat;		
		@ApiModelProperty(value = "", name = "lastUpdateOrg")
		private String	lastUpdateOrg;		
		@ApiModelProperty(value = "", name = "synchronizedDate")
		private Date	synchronizedDate;		
		@ApiModelProperty(value = "", name = "cleanDate")
		private Date	cleanDate;		
		@ApiModelProperty(value = "", name = "description")
		private String	description;		
		@ApiModelProperty(value = "", name = "insuranceNo")
		private String	insuranceNo;		
		@ApiModelProperty(value = "", name = "doseageFormCode")
		private String	doseageFormCode;		
		@ApiModelProperty(value = "", name = "medicalId")
		private String	medicalId;		
		@ApiModelProperty(value = "", name = "medicalCode")
		private String	medicalCode;		
		@ApiModelProperty(value = "", name = "medical12Id")
		private String	medical12Id;		
		@ApiModelProperty(value = "", name = "medical16Id")
		private String	medical16Id;		
		@ApiModelProperty(value = "", name = "medical18Id")
		private String	medical18Id;		
		@ApiModelProperty(value = "", name = "saltCode")
		private String	saltCode;		

}
