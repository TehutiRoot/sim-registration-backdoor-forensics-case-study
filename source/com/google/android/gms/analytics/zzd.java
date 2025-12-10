package com.google.android.gms.analytics;

import androidx.annotation.VisibleForTesting;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.gtm.zzfc;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;

@VisibleForTesting
/* loaded from: classes3.dex */
public final class zzd {
    /* renamed from: a */
    public static String m48736a(String str, int i) {
        if (i <= 0) {
            zzfc.zzb("index out of range for prefix", str);
            return "";
        }
        return str + i;
    }

    public static String zza(int i) {
        return m48736a("&cd", i);
    }

    public static String zzb(int i) {
        return m48736a("cd", i);
    }

    public static String zzc(int i) {
        return m48736a("cd", i);
    }

    public static String zzd(int i) {
        return m48736a("&cm", i);
    }

    public static String zze(int i) {
        return m48736a(OperatorName.CONCAT, i);
    }

    public static String zzf(int i) {
        return m48736a(OperatorName.CONCAT, i);
    }

    public static String zzg(int i) {
        return m48736a("&il", i);
    }

    public static String zzh(int i) {
        return m48736a("il", i);
    }

    public static String zzi(int i) {
        return m48736a("pi", i);
    }

    public static String zzj(int i) {
        return m48736a("&pr", i);
    }

    public static String zzk(int i) {
        return m48736a("pr", i);
    }

    public static String zzl(int i) {
        return m48736a("&promo", i);
    }

    public static String zzm(int i) {
        return m48736a(NotificationCompat.CATEGORY_PROMO, i);
    }
}
