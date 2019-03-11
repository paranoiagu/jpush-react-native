package cn.jpush.reactnativejpush;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ExtraDataParser {
    public static Integer getBadgeChange(String extras) {
        Gson gson = new GsonBuilder().create();
        ExtDatas extDatas = gson.fromJson(extras, ExtDatas.class);

        if (extDatas != null) {
            ExtData extData = gson.fromJson(extDatas.getExtdata(), ExtData.class);
            if (extData != null) {
                return extData.getBadge();
            }
        }
        return 0;
    }
}
