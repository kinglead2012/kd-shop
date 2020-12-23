package com.kinglead.member.service.impl;

import com.kinglead.entity.weixin.AppEntity;
import com.kinglead.member.feign.WeiXinServiceFeign;
import com.kinglead.member.service.MemberService;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author kinglead
 * @date 2020-12-23 上午 11:24
 * @describe {请写具体描述}
 */
@RestController
public class MemberServiceImpl implements MemberService {

    @Resource
    private WeiXinServiceFeign weiXinServiceFeign;

    @Override
    public AppEntity memberToWeixin() {
        return weiXinServiceFeign.getApp();
    }
}
