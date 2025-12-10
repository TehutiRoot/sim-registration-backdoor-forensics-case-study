package com.google.android.gms.internal.mlkit_vision_barcode;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.y */
/* loaded from: classes3.dex */
public final class C6564y extends AbstractC6560u {
    public /* synthetic */ C6564y(zzee zzeeVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.AbstractC6560u
    /* renamed from: a */
    public final C6562w mo47076a(zzec zzecVar, C6562w c6562w) {
        C6562w c6562w2;
        synchronized (zzecVar) {
            try {
                c6562w2 = zzecVar.f46584b;
                if (c6562w2 != c6562w) {
                    zzecVar.f46584b = c6562w;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c6562w2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.AbstractC6560u
    /* renamed from: b */
    public final C6537B mo47075b(zzec zzecVar, C6537B c6537b) {
        C6537B c6537b2;
        synchronized (zzecVar) {
            try {
                c6537b2 = zzecVar.f46585c;
                if (c6537b2 != c6537b) {
                    zzecVar.f46585c = c6537b;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c6537b2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.AbstractC6560u
    /* renamed from: c */
    public final void mo47074c(C6537B c6537b, C6537B c6537b2) {
        c6537b.f46518b = c6537b2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.AbstractC6560u
    /* renamed from: d */
    public final void mo47073d(C6537B c6537b, Thread thread) {
        c6537b.f46517a = thread;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.AbstractC6560u
    /* renamed from: e */
    public final boolean mo47072e(zzec zzecVar, C6562w c6562w, C6562w c6562w2) {
        C6562w c6562w3;
        synchronized (zzecVar) {
            try {
                c6562w3 = zzecVar.f46584b;
                if (c6562w3 == c6562w) {
                    zzecVar.f46584b = c6562w2;
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.AbstractC6560u
    /* renamed from: f */
    public final boolean mo47071f(zzec zzecVar, Object obj, Object obj2) {
        Object obj3;
        synchronized (zzecVar) {
            try {
                obj3 = zzecVar.f46583a;
                if (obj3 == obj) {
                    zzecVar.f46583a = obj2;
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.AbstractC6560u
    /* renamed from: g */
    public final boolean mo47070g(zzec zzecVar, C6537B c6537b, C6537B c6537b2) {
        C6537B c6537b3;
        synchronized (zzecVar) {
            try {
                c6537b3 = zzecVar.f46585c;
                if (c6537b3 == c6537b) {
                    zzecVar.f46585c = c6537b2;
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
