package io.github.akycode.myapp;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class AppDataLab {

    private static AppDataLab sAppDataLab;

    private List<DataItem> mDataItems;

    public static AppDataLab get(Context context) {
        if (sAppDataLab == null){
            sAppDataLab = new AppDataLab(context);
        }
        return sAppDataLab;
    }

    private AppDataLab(Context context){
        mDataItems = new ArrayList<>();
    }


}
