package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.internal.flags.zze;

/* loaded from: classes3.dex */
public final class zzj {

    /* renamed from: a */
    public static SharedPreferences f45394a;

    public static SharedPreferences zza(Context context) throws Exception {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            try {
                if (f45394a == null) {
                    f45394a = (SharedPreferences) zze.zza(new EB2(context));
                }
                sharedPreferences = f45394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sharedPreferences;
    }
}
