package com.kangning.utils;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.kangning.common.constants.URLConstant.URL_GET_TOKKEN;


/**
 * 获取access_token工具类
 */
public class AccessTokenUtil {
    private static final Logger bizLogger = LoggerFactory.getLogger(AccessTokenUtil.class);

//    public static String getToken() throws RuntimeException {
//        try {
//            DefaultDingTalkClient client = new DefaultDingTalkClient(URL_GET_TOKKEN);
//            OapiGettokenRequest request = new OapiGettokenRequest();
//
//            request.setAppkey(DingDingEConstants.APP_KEY);
//            request.setAppsecret(DingDingEConstants.APP_SECRET);
//            request.setHttpMethod("GET");
//            OapiGettokenResponse response = client.execute(request);
//            String accessToken = response.getAccessToken();
//            return accessToken;
//        } catch (ApiException e) {
//            bizLogger.error("getAccessToken failed", e);
//            throw new RuntimeException();
//        }
//    }

//    public static void main(String[] args)throws ApiException{
//        String accessToken = AccessTokenUtil.getToken();
//        System.out.println(accessToken);
//    }
}
