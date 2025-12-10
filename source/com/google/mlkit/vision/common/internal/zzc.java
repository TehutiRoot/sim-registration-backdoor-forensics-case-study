package com.google.mlkit.vision.common.internal;

import com.google.android.gms.tasks.OnFailureListener;

/* loaded from: classes4.dex */
public final /* synthetic */ class zzc implements OnFailureListener {
    public static final /* synthetic */ zzc zza = new zzc();

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        MobileVisionBase.f57105f.m48405e("MobileVisionBase", "Error preloading model resource", exc);
    }
}
