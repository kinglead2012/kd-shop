package com.kinglead.entity.weixin;

import lombok.Data;

/**
 * @author kinglead
 * @date 2020-12-23 上午 10:45
 * @describe {请写具体描述}
 */
@Data
public class AppEntity {

    private String appId;

    private String appName;

    public AppEntity(String appId, String appName) {
        this.appId = appId;
        this.appName = appName;
    }
}

