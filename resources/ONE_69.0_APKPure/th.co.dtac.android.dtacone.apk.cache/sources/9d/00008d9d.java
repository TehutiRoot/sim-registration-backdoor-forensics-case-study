package com.google.android.gms.internal.clearcut;

/* renamed from: com.google.android.gms.internal.clearcut.c */
/* loaded from: classes3.dex */
public final class C6384c {

    /* renamed from: a */
    public final zzbn f45479a;

    /* renamed from: b */
    public final byte[] f45480b;

    public C6384c(int i) {
        byte[] bArr = new byte[i];
        this.f45480b = bArr;
        this.f45479a = zzbn.zzc(bArr);
    }

    /* renamed from: a */
    public final zzbb m48299a() {
        if (this.f45479a.zzag() == 0) {
            return new zzbi(this.f45480b);
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }

    /* renamed from: b */
    public final zzbn m48298b() {
        return this.f45479a;
    }

    public /* synthetic */ C6384c(int i, C18468Se2 c18468Se2) {
        this(i);
    }
}