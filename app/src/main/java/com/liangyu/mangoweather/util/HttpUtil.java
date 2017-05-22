package com.liangyu.mangoweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by liangyu on 17-5-22.
 */

public class HttpUtil {

    public static void sendHttpRequest(String address, okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
