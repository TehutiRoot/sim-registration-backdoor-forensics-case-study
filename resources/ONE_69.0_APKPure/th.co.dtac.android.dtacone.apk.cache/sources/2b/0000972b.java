package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.f */
/* loaded from: classes3.dex */
public final class C6561f extends AbstractC18412Rh2 {

    /* renamed from: a */
    public final C6563h f46878a;

    /* renamed from: b */
    public zzcw f46879b = m46911a();

    /* renamed from: c */
    public final /* synthetic */ zzgg f46880c;

    public C6561f(zzgg zzggVar) {
        this.f46880c = zzggVar;
        this.f46878a = new C6563h(zzggVar, null);
    }

    /* renamed from: a */
    public final zzcw m46911a() {
        C6563h c6563h = this.f46878a;
        if (c6563h.hasNext()) {
            return c6563h.next().iterator();
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f46879b != null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcw
    public final byte zza() {
        zzcw zzcwVar = this.f46879b;
        if (zzcwVar != null) {
            byte zza = zzcwVar.zza();
            if (!this.f46879b.hasNext()) {
                this.f46879b = m46911a();
            }
            return zza;
        }
        throw new NoSuchElementException();
    }
}