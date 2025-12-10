package com.google.android.gms.internal.gtm;

import androidx.annotation.VisibleForTesting;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;
import org.apache.commons.cli.HelpFormatter;

/* loaded from: classes3.dex */
public final class zzfd extends zzbu {
    private static zzfd zza;

    public zzfd(zzbx zzbxVar) {
        super(zzbxVar);
    }

    public static zzfd zza() {
        return zza;
    }

    @VisibleForTesting
    public static final String zzf(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        boolean z = obj instanceof Long;
        String str = HelpFormatter.DEFAULT_OPT_PREFIX;
        if (z) {
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return obj.toString();
            }
            char charAt = obj.toString().charAt(0);
            String valueOf = String.valueOf(Math.abs(l.longValue()));
            StringBuilder sb = new StringBuilder();
            if (charAt != '-') {
                str = "";
            }
            sb.append(str);
            sb.append(Math.round(Math.pow(10.0d, valueOf.length() - 1)));
            sb.append("...");
            sb.append(str);
            sb.append(Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d));
            return sb.toString();
        } else if (obj instanceof Boolean) {
            return obj.toString();
        } else {
            if (!(obj instanceof Throwable)) {
                return HelpFormatter.DEFAULT_OPT_PREFIX;
            }
            return obj.getClass().getCanonicalName();
        }
    }

    public final void zzb(zzez zzezVar, String str) {
        String str2;
        if (zzezVar != null) {
            str2 = zzezVar.toString();
        } else {
            str2 = "no hit data";
        }
        zzR("Discarding hit. ".concat(str), str2);
    }

    public final void zzc(Map map, String str) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            if (sb.length() > 0) {
                sb.append(',');
            }
            sb.append((String) entry.getKey());
            sb.append('=');
            sb.append((String) entry.getValue());
        }
        zzR("Discarding hit. ".concat(str), sb.toString());
    }

    @Override // com.google.android.gms.internal.gtm.zzbu
    public final void zzd() {
        synchronized (zzfd.class) {
            zza = this;
        }
    }

    public final synchronized void zze(int i, String str, Object obj, Object obj2, Object obj3) {
        char c;
        try {
            Preconditions.checkNotNull(str);
            if (zzw().zzb()) {
                zzw();
                c = 'C';
            } else {
                zzw();
                c = 'c';
            }
            String str2 = ExifInterface.GPS_MEASUREMENT_3D + "01VDIWEA?".charAt(i) + c + zzbv.zza + ":" + zzbt.zzD(str, zzf(obj), zzf(obj2), zzf(obj3));
            if (str2.length() > 1024) {
                str2 = str2.substring(0, 1024);
            }
            zzfj zzp = zzt().zzp();
            if (zzp != null) {
                zzp.zze().zzc(str2);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
