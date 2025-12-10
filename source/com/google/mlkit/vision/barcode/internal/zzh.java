package com.google.mlkit.vision.barcode.internal;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.internal.mlkit_vision_barcode.zztx;
import com.google.android.gms.internal.mlkit_vision_barcode.zzui;
import com.google.mlkit.common.sdkinternal.LazyInstanceMap;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.vision.barcode.BarcodeScannerOptions;

/* loaded from: classes4.dex */
public final class zzh extends LazyInstanceMap {

    /* renamed from: b */
    public final MlKitContext f57079b;

    public zzh(MlKitContext mlKitContext) {
        this.f57079b = mlKitContext;
    }

    @Override // com.google.mlkit.common.sdkinternal.LazyInstanceMap
    public final /* bridge */ /* synthetic */ Object create(Object obj) {
        KD2 hh2;
        BarcodeScannerOptions barcodeScannerOptions = (BarcodeScannerOptions) obj;
        Context applicationContext = this.f57079b.getApplicationContext();
        zztx zzb = zzui.zzb(zzb.zzd());
        if (!HH2.m68109b(applicationContext) && GoogleApiAvailabilityLight.getInstance().getApkVersion(applicationContext) < 204500000) {
            hh2 = new C22771wI2(applicationContext, barcodeScannerOptions, zzb);
        } else {
            hh2 = new HH2(applicationContext, barcodeScannerOptions, zzb);
        }
        return new zzk(this.f57079b, barcodeScannerOptions, hh2, zzb);
    }
}
