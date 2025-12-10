package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.util.BiConsumer;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigValue;
import com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONException;

/* loaded from: classes4.dex */
public class ConfigGetParameterHandler {
    @VisibleForTesting(otherwise = 3)
    public static final Charset FRC_BYTE_ARRAY_ENCODING = Charset.forName("UTF-8");

    /* renamed from: e */
    public static final Pattern f56400e = Pattern.compile("^(1|true|t|yes|y|on)$", 2);

    /* renamed from: f */
    public static final Pattern f56401f = Pattern.compile("^(0|false|f|no|n|off|)$", 2);

    /* renamed from: a */
    public final Set f56402a = new HashSet();

    /* renamed from: b */
    public final Executor f56403b;

    /* renamed from: c */
    public final ConfigCacheClient f56404c;

    /* renamed from: d */
    public final ConfigCacheClient f56405d;

    public ConfigGetParameterHandler(Executor executor, ConfigCacheClient configCacheClient, ConfigCacheClient configCacheClient2) {
        this.f56403b = executor;
        this.f56404c = configCacheClient;
        this.f56405d = configCacheClient2;
    }

    /* renamed from: a */
    public static /* synthetic */ void m37716a(BiConsumer biConsumer, String str, ConfigContainer configContainer) {
        biConsumer.accept(str, configContainer);
    }

    /* renamed from: c */
    public static ConfigContainer m37714c(ConfigCacheClient configCacheClient) {
        return configCacheClient.getBlocking();
    }

