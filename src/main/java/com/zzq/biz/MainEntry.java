package com.zzq.biz;

import com.zzq.util.HttpClientUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangzhiqiang
 * @date 2018-08-28 8:56
 * &Desc 百果园自动刷分
 */
public class MainEntry {

    public static void main(String[] args) {
        HttpClientUtil httpClientUtil = new HttpClientUtil();
        String url = "https://x.pagoda.com.cn/h5/check_in.json";
        Map<String,String> para = new HashMap<String, String>();
        para.put("share_id","");
        String result = httpClientUtil.doPost(url,para,"utf-8");
        System.out.println("返回结果是=="+result);
    }
}
