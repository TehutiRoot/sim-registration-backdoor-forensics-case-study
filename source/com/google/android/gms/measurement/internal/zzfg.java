package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;

/* loaded from: classes3.dex */
public final class zzfg {

    /* renamed from: a */
    public final zzfy f48340a;

    public zzfg(zzkz zzkzVar) {
        this.f48340a = zzkzVar.m46191O();
    }

    /* renamed from: a */
    public final boolean m46310a() {
        try {
            PackageManagerWrapper packageManager = Wrappers.packageManager(this.f48340a.zzau());
            if (packageManager == null) {
                this.f48340a.zzay().zzj().zza("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                return false;
            } else if (packageManager.getPackageInfo("com.android.vending", 128).versionCode < 80837300) {
                return false;
            } else {
                return true;
            }
        } catch (Exception e) {
            this.f48340a.zzay().zzj().zzb("Failed to retrieve Play Store version for Install Referrer", e);
            return false;
        }
    }
}
