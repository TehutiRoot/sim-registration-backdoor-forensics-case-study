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
    public static final Charset f45634b = Charset.forName("UTF-8");

    /* renamed from: c */
    public static final zzao f45635c;

    /* renamed from: d */
    public static final zzao f45636d;

    /* renamed from: e */
    public static final ConcurrentHashMap f45637e;

    /* renamed from: f */
    public static final HashMap f45638f;

    /* renamed from: g */
    public static Boolean f45639g;

    /* renamed from: h */
    public static Long f45640h;

    /* renamed from: i */
    public static final zzae f45641i;

    /* renamed from: a */
    public final Context f45642a;

    static {
        zzao zzd = new zzao(Phenotype.getContentProviderUri("com.google.android.gms.clearcut.public")).zzc("gms:playlog:service:samplingrules_").zzd("LogSamplingRules__");
        f45635c = zzd;
        f45636d = new zzao(Phenotype.getContentProviderUri("com.google.android.gms.clearcut.public")).zzc("gms:playlog:service:sampling_").zzd("LogSampling__");
        f45637e = new ConcurrentHashMap();
        f45638f = new HashMap();
        f45639g = null;
        f45640h = null;
        f45641i = zzd.zzc("enable_log_sampling_rules", false);
    }

    public zzp(Context context) {
        this.f45642a = context;
        if (context != null) {
            zzae.maybeInit(context);
        }
    }

    /* renamed from: a */
    public static long m48093a(String str, long j) {
        if (str == null || str.isEmpty()) {
            return zzk.zza(ByteBuffer.allocate(8).putLong(j).array());
        }
        byte[] bytes = str.getBytes(f45634b);
        ByteBuffer allocate = ByteBuffer.allocate(bytes.length + 8);
        allocate.put(bytes);
        allocate.putLong(j);
        return zzk.zza(allocate.array());
    }

    /* renamed from: b */
    public static zzgw.zza.zzb m48092b(String str) {
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
    public static boolean m48091c(long j, long j2, long j3) {
        if (j2 < 0 || j3 <= 0) {
            return true;
        }
        return ((j > 0L ? 1 : (j == 0L ? 0 : -1)) >= 0 ? j % j3 : (((Long.MAX_VALUE % j3) + 1) + ((j & Long.MAX_VALUE) % j3)) % j3) < j2;
    }

    /* renamed from: d */
    public static boolean m48090d(Context context) {
        if (f45639g == null) {
            f45639g = Boolean.valueOf(Wrappers.packageManager(context).checkCallingOrSelfPermission("com.google.android.providers.gsf.permission.READ_GSERVICES") == 0);
        }
        return f45639g.booleanValue();
    }

    /* renamed from: e */
    public static long m48089e(Context context) {
        if (f45640h == null) {
            if (context == null) {
                return 0L;
            }
            f45640h = Long.valueOf(m48090d(context) ? zzy.getLong(context.getContentResolver(), "android_id", 0L) : 0L);
        }
        return f45640h.longValue();
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
        if (!((Boolean) f45641i.get()).booleanValue()) {
            if (str == null || str.isEmpty()) {
                str = i >= 0 ? String.valueOf(i) : null;
            }
            if (str != null) {
                Context context = this.f45642a;
                if (context != null && m48090d(context)) {
                    HashMap hashMap = f45638f;
                    zzae<String> zzaeVar = (zzae) hashMap.get(str);
                    if (zzaeVar == null) {
                        zzaeVar = f45636d.zza(str, null);
                        hashMap.put(str, zzaeVar);
                    }
                    str2 = zzaeVar.get();
                }
                zzgw.zza.zzb m48092b = m48092b(str2);
                if (m48092b != null) {
                    return m48091c(m48093a(m48092b.zzfw(), m48089e(this.f45642a)), m48092b.zzfx(), m48092b.zzfy());
                }
                return true;
            }
            return true;
        }
        if (str == null || str.isEmpty()) {
            str = i >= 0 ? String.valueOf(i) : null;
        }
        if (str != null) {
            if (this.f45642a == null) {
                zzfs = Collections.emptyList();
            } else {
                ConcurrentHashMap concurrentHashMap = f45637e;
                zzae zzaeVar2 = (zzae) concurrentHashMap.get(str);
                if (zzaeVar2 == null) {
                    zzaeVar2 = f45635c.zza(str, zzgw.zza.zzft(), KI2.f3165a);
                    zzae zzaeVar3 = (zzae) concurrentHashMap.putIfAbsent(str, zzaeVar2);
                    if (zzaeVar3 != null) {
                        zzaeVar2 = zzaeVar3;
                    }
                }
                zzfs = ((zzgw.zza) zzaeVar2.get()).zzfs();
            }
            for (zzgw.zza.zzb zzbVar : zzfs) {
                if (!zzbVar.zzfv() || zzbVar.getEventCode() == 0 || zzbVar.getEventCode() == i2) {
                    if (!m48091c(m48093a(zzbVar.zzfw(), m48089e(this.f45642a)), zzbVar.zzfx(), zzbVar.zzfy())) {
                        return false;
                    }
                }
            }
            return true;
        }
        return true;
    }
}
