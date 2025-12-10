package com.google.common.base;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.internal.Finalizer;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

@J2ktIncompatible
@GwtIncompatible
/* loaded from: classes4.dex */
public class FinalizableReferenceQueue implements Closeable {

    /* renamed from: d */
    public static final Logger f52739d = Logger.getLogger(FinalizableReferenceQueue.class.getName());

    /* renamed from: e */
    public static final Method f52740e = m41330g(m41329i(new C7424d(), new C7421a(), new C7422b()));

    /* renamed from: a */
    public final ReferenceQueue f52741a;

    /* renamed from: b */
    public final PhantomReference f52742b;

    /* renamed from: c */
    public final boolean f52743c;

    /* renamed from: com.google.common.base.FinalizableReferenceQueue$a */
    /* loaded from: classes4.dex */
    public static class C7421a implements InterfaceC7423c {
        @Override // com.google.common.base.FinalizableReferenceQueue.InterfaceC7423c
        /* renamed from: a */
        public Class mo41326a() {
            try {
                return m41327c(m41328b()).loadClass("com.google.common.base.internal.Finalizer");
            } catch (Exception e) {
                FinalizableReferenceQueue.f52739d.log(Level.WARNING, "Could not load Finalizer in its own class loader. Loading Finalizer in the current class loader instead. As a result, you will not be able to garbage collect this class loader. To support reclaiming this class loader, either resolve the underlying issue, or move Guava to your system class path.", (Throwable) e);
                return null;
            }
        }

        /* renamed from: b */
        public URL m41328b() {
            String str = "com.google.common.base.internal.Finalizer".replace('.', '/') + ".class";
            URL resource = getClass().getClassLoader().getResource(str);
            if (resource != null) {
                String url = resource.toString();
                if (url.endsWith(str)) {
                    return new URL(resource, url.substring(0, url.length() - str.length()));
                }
                throw new IOException("Unsupported path style: " + url);
            }
            throw new FileNotFoundException(str);
        }

        /* renamed from: c */
        public URLClassLoader m41327c(URL url) {
            return new URLClassLoader(new URL[]{url}, null);
        }
    }

    /* renamed from: com.google.common.base.FinalizableReferenceQueue$b */
    /* loaded from: classes4.dex */
    public static class C7422b implements InterfaceC7423c {
        @Override // com.google.common.base.FinalizableReferenceQueue.InterfaceC7423c
        /* renamed from: a */
        public Class mo41326a() {
            try {
                Logger logger = Finalizer.f52810d;
                return Finalizer.class;
            } catch (ClassNotFoundException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* renamed from: com.google.common.base.FinalizableReferenceQueue$c */
    /* loaded from: classes4.dex */
    public interface InterfaceC7423c {
        /* renamed from: a */
        Class mo41326a();
    }

    /* renamed from: com.google.common.base.FinalizableReferenceQueue$d */
    /* loaded from: classes4.dex */
    public static class C7424d implements InterfaceC7423c {

        /* renamed from: a */
        public static boolean f52744a;

        @Override // com.google.common.base.FinalizableReferenceQueue.InterfaceC7423c
        /* renamed from: a */
        public Class mo41326a() {
            if (f52744a) {
                return null;
            }
            try {
                ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
                if (systemClassLoader != null) {
                    try {
                        return systemClassLoader.loadClass("com.google.common.base.internal.Finalizer");
                    } catch (ClassNotFoundException unused) {
                    }
                }
                return null;
            } catch (SecurityException unused2) {
                FinalizableReferenceQueue.f52739d.info("Not allowed to access system class loader.");
                return null;
            }
        }
    }

    public FinalizableReferenceQueue() {
        boolean z = true;
        ReferenceQueue referenceQueue = new ReferenceQueue();
        this.f52741a = referenceQueue;
        PhantomReference phantomReference = new PhantomReference(this, referenceQueue);
        this.f52742b = phantomReference;
        try {
            f52740e.invoke(null, FinalizableReference.class, referenceQueue, phantomReference);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (Throwable th2) {
            f52739d.log(Level.INFO, "Failed to start reference finalizer thread. Reference cleanup will only occur when new references are created.", th2);
            z = false;
        }
        this.f52743c = z;
    }

    /* renamed from: g */
    public static Method m41330g(Class cls) {
        try {
            return cls.getMethod("startFinalizer", Class.class, ReferenceQueue.class, PhantomReference.class);
        } catch (NoSuchMethodException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: i */
    public static Class m41329i(InterfaceC7423c... interfaceC7423cArr) {
        for (InterfaceC7423c interfaceC7423c : interfaceC7423cArr) {
            Class mo41326a = interfaceC7423c.mo41326a();
            if (mo41326a != null) {
                return mo41326a;
            }
        }
        throw new AssertionError();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f52742b.enqueue();
        m41331d();
    }

    /* renamed from: d */
    public void m41331d() {
        if (this.f52743c) {
            return;
        }
        while (true) {
            Reference poll = this.f52741a.poll();
            if (poll != null) {
                poll.clear();
                try {
                    ((FinalizableReference) poll).finalizeReferent();
                } catch (Throwable th2) {
                    f52739d.log(Level.SEVERE, "Error cleaning up after reference.", th2);
                }
            } else {
                return;
            }
        }
    }
}
