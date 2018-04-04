package com.gyguohua.model.;

import java.util.Date;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 * POJO:VOrgCommon
 * 
 * @author yuchanglong
 * @date 2018-4-2
 */
 @ApiModel(value = "VOrgCommon", description = "xxx对象")
@Data
public class VOrgCommon {
	
		@ApiModelProperty(value = "", name = "projectId")
		private String	projectId;		
		@ApiModelProperty(value = "", name = "projectName")
		private String	projectName;		
		@ApiModelProperty(value = "", name = "id")
		private String	id;		
		@ApiModelProperty(value = "", name = "code")
		private String	code;		
		@ApiModelProperty(value = "", name = "name")
		private String	name;		
		@ApiModelProperty(value = "", name = "abbr")
		private String	abbr;		
		@ApiModelProperty(value = "", name = "spellAbbr")
		private String	spellAbbr;		
		@ApiModelProperty(value = "", name = "nameWb")
		private String	nameWb;		
		@ApiModelProperty(value = "", name = "orgType")
		private String	orgType;		
		@ApiModelProperty(value = "", name = "juridicalPerson")
		private String	juridicalPerson;		
		@ApiModelProperty(value = "", name = "taxpayerCode")
		private String	taxpayerCode;		
		@ApiModelProperty(value = "", name = "accountBank")
		private String	accountBank;		
		@ApiModelProperty(value = "", name = "accountNumber")
		private String	accountNumber;		
		@ApiModelProperty(value = "", name = "accountName")
		private String	accountName;		
		@ApiModelProperty(value = "", name = "regNo")
		private String	regNo;		
		@ApiModelProperty(value = "", name = "regAmount")
		private Double	regAmount;		
		@ApiModelProperty(value = "", name = "regScope")
		private String	regScope;		
		@ApiModelProperty(value = "", name = "regDate")
		private Date	regDate;		
		@ApiModelProperty(value = "", name = "regExpireS")
		private Date	regExpireS;		
		@ApiModelProperty(value = "", name = "businessLicenseDate")
		private Date	businessLicenseDate;		
		@ApiModelProperty(value = "", name = "regAmountUnit")
		private String	regAmountUnit;		
		@ApiModelProperty(value = "", name = "address")
		private String	address;		
		@ApiModelProperty(value = "", name = "postCode")
		private String	postCode;		
		@ApiModelProperty(value = "", name = "tel")
		private String	tel;		
		@ApiModelProperty(value = "", name = "fax")
		private String	fax;		
		@ApiModelProperty(value = "", name = "website")
		private String	website;		
		@ApiModelProperty(value = "", name = "linkPerson")
		private String	linkPerson;		
		@ApiModelProperty(value = "", name = "linkPhone")
		private String	linkPhone;		
		@ApiModelProperty(value = "", name = "linkTel")
		private String	linkTel;		
		@ApiModelProperty(value = "", name = "linkJtel")
		private String	linkJtel;		
		@ApiModelProperty(value = "", name = "countryId")
		private String	countryId;		
		@ApiModelProperty(value = "", name = "provinceId")
		private String	provinceId;		
		@ApiModelProperty(value = "", name = "cityId")
		private String	cityId;		
		@ApiModelProperty(value = "", name = "saleLastYear")
		private Double	saleLastYear;		
		@ApiModelProperty(value = "", name = "businessFlag")
		private String	businessFlag;		
		@ApiModelProperty(value = "", name = "archiveNum")
		private String	archiveNum;		
		@ApiModelProperty(value = "", name = "organizeCode")
		private String	organizeCode;		
		@ApiModelProperty(value = "", name = "creditCode")
		private String	creditCode;		
		@ApiModelProperty(value = "", name = "communityHospital")
		private String	communityHospital;		

}
