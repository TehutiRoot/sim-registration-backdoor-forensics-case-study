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
    public static final Logger f52751d = Logger.getLogger(FinalizableReferenceQueue.class.getName());

    /* renamed from: e */
    public static final Method f52752e = m41317g(m41316i(new C7413d(), new C7410a(), new C7411b()));

    /* renamed from: a */
    public final ReferenceQueue f52753a;

    /* renamed from: b */
    public final PhantomReference f52754b;

    /* renamed from: c */
    public final boolean f52755c;

    /* renamed from: com.google.common.base.FinalizableReferenceQueue$a */
    /* loaded from: classes4.dex */
    public static class C7410a implements InterfaceC7412c {
        @Override // com.google.common.base.FinalizableReferenceQueue.InterfaceC7412c
        /* renamed from: a */
        public Class mo41313a() {
            try {
                return m41314c(m41315b()).loadClass("com.google.common.base.internal.Finalizer");
            } catch (Exception e) {
                FinalizableReferenceQueue.f52751d.log(Level.WARNING, "Could not load Finalizer in its own class loader. Loading Finalizer in the current class loader instead. As a result, you will not be able to garbage collect this class loader. To support reclaiming this class loader, either resolve the underlying issue, or move Guava to your system class path.", (Throwable) e);
                return null;
            }
        }

        /* renamed from: b */
        public URL m41315b() {
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
        public URLClassLoader m41314c(URL url) {
            return new URLClassLoader(new URL[]{url}, null);
        }
    }

    /* renamed from: com.google.common.base.FinalizableReferenceQueue$b */
    /* loaded from: classes4.dex */
    public static class C7411b implements InterfaceC7412c {
        @Override // com.google.common.base.FinalizableReferenceQueue.InterfaceC7412c
        /* renamed from: a */
        public Class mo41313a() {
            try {
                Logger logger = Finalizer.f52822d;
                return Finalizer.class;
            } catch (ClassNotFoundException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* renamed from: com.google.common.base.FinalizableReferenceQueue$c */
    /* loaded from: classes4.dex */
    public interface InterfaceC7412c {
        /* renamed from: a */
        Class mo41313a();
    }

    /* renamed from: com.google.common.base.FinalizableReferenceQueue$d */
    /* loaded from: classes4.dex */
    public static class C7413d implements InterfaceC7412c {

        /* renamed from: a */
        public static boolean f52756a;

        @Override // com.google.common.base.FinalizableReferenceQueue.InterfaceC7412c
        /* renamed from: a */
        public Class mo41313a() {
            if (f52756a) {
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
                FinalizableReferenceQueue.f52751d.info("Not allowed to access system class loader.");
                return null;
            }
        }
    }

    public FinalizableReferenceQueue() {
        boolean z = true;
        ReferenceQueue referenceQueue = new ReferenceQueue();
        this.f52753a = referenceQueue;
        PhantomReference phantomReference = new PhantomReference(this, referenceQueue);
        this.f52754b = phantomReference;
        try {
            f52752e.invoke(null, FinalizableReference.class, referenceQueue, phantomReference);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (Throwable th2) {
            f52751d.log(Level.INFO, "Failed to start reference finalizer thread. Reference cleanup will only occur when new references are created.", th2);
            z = false;
        }
        this.f52755c = z;
    }

    /* renamed from: g */
    public static Method m41317g(Class cls) {
        try {
            return cls.getMethod("startFinalizer", Class.class, ReferenceQueue.class, PhantomReference.class);
        } catch (NoSuchMethodException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: i */
    public static Class m41316i(InterfaceC7412c... interfaceC7412cArr) {
        for (InterfaceC7412c interfaceC7412c : interfaceC7412cArr) {
            Class mo41313a = interfaceC7412c.mo41313a();
            if (mo41313a != null) {
                return mo41313a;
            }
        }
        throw new AssertionError();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f52754b.enqueue();
        m41318d();
    }

    /* renamed from: d */
    public void m41318d() {
        if (this.f52755c) {
            return;
        }
        while (true) {
            Reference poll = this.f52753a.poll();
            if (poll != null) {
                poll.clear();
                try {
                    ((FinalizableReference) poll).finalizeReferent();
                } catch (Throwable th2) {
                    f52751d.log(Level.SEVERE, "Error cleaning up after reference.", th2);
                }
            } else {
                return;
            }
        }
    }
}