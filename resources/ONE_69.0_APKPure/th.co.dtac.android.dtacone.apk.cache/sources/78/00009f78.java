package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import androidx.annotation.VisibleForTesting;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Locale;
import org.apache.commons.cli.HelpFormatter;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzfi implements zzbj {
    private final String zza;
    private final Context zzb;
    private final zzfh zzc;
    private final zzfg zzd = new zzfg();

    @VisibleForTesting
    public zzfi(Context context, zzfh zzfhVar) {
        this.zzb = context.getApplicationContext();
        this.zzc = zzfhVar;
        Locale locale = Locale.getDefault();
        String str = null;
        if (locale != null && locale.getLanguage() != null && locale.getLanguage().length() != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(locale.getLanguage().toLowerCase());
            if (locale.getCountry() != null && locale.getCountry().length() != 0) {
                sb.append(HelpFormatter.DEFAULT_OPT_PREFIX);
                sb.append(locale.getCountry().toLowerCase());
            }
            str = sb.toString();
        }
        this.zza = String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", "GoogleTagManager", "4.00", Build.VERSION.RELEASE, str, Build.MODEL, Build.ID);
    }

    @VisibleForTesting
    public static final URL zzc(zzbz zzbzVar) {
        try {
            return new URL(zzbzVar.zzc());
        } catch (MalformedURLException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00c1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.tagmanager.zzbj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(java.util.List r12) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.zzfi.zza(java.util.List):void");
    }

    @Override // com.google.android.gms.tagmanager.zzbj
    public final boolean zzb() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.zzb.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        zzdg.zzb.zzd("...no network connectivity");
        return false;
    }
}