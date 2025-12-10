package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import androidx.collection.ArrayMap;
import androidx.core.content.ContextCompat;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.firebase.iid.b */
/* loaded from: classes4.dex */
public class C8496b {

    /* renamed from: a */
    public final SharedPreferences f55494a;

    /* renamed from: b */
    public final Context f55495b;

    /* renamed from: c */
    public final Map f55496c = new ArrayMap();

    /* renamed from: com.google.firebase.iid.b$a */
    /* loaded from: classes4.dex */
    public static class C8497a {

        /* renamed from: d */
        public static final long f55497d = TimeUnit.DAYS.toMillis(7);

        /* renamed from: a */
        public final String f55498a;

        /* renamed from: b */
        public final String f55499b;

        /* renamed from: c */
        public final long f55500c;

        public C8497a(String str, String str2, long j) {
            this.f55498a = str;
            this.f55499b = str2;
            this.f55500c = j;
        }

        /* renamed from: a */
        public static String m38656a(String str, String str2, long j) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str);
                jSONObject.put(RemoteConfigConstants.RequestFieldKey.APP_VERSION, str2);
                jSONObject.put("timestamp", j);
                return jSONObject.toString();
            } catch (JSONException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(valueOf.length() + 24);
                sb.append("Failed to encode token: ");
                sb.append(valueOf);
                Log.w("FirebaseInstanceId", sb.toString());
                return null;
            }
        }

        /* renamed from: b */
        public static String m38655b(C8497a c8497a) {
            if (c8497a == null) {
                return null;
            }
            return c8497a.f55498a;
        }

        /* renamed from: d */
        public static C8497a m38653d(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (str.startsWith("{")) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    return new C8497a(jSONObject.getString("token"), jSONObject.getString(RemoteConfigConstants.RequestFieldKey.APP_VERSION), jSONObject.getLong("timestamp"));
                } catch (JSONException e) {
                    String valueOf = String.valueOf(e);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 23);
                    sb.append("Failed to parse token: ");
                    sb.append(valueOf);
                    Log.w("FirebaseInstanceId", sb.toString());
                    return null;
                }
            }
            return new C8497a(str, null, 0L);
        }

        /* renamed from: c */
        public boolean m38654c(String str) {
            if (System.currentTimeMillis() <= this.f55500c + f55497d && str.equals(this.f55499b)) {
                return false;
            }
            return true;
        }
    }

    public C8496b(Context context) {
        this.f55495b = context;
        this.f55494a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        m38668a("com.google.android.gms.appid-no-backup");
    }

    /* renamed from: b */
    public static String m38667b(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 6);
        sb.append(str);
        sb.append("|S|cre");
        return sb.toString();
    }

    /* renamed from: a */
    public final void m38668a(String str) {
        File file = new File(ContextCompat.getNoBackupFilesDir(this.f55495b), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile() && !m38660i()) {
                m38665d();
            }
        } catch (IOException e) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(e.getMessage());
                if (valueOf.length() != 0) {
                    "Error creating file in no backup dir: ".concat(valueOf);
                }
            }
        }
    }

    /* renamed from: c */
    public final String m38666c(String str, String str2, String str3) {
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 4 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append("|T|");
        sb.append(str2);
        sb.append("|");
        sb.append(str3);
        return sb.toString();
    }

    /* renamed from: d */
    public synchronized void m38665d() {
        this.f55496c.clear();
        this.f55494a.edit().clear().commit();
    }

    /* renamed from: e */
    public synchronized void m38664e(String str, String str2, String str3) {
        String m38666c = m38666c(str, str2, str3);
        SharedPreferences.Editor edit = this.f55494a.edit();
        edit.remove(m38666c);
        edit.commit();
    }

    /* renamed from: f */
    public synchronized long m38663f(String str) {
        Long l = (Long) this.f55496c.get(str);
        if (l != null) {
            return l.longValue();
        }
        return m38662g(str);
    }

    /* renamed from: g */
    public final long m38662g(String str) {
        String string = this.f55494a.getString(m38667b(str, "cre"), null);
        if (string != null) {
            try {
                return Long.parseLong(string);
            } catch (NumberFormatException unused) {
                return 0L;
            }
        }
        return 0L;
    }

    /* renamed from: h */
    public synchronized C8497a m38661h(String str, String str2, String str3) {
        return C8497a.m38653d(this.f55494a.getString(m38666c(str, str2, str3), null));
    }

    /* renamed from: i */
    public synchronized boolean m38660i() {
        return this.f55494a.getAll().isEmpty();
    }

    /* renamed from: j */
    public synchronized void m38659j(String str, String str2, String str3, String str4, String str5) {
        String m38656a = C8497a.m38656a(str4, str5, System.currentTimeMillis());
        if (m38656a == null) {
            return;
        }
        SharedPreferences.Editor edit = this.f55494a.edit();
        edit.putString(m38666c(str, str2, str3), m38656a);
        edit.commit();
    }

    /* renamed from: k */
    public synchronized long m38658k(String str) {
        long m38657l;
        m38657l = m38657l(str);
        this.f55496c.put(str, Long.valueOf(m38657l));
        return m38657l;
    }

    /* renamed from: l */
    public final long m38657l(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        if (!this.f55494a.contains(m38667b(str, "cre"))) {
            SharedPreferences.Editor edit = this.f55494a.edit();
            edit.putString(m38667b(str, "cre"), String.valueOf(currentTimeMillis));
            edit.commit();
            return currentTimeMillis;
        }
        return m38662g(str);
    }
}