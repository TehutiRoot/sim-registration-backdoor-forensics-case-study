package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.x */
/* loaded from: classes3.dex */
public final class C6552x extends AbstractC6549u {

    /* renamed from: a */
    public final AtomicReferenceFieldUpdater f46578a;

    /* renamed from: b */
    public final AtomicReferenceFieldUpdater f46579b;

    /* renamed from: c */
    public final AtomicReferenceFieldUpdater f46580c;

    /* renamed from: d */
    public final AtomicReferenceFieldUpdater f46581d;

    /* renamed from: e */
    public final AtomicReferenceFieldUpdater f46582e;

    public C6552x(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(null);
        this.f46578a = atomicReferenceFieldUpdater;
        this.f46579b = atomicReferenceFieldUpdater2;
        this.f46580c = atomicReferenceFieldUpdater3;
        this.f46581d = atomicReferenceFieldUpdater4;
        this.f46582e = atomicReferenceFieldUpdater5;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.AbstractC6549u
    /* renamed from: a */
    public final C6551w mo47085a(zzec zzecVar, C6551w c6551w) {
        return (C6551w) this.f46581d.getAndSet(zzecVar, c6551w);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.AbstractC6549u
    /* renamed from: b */
    public final C6526B mo47084b(zzec zzecVar, C6526B c6526b) {
        return (C6526B) this.f46580c.getAndSet(zzecVar, c6526b);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.AbstractC6549u
    /* renamed from: c */
    public final void mo47083c(C6526B c6526b, C6526B c6526b2) {
        this.f46579b.lazySet(c6526b, c6526b2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.AbstractC6549u
    /* renamed from: d */
    public final void mo47082d(C6526B c6526b, Thread thread) {
        this.f46578a.lazySet(c6526b, thread);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.AbstractC6549u
    /* renamed from: e */
    public final boolean mo47081e(zzec zzecVar, C6551w c6551w, C6551w c6551w2) {
        return zzed.zza(this.f46581d, zzecVar, c6551w, c6551w2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.AbstractC6549u
    /* renamed from: f */
    public final boolean mo47080f(zzec zzecVar, Object obj, Object obj2) {
        return zzed.zza(this.f46582e, zzecVar, obj, obj2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.AbstractC6549u
    /* renamed from: g */
    public final boolean mo47079g(zzec zzecVar, C6526B c6526b, C6526B c6526b2) {
        return zzed.zza(this.f46580c, zzecVar, c6526b, c6526b2);
    }
}