package com.example.swagger2.controller;

import com.example.swagger2.request.CarInfoRequestDTO;
import com.example.swagger2.response.CarInfoResponseDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "Swagger2")
@RestController
@RequestMapping("/swagger2")
public class Swagger2Controller {

    @ApiOperation(value = "测试接口", tags = "Swagger2")
    @PostMapping("/getCarInfo")
    public CarInfoResponseDTO test (@RequestBody CarInfoRequestDTO carInfoRequestDTO) {
        return new CarInfoResponseDTO();
    }
}
