package com.example.sofabootswagger3.facade;

import com.example.sofabootswagger3.request.CarInfoRequestDTO;
import com.example.sofabootswagger3.response.CarInfoResponseDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Tag(name = "测试接口管理-SofaBootSwagger3")
@Path("/test")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface TestFacade {

    @Operation(summary = "测试接口")
    @Path("/getCarInfo")
    @POST
    CarInfoResponseDTO test(CarInfoRequestDTO carInfoRequestDTO);
}

