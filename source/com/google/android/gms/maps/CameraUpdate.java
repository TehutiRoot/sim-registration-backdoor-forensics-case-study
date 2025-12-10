package com.google.android.gms.maps;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes3.dex */
public final class CameraUpdate {

    /* renamed from: a */
    public final IObjectWrapper f47827a;

    public CameraUpdate(IObjectWrapper iObjectWrapper) {
        this.f47827a = (IObjectWrapper) Preconditions.checkNotNull(iObjectWrapper);
    }

    @NonNull
    public final IObjectWrapper zza() {
        return this.f47827a;
    }
}
