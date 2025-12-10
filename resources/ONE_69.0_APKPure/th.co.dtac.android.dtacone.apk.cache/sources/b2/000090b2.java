package com.google.android.gms.internal.firebase_ml;

import com.google.android.gms.internal.firebase_ml.zzvs;
import com.google.android.gms.internal.firebase_ml.zzvt;

/* loaded from: classes3.dex */
public abstract class zzvs<MessageType extends zzvt<MessageType, BuilderType>, BuilderType extends zzvs<MessageType, BuilderType>> implements zzyv {
    public abstract BuilderType zza(MessageType messagetype);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.firebase_ml.zzyv
    public final /* synthetic */ zzyv zza(zzys zzysVar) {
        if (zzvh().getClass().isInstance(zzysVar)) {
            return zza((zzvs<MessageType, BuilderType>) ((zzvt) zzysVar));
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    @Override // 
    /* renamed from: zztr */
    public abstract BuilderType clone();
}