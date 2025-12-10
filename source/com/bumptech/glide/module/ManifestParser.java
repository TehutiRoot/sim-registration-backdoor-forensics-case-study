package com.bumptech.glide.module;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

@Deprecated
/* loaded from: classes3.dex */
public final class ManifestParser {

    /* renamed from: a */
    public final Context f42519a;

    public ManifestParser(Context context) {
        this.f42519a = context;
    }

    /* renamed from: b */
    public static GlideModule m50084b(String str) {
        try {
            Class<?> cls = Class.forName(str);
            Object obj = null;
            try {
                obj = cls.getDeclaredConstructor(null).newInstance(null);
            } catch (IllegalAccessException e) {
                m50083c(cls, e);
            } catch (InstantiationException e2) {
                m50083c(cls, e2);
            } catch (NoSuchMethodException e3) {
                m50083c(cls, e3);
            } catch (InvocationTargetException e4) {
                m50083c(cls, e4);
            }
            if (obj instanceof GlideModule) {
                return (GlideModule) obj;
            }
            throw new RuntimeException("Expected instanceof GlideModule, but found: " + obj);
        } catch (ClassNotFoundException e5) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e5);
        }
    }

    /* renamed from: c */
    public static void m50083c(Class cls, Exception exc) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, exc);
    }

    /* renamed from: a */
    public final ApplicationInfo m50085a() {
        return this.f42519a.getPackageManager().getApplicationInfo(this.f42519a.getPackageName(), 128);
    }

    public List<GlideModule> parse() {
        ApplicationInfo m50085a;
        Log.isLoggable("ManifestParser", 3);
        ArrayList arrayList = new ArrayList();
        try {
            m50085a = m50085a();
        } catch (PackageManager.NameNotFoundException unused) {
            Log.isLoggable("ManifestParser", 6);
        }
        if (m50085a != null && m50085a.metaData != null) {
            if (Log.isLoggable("ManifestParser", 2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Got app info metadata: ");
                sb.append(m50085a.metaData);
            }
            for (String str : m50085a.metaData.keySet()) {
                if ("GlideModule".equals(m50085a.metaData.get(str))) {
                    arrayList.add(m50084b(str));
                    if (Log.isLoggable("ManifestParser", 3)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Loaded Glide module: ");
                        sb2.append(str);
                    }
                }
            }
            Log.isLoggable("ManifestParser", 3);
            return arrayList;
        }
        Log.isLoggable("ManifestParser", 3);
        return arrayList;
    }
}
