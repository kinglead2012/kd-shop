package com.kinglead.member.service;

import com.kinglead.entity.weixin.AppEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author kinglead
 * @date 2020-12-23 上午 11:21
 * @describe {请写具体描述}
 */
@Api(tags = "会员服务接口")
public interface MemberService {

    @ApiOperation("获取微信APP信息")
    @GetMapping("/memberToWeixin")
    AppEntity memberToWeixin();

}
