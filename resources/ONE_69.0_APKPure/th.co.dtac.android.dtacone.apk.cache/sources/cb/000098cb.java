package com.google.android.gms.internal.mlkit_vision_face;

import java.io.Serializable;

/* loaded from: classes3.dex */
final class zzbj extends AbstractC20813kd2 implements Serializable {
    final Object zza;
    final Object zzb;

    public zzbj(Object obj, Object obj2) {
        this.zza = obj;
        this.zzb = obj2;
    }

    @Override // p000.AbstractC20813kd2, java.util.Map.Entry
    public final Object getKey() {
        return this.zza;
    }

    @Override // p000.AbstractC20813kd2, java.util.Map.Entry
    public final Object getValue() {
        return this.zzb;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}