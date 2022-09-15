package com.example.swagger2.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

// 返参添加注解
@Data
@ApiModel(value = "CarInfoResponseDTO", description = "车辆信息响应DTO")
public class CarInfoResponseDTO {

    @ApiModelProperty(value = "车架码(vin码)", name = "vin", dataType = "String")
    private String vin;

    @ApiModelProperty(value = "车牌号", name = "plateNo", dataType = "String")
    private String plateNo;

    @ApiModelProperty(value = "发动机号", name = "engNO", dataType = "String")
    private String engNO;

    @ApiModelProperty(value = "初登日期", name = "firstRegisterDate", dataType = "LocalDate")
    private LocalDate firstRegisterDate;

    @ApiModelProperty(value = "新车购置价", name = "purchasePrice", dataType = "BigDecimal")
    private BigDecimal purchasePrice;

    @ApiModelProperty(value = "座位数", name = "seat", dataType = "Integer")
    private Integer seat;

    @ApiModelProperty(value = "核定载质量", name = "vehicleCapacity", dataType = "BigDecimal")
    private BigDecimal vehicleCapacity;

    @ApiModelProperty(value = "行业车型编码", name = "hyModelCode", dataType = "String")
    private String hyModelCode;

    @ApiModelProperty(value = "整车车型编码", name = "jyModelCode", dataType = "String")
    private String jyModelCode;

    @ApiModelProperty(value = "品牌型号", name = "brandModel", dataType = "String")
    private String brandModel;

    @ApiModelProperty(value = "行业车型名称", name = "carStyleName", dataType = "String")
    private String carStyleName;

    @ApiModelProperty(value = "整车车型名称", name = "jyModelName", dataType = "String")
    private String jyModelName;

    @ApiModelProperty(value = "排量", name = "displacement", dataType = "BigDecimal")
    private BigDecimal displacement;

    @ApiModelProperty(value = "年款，格式：YYYY", name = "yearKx", dataType = "String")
    private String yearKx;

    @ApiModelProperty(value = "车辆的实际价值", name = "actualValue", dataType = "BigDecimal")
    private BigDecimal actualValue;

    @ApiModelProperty(value = "车辆的实际价值上限", name = "actualValueMax", dataType = "BigDecimal")
    private BigDecimal actualValueMax;

    @ApiModelProperty(value = "车辆的实际价值下限", name = "actualValueMin", dataType = "BigDecimal")
    private BigDecimal actualValueMin;

    @ApiModelProperty(value = "整备质量", name = "curbWeight", dataType = "BigDecimal")
    private BigDecimal curbWeight;
}
