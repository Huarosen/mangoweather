package com.liangyu.mangoweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by liangyu on 17-5-23.
 */

public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    @SerializedName("drsg")
    public DressSuggestion dressSuggestion;

    @SerializedName("flu")
    public FluInfo fluInfo;

    @SerializedName("trav")
    public Travel travel;

    @SerializedName("uv")
    public UltraViolet ultraViolet;

    public Sport sport;


    public class Comfort{

        @SerializedName("txt")
        public String info;
    }

    public class CarWash{

        @SerializedName("txt")
        public String info;
    }

    public class DressSuggestion{

        @SerializedName("txt")
        public String info;
    }

    public class FluInfo{

        @SerializedName("txt")
        public String info;
    }

    public class Travel{

        @SerializedName("txt")
        public String info;
    }

    public class UltraViolet{

        @SerializedName("txt")
        public String info;
    }

    public class Sport{

        @SerializedName("txt")
        public String info;
    }
}
