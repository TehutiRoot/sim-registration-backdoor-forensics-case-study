package io.realm.internal;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class NativeObjectReference extends PhantomReference<NativeObject> {

    /* renamed from: f */
    public static C11299b f66672f = new C11299b();

    /* renamed from: a */
    public final long f66673a;

    /* renamed from: b */
    public final long f66674b;

    /* renamed from: c */
    public final NativeContext f66675c;

    /* renamed from: d */
    public NativeObjectReference f66676d;

    /* renamed from: e */
    public NativeObjectReference f66677e;

    /* renamed from: io.realm.internal.NativeObjectReference$b */
    /* loaded from: classes5.dex */
    public static class C11299b {

        /* renamed from: a */
        public NativeObjectReference f66678a;

        public C11299b() {
        }

        /* renamed from: a */
        public synchronized void m29553a(NativeObjectReference nativeObjectReference) {
            try {
                nativeObjectReference.f66676d = null;
                nativeObjectReference.f66677e = this.f66678a;
                NativeObjectReference nativeObjectReference2 = this.f66678a;
                if (nativeObjectReference2 != null) {
                    nativeObjectReference2.f66676d = nativeObjectReference;
                }
                this.f66678a = nativeObjectReference;
            } catch (Throwable th2) {
                throw th2;
            }
        }

        /* renamed from: b */
        public synchronized void m29552b(NativeObjectReference nativeObjectReference) {
            try {
                NativeObjectReference nativeObjectReference2 = nativeObjectReference.f66677e;
                NativeObjectReference nativeObjectReference3 = nativeObjectReference.f66676d;
                nativeObjectReference.f66677e = null;
                nativeObjectReference.f66676d = null;
                if (nativeObjectReference3 != null) {
                    nativeObjectReference3.f66677e = nativeObjectReference2;
                } else {
                    this.f66678a = nativeObjectReference2;
                }
                if (nativeObjectReference2 != null) {
                    nativeObjectReference2.f66676d = nativeObjectReference3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public NativeObjectReference(NativeContext nativeContext, NativeObject nativeObject, ReferenceQueue referenceQueue) {
        super(nativeObject, referenceQueue);
        this.f66673a = nativeObject.getNativePtr();
        this.f66674b = nativeObject.getNativeFinalizerPtr();
        this.f66675c = nativeContext;
        f66672f.m29553a(this);
    }

    public static native void nativeCleanUp(long j, long j2);

    /* renamed from: e */
    public void m29554e() {
        synchronized (this.f66675c) {
            nativeCleanUp(this.f66674b, this.f66673a);
        }
        f66672f.m29552b(this);
    }
}
