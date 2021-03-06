package com.rangon.en_mmgeologydictionary.data.cache;

import android.content.Context;

import com.rangon.en_mmgeologydictionary.data.sharedPref.MySharedPref;

/**
 * Created by winhtaikaung on 19/9/17.
 */

public class AppDataCacheImpl implements AppDataCache {

    private final String IS_CACHED = "IS_CACHED";
    private final String IS_UNICODE = "IS_UNICODE";

    private Context mContext;

    public AppDataCacheImpl(Context context) {
        this.mContext = context;
    }

    @Override
    public boolean isCached() {
        return MySharedPref.getInstance(mContext).getBooleanPreference(IS_CACHED, false);

    }

    @Override
    public void setCached() {
        MySharedPref.getInstance(mContext).setBooleanPreference(IS_CACHED, true);
    }

    @Override
    public boolean isUnicode() {
        return MySharedPref.getInstance(mContext).getBooleanPreference(IS_UNICODE, false);
    }

    @Override
    public void setUnicode(boolean isUniOrZawgyi) {
        MySharedPref.getInstance(mContext).setBooleanPreference(IS_UNICODE, isUniOrZawgyi);
    }

}
