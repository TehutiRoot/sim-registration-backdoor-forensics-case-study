package com.google.android.gms.internal.mlkit_vision_barcode;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.y */
/* loaded from: classes3.dex */
public final class C6553y extends AbstractC6549u {
    public /* synthetic */ C6553y(zzee zzeeVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.AbstractC6549u
    /* renamed from: a */
    public final C6551w mo47085a(zzec zzecVar, C6551w c6551w) {
        C6551w c6551w2;
        synchronized (zzecVar) {
            try {
                c6551w2 = zzecVar.f46596b;
                if (c6551w2 != c6551w) {
                    zzecVar.f46596b = c6551w;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c6551w2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.AbstractC6549u
    /* renamed from: b */
    public final C6526B mo47084b(zzec zzecVar, C6526B c6526b) {
        C6526B c6526b2;
        synchronized (zzecVar) {
            try {
                c6526b2 = zzecVar.f46597c;
                if (c6526b2 != c6526b) {
                    zzecVar.f46597c = c6526b;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c6526b2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.AbstractC6549u
    /* renamed from: c */
    public final void mo47083c(C6526B c6526b, C6526B c6526b2) {
        c6526b.f46530b = c6526b2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.AbstractC6549u
    /* renamed from: d */
    public final void mo47082d(C6526B c6526b, Thread thread) {
        c6526b.f46529a = thread;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.AbstractC6549u
    /* renamed from: e */
    public final boolean mo47081e(zzec zzecVar, C6551w c6551w, C6551w c6551w2) {
        C6551w c6551w3;
        synchronized (zzecVar) {
            try {
                c6551w3 = zzecVar.f46596b;
                if (c6551w3 == c6551w) {
                    zzecVar.f46596b = c6551w2;
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.AbstractC6549u
    /* renamed from: f */
    public final boolean mo47080f(zzec zzecVar, Object obj, Object obj2) {
        Object obj3;
        synchronized (zzecVar) {
            try {
                obj3 = zzecVar.f46595a;
                if (obj3 == obj) {
                    zzecVar.f46595a = obj2;
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.AbstractC6549u
    /* renamed from: g */
    public final boolean mo47079g(zzec zzecVar, C6526B c6526b, C6526B c6526b2) {
        C6526B c6526b3;
        synchronized (zzecVar) {
            try {
                c6526b3 = zzecVar.f46597c;
                if (c6526b3 == c6526b) {
                    zzecVar.f46597c = c6526b2;
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}