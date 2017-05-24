package com.liangyu.mangoweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by liangyu on 17-5-23.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{

        @SerializedName("loc")
        public String updateTime;
    }
}
