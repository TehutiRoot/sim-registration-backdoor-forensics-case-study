package com.google.mlkit.vision.barcode.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.mlkit_vision_barcode.zzui;
import com.google.mlkit.common.sdkinternal.ExecutorSelector;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.vision.barcode.BarcodeScannerOptions;

/* loaded from: classes4.dex */
public final class zzg {

    /* renamed from: a */
    public final zzh f57076a;

    /* renamed from: b */
    public final ExecutorSelector f57077b;

    /* renamed from: c */
    public final MlKitContext f57078c;

    public zzg(zzh zzhVar, ExecutorSelector executorSelector, MlKitContext mlKitContext) {
        this.f57076a = zzhVar;
        this.f57077b = executorSelector;
        this.f57078c = mlKitContext;
    }

    public final BarcodeScannerImpl zza() {
        BarcodeScannerOptions barcodeScannerOptions;
        barcodeScannerOptions = BarcodeScannerImpl.f57066l;
        return zzb(barcodeScannerOptions);
    }

    public final BarcodeScannerImpl zzb(@NonNull BarcodeScannerOptions barcodeScannerOptions) {
        return new BarcodeScannerImpl(barcodeScannerOptions, (zzk) this.f57076a.get(barcodeScannerOptions), this.f57077b.getExecutorToUse(barcodeScannerOptions.zzc()), zzui.zzb(zzb.zzd()), this.f57078c);
    }
}
