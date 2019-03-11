package cn.jpush.reactnativejpush;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/***
* Description: SharedPreferences 工具类
* Creator: 向奎 ahxiangkui@163.com
* Date: 16/3/16 下午10:16
*/
public class PreferenceUtil {

    private SharedPreferences preferences;

    public PreferenceUtil(Context context) {
        this.preferences = PreferenceManager.getDefaultSharedPreferences(context);
    }

    public boolean getSettingParam(String key, boolean defValue)
    {
        return preferences.getBoolean(key ,defValue);
    }

    public String getSettingParam(String key, String defValue)
    {
        return preferences.getString(key ,defValue);
    }

    public float getSettingParam(String key, float defValue)
    {
        return preferences.getFloat(key ,defValue);
    }

    public int getSettingParam(String key, int defValue)
    {
        return preferences.getInt(key ,defValue);
    }

    public long getSettingParam(String key, long defValue)
    {
        return preferences.getLong(key ,defValue);
    }

    public boolean setSettingParam(String key, boolean value)
    {
        preferences.edit().putBoolean(key, value).commit();
        return false;
    }

    public boolean setSettingParam(String key, String value)
    {
        preferences.edit().putString(key, value).commit();
        return false;
    }

    public boolean setSettingParam(String key, int value)
    {
        preferences.edit().putInt(key, value).commit();
        return false;
    }

    public boolean setSettingParam(String key, float value)
    {
        preferences.edit().putFloat(key, value).commit();
        return false;
    }

    public boolean setSettingParam(String key, long value)
    {
        preferences.edit().putLong(key, value).commit();
        return false;
    }

    public boolean removeParam(String key)
    {
        preferences.edit().remove(key).commit();
        return false;
    }

}
