package com.mayanugrahsyafira202102344.forex;

import android.provider.Telephony;

import com.google.gson.annotations.SerializedName;

public class RootModel
{
    @SerializedName("rates")
    private RatesModel ratesModel;

    public RootModel() {}

    public RatesModel getRatesModel(){ return ratesModel; }

    public void setRatesModel(RatesModel ratesModel) { this.ratesModel = ratesModel;}
}
