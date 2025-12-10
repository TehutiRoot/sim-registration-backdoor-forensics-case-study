package com.google.android.gms.internal.firebase_ml;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zznb<E> extends zzmx<E> {
    static final zzmx<Object> zzamu = new zznb(new Object[0], 0);
    private final transient int size;
    private final transient Object[] zzamv;

    public zznb(Object[] objArr, int i) {
        this.zzamv = objArr;
        this.size = i;
    }

    @Override // java.util.List
    public final E get(int i) {
        zzml.zzb(i, this.size);
        return (E) this.zzamv[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.size;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzmx, com.google.android.gms.internal.firebase_ml.zzmu
    public final int zza(Object[] objArr, int i) {
        System.arraycopy(this.zzamv, 0, objArr, 0, this.size);
        return this.size;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzmu
    public final Object[] zzjp() {
        return this.zzamv;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzmu
    public final int zzjq() {
        return 0;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzmu
    public final int zzjr() {
        return this.size;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzmu
    public final boolean zzjt() {
        return false;
    }
}