package com.londonappbrewery.bitcointicker;

import org.json.JSONException;
import org.json.JSONObject;

public class PriceDataModel {

    private String mPrice;

    public static PriceDataModel fromJson(JSONObject jsonObject) {
        try {
            PriceDataModel priceData = new PriceDataModel();


            double realPrice = jsonObject.getJSONObject("main").getDouble("price");
            int priceView = (int)realPrice;

            priceData.mPrice = Integer.toString(priceView);
            priceData.mPrice = jsonObject.getString("price");

            return priceData;

        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getPrice() {
        return mPrice;
    }
}