package com.google.android.gms.maps;

import android.graphics.Bitmap;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.zzbv;

/* renamed from: com.google.android.gms.maps.w */
/* loaded from: classes3.dex */
public final class BinderC6688w extends zzbv {

    /* renamed from: a */
    public final /* synthetic */ GoogleMap.SnapshotReadyCallback f48048a;

    public BinderC6688w(GoogleMap googleMap, GoogleMap.SnapshotReadyCallback snapshotReadyCallback) {
        this.f48048a = snapshotReadyCallback;
    }

    @Override // com.google.android.gms.maps.internal.zzbw
    public final void zzb(Bitmap bitmap) {
        this.f48048a.onSnapshotReady(bitmap);
    }

    @Override // com.google.android.gms.maps.internal.zzbw
    public final void zzc(IObjectWrapper iObjectWrapper) {
        this.f48048a.onSnapshotReady((Bitmap) ObjectWrapper.unwrap(iObjectWrapper));
    }
}
