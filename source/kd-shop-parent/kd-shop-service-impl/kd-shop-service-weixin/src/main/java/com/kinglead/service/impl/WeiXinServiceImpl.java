package com.kinglead.service.impl;

import com.kinglead.entity.AppEntity;
import com.kinglead.service.WeiXinService;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kinglead
 * @date 2020-12-23 上午 10:59
 * @describe {请写具体描述}
 */
@RestController
public class WeiXinServiceImpl implements WeiXinService {
    @Override
    public AppEntity getApp() {
        return new AppEntity("111","222");
    }
}
