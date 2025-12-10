package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

@DynamiteApi
/* loaded from: classes3.dex */
public class FlagProviderImpl extends com.google.android.gms.flags.zzd {

    /* renamed from: a */
    public boolean f45404a = false;

    /* renamed from: b */
    public SharedPreferences f45405b;

    @Override // com.google.android.gms.flags.zzc
    public boolean getBooleanFlagValue(String str, boolean z, int i) {
        if (!this.f45404a) {
            return z;
        }
        return zzb.zza(this.f45405b, str, Boolean.valueOf(z)).booleanValue();
    }

    @Override // com.google.android.gms.flags.zzc
    public int getIntFlagValue(String str, int i, int i2) {
        if (!this.f45404a) {
            return i;
        }
        return zzd.zza(this.f45405b, str, Integer.valueOf(i)).intValue();
    }

    @Override // com.google.android.gms.flags.zzc
    public long getLongFlagValue(String str, long j, int i) {
        if (!this.f45404a) {
            return j;
        }
        return zzf.zza(this.f45405b, str, Long.valueOf(j)).longValue();
    }

    @Override // com.google.android.gms.flags.zzc
    public String getStringFlagValue(String str, String str2, int i) {
        if (!this.f45404a) {
            return str2;
        }
        return zzh.zza(this.f45405b, str, str2);
    }

    @Override // com.google.android.gms.flags.zzc
    public void init(IObjectWrapper iObjectWrapper) {
        String str;
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        if (this.f45404a) {
            return;
        }
        try {
            this.f45405b = zzj.zza(context.createPackageContext("com.google.android.gms", 0));
            this.f45404a = true;
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() != 0) {
                str = "Could not retrieve sdk flags, continuing with defaults: ".concat(valueOf);
            } else {
                str = new String("Could not retrieve sdk flags, continuing with defaults: ");
            }
            Log.w("FlagProviderImpl", str);
        }
    }
}