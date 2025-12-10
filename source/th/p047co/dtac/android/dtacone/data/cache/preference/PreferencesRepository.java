package th.p047co.dtac.android.dtacone.data.cache.preference;

import android.content.SharedPreferences;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
/* renamed from: th.co.dtac.android.dtacone.data.cache.preference.PreferencesRepository */
/* loaded from: classes7.dex */
public class PreferencesRepository {

    /* renamed from: a */
    public SharedPreferences f83426a;

    @Inject
    public PreferencesRepository(SharedPreferences sharedPreferences) {
        this.f83426a = sharedPreferences;
    }

    public boolean getBoolean(String str) {
        return this.f83426a.getBoolean(str, false);
    }

    public int getInt(String str) {
        return this.f83426a.getInt(str, 0);
    }

    public String getString(String str) {
        return getString(str, "");
    }

    public void remove(String str) {
        SharedPreferences.Editor edit = this.f83426a.edit();
        edit.remove(str);
        edit.apply();
    }

    public void setBoolean(String str, boolean z) {
        SharedPreferences.Editor edit = this.f83426a.edit();
        edit.putBoolean(str, z);
        edit.apply();
    }

    public void setInt(String str, int i) {
        SharedPreferences.Editor edit = this.f83426a.edit();
        edit.putInt(str, i);
        edit.apply();
    }

    public void setString(String str, String str2) {
        SharedPreferences.Editor edit = this.f83426a.edit();
        edit.putString(str, str2);
        edit.apply();
    }

    public String getString(String str, String str2) {
        return this.f83426a.getString(str, str2);
    }
}
