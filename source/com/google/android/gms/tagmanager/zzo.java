package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.Uri;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
final class zzo extends zzfs {
    static final String zza;
    private static final String zzb;
    private static final String zzc;
    private static final String zzd;
    private static final String zze;
    private static final Set zzf;
    private final zzn zzg;
    private final Context zzh;

    static {
        String zzaVar = com.google.android.gms.internal.gtm.zza.ARBITRARY_PIXEL.toString();
        zzb = zzaVar;
        zzc = com.google.android.gms.internal.gtm.zzb.URL.toString();
        zzd = com.google.android.gms.internal.gtm.zzb.ADDITIONAL_PARAMS.toString();
        zze = com.google.android.gms.internal.gtm.zzb.UNREPEATABLE.toString();
        zza = "gtm_" + zzaVar + "_unrepeatable";
        zzf = new HashSet();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzo(Context context) {
        super(zzb, zzc);
        zzm zzmVar = new zzm(context);
        this.zzg = zzmVar;
        this.zzh = context;
    }

    private final synchronized boolean zzd(String str) {
        Set set = zzf;
        if (set.contains(str)) {
            return true;
        }
        if (!this.zzh.getSharedPreferences(zza, 0).contains(str)) {
            return false;
        }
        set.add(str);
        return true;
    }

    @Override // com.google.android.gms.tagmanager.zzfs
    public final void zzc(Map map) {
        String str;
        String str2 = zze;
        if (map.get(str2) != null) {
            str = zzfu.zzm(zzfu.zzk((com.google.android.gms.internal.gtm.zzam) map.get(str2)));
        } else {
            str = null;
        }
        if (str != null && zzd(str)) {
            return;
        }
        Uri.Builder buildUpon = Uri.parse(zzfu.zzm(zzfu.zzk((com.google.android.gms.internal.gtm.zzam) map.get(zzc)))).buildUpon();
        com.google.android.gms.internal.gtm.zzam zzamVar = (com.google.android.gms.internal.gtm.zzam) map.get(zzd);
        if (zzamVar != null) {
            Object zzk = zzfu.zzk(zzamVar);
            if (!(zzk instanceof List)) {
                "ArbitraryPixel: additional params not a list: not sending partial hit: ".concat(String.valueOf(buildUpon.build().toString()));
                return;
            }
            for (Object obj : (List) zzk) {
                if (!(obj instanceof Map)) {
                    "ArbitraryPixel: additional params contains non-map: not sending partial hit: ".concat(String.valueOf(buildUpon.build().toString()));
                    return;
                }
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    buildUpon.appendQueryParameter(entry.getKey().toString(), entry.getValue().toString());
                }
            }
        }
        String uri = buildUpon.build().toString();
        zzbg.zzb(((zzm) this.zzg).zza).zza(uri);
        zzdg.zzb.zzd("ArbitraryPixel: url = ".concat(String.valueOf(uri)));
        if (str != null) {
            synchronized (zzo.class) {
                zzf.add(str);
                zzff.zza(this.zzh, zza, str, "true");
            }
        }
    }
}
