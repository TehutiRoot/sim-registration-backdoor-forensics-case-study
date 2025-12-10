package com.google.android.gms.measurement.internal;

import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzju extends RC2 {

    /* renamed from: b */
    public final Map f48440b;
    public final zzez zza;
    public final zzez zzb;
    public final zzez zzc;
    public final zzez zzd;
    public final zzez zze;

    public zzju(zzkz zzkzVar) {
        super(zzkzVar);
        this.f48440b = new HashMap();
        En2 zzm = this.zzs.zzm();
        zzm.getClass();
        this.zza = new zzez(zzm, "last_delete_stale", 0L);
        En2 zzm2 = this.zzs.zzm();
        zzm2.getClass();
        this.zzb = new zzez(zzm2, "backoff", 0L);
        En2 zzm3 = this.zzs.zzm();
        zzm3.getClass();
        this.zzc = new zzez(zzm3, "last_upload", 0L);
        En2 zzm4 = this.zzs.zzm();
        zzm4.getClass();
        this.zzd = new zzez(zzm4, "last_upload_attempt", 0L);
        En2 zzm5 = this.zzs.zzm();
        zzm5.getClass();
        this.zze = new zzez(zzm5, "midnight_offset", 0L);
    }

    /* renamed from: b */
    public final Pair m46219b(String str) {
        YA2 ya2;
        AdvertisingIdClient.Info advertisingIdInfo;
        zzg();
        long elapsedRealtime = this.zzs.zzav().elapsedRealtime();
        YA2 ya22 = (YA2) this.f48440b.get(str);
        if (ya22 != null && elapsedRealtime < ya22.f7701c) {
            return new Pair(ya22.f7699a, Boolean.valueOf(ya22.f7700b));
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        long zzi = elapsedRealtime + this.zzs.zzf().zzi(str, zzeb.zza);
        try {
            advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.zzs.zzau());
        } catch (Exception e) {
            this.zzs.zzay().zzc().zzb("Unable to get advertising id", e);
            ya2 = new YA2("", false, zzi);
        }
        if (advertisingIdInfo == null) {
            return new Pair("", Boolean.FALSE);
        }
        String id2 = advertisingIdInfo.getId();
        if (id2 != null) {
            ya2 = new YA2(id2, advertisingIdInfo.isLimitAdTrackingEnabled(), zzi);
        } else {
            ya2 = new YA2("", advertisingIdInfo.isLimitAdTrackingEnabled(), zzi);
        }
        this.f48440b.put(str, ya2);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair(ya2.f7699a, Boolean.valueOf(ya2.f7700b));
    }

    /* renamed from: c */
    public final Pair m46218c(String str, zzai zzaiVar) {
        if (zzaiVar.zzi(zzah.AD_STORAGE)) {
            return m46219b(str);
        }
        return new Pair("", Boolean.FALSE);
    }

    /* renamed from: d */
    public final String m46217d(String str, boolean z) {
        String str2;
        zzg();
        if (z) {
            str2 = (String) m46219b(str).first;
        } else {
            str2 = "00000000-0000-0000-0000-000000000000";
        }
        MessageDigest m46107e = zzlh.m46107e();
        if (m46107e == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, m46107e.digest(str2.getBytes())));
    }

    @Override // p000.RC2
    public final boolean zzb() {
        return false;
    }
}
