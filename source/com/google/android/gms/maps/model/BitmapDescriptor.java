package com.google.android.gms.maps.model;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes3.dex */
public final class BitmapDescriptor {

    /* renamed from: a */
    public final IObjectWrapper f47895a;

    public BitmapDescriptor(@NonNull IObjectWrapper iObjectWrapper) {
        this.f47895a = (IObjectWrapper) Preconditions.checkNotNull(iObjectWrapper);
    }

    @NonNull
    public final IObjectWrapper zza() {
        return this.f47895a;
    }
}
