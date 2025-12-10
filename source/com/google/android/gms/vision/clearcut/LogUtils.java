package com.google.android.gms.vision.clearcut;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.vision.zzfi;
import com.google.android.gms.internal.vision.zzjb;
import com.google.android.gms.internal.vision.zzs;
import com.google.android.gms.vision.C6779L;
import java.util.ArrayList;
import java.util.List;

@Keep
/* loaded from: classes4.dex */
public class LogUtils {
    public static zzfi.zzo zza(long j, int i, @Nullable String str, String str2, @Nullable List<zzfi.zzn> list, zzs zzsVar) {
        zzfi.zzi.zza zza = zzfi.zzi.zza();
        zzfi.zzf.zzb zzb = zzfi.zzf.zza().zza(str2).zza(j).zzb(i);
        zzb.zza(list);
        ArrayList arrayList = new ArrayList();
        arrayList.add((zzfi.zzf) ((zzjb) zzb.zzf()));
        return (zzfi.zzo) ((zzjb) zzfi.zzo.zza().zza((zzfi.zzi) ((zzjb) zza.zza(arrayList).zza((zzfi.zzj) ((zzjb) zzfi.zzj.zza().zzb(zzsVar.zzb).zza(zzsVar.zza).zzc(zzsVar.zzc).zzd(zzsVar.zzd).zzf())).zzf())).zzf());
    }

    @Nullable
    private static String zzb(Context context) {
        try {
            return Wrappers.packageManager(context).getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            C6779L.m46008e(e, "Unable to find calling package info for %s", context.getPackageName());
            return null;
        }
    }

    public static zzfi.zza zza(Context context) {
        zzfi.zza.C17260zza zza = zzfi.zza.zza().zza(context.getPackageName());
        String zzb = zzb(context);
        if (zzb != null) {
            zza.zzb(zzb);
        }
        return (zzfi.zza) ((zzjb) zza.zzf());
    }
}
