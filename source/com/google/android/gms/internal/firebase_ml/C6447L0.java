package com.google.android.gms.internal.firebase_ml;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.firebase_ml.L0 */
/* loaded from: classes3.dex */
public final class C6447L0 extends DK2 {

    /* renamed from: a */
    public final C6449M0 f45707a;

    /* renamed from: b */
    public zzwi f45708b = m47992a();

    /* renamed from: c */
    public final /* synthetic */ zzzi f45709c;

    public C6447L0(zzzi zzziVar) {
        this.f45709c = zzziVar;
        this.f45707a = new C6449M0(zzziVar, null);
    }

    /* renamed from: a */
    public final zzwi m47992a() {
        if (this.f45707a.hasNext()) {
            return (zzwi) ((zzwk) this.f45707a.next()).iterator();
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f45708b != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzwi
    public final byte nextByte() {
        zzwi zzwiVar = this.f45708b;
        if (zzwiVar != null) {
            byte nextByte = zzwiVar.nextByte();
            if (!this.f45708b.hasNext()) {
                this.f45708b = m47992a();
            }
            return nextByte;
        }
        throw new NoSuchElementException();
    }
}
