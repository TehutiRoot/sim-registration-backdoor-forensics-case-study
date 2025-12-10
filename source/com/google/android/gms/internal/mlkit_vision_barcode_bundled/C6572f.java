package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.f */
/* loaded from: classes3.dex */
public final class C6572f extends AbstractC18561Ug2 {

    /* renamed from: a */
    public final C6574h f46866a;

    /* renamed from: b */
    public zzcw f46867b = m46919a();

    /* renamed from: c */
    public final /* synthetic */ zzgg f46868c;

    public C6572f(zzgg zzggVar) {
        this.f46868c = zzggVar;
        this.f46866a = new C6574h(zzggVar, null);
    }

    /* renamed from: a */
    public final zzcw m46919a() {
        C6574h c6574h = this.f46866a;
        if (c6574h.hasNext()) {
            return c6574h.next().iterator();
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f46867b != null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcw
    public final byte zza() {
        zzcw zzcwVar = this.f46867b;
        if (zzcwVar != null) {
            byte zza = zzcwVar.zza();
            if (!this.f46867b.hasNext()) {
                this.f46867b = m46919a();
            }
            return zza;
        }
        throw new NoSuchElementException();
    }
}
