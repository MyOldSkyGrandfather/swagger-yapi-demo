package com.example.sofabootswagger3.facade.impl;

import com.example.sofabootswagger3.facade.TestFacade;

import com.alipay.sofa.runtime.api.annotation.SofaService;
import com.alipay.sofa.runtime.api.annotation.SofaServiceBinding;
import com.example.sofabootswagger3.request.CarInfoRequestDTO;
import com.example.sofabootswagger3.response.CarInfoResponseDTO;
import org.springframework.stereotype.Service;

@Service
@SofaService(interfaceType = TestFacade.class, bindings = {
        @SofaServiceBinding(bindingType = "rest")})
public class TestFacadeImpl implements TestFacade {

    public CarInfoResponseDTO test(CarInfoRequestDTO carInfoRequestDTO) {
        return null;
    }
}

