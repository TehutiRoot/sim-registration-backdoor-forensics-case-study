package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzff {
    final /* synthetic */ zzfg zza;
    private int zzb;
    private final ByteArrayOutputStream zzc = new ByteArrayOutputStream();

    public zzff(zzfg zzfgVar) {
        this.zza = zzfgVar;
    }

    public final int zza() {
        return this.zzb;
    }

    public final boolean zzb(zzez zzezVar) {
        byte[] bArr;
        Preconditions.checkNotNull(zzezVar);
        int i = this.zzb + 1;
        this.zza.zzw();
        if (i > zzcv.zzg()) {
            return false;
        }
        String zza = this.zza.zza(zzezVar, false);
        if (zza == null) {
            this.zza.zzz().zzb(zzezVar, "Error formatting hit");
            return true;
        }
        byte[] bytes = zza.getBytes();
        int length = bytes.length;
        this.zza.zzw();
        if (length > zzcv.zzf()) {
            this.zza.zzz().zzb(zzezVar, "Hit size exceeds the maximum size limit");
            return true;
        }
        if (this.zzc.size() > 0) {
            length++;
        }
        int size = this.zzc.size() + length;
        this.zza.zzw();
        if (size > ((Integer) zzew.zzA.zzb()).intValue()) {
            return false;
        }
        try {
            if (this.zzc.size() > 0) {
                ByteArrayOutputStream byteArrayOutputStream = this.zzc;
                bArr = zzfg.zza;
                byteArrayOutputStream.write(bArr);
            }
            this.zzc.write(bytes);
            this.zzb++;
            return true;
        } catch (IOException e) {
            this.zza.zzJ("Failed to write payload when batching hits", e);
            return true;
        }
    }

    public final byte[] zzc() {
        return this.zzc.toByteArray();
    }
}