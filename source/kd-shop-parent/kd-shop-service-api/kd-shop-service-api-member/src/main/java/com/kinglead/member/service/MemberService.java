package com.kinglead.member.service;

import com.kinglead.entity.weixin.AppEntity;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author kinglead
 * @date 2020-12-23 上午 11:21
 * @describe {请写具体描述}
 */
public interface MemberService {

    @GetMapping("/memberToWeixin")
    AppEntity memberToWeixin();

}
