package com.google.android.gms.internal.clearcut;

import android.content.Context;
import com.google.android.gms.clearcut.ClearcutLogger;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.clearcut.zzgw;
import com.google.android.gms.phenotype.Phenotype;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class zzp implements ClearcutLogger.zza {

    /* renamed from: b */
    public static final Charset f45646b = Charset.forName("UTF-8");

    /* renamed from: c */
    public static final zzao f45647c;

    /* renamed from: d */
    public static final zzao f45648d;

    /* renamed from: e */
    public static final ConcurrentHashMap f45649e;

    /* renamed from: f */
    public static final HashMap f45650f;

    /* renamed from: g */
    public static Boolean f45651g;

    /* renamed from: h */
    public static Long f45652h;

    /* renamed from: i */
    public static final zzae f45653i;

    /* renamed from: a */
    public final Context f45654a;

    static {
        zzao zzd = new zzao(Phenotype.getContentProviderUri("com.google.android.gms.clearcut.public")).zzc("gms:playlog:service:samplingrules_").zzd("LogSamplingRules__");
        f45647c = zzd;
        f45648d = new zzao(Phenotype.getContentProviderUri("com.google.android.gms.clearcut.public")).zzc("gms:playlog:service:sampling_").zzd("LogSampling__");
        f45649e = new ConcurrentHashMap();
        f45650f = new HashMap();
        f45651g = null;
        f45652h = null;
        f45653i = zzd.zzc("enable_log_sampling_rules", false);
    }

    public zzp(Context context) {
        this.f45654a = context;
        if (context != null) {
            zzae.maybeInit(context);
        }
    }

    /* renamed from: a */
    public static long m48090a(String str, long j) {
        if (str == null || str.isEmpty()) {
            return zzk.zza(ByteBuffer.allocate(8).putLong(j).array());
        }
        byte[] bytes = str.getBytes(f45646b);
        ByteBuffer allocate = ByteBuffer.allocate(bytes.length + 8);
        allocate.put(bytes);
        allocate.putLong(j);
        return zzk.zza(allocate.array());
    }

    /* renamed from: b */
    public static zzgw.zza.zzb m48089b(String str) {
        String str2;
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(44);
        int i = 0;
        if (indexOf >= 0) {
            i = indexOf + 1;
            str2 = str.substring(0, indexOf);
        } else {
            str2 = "";
        }
        int indexOf2 = str.indexOf(47, i);
        if (indexOf2 <= 0) {
            if (str.length() != 0) {
                "Failed to parse the rule: ".concat(str);
            }
            return null;
        }
        try {
            long parseLong = Long.parseLong(str.substring(i, indexOf2));
            long parseLong2 = Long.parseLong(str.substring(indexOf2 + 1));
            if (parseLong < 0 || parseLong2 < 0) {
                StringBuilder sb = new StringBuilder(72);
                sb.append("negative values not supported: ");
                sb.append(parseLong);
                sb.append(RemoteSettings.FORWARD_SLASH_STRING);
                sb.append(parseLong2);
                return null;
            }
            return zzgw.zza.zzb.zzfz().zzn(str2).zzr(parseLong).zzs(parseLong2).zzbh();
        } catch (NumberFormatException unused) {
            if (str.length() != 0) {
                "parseLong() failed while parsing: ".concat(str);
            }
            return null;
        }
    }

    /* renamed from: c */
    public static boolean m48088c(long j, long j2, long j3) {
        if (j2 < 0 || j3 <= 0) {
            return true;
        }
        return ((j > 0L ? 1 : (j == 0L ? 0 : -1)) >= 0 ? j % j3 : (((Long.MAX_VALUE % j3) + 1) + ((j & Long.MAX_VALUE) % j3)) % j3) < j2;
    }

    /* renamed from: d */
    public static boolean m48087d(Context context) {
        if (f45651g == null) {
            f45651g = Boolean.valueOf(Wrappers.packageManager(context).checkCallingOrSelfPermission("com.google.android.providers.gsf.permission.READ_GSERVICES") == 0);
        }
        return f45651g.booleanValue();
    }

    /* renamed from: e */
    public static long m48086e(Context context) {
        if (f45652h == null) {
            if (context == null) {
                return 0L;
            }
            f45652h = Long.valueOf(m48087d(context) ? zzy.getLong(context.getContentResolver(), "android_id", 0L) : 0L);
        }
        return f45652h.longValue();
    }

    @Override // com.google.android.gms.clearcut.ClearcutLogger.zza
    public final boolean zza(com.google.android.gms.clearcut.zze zzeVar) {
        List<zzgw.zza.zzb> zzfs;
        zzr zzrVar = zzeVar.zzag;
        String str = zzrVar.zzj;
        int i = zzrVar.zzk;
        zzha zzhaVar = zzeVar.zzaa;
        int i2 = zzhaVar != null ? zzhaVar.zzbji : 0;
        String str2 = null;
        if (!((Boolean) f45653i.get()).booleanValue()) {
            if (str == null || str.isEmpty()) {
                str = i >= 0 ? String.valueOf(i) : null;
            }
            if (str != null) {
                Context context = this.f45654a;
                if (context != null && m48087d(context)) {
                    HashMap hashMap = f45650f;
                    zzae<String> zzaeVar = (zzae) hashMap.get(str);
                    if (zzaeVar == null) {
                        zzaeVar = f45648d.zza(str, null);
                        hashMap.put(str, zzaeVar);
                    }
                    str2 = zzaeVar.get();
                }
                zzgw.zza.zzb m48089b = m48089b(str2);
                if (m48089b != null) {
                    return m48088c(m48090a(m48089b.zzfw(), m48086e(this.f45654a)), m48089b.zzfx(), m48089b.zzfy());
                }
                return true;
            }
            return true;
        }
        if (str == null || str.isEmpty()) {
            str = i >= 0 ? String.valueOf(i) : null;
        }
        if (str != null) {
            if (this.f45654a == null) {
                zzfs = Collections.emptyList();
            } else {
                ConcurrentHashMap concurrentHashMap = f45649e;
                zzae zzaeVar2 = (zzae) concurrentHashMap.get(str);
                if (zzaeVar2 == null) {
                    zzaeVar2 = f45647c.zza(str, zzgw.zza.zzft(), HJ2.f2346a);
                    zzae zzaeVar3 = (zzae) concurrentHashMap.putIfAbsent(str, zzaeVar2);
                    if (zzaeVar3 != null) {
                        zzaeVar2 = zzaeVar3;
                    }
                }
                zzfs = ((zzgw.zza) zzaeVar2.get()).zzfs();
            }
            for (zzgw.zza.zzb zzbVar : zzfs) {
                if (!zzbVar.zzfv() || zzbVar.getEventCode() == 0 || zzbVar.getEventCode() == i2) {
                    if (!m48088c(m48090a(zzbVar.zzfw(), m48086e(this.f45654a)), zzbVar.zzfx(), zzbVar.zzfy())) {
                        return false;
                    }
                }
            }
            return true;
        }
        return true;
    }
}