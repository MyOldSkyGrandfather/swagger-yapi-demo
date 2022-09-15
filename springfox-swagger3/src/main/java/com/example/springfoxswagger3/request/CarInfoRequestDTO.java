package com.example.springfoxswagger3.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(value = "CarInfoRequestDTO", description = "车辆信息DTO")
public class CarInfoRequestDTO implements Serializable {

    @ApiModelProperty(value = "车架码(vin码)", name = "vin", dataType = "String")
    private String vin;

    @ApiModelProperty(value = "车牌号", name = "plateNo", dataType = "String")
    private String plateNo;

    @ApiModelProperty(value = "号牌种类", name = "plateType", dataType = "String")
    private String plateType;

    @ApiModelProperty(value = "厂牌型号", name = "vehicleName", dataType = "String")
    private String vehicleName;

    @ApiModelProperty(value = "订单id", name = "orderId", dataType = "String")
    private String orderId;
}
