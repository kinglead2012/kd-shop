package com.kinglead.service;

import com.kinglead.entity.AppEntity;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author kinglead
 * @date 2020-12-23 上午 10:48
 * @describe {请写具体描述}
 */
public interface WeiXinService {

    @GetMapping("/getApp")
    AppEntity getApp();

}
