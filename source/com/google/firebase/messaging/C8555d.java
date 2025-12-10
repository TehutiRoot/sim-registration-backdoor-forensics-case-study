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
public class C8555d {

    /* renamed from: a */
    public final SharedPreferences f55681a;

    /* renamed from: com.google.firebase.messaging.d$a */
    /* loaded from: classes4.dex */
    public static class C8556a {

        /* renamed from: d */
        public static final long f55682d = TimeUnit.DAYS.toMillis(7);

        /* renamed from: a */
        public final String f55683a;

        /* renamed from: b */
        public final String f55684b;

        /* renamed from: c */
        public final long f55685c;

        public C8556a(String str, String str2, long j) {
            this.f55683a = str;
            this.f55684b = str2;
            this.f55685c = j;
        }

        /* renamed from: a */
        public static String m38425a(String str, String str2, long j) {
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
        public static C8556a m38423c(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (str.startsWith("{")) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    return new C8556a(jSONObject.getString("token"), jSONObject.getString(RemoteConfigConstants.RequestFieldKey.APP_VERSION), jSONObject.getLong("timestamp"));
                } catch (JSONException e) {
                    Log.w(Constants.TAG, "Failed to parse token: " + e);
                    return null;
                }
            }
            return new C8556a(str, null, 0L);
        }

        /* renamed from: b */
        public boolean m38424b(String str) {
            if (System.currentTimeMillis() <= this.f55685c + f55682d && str.equals(this.f55684b)) {
                return false;
            }
            return true;
        }
    }

    public C8555d(Context context) {
        this.f55681a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        m38432a(context, "com.google.android.gms.appid-no-backup");
    }

    /* renamed from: a */
    public final void m38432a(Context context, String str) {
        File file = new File(ContextCompat.getNoBackupFilesDir(context), str);
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile() && !m38427f()) {
                m38430c();
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
    public final String m38431b(String str, String str2) {
        return str + "|T|" + str2 + "|" + Marker.ANY_MARKER;
    }

    /* renamed from: c */
    public synchronized void m38430c() {
        this.f55681a.edit().clear().commit();
    }

    /* renamed from: d */
    public synchronized void m38429d(String str, String str2) {
        String m38431b = m38431b(str, str2);
        SharedPreferences.Editor edit = this.f55681a.edit();
        edit.remove(m38431b);
        edit.commit();
    }

    /* renamed from: e */
    public synchronized C8556a m38428e(String str, String str2) {
        return C8556a.m38423c(this.f55681a.getString(m38431b(str, str2), null));
    }

    /* renamed from: f */
    public synchronized boolean m38427f() {
        return this.f55681a.getAll().isEmpty();
    }

    /* renamed from: g */
    public synchronized void m38426g(String str, String str2, String str3, String str4) {
        String m38425a = C8556a.m38425a(str3, str4, System.currentTimeMillis());
        if (m38425a == null) {
            return;
        }
        SharedPreferences.Editor edit = this.f55681a.edit();
        edit.putString(m38431b(str, str2), m38425a);
        edit.commit();
    }
}
