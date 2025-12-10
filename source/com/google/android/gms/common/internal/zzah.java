package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.wrappers.Wrappers;

/* loaded from: classes3.dex */
public final class zzah {

    /* renamed from: a */
    public static final Object f45171a = new Object();

    /* renamed from: b */
    public static boolean f45172b;

    /* renamed from: c */
    public static String f45173c;

    /* renamed from: d */
    public static int f45174d;

    /* renamed from: a */
    public static void m48381a(Context context) {
        Bundle bundle;
        synchronized (f45171a) {
            try {
                if (f45172b) {
                    return;
                }
                f45172b = true;
                try {
                    bundle = Wrappers.packageManager(context).getApplicationInfo(context.getPackageName(), 128).metaData;
                } catch (PackageManager.NameNotFoundException unused) {
                }
                if (bundle == null) {
                    return;
                }
                f45173c = bundle.getString("com.google.app.id");
                f45174d = bundle.getInt("com.google.android.gms.version");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static int zza(Context context) {
        m48381a(context);
        return f45174d;
    }

    @Nullable
    public static String zzb(Context context) {
        m48381a(context);
        return f45173c;
    }
}
