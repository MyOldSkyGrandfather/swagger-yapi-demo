package com.example.sofabootswagger3.request;

import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serializable;

@Schema(name = "CarInfoRequestDTO", description = "车辆信息DTO")
public class CarInfoRequestDTO implements Serializable {

    @Schema(name = "vin", description = "车架号", required = true)
    private String vin;

    @Schema(name = "plateNo", description = "车牌号", required = true)
    private String plateNo;

    @Schema(name = "plateType", description = "号牌种类", required = true)
    private String plateType;

    @Schema(name = "vehicleName", description = "厂牌型号", required = true)
    private String vehicleName;

    @Schema(name = "orderId", description = "订单id", required = true)
    private String orderId;

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

    public String getPlateType() {
        return plateType;
    }

    public void setPlateType(String plateType) {
        this.plateType = plateType;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
}
