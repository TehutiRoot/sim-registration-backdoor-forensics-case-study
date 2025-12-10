package com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.zzc;

/* renamed from: com.google.android.gms.maps.c */
/* loaded from: classes3.dex */
public final class BinderC6665c extends zzc {

    /* renamed from: a */
    public final GoogleMap.CancelableCallback f47881a;

    public BinderC6665c(GoogleMap.CancelableCallback cancelableCallback) {
        this.f47881a = cancelableCallback;
    }

    @Override // com.google.android.gms.maps.internal.zzd
    public final void zzb() {
        this.f47881a.onCancel();
    }

    @Override // com.google.android.gms.maps.internal.zzd
    public final void zzc() {
        this.f47881a.onFinish();
    }
}
