package com.kinglead.member.feign;

import com.kinglead.weixin.service.WeiXinService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author kinglead
 * @date 2020-12-23 上午 11:30
 * @describe {请写具体描述}
 */
@FeignClient(value = "app-weixin")
public interface WeiXinServiceFeign extends WeiXinService {

//    @GetMapping("/getApp")
//    AppEntity getApp();

}
