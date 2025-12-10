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
    public final Context f42531a;

    public ManifestParser(Context context) {
        this.f42531a = context;
    }

    /* renamed from: b */
    public static GlideModule m50081b(String str) {
        try {
            Class<?> cls = Class.forName(str);
            Object obj = null;
            try {
                obj = cls.getDeclaredConstructor(null).newInstance(null);
            } catch (IllegalAccessException e) {
                m50080c(cls, e);
            } catch (InstantiationException e2) {
                m50080c(cls, e2);
            } catch (NoSuchMethodException e3) {
                m50080c(cls, e3);
            } catch (InvocationTargetException e4) {
                m50080c(cls, e4);
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
    public static void m50080c(Class cls, Exception exc) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, exc);
    }

    /* renamed from: a */
    public final ApplicationInfo m50082a() {
        return this.f42531a.getPackageManager().getApplicationInfo(this.f42531a.getPackageName(), 128);
    }

    public List<GlideModule> parse() {
        ApplicationInfo m50082a;
        Log.isLoggable("ManifestParser", 3);
        ArrayList arrayList = new ArrayList();
        try {
            m50082a = m50082a();
        } catch (PackageManager.NameNotFoundException unused) {
            Log.isLoggable("ManifestParser", 6);
        }
        if (m50082a != null && m50082a.metaData != null) {
            if (Log.isLoggable("ManifestParser", 2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Got app info metadata: ");
                sb.append(m50082a.metaData);
            }
            for (String str : m50082a.metaData.keySet()) {
                if ("GlideModule".equals(m50082a.metaData.get(str))) {
                    arrayList.add(m50081b(str));
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