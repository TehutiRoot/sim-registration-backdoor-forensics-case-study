package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.content.ContextCompat;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Marker;

/* renamed from: com.google.firebase.messaging.d */
/* loaded from: classes4.dex */
public class C8544d {

    /* renamed from: a */
    public final SharedPreferences f55693a;

    /* renamed from: com.google.firebase.messaging.d$a */
    /* loaded from: classes4.dex */
    public static class C8545a {

        /* renamed from: d */
        public static final long f55694d = TimeUnit.DAYS.toMillis(7);

        /* renamed from: a */
        public final String f55695a;

        /* renamed from: b */
        public final String f55696b;

        /* renamed from: c */
        public final long f55697c;

        public C8545a(String str, String str2, long j) {
            this.f55695a = str;
            this.f55696b = str2;
            this.f55697c = j;
        }

        /* renamed from: a */
        public static String m38417a(String str, String str2, long j) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str);
                jSONObject.put(RemoteConfigConstants.RequestFieldKey.APP_VERSION, str2);
                jSONObject.put("timestamp", j);
                return jSONObject.toString();
            } catch (JSONException e) {
                Log.w(Constants.TAG, "Failed to encode token: " + e);
                return null;
            }
        }

        /* renamed from: c */
        public static C8545a m38415c(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (str.startsWith("{")) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    return new C8545a(jSONObject.getString("token"), jSONObject.getString(RemoteConfigConstants.RequestFieldKey.APP_VERSION), jSONObject.getLong("timestamp"));
                } catch (JSONException e) {
                    Log.w(Constants.TAG, "Failed to parse token: " + e);
                    return null;
                }
            }
            return new C8545a(str, null, 0L);
        }

        /* renamed from: b */
        public boolean m38416b(String str) {
            if (System.currentTimeMillis() <= this.f55697c + f55694d && str.equals(this.f55696b)) {
                return false;
            }
            return true;
        }
    }

    public C8544d(Context context) {
        this.f55693a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        m38424a(context, "com.google.android.gms.appid-no-backup");
    }

    /* renamed from: a */
    public final void m38424a(Context context, String str) {
        File file = new File(ContextCompat.getNoBackupFilesDir(context), str);
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile() && !m38419f()) {
                m38422c();
            }
        } catch (IOException e) {
            if (Log.isLoggable(Constants.TAG, 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Error creating file in no backup dir: ");
                sb.append(e.getMessage());
            }
        }
    }

    /* renamed from: b */
    public final String m38423b(String str, String str2) {
        return str + "|T|" + str2 + "|" + Marker.ANY_MARKER;
    }

    /* renamed from: c */
    public synchronized void m38422c() {
        this.f55693a.edit().clear().commit();
    }

    /* renamed from: d */
    public synchronized void m38421d(String str, String str2) {
        String m38423b = m38423b(str, str2);
        SharedPreferences.Editor edit = this.f55693a.edit();
        edit.remove(m38423b);
        edit.commit();
    }

    /* renamed from: e */
    public synchronized C8545a m38420e(String str, String str2) {
        return C8545a.m38415c(this.f55693a.getString(m38423b(str, str2), null));
    }

    /* renamed from: f */
    public synchronized boolean m38419f() {
        return this.f55693a.getAll().isEmpty();
    }

    /* renamed from: g */
    public synchronized void m38418g(String str, String str2, String str3, String str4) {
        String m38417a = C8545a.m38417a(str3, str4, System.currentTimeMillis());
        if (m38417a == null) {
            return;
        }
        SharedPreferences.Editor edit = this.f55693a.edit();
        edit.putString(m38423b(str, str2), m38417a);
        edit.commit();
    }
}