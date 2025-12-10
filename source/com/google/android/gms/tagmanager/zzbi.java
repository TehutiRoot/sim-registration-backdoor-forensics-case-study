package com.google.android.gms.tagmanager;

import android.os.Build;
import androidx.core.p005os.EnvironmentCompat;
import java.util.Map;
import org.apache.commons.cli.HelpFormatter;

/* loaded from: classes3.dex */
final class zzbi extends zzbt {
    private static final String zza = com.google.android.gms.internal.gtm.zza.DEVICE_NAME.toString();

    public zzbi() {
        super(zza, new String[0]);
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final com.google.android.gms.internal.gtm.zzam zza(Map map) {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (!str2.startsWith(str) && !str.equals(EnvironmentCompat.MEDIA_UNKNOWN)) {
            str2 = str + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + str2;
        }
        return zzfu.zzb(str2);
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final boolean zzb() {
        return true;
    }
}
