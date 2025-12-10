package com.google.android.gms.internal.mlkit_vision_barcode;

import java.io.Serializable;

/* loaded from: classes3.dex */
final class zzcr extends AbstractC18235Pe2 implements Serializable {
    final Object zza;
    final Object zzb;

    public zzcr(Object obj, Object obj2) {
        this.zza = obj;
        this.zzb = obj2;
    }

    @Override // p000.AbstractC18235Pe2, java.util.Map.Entry
    public final Object getKey() {
        return this.zza;
    }

    @Override // p000.AbstractC18235Pe2, java.util.Map.Entry
    public final Object getValue() {
        return this.zzb;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
