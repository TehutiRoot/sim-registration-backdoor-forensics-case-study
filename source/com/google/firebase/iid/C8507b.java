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
public class C8507b {

    /* renamed from: a */
    public final SharedPreferences f55482a;

    /* renamed from: b */
    public final Context f55483b;

    /* renamed from: c */
    public final Map f55484c = new ArrayMap();

    /* renamed from: com.google.firebase.iid.b$a */
    /* loaded from: classes4.dex */
    public static class C8508a {

        /* renamed from: d */
        public static final long f55485d = TimeUnit.DAYS.toMillis(7);

        /* renamed from: a */
        public final String f55486a;

        /* renamed from: b */
        public final String f55487b;

        /* renamed from: c */
        public final long f55488c;

        public C8508a(String str, String str2, long j) {
            this.f55486a = str;
            this.f55487b = str2;
            this.f55488c = j;
        }

        /* renamed from: a */
        public static String m38664a(String str, String str2, long j) {
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
        public static String m38663b(C8508a c8508a) {
            if (c8508a == null) {
                return null;
            }
            return c8508a.f55486a;
        }

        /* renamed from: d */
        public static C8508a m38661d(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (str.startsWith("{")) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    return new C8508a(jSONObject.getString("token"), jSONObject.getString(RemoteConfigConstants.RequestFieldKey.APP_VERSION), jSONObject.getLong("timestamp"));
                } catch (JSONException e) {
                    String valueOf = String.valueOf(e);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 23);
                    sb.append("Failed to parse token: ");
                    sb.append(valueOf);
                    Log.w("FirebaseInstanceId", sb.toString());
                    return null;
                }
            }
            return new C8508a(str, null, 0L);
        }

        /* renamed from: c */
        public boolean m38662c(String str) {
            if (System.currentTimeMillis() <= this.f55488c + f55485d && str.equals(this.f55487b)) {
                return false;
            }
            return true;
        }
    }

    public C8507b(Context context) {
        this.f55483b = context;
        this.f55482a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        m38676a("com.google.android.gms.appid-no-backup");
    }

    /* renamed from: b */
    public static String m38675b(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 6);
        sb.append(str);
        sb.append("|S|cre");
        return sb.toString();
    }

    /* renamed from: a */
    public final void m38676a(String str) {
        File file = new File(ContextCompat.getNoBackupFilesDir(this.f55483b), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile() && !m38668i()) {
                m38673d();
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
    public final String m38674c(String str, String str2, String str3) {
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
    public synchronized void m38673d() {
        this.f55484c.clear();
        this.f55482a.edit().clear().commit();
    }

    /* renamed from: e */
    public synchronized void m38672e(String str, String str2, String str3) {
        String m38674c = m38674c(str, str2, str3);
        SharedPreferences.Editor edit = this.f55482a.edit();
        edit.remove(m38674c);
        edit.commit();
    }

    /* renamed from: f */
    public synchronized long m38671f(String str) {
        Long l = (Long) this.f55484c.get(str);
        if (l != null) {
            return l.longValue();
        }
        return m38670g(str);
    }

    /* renamed from: g */
    public final long m38670g(String str) {
        String string = this.f55482a.getString(m38675b(str, "cre"), null);
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
    public synchronized C8508a m38669h(String str, String str2, String str3) {
        return C8508a.m38661d(this.f55482a.getString(m38674c(str, str2, str3), null));
    }

    /* renamed from: i */
    public synchronized boolean m38668i() {
        return this.f55482a.getAll().isEmpty();
    }

    /* renamed from: j */
    public synchronized void m38667j(String str, String str2, String str3, String str4, String str5) {
        String m38664a = C8508a.m38664a(str4, str5, System.currentTimeMillis());
        if (m38664a == null) {
            return;
        }
        SharedPreferences.Editor edit = this.f55482a.edit();
        edit.putString(m38674c(str, str2, str3), m38664a);
        edit.commit();
    }

    /* renamed from: k */
    public synchronized long m38666k(String str) {
        long m38665l;
        m38665l = m38665l(str);
        this.f55484c.put(str, Long.valueOf(m38665l));
        return m38665l;
    }

    /* renamed from: l */
    public final long m38665l(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        if (!this.f55482a.contains(m38675b(str, "cre"))) {
            SharedPreferences.Editor edit = this.f55482a.edit();
            edit.putString(m38675b(str, "cre"), String.valueOf(currentTimeMillis));
            edit.commit();
            return currentTimeMillis;
        }
        return m38670g(str);
    }
}
