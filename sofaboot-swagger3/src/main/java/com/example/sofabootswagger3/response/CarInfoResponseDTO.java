package com.example.sofabootswagger3.response;


import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name = "CarInfoResponseDTO", description = "车辆信息响应DTO")
public class CarInfoResponseDTO {

    @Schema(name = "vin", description = "车架码(vin码)", required = true)
    private String vin;

    @Schema(name = "plateNo", description = "车牌号", required = true)
    private String plateNo;

    @Schema(name = "engNO", description = "发动机号", required = true)
    private String engNO;

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getPlateNo() {
        return plateNo;
    }

    public void setPlateNo(String plateNo) {
        this.plateNo = plateNo;
    }

    public String getEngNO() {
        return engNO;
    }

    public void setEngNO(String engNO) {
        this.engNO = engNO;
    }
}


