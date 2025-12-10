package com.google.android.gms.analytics;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzax;
import com.google.android.gms.internal.gtm.zzbg;
import com.google.android.gms.internal.gtm.zzbt;
import com.google.android.gms.internal.gtm.zzbv;
import com.google.android.gms.internal.gtm.zzbx;
import com.google.android.gms.internal.gtm.zzbz;
import com.google.android.gms.internal.gtm.zzez;
import com.google.android.gms.internal.gtm.zzfu;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzb extends zzbt implements zzt {

    /* renamed from: d */
    public static DecimalFormat f44411d;

    /* renamed from: a */
    public final zzbx f44412a;

    /* renamed from: b */
    public final String f44413b;

    /* renamed from: c */
    public final Uri f44414c;

    public zzb(zzbx zzbxVar, String str) {
        super(zzbxVar);
        Preconditions.checkNotEmpty(str);
        this.f44412a = zzbxVar;
        this.f44413b = str;
        this.f44414c = m48737b(str);
    }

    /* renamed from: b */
    public static Uri m48737b(String str) {
        Preconditions.checkNotEmpty(str);
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("uri");
        builder.authority("google-analytics.com");
        builder.path(str);
        return builder.build();
    }

    /* renamed from: d */
    public static String m48736d(double d) {
        if (f44411d == null) {
            f44411d = new DecimalFormat("0.######");
        }
        return f44411d.format(d);
    }

    /* renamed from: g */
    public static void m48735g(Map map, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            map.put(str, str2);
        }
    }

    /* renamed from: i */
    public static void m48734i(Map map, String str, boolean z) {
        if (z) {
            map.put(str, "1");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
        if (android.text.TextUtils.isEmpty(r6) != false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x001e A[SYNTHETIC] */
    @androidx.annotation.VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Map zzd(com.google.android.gms.analytics.zzh r10) {
        /*
            Method dump skipped, instructions count: 823
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.analytics.zzb.zzd(com.google.android.gms.analytics.zzh):java.util.Map");
    }

    @Override // com.google.android.gms.analytics.zzt
    public final Uri zzb() {
        return this.f44414c;
    }

    @Override // com.google.android.gms.analytics.zzt
    public final void zze(zzh zzhVar) {
        Preconditions.checkNotNull(zzhVar);
        Preconditions.checkArgument(zzhVar.zzm(), "Can't deliver not submitted measurement");
        Preconditions.checkNotMainThread("deliver should be called on worker thread");
        zzh zzhVar2 = new zzh(zzhVar);
        zzbg zzbgVar = (zzbg) zzhVar2.zzb(zzbg.class);
        if (TextUtils.isEmpty(zzbgVar.zzf())) {
            zzz().zzc(zzd(zzhVar2), "Ignoring measurement without type");
        } else if (TextUtils.isEmpty(zzbgVar.zze())) {
            zzz().zzc(zzd(zzhVar2), "Ignoring measurement without client id");
        } else if (!this.f44412a.zzc().getAppOptOut()) {
            if (zzfu.zzj(0.0d, zzbgVar.zze())) {
                zzF("Sampling enabled. Hit sampled out. sampling rate", Double.valueOf(0.0d));
                return;
            }
            Map zzd = zzd(zzhVar2);
            zzd.put(OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "1");
            zzd.put("_v", zzbv.zzb);
            zzd.put("tid", this.f44413b);
            if (this.f44412a.zzc().isDryRunEnabled()) {
                StringBuilder sb = new StringBuilder();
                for (Map.Entry entry : zzd.entrySet()) {
                    if (sb.length() != 0) {
                        sb.append(", ");
                    }
                    sb.append((String) entry.getKey());
                    sb.append("=");
                    sb.append((String) entry.getValue());
                }
                zzM("Dry run is enabled. GoogleAnalytics would have sent", sb.toString());
                return;
            }
            HashMap hashMap = new HashMap();
            zzfu.zzg(hashMap, "uid", zzbgVar.zzg());
            zzax zzaxVar = (zzax) zzhVar.zzc(zzax.class);
            if (zzaxVar != null) {
                zzfu.zzg(hashMap, "an", zzaxVar.zzf());
                zzfu.zzg(hashMap, "aid", zzaxVar.zzd());
                zzfu.zzg(hashMap, "av", zzaxVar.zzg());
                zzfu.zzg(hashMap, "aiid", zzaxVar.zze());
            }
            zzd.put("_s", String.valueOf(zzs().zza(new zzbz(0L, zzbgVar.zze(), this.f44413b, !TextUtils.isEmpty(zzbgVar.zzd()), 0L, hashMap))));
            zzs().zzh(new zzez(zzz(), zzd, zzhVar.zza(), true));
        }
    }
}