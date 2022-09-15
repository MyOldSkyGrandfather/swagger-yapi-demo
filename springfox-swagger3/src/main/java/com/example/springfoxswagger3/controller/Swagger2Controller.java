package com.example.springfoxswagger3.controller;

import com.example.springfoxswagger3.request.CarInfoRequestDTO;
import com.example.springfoxswagger3.response.CarInfoResponseDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "SpringFox-Swagger3")
@RestController
@RequestMapping("/swagger3")
public class Swagger2Controller {

    @ApiOperation(value = "测试接口_1", tags = "Swagger3")
    @PostMapping("/getCarInfo")
    public CarInfoResponseDTO test (@RequestBody CarInfoRequestDTO carInfoRequestDTO) {
        return new CarInfoResponseDTO();
    }
}
