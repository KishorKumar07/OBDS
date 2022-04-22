package com.example.obds.Common;

import com.example.obds.Remote.APIservice;
import com.example.obds.Remote.FCMretrofitClient;

public class Common {


    public static final String BaseUrl="https://fcm.googleapis.com/";




    public static APIservice getFCMClient(){
        return FCMretrofitClient.getClint(BaseUrl).create(APIservice.class);
    }

}
