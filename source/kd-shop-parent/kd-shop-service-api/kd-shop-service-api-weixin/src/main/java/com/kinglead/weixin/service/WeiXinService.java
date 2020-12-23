package com.kinglead.weixin.service;

import com.kinglead.entity.weixin.AppEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author kinglead
 * @date 2020-12-23 上午 10:48
 * @describe {请写具体描述}
 */
@Api(tags = "微信服务接口")
public interface WeiXinService {

    @ApiOperation("获取APP信息")
    @GetMapping("/getApp")
    AppEntity getApp();

}
