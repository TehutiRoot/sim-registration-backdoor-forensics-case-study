package com.google.common.base.internal;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes4.dex */
public class Finalizer implements Runnable {

    /* renamed from: d */
    public static final Logger f52822d = Logger.getLogger(Finalizer.class.getName());

    /* renamed from: e */
    public static final Constructor f52823e;

    /* renamed from: f */
    public static final Field f52824f;

    /* renamed from: a */
    public final WeakReference f52825a;

    /* renamed from: b */
    public final PhantomReference f52826b;

    /* renamed from: c */
    public final ReferenceQueue f52827c;

    static {
        Field field;
        Constructor m41228c = m41228c();
        f52823e = m41228c;
        if (m41228c == null) {
            field = m41226f();
        } else {
            field = null;
        }
        f52824f = field;
    }

    public Finalizer(Class cls, ReferenceQueue referenceQueue, PhantomReference phantomReference) {
        this.f52827c = referenceQueue;
        this.f52825a = new WeakReference(cls);
        this.f52826b = phantomReference;
    }

    /* renamed from: c */
    public static Constructor m41228c() {
        try {
            return Thread.class.getConstructor(ThreadGroup.class, Runnable.class, String.class, Long.TYPE, Boolean.TYPE);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: f */
    public static Field m41226f() {
        try {
            Field declaredField = Thread.class.getDeclaredField("inheritableThreadLocals");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            f52822d.log(Level.INFO, "Couldn't access Thread.inheritableThreadLocals. Reference finalizer threads will inherit thread local values.");
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:3|(10:5|6|7|(1:9)|10|11|12|(1:14)|16|17)|24|(0)|10|11|12|(0)|16|17) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
        com.google.common.base.internal.Finalizer.f52822d.log(java.util.logging.Level.INFO, "Failed to clear thread local values inherited by reference finalizer thread.", r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0056 A[Catch: all -> 0x005a, TRY_LEAVE, TryCatch #0 {all -> 0x005a, blocks: (B:15:0x0052, B:17:0x0056), top: B:25:0x0052 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void startFinalizer(java.lang.Class<?> r5, java.lang.ref.ReferenceQueue<java.lang.Object> r6, java.lang.ref.PhantomReference<java.lang.Object> r7) {
        /*
            r0 = 1
            java.lang.String r1 = r5.getName()
            java.lang.String r2 = "com.google.common.base.FinalizableReference"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L68
            com.google.common.base.internal.Finalizer r1 = new com.google.common.base.internal.Finalizer
            r1.<init>(r5, r6, r7)
            java.lang.Class<com.google.common.base.internal.Finalizer> r5 = com.google.common.base.internal.Finalizer.class
            java.lang.String r5 = r5.getName()
            java.lang.reflect.Constructor r6 = com.google.common.base.internal.Finalizer.f52823e
            r7 = 0
            if (r6 == 0) goto L47
            r2 = 0
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L3d
            r3 = 5
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L3d
            r4 = 0
            r3[r4] = r7     // Catch: java.lang.Throwable -> L3d
            r3[r0] = r1     // Catch: java.lang.Throwable -> L3d
            r4 = 2
            r3[r4] = r5     // Catch: java.lang.Throwable -> L3d
            r4 = 3
            r3[r4] = r2     // Catch: java.lang.Throwable -> L3d
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L3d
            r4 = 4
            r3[r4] = r2     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r6 = r6.newInstance(r3)     // Catch: java.lang.Throwable -> L3d
            java.lang.Thread r6 = (java.lang.Thread) r6     // Catch: java.lang.Throwable -> L3d
            goto L48
        L3d:
            r6 = move-exception
            java.util.logging.Logger r2 = com.google.common.base.internal.Finalizer.f52822d
            java.util.logging.Level r3 = java.util.logging.Level.INFO
            java.lang.String r4 = "Failed to create a thread without inherited thread-local values"
            r2.log(r3, r4, r6)
        L47:
            r6 = r7
        L48:
            if (r6 != 0) goto L4f
            java.lang.Thread r6 = new java.lang.Thread
            r6.<init>(r7, r1, r5)
        L4f:
            r6.setDaemon(r0)
            java.lang.reflect.Field r5 = com.google.common.base.internal.Finalizer.f52824f     // Catch: java.lang.Throwable -> L5a
            if (r5 == 0) goto L64
            r5.set(r6, r7)     // Catch: java.lang.Throwable -> L5a
            goto L64
        L5a:
            r5 = move-exception
            java.util.logging.Logger r7 = com.google.common.base.internal.Finalizer.f52822d
            java.util.logging.Level r0 = java.util.logging.Level.INFO
            java.lang.String r1 = "Failed to clear thread local values inherited by reference finalizer thread."
            r7.log(r0, r1, r5)
        L64:
            r6.start()
            return
        L68:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Expected com.google.common.base.FinalizableReference."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.base.internal.Finalizer.startFinalizer(java.lang.Class, java.lang.ref.ReferenceQueue, java.lang.ref.PhantomReference):void");
    }

    /* renamed from: a */
    public final boolean m41230a(Reference reference) {
        Reference poll;
        Method m41227d = m41227d();
        if (m41227d == null || !m41229b(reference, m41227d)) {
            return false;
        }
        do {
            poll = this.f52827c.poll();
            if (poll == null) {
                return true;
            }
        } while (m41229b(poll, m41227d));
        return false;
    }

    /* renamed from: b */
    public final boolean m41229b(Reference reference, Method method) {
        reference.clear();
        if (reference == this.f52826b) {
            return false;
        }
        try {
            method.invoke(reference, null);
            return true;
        } catch (Throwable th2) {
            f52822d.log(Level.SEVERE, "Error cleaning up after reference.", th2);
            return true;
        }
    }

    /* renamed from: d */
    public final Method m41227d() {
        Class cls = (Class) this.f52825a.get();
        if (cls == null) {
            return null;
        }
        try {
            return cls.getMethod("finalizeReferent", null);
        } catch (NoSuchMethodException e) {
            throw new AssertionError(e);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        while (m41230a(this.f52827c.remove())) {
        }
    }
}