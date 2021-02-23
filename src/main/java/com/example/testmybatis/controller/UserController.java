package com.example.testmybatis.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "下行接口")
@RestController
@RequestMapping(value = "/v1/User/")
public class UserController {
    @ApiOperation("根据名字查询")
    @RequestMapping(value = "/getSettingCameraListByParkName", method = RequestMethod.POST)
    public String getSettingCameraListByParkName() {

        return "测试返回063";

    }

}
