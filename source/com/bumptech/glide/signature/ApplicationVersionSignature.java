package com.bumptech.glide.signature;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.Key;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes3.dex */
public final class ApplicationVersionSignature {

    /* renamed from: a */
    public static final ConcurrentMap f42702a = new ConcurrentHashMap();

    /* renamed from: a */
    public static PackageInfo m49993a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot resolve info for");
            sb.append(context.getPackageName());
            return null;
        }
    }

    /* renamed from: b */
    public static String m49992b(PackageInfo packageInfo) {
        if (packageInfo != null) {
            return String.valueOf(packageInfo.versionCode);
        }
        return UUID.randomUUID().toString();
    }

    /* renamed from: c */
    public static Key m49991c(Context context) {
        return new ObjectKey(m49992b(m49993a(context)));
    }

    @NonNull
    public static Key obtain(@NonNull Context context) {
        String packageName = context.getPackageName();
        ConcurrentMap concurrentMap = f42702a;
        Key key = (Key) concurrentMap.get(packageName);
        if (key == null) {
            Key m49991c = m49991c(context);
            Key key2 = (Key) concurrentMap.putIfAbsent(packageName, m49991c);
            if (key2 != null) {
                return key2;
            }
            return m49991c;
        }
        return key;
    }
}
