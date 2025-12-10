package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.x */
/* loaded from: classes3.dex */
public final class C6563x extends AbstractC6560u {

    /* renamed from: a */
    public final AtomicReferenceFieldUpdater f46566a;

    /* renamed from: b */
    public final AtomicReferenceFieldUpdater f46567b;

    /* renamed from: c */
    public final AtomicReferenceFieldUpdater f46568c;

    /* renamed from: d */
    public final AtomicReferenceFieldUpdater f46569d;

    /* renamed from: e */
    public final AtomicReferenceFieldUpdater f46570e;

    public C6563x(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(null);
        this.f46566a = atomicReferenceFieldUpdater;
        this.f46567b = atomicReferenceFieldUpdater2;
        this.f46568c = atomicReferenceFieldUpdater3;
        this.f46569d = atomicReferenceFieldUpdater4;
        this.f46570e = atomicReferenceFieldUpdater5;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.AbstractC6560u
    /* renamed from: a */
    public final C6562w mo47076a(zzec zzecVar, C6562w c6562w) {
        return (C6562w) this.f46569d.getAndSet(zzecVar, c6562w);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.AbstractC6560u
    /* renamed from: b */
    public final C6537B mo47075b(zzec zzecVar, C6537B c6537b) {
        return (C6537B) this.f46568c.getAndSet(zzecVar, c6537b);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.AbstractC6560u
    /* renamed from: c */
    public final void mo47074c(C6537B c6537b, C6537B c6537b2) {
        this.f46567b.lazySet(c6537b, c6537b2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.AbstractC6560u
    /* renamed from: d */
    public final void mo47073d(C6537B c6537b, Thread thread) {
        this.f46566a.lazySet(c6537b, thread);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.AbstractC6560u
    /* renamed from: e */
    public final boolean mo47072e(zzec zzecVar, C6562w c6562w, C6562w c6562w2) {
        return zzed.zza(this.f46569d, zzecVar, c6562w, c6562w2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.AbstractC6560u
    /* renamed from: f */
    public final boolean mo47071f(zzec zzecVar, Object obj, Object obj2) {
        return zzed.zza(this.f46570e, zzecVar, obj, obj2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.AbstractC6560u
    /* renamed from: g */
    public final boolean mo47070g(zzec zzecVar, C6537B c6537b, C6537B c6537b2) {
        return zzed.zza(this.f46568c, zzecVar, c6537b, c6537b2);
    }
}
