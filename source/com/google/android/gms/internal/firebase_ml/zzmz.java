package com.google.android.gms.internal.firebase_ml;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzmz extends zzmx {
    private final transient int length;
    private final transient int offset;
    private final /* synthetic */ zzmx zzamt;

    public zzmz(zzmx zzmxVar, int i, int i2) {
        this.zzamt = zzmxVar;
        this.offset = i;
        this.length = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzml.zzb(i, this.length);
        return this.zzamt.get(i + this.offset);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.length;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzmx, java.util.List
    public final /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzmx
    public final zzmx zzd(int i, int i2) {
        zzml.zza(i, i2, this.length);
        zzmx zzmxVar = this.zzamt;
        int i3 = this.offset;
        return (zzmx) zzmxVar.subList(i + i3, i2 + i3);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzmu
    public final Object[] zzjp() {
        return this.zzamt.zzjp();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzmu
    public final int zzjq() {
        return this.zzamt.zzjq() + this.offset;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzmu
    public final int zzjr() {
        return this.zzamt.zzjq() + this.offset + this.length;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzmu
    public final boolean zzjt() {
        return true;
    }
}