    /* renamed from: d */
    public static Double m37713d(ConfigCacheClient configCacheClient, String str) {
        ConfigContainer m37714c = m37714c(configCacheClient);
        if (m37714c == null) {
            return null;
        }
        try {
            return Double.valueOf(m37714c.getConfigs().getDouble(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static Set m37712e(ConfigCacheClient configCacheClient) {
        HashSet hashSet = new HashSet();
        ConfigContainer m37714c = m37714c(configCacheClient);
        if (m37714c == null) {
            return hashSet;
        }
        Iterator<String> keys = m37714c.getConfigs().keys();
        while (keys.hasNext()) {
            hashSet.add(keys.next());
        }
        return hashSet;
    }

    /* renamed from: f */
    public static TreeSet m37711f(String str, ConfigContainer configContainer) {
        TreeSet treeSet = new TreeSet();
        Iterator<String> keys = configContainer.getConfigs().keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (next.startsWith(str)) {
                treeSet.add(next);
            }
        }
        return treeSet;
    }

    /* renamed from: g */
    public static Long m37710g(ConfigCacheClient configCacheClient, String str) {
        ConfigContainer m37714c = m37714c(configCacheClient);
        if (m37714c == null) {
            return null;
        }
        try {
            return Long.valueOf(m37714c.getConfigs().getLong(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: h */
    public static String m37709h(ConfigCacheClient configCacheClient, String str) {
        ConfigContainer m37714c = m37714c(configCacheClient);
        if (m37714c == null) {
            return null;
        }
        try {
            return m37714c.getConfigs().getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: j */
    public static void m37707j(String str, String str2) {
        Log.w(FirebaseRemoteConfig.TAG, String.format("No value of type '%s' exists for parameter key '%s'.", str2, str));
    }

    public void addListener(BiConsumer<String, ConfigContainer> biConsumer) {
        synchronized (this.f56402a) {
            this.f56402a.add(biConsumer);
        }
    }

    /* renamed from: b */
    public final void m37715b(final String str, final ConfigContainer configContainer) {
        if (configContainer == null) {
            return;
        }
        synchronized (this.f56402a) {
            try {
                for (final BiConsumer biConsumer : this.f56402a) {
                    this.f56403b.execute(new Runnable() { // from class: uw
                        @Override // java.lang.Runnable
                        public final void run() {
                            ConfigGetParameterHandler.m37716a(biConsumer, str, configContainer);
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public Map<String, FirebaseRemoteConfigValue> getAll() {
        HashSet<String> hashSet = new HashSet();
        hashSet.addAll(m37712e(this.f56404c));
        hashSet.addAll(m37712e(this.f56405d));
        HashMap hashMap = new HashMap();
        for (String str : hashSet) {
            hashMap.put(str, getValue(str));
        }
        return hashMap;
    }

    public boolean getBoolean(String str) {
        String m37709h = m37709h(this.f56404c, str);
        if (m37709h != null) {
            if (f56400e.matcher(m37709h).matches()) {
                m37715b(str, m37714c(this.f56404c));
                return true;
            } else if (f56401f.matcher(m37709h).matches()) {
                m37715b(str, m37714c(this.f56404c));
                return false;
            }
        }
        String m37709h2 = m37709h(this.f56405d, str);
        if (m37709h2 != null) {
            if (f56400e.matcher(m37709h2).matches()) {
                return true;
            }
            if (f56401f.matcher(m37709h2).matches()) {
                return false;
            }
        }
        m37707j(str, "Boolean");
        return false;
    }

    public byte[] getByteArray(String str) {
        String m37709h = m37709h(this.f56404c, str);
        if (m37709h != null) {
            m37715b(str, m37714c(this.f56404c));
            return m37709h.getBytes(FRC_BYTE_ARRAY_ENCODING);
        }
        String m37709h2 = m37709h(this.f56405d, str);
        if (m37709h2 != null) {
            return m37709h2.getBytes(FRC_BYTE_ARRAY_ENCODING);
        }
        m37707j(str, "ByteArray");
        return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_BYTE_ARRAY;
    }

    public double getDouble(String str) {
        Double m37713d = m37713d(this.f56404c, str);
        if (m37713d != null) {
            m37715b(str, m37714c(this.f56404c));
            return m37713d.doubleValue();
        }
        Double m37713d2 = m37713d(this.f56405d, str);
        if (m37713d2 != null) {
            return m37713d2.doubleValue();
        }
        m37707j(str, PDLayoutAttributeObject.BORDER_STYLE_DOUBLE);
        return 0.0d;
    }

    public Set<String> getKeysByPrefix(String str) {
        if (str == null) {
            str = "";
        }
        TreeSet treeSet = new TreeSet();
        ConfigContainer m37714c = m37714c(this.f56404c);
        if (m37714c != null) {
            treeSet.addAll(m37711f(str, m37714c));
        }
        ConfigContainer m37714c2 = m37714c(this.f56405d);
        if (m37714c2 != null) {
            treeSet.addAll(m37711f(str, m37714c2));
        }
        return treeSet;
    }

    public long getLong(String str) {
        Long m37710g = m37710g(this.f56404c, str);
        if (m37710g != null) {
            m37715b(str, m37714c(this.f56404c));
            return m37710g.longValue();
        }
        Long m37710g2 = m37710g(this.f56405d, str);
        if (m37710g2 != null) {
            return m37710g2.longValue();
        }
        m37707j(str, "Long");
        return 0L;
    }

    public String getString(String str) {
        String m37709h = m37709h(this.f56404c, str);
        if (m37709h != null) {
            m37715b(str, m37714c(this.f56404c));
            return m37709h;
        }
        String m37709h2 = m37709h(this.f56405d, str);
        if (m37709h2 != null) {
            return m37709h2;
        }
        m37707j(str, "String");
        return "";
    }

    public FirebaseRemoteConfigValue getValue(String str) {
        String m37709h = m37709h(this.f56404c, str);
        if (m37709h != null) {
            m37715b(str, m37714c(this.f56404c));
            return new FirebaseRemoteConfigValueImpl(m37709h, 2);
        }
        String m37709h2 = m37709h(this.f56405d, str);
        if (m37709h2 != null) {
            return new FirebaseRemoteConfigValueImpl(m37709h2, 1);
        }
        m37707j(str, "FirebaseRemoteConfigValue");
        return new FirebaseRemoteConfigValueImpl("", 0);
    }
}
