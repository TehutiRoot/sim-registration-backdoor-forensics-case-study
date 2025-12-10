package com.google.android.gms.internal.mlkit_vision_text_common;

import java.io.Serializable;

/* loaded from: classes3.dex */
final class zzbg extends AbstractC18657Vc2 implements Serializable {
    final Object zza;
    final Object zzb;

    public zzbg(Object obj, Object obj2) {
        this.zza = obj;
        this.zzb = obj2;
    }

    @Override // p000.AbstractC18657Vc2, java.util.Map.Entry
    public final Object getKey() {
        return this.zza;
    }

    @Override // p000.AbstractC18657Vc2, java.util.Map.Entry
    public final Object getValue() {
        return this.zzb;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}