package com.google.android.gms.tagmanager;

import android.util.Log;
import com.google.android.gms.internal.gtm.zzro;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes3.dex */
final class zzek implements Runnable {
    final /* synthetic */ zzro zza;
    final /* synthetic */ zzel zzb;

    public zzek(zzel zzelVar, zzro zzroVar) {
        this.zzb = zzelVar;
        this.zza = zzroVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FileOutputStream fileOutputStream;
        zzro zzroVar = this.zza;
        File zze = this.zzb.zze();
        try {
            try {
                fileOutputStream = new FileOutputStream(zze);
                try {
                    zzroVar.zzS(fileOutputStream);
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused) {
                        Log.w("GoogleTagManager", "error closing stream for writing resource to disk");
                    }
                } catch (IOException unused2) {
                    Log.w("GoogleTagManager", "Error writing resource to disk. Removing resource from disk.");
                    zze.delete();
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused3) {
                        Log.w("GoogleTagManager", "error closing stream for writing resource to disk");
                    }
                }
            } catch (Throwable th2) {
                try {
                    fileOutputStream.close();
                } catch (IOException unused4) {
                    Log.w("GoogleTagManager", "error closing stream for writing resource to disk");
                }
                throw th2;
            }
        } catch (FileNotFoundException unused5) {
        }
    }
}
