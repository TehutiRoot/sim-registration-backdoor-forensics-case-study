package com.google.android.gms.internal.firebase_ml;

/* loaded from: classes3.dex */
final class zzwg extends zzwn {
    private final int zzckv;
    private final int zzckw;

    public zzwg(byte[] bArr, int i, int i2) {
        super(bArr);
        zzwd.zzd(i, i + i2, bArr.length);
        this.zzckv = i;
        this.zzckw = i2;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzwn, com.google.android.gms.internal.firebase_ml.zzwd
    public final int size() {
        return this.zzckw;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzwn, com.google.android.gms.internal.firebase_ml.zzwd
    public final void zzb(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.bytes, zzug() + i, bArr, i2, i3);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzwn, com.google.android.gms.internal.firebase_ml.zzwd
    public final byte zzdb(int i) {
        zzwd.zzg(i, size());
        return this.bytes[this.zzckv + i];
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzwn, com.google.android.gms.internal.firebase_ml.zzwd
    public final byte zzdc(int i) {
        return this.bytes[this.zzckv + i];
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzwn
    public final int zzug() {
        return this.zzckv;
    }
}