package com.google.android.gms.vision.clearcut;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.clearcut.ClearcutLogger;
import com.google.android.gms.internal.vision.zzfe;
import com.google.android.gms.internal.vision.zzfi;
import com.google.android.gms.internal.vision.zzio;
import com.google.android.gms.vision.C6779L;

@Keep
/* loaded from: classes4.dex */
public class VisionClearcutLogger {
    private final ClearcutLogger zza;
    private boolean zzb = true;

    public VisionClearcutLogger(@RecentlyNonNull Context context) {
        this.zza = new ClearcutLogger(context, "VISION", null);
    }

    public final void zza(int i, zzfi.zzo zzoVar) {
        byte[] zzh = zzoVar.zzh();
        if (i >= 0 && i <= 3) {
            try {
                if (this.zzb) {
                    this.zza.newEvent(zzh).setEventCode(i).log();
                    return;
                }
                zzfi.zzo.zza zza = zzfi.zzo.zza();
                try {
                    zza.zza(zzh, 0, zzh.length, zzio.zzc());
                    C6779L.m46009e("Would have logged:\n%s", zza.toString());
                    return;
                } catch (Exception e) {
                    C6779L.m46008e(e, "Parsing error", new Object[0]);
                    return;
                }
            } catch (Exception e2) {
                zzfe.zza(e2);
                C6779L.m46008e(e2, "Failed to log", new Object[0]);
                return;
            }
        }
        C6779L.m46007i("Illegal event code: %d", Integer.valueOf(i));
    }
}
