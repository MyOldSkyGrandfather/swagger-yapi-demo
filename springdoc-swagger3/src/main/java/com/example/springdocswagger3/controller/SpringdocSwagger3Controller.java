package com.example.springdocswagger3.controller;

import com.example.springdocswagger3.request.CarInfoRequestDTO;
import com.example.springdocswagger3.response.CarInfoResponseDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@Tag(name = "SpringdocSwagger3")
@RestController
@RequestMapping("/test")
public class SpringdocSwagger3Controller {

    @Operation(summary = "测试接口")
    @PostMapping("/getCarInfo")
    public CarInfoResponseDTO test (@RequestBody CarInfoRequestDTO carInfoRequestDTO) {
        return new CarInfoResponseDTO();
    }
}
