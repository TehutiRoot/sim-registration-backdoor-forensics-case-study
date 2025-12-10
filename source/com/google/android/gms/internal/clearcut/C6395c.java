package com.google.android.gms.internal.clearcut;

/* renamed from: com.google.android.gms.internal.clearcut.c */
/* loaded from: classes3.dex */
public final class C6395c {

    /* renamed from: a */
    public final zzbn f45467a;

    /* renamed from: b */
    public final byte[] f45468b;

    public C6395c(int i) {
        byte[] bArr = new byte[i];
        this.f45468b = bArr;
        this.f45467a = zzbn.zzc(bArr);
    }

    /* renamed from: a */
    public final zzbb m48302a() {
        if (this.f45467a.zzag() == 0) {
            return new zzbi(this.f45468b);
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }

    /* renamed from: b */
    public final zzbn m48301b() {
        return this.f45467a;
    }

    public /* synthetic */ C6395c(int i, C18616Vd2 c18616Vd2) {
        this(i);
    }
}
