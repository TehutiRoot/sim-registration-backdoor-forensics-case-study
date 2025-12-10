package com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.zzc;

/* renamed from: com.google.android.gms.maps.c */
/* loaded from: classes3.dex */
public final class BinderC6654c extends zzc {

    /* renamed from: a */
    public final GoogleMap.CancelableCallback f47893a;

    public BinderC6654c(GoogleMap.CancelableCallback cancelableCallback) {
        this.f47893a = cancelableCallback;
    }

    @Override // com.google.android.gms.maps.internal.zzd
    public final void zzb() {
        this.f47893a.onCancel();
    }

    @Override // com.google.android.gms.maps.internal.zzd
    public final void zzc() {
        this.f47893a.onFinish();
    }
}