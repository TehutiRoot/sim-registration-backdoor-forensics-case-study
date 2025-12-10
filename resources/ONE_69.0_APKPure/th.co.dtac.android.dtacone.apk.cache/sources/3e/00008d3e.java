package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.internal.flags.zze;

/* loaded from: classes3.dex */
public final class zzj {

    /* renamed from: a */
    public static SharedPreferences f45406a;

    public static SharedPreferences zza(Context context) throws Exception {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            try {
                if (f45406a == null) {
                    f45406a = (SharedPreferences) zze.zza(new BC2(context));
                }
                sharedPreferences = f45406a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sharedPreferences;
    }
}