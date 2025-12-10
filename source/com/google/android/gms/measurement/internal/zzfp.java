package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import androidx.collection.LruCache;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zzfd;
import com.google.android.gms.internal.measurement.zzfe;
import com.google.android.gms.internal.measurement.zzgs;
import com.google.android.gms.internal.measurement.zzn;
import com.google.android.gms.internal.measurement.zzow;
import com.google.android.gms.internal.measurement.zzu;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class zzfp extends RC2 implements InterfaceC17266Ab2 {

    /* renamed from: b */
    public final Map f48342b;

    /* renamed from: c */
    public final Map f48343c;

    /* renamed from: d */
    public final Map f48344d;

    /* renamed from: e */
    public final Map f48345e;

    /* renamed from: f */
    public final Map f48346f;

    /* renamed from: g */
    public final Map f48347g;

    /* renamed from: h */
    public final LruCache f48348h;

    /* renamed from: i */
    public final com.google.android.gms.internal.measurement.zzr f48349i;

    /* renamed from: j */
    public final Map f48350j;

    /* renamed from: k */
    public final Map f48351k;

    /* renamed from: l */
    public final Map f48352l;

    public zzfp(zzkz zzkzVar) {
        super(zzkzVar);
        this.f48342b = new ArrayMap();
        this.f48343c = new ArrayMap();
        this.f48344d = new ArrayMap();
        this.f48345e = new ArrayMap();
        this.f48346f = new ArrayMap();
        this.f48350j = new ArrayMap();
        this.f48351k = new ArrayMap();
        this.f48352l = new ArrayMap();
        this.f48347g = new ArrayMap();
        this.f48348h = new Go2(this, 20);
        this.f48349i = new C6726e(this);
    }

    /* renamed from: f */
    public static final Map m46305f(zzfe zzfeVar) {
        ArrayMap arrayMap = new ArrayMap();
        if (zzfeVar != null) {
            for (com.google.android.gms.internal.measurement.zzfi zzfiVar : zzfeVar.zzn()) {
                arrayMap.put(zzfiVar.zzb(), zzfiVar.zzc());
            }
        }
        return arrayMap;
    }

    /* renamed from: h */
    public static /* bridge */ /* synthetic */ zzc m46303h(zzfp zzfpVar, String str) {
        zzfpVar.zzW();
        Preconditions.checkNotEmpty(str);
        if (!zzfpVar.zzo(str)) {
            return null;
        }
        if (zzfpVar.f48346f.containsKey(str) && zzfpVar.f48346f.get(str) != null) {
            zzfpVar.m46306e(str, (zzfe) zzfpVar.f48346f.get(str));
        } else {
            zzfpVar.m46307d(str);
        }
        return (zzc) zzfpVar.f48348h.snapshot().get(str);
    }

    /* renamed from: b */
    public final zzfe m46309b(String str, byte[] bArr) {
        Long l;
        if (bArr == null) {
            return zzfe.zzg();
        }
        try {
            zzfe zzfeVar = (zzfe) ((zzfd) zzlb.m46139r(zzfe.zze(), bArr)).zzaE();
            zzem zzj = this.zzs.zzay().zzj();
            String str2 = null;
            if (zzfeVar.zzs()) {
                l = Long.valueOf(zzfeVar.zzc());
            } else {
                l = null;
            }
            if (zzfeVar.zzr()) {
                str2 = zzfeVar.zzh();
            }
            zzj.zzc("Parsed config. version, gmp_app_id", l, str2);
            return zzfeVar;
        } catch (com.google.android.gms.internal.measurement.zzko e) {
            this.zzs.zzay().zzk().zzc("Unable to merge remote config. appId", zzeo.zzn(str), e);
            return zzfe.zzg();
        } catch (RuntimeException e2) {
            this.zzs.zzay().zzk().zzc("Unable to merge remote config. appId", zzeo.zzn(str), e2);
            return zzfe.zzg();
        }
    }

    /* renamed from: c */
    public final void m46308c(String str, zzfd zzfdVar) {
        HashSet hashSet = new HashSet();
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = new ArrayMap();
        ArrayMap arrayMap3 = new ArrayMap();
        if (zzfdVar != null) {
            zzow.zzc();
            if (this.zzs.zzf().zzs(null, zzeb.zzal)) {
                for (com.google.android.gms.internal.measurement.zzfa zzfaVar : zzfdVar.zzg()) {
                    hashSet.add(zzfaVar.zzb());
                }
            }
            for (int i = 0; i < zzfdVar.zza(); i++) {
                com.google.android.gms.internal.measurement.zzfb zzfbVar = (com.google.android.gms.internal.measurement.zzfb) zzfdVar.zzb(i).zzby();
                if (zzfbVar.zzc().isEmpty()) {
                    this.zzs.zzay().zzk().zza("EventConfig contained null event name");
                } else {
                    String zzc = zzfbVar.zzc();
                    String zzb = zzgv.zzb(zzfbVar.zzc());
                    if (!TextUtils.isEmpty(zzb)) {
                        zzfbVar.zzb(zzb);
                        zzfdVar.zzd(i, zzfbVar);
                    }
                    if (zzfbVar.zzf() && zzfbVar.zzd()) {
                        arrayMap.put(zzc, Boolean.TRUE);
                    }
                    if (zzfbVar.zzg() && zzfbVar.zze()) {
                        arrayMap2.put(zzfbVar.zzc(), Boolean.TRUE);
                    }
                    if (zzfbVar.zzh()) {
                        if (zzfbVar.zza() >= 2 && zzfbVar.zza() <= 65535) {
                            arrayMap3.put(zzfbVar.zzc(), Integer.valueOf(zzfbVar.zza()));
                        } else {
                            this.zzs.zzay().zzk().zzc("Invalid sampling rate. Event name, sample rate", zzfbVar.zzc(), Integer.valueOf(zzfbVar.zza()));
                        }
                    }
                }
            }
        }
        this.f48343c.put(str, hashSet);
        this.f48344d.put(str, arrayMap);
        this.f48345e.put(str, arrayMap2);
        this.f48347g.put(str, arrayMap3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ae, code lost:
        if (r2 == null) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x012d  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m46307d(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzfp.m46307d(java.lang.String):void");
    }

    /* renamed from: e */
    public final void m46306e(final String str, zzfe zzfeVar) {
        if (zzfeVar.zza() != 0) {
            this.zzs.zzay().zzj().zzb("EES programs found", Integer.valueOf(zzfeVar.zza()));
            zzgs zzgsVar = (zzgs) zzfeVar.zzm().get(0);
            try {
                zzc zzcVar = new zzc();
                zzcVar.zzd("internal.remoteConfig", new Callable() { // from class: com.google.android.gms.measurement.internal.zzfj
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return new zzn("internal.remoteConfig", new Po2(zzfp.this, str));
                    }
                });
                zzcVar.zzd("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.zzfk
                    {
                        zzfp.this = this;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        final zzfp zzfpVar = zzfp.this;
                        final String str2 = str;
                        return new zzu("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.zzfi
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                zzfp zzfpVar2 = zzfpVar;
                                String str3 = str2;
                                C19256bt2 m65207F = zzfpVar2.zzf.zzi().m65207F(str3);
                                HashMap hashMap = new HashMap();
                                hashMap.put("platform", "android");
                                hashMap.put("package_name", str3);
                                zzfpVar2.zzs.zzf().zzh();
                                hashMap.put("gmp_version", 73000L);
                                if (m65207F != null) {
                                    String m51761g0 = m65207F.m51761g0();
                                    if (m51761g0 != null) {
                                        hashMap.put("app_version", m51761g0);
                                    }
                                    hashMap.put("app_version_int", Long.valueOf(m65207F.m51789L()));
                                    hashMap.put("dynamite_version", Long.valueOf(m65207F.m51780U()));
                                }
                                return hashMap;
                            }
                        });
                    }
                });
                zzcVar.zzd("internal.logger", new Callable() { // from class: com.google.android.gms.measurement.internal.zzfl
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return new com.google.android.gms.internal.measurement.zzt(zzfp.this.f48349i);
                    }
                });
                zzcVar.zzc(zzgsVar);
                this.f48348h.put(str, zzcVar);
                this.zzs.zzay().zzj().zzc("EES program loaded for appId, activities", str, Integer.valueOf(zzgsVar.zza().zza()));
                for (com.google.android.gms.internal.measurement.zzgq zzgqVar : zzgsVar.zza().zzd()) {
                    this.zzs.zzay().zzj().zzb("EES program activity", zzgqVar.zzb());
                }
                return;
            } catch (com.google.android.gms.internal.measurement.zzd unused) {
                this.zzs.zzay().zzd().zzb("Failed to load EES program. appId", str);
                return;
            }
        }
        this.f48348h.remove(str);
    }

    /* renamed from: g */
    public final int m46304g(String str, String str2) {
        Integer num;
        zzg();
        m46307d(str);
        Map map = (Map) this.f48347g.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    /* renamed from: i */
    public final String m46302i(String str) {
        zzg();
        m46307d(str);
        return (String) this.f48350j.get(str);
    }

    /* renamed from: k */
    public final Set m46300k(String str) {
        zzg();
        m46307d(str);
        return (Set) this.f48343c.get(str);
    }

    /* renamed from: l */
    public final void m46299l(String str) {
        zzg();
        this.f48346f.remove(str);
    }

    /* renamed from: m */
    public final boolean m46298m(String str) {
        zzg();
        zzfe zze = zze(str);
        if (zze == null) {
            return false;
        }
        return zze.zzq();
    }

    /* renamed from: n */
    public final boolean m46297n(String str) {
        return "1".equals(zza(str, "measurement.upload.blacklist_internal"));
    }

    /* renamed from: o */
    public final boolean m46296o(String str, String str2) {
        Boolean bool;
        zzg();
        m46307d(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f48345e.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: p */
    public final boolean m46295p(String str, String str2) {
        Boolean bool;
        zzg();
        m46307d(str);
        if (m46297n(str) && zzlh.m46087y(str2)) {
            return true;
        }
        if (m46294q(str) && zzlh.m46086z(str2)) {
            return true;
        }
        Map map = (Map) this.f48344d.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: q */
    public final boolean m46294q(String str) {
        return "1".equals(zza(str, "measurement.upload.blacklist_public"));
    }

    /* renamed from: r */
    public final boolean m46293r(String str) {
        zzg();
        m46307d(str);
        if (this.f48343c.get(str) != null && ((Set) this.f48343c.get(str)).contains("app_instance_id")) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public final boolean m46292s(String str) {
        zzg();
        m46307d(str);
        if (this.f48343c.get(str) == null) {
            return false;
        }
        if (!((Set) this.f48343c.get(str)).contains("device_model") && !((Set) this.f48343c.get(str)).contains("device_info")) {
            return false;
        }
        return true;
    }

    /* renamed from: t */
    public final boolean m46291t(String str) {
        zzg();
        m46307d(str);
        if (this.f48343c.get(str) != null && ((Set) this.f48343c.get(str)).contains("google_signals")) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    public final boolean m46290u(String str) {
        zzg();
        m46307d(str);
        if (this.f48343c.get(str) == null) {
            return false;
        }
        if (!((Set) this.f48343c.get(str)).contains("os_version") && !((Set) this.f48343c.get(str)).contains("device_info")) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    public final boolean m46289v(String str) {
        zzg();
        m46307d(str);
        if (this.f48343c.get(str) != null && ((Set) this.f48343c.get(str)).contains("user_id")) {
            return true;
        }
        return false;
    }

    @Override // p000.InterfaceC17266Ab2
    @WorkerThread
    public final String zza(String str, String str2) {
        zzg();
        m46307d(str);
        Map map = (Map) this.f48342b.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    @Override // p000.RC2
    public final boolean zzb() {
        return false;
    }

    @WorkerThread
    public final zzfe zze(String str) {
        zzW();
        zzg();
        Preconditions.checkNotEmpty(str);
        m46307d(str);
        return (zzfe) this.f48346f.get(str);
    }

    @WorkerThread
    public final String zzf(String str) {
        zzg();
        return (String) this.f48352l.get(str);
    }

    @WorkerThread
    public final String zzh(String str) {
        zzg();
        return (String) this.f48351k.get(str);
    }

    @WorkerThread
    public final void zzl(String str) {
        zzg();
        this.f48351k.put(str, null);
    }

    public final boolean zzo(String str) {
        zzfe zzfeVar;
        if (TextUtils.isEmpty(str) || (zzfeVar = (zzfe) this.f48346f.get(str)) == null || zzfeVar.zza() == 0) {
            return false;
        }
        return true;
    }

    @WorkerThread
    public final boolean zzt(String str, byte[] bArr, String str2, String str3) {
        zzW();
        zzg();
        Preconditions.checkNotEmpty(str);
        zzfd zzfdVar = (zzfd) m46309b(str, bArr).zzby();
        if (zzfdVar == null) {
            return false;
        }
        m46308c(str, zzfdVar);
        m46306e(str, (zzfe) zzfdVar.zzaE());
        this.f48346f.put(str, (zzfe) zzfdVar.zzaE());
        this.f48350j.put(str, zzfdVar.zze());
        this.f48351k.put(str, str2);
        this.f48352l.put(str, str3);
        this.f48342b.put(str, m46305f((zzfe) zzfdVar.zzaE()));
        this.zzf.zzi().m65192c(str, new ArrayList(zzfdVar.zzf()));
        try {
            zzfdVar.zzc();
            bArr = ((zzfe) zzfdVar.zzaE()).zzbv();
        } catch (RuntimeException e) {
            this.zzs.zzay().zzk().zzc("Unable to serialize reduced-size config. Storing full config instead. appId", zzeo.zzn(str), e);
        }
        C18866Zb2 zzi = this.zzf.zzi();
        Preconditions.checkNotEmpty(str);
        zzi.zzg();
        zzi.zzW();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        if (zzi.zzs.zzf().zzs(null, zzeb.zzaw)) {
            contentValues.put("e_tag", str3);
        }
        try {
            if (zzi.m65209D().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                zzi.zzs.zzay().zzd().zzb("Failed to update remote config (got 0). appId", zzeo.zzn(str));
            }
        } catch (SQLiteException e2) {
            zzi.zzs.zzay().zzd().zzc("Error storing remote config. appId", zzeo.zzn(str), e2);
        }
        this.f48346f.put(str, (zzfe) zzfdVar.zzaE());
        return true;
    }

    public final boolean zzw(String str) {
        zzg();
        m46307d(str);
        if (this.f48343c.get(str) != null && ((Set) this.f48343c.get(str)).contains("enhanced_user_id")) {
            return true;
        }
        return false;
    }
}
