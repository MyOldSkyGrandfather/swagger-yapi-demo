package com.example.springdocswagger3.response;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

// 返参添加注解
@Data
@Schema(name = "CarInfoResponseDTO", description = "车辆信息响应DTO")
public class CarInfoResponseDTO {

    @Schema(name = "vin", description = "车架码(vin码)", required = true)
    private String vin;

    @Schema(name = "plateNo", description = "车牌号", required = true)
    private String plateNo;

    @Schema(name = "engNO", description = "发动机号", required = true)
    private String engNO;
}

