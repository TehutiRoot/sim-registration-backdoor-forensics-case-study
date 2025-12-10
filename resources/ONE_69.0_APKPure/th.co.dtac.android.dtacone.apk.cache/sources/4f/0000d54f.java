package io.realm.internal;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class NativeObjectReference extends PhantomReference<NativeObject> {

    /* renamed from: f */
    public static C11286b f66735f = new C11286b();

    /* renamed from: a */
    public final long f66736a;

    /* renamed from: b */
    public final long f66737b;

    /* renamed from: c */
    public final NativeContext f66738c;

    /* renamed from: d */
    public NativeObjectReference f66739d;

    /* renamed from: e */
    public NativeObjectReference f66740e;

    /* renamed from: io.realm.internal.NativeObjectReference$b */
    /* loaded from: classes5.dex */
    public static class C11286b {

        /* renamed from: a */
        public NativeObjectReference f66741a;

        public C11286b() {
        }

        /* renamed from: a */
        public synchronized void m29893a(NativeObjectReference nativeObjectReference) {
            try {
                nativeObjectReference.f66739d = null;
                nativeObjectReference.f66740e = this.f66741a;
                NativeObjectReference nativeObjectReference2 = this.f66741a;
                if (nativeObjectReference2 != null) {
                    nativeObjectReference2.f66739d = nativeObjectReference;
                }
                this.f66741a = nativeObjectReference;
            } catch (Throwable th2) {
                throw th2;
            }
        }

        /* renamed from: b */
        public synchronized void m29892b(NativeObjectReference nativeObjectReference) {
            try {
                NativeObjectReference nativeObjectReference2 = nativeObjectReference.f66740e;
                NativeObjectReference nativeObjectReference3 = nativeObjectReference.f66739d;
                nativeObjectReference.f66740e = null;
                nativeObjectReference.f66739d = null;
                if (nativeObjectReference3 != null) {
                    nativeObjectReference3.f66740e = nativeObjectReference2;
                } else {
                    this.f66741a = nativeObjectReference2;
                }
                if (nativeObjectReference2 != null) {
                    nativeObjectReference2.f66739d = nativeObjectReference3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public NativeObjectReference(NativeContext nativeContext, NativeObject nativeObject, ReferenceQueue referenceQueue) {
        super(nativeObject, referenceQueue);
        this.f66736a = nativeObject.getNativePtr();
        this.f66737b = nativeObject.getNativeFinalizerPtr();
        this.f66738c = nativeContext;
        f66735f.m29893a(this);
    }

    public static native void nativeCleanUp(long j, long j2);

    /* renamed from: e */
    public void m29894e() {
        synchronized (this.f66738c) {
            nativeCleanUp(this.f66737b, this.f66736a);
        }
        f66735f.m29892b(this);
    }
}