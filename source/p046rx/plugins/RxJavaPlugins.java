package p046rx.plugins;

import java.util.Properties;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: rx.plugins.RxJavaPlugins */
/* loaded from: classes7.dex */
public class RxJavaPlugins {

    /* renamed from: f */
    public static final RxJavaPlugins f79419f = new RxJavaPlugins();

    /* renamed from: g */
    public static final RxJavaErrorHandler f79420g = new C13857a();

    /* renamed from: a */
    public final AtomicReference f79421a = new AtomicReference();

    /* renamed from: b */
    public final AtomicReference f79422b = new AtomicReference();

    /* renamed from: c */
    public final AtomicReference f79423c = new AtomicReference();

    /* renamed from: d */
    public final AtomicReference f79424d = new AtomicReference();

    /* renamed from: e */
    public final AtomicReference f79425e = new AtomicReference();

    /* renamed from: rx.plugins.RxJavaPlugins$a */
    /* loaded from: classes7.dex */
    public static class C13857a extends RxJavaErrorHandler {
    }

    /* renamed from: rx.plugins.RxJavaPlugins$b */
    /* loaded from: classes7.dex */
    public class C13858b extends RxJavaCompletableExecutionHook {
        public C13858b() {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
        r2 = "rxjava.plugin." + r7.substring(0, r7.length() - 6).substring(14) + ".impl";
        r1 = r10.getProperty(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0087, code lost:
        if (r1 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a8, code lost:
        throw new java.lang.IllegalStateException("Implementing class declaration for " + r0 + " missing: " + r2);
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object m22760a(java.lang.Class r9, java.util.Properties r10) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p046rx.plugins.RxJavaPlugins.m22760a(java.lang.Class, java.util.Properties):java.lang.Object");
    }

    /* renamed from: b */
    public static Properties m22759b() {
        try {
            return System.getProperties();
        } catch (SecurityException unused) {
            return new Properties();
        }
    }

    @Deprecated
    public static RxJavaPlugins getInstance() {
        return f79419f;
    }

    public RxJavaCompletableExecutionHook getCompletableExecutionHook() {
        if (this.f79424d.get() == null) {
            Object m22760a = m22760a(RxJavaCompletableExecutionHook.class, m22759b());
            if (m22760a == null) {
                AbstractC17300An1.m69050a(this.f79424d, null, new C13858b());
            } else {
                AbstractC17300An1.m69050a(this.f79424d, null, (RxJavaCompletableExecutionHook) m22760a);
            }
        }
        return (RxJavaCompletableExecutionHook) this.f79424d.get();
    }

    public RxJavaErrorHandler getErrorHandler() {
        if (this.f79421a.get() == null) {
            Object m22760a = m22760a(RxJavaErrorHandler.class, m22759b());
            if (m22760a == null) {
                AbstractC17300An1.m69050a(this.f79421a, null, f79420g);
            } else {
                AbstractC17300An1.m69050a(this.f79421a, null, (RxJavaErrorHandler) m22760a);
            }
        }
        return (RxJavaErrorHandler) this.f79421a.get();
    }

    public RxJavaObservableExecutionHook getObservableExecutionHook() {
        if (this.f79422b.get() == null) {
            Object m22760a = m22760a(RxJavaObservableExecutionHook.class, m22759b());
            if (m22760a == null) {
                AbstractC17300An1.m69050a(this.f79422b, null, BB1.m68987a());
            } else {
                AbstractC17300An1.m69050a(this.f79422b, null, (RxJavaObservableExecutionHook) m22760a);
            }
        }
        return (RxJavaObservableExecutionHook) this.f79422b.get();
    }

    public RxJavaSchedulersHook getSchedulersHook() {
        if (this.f79425e.get() == null) {
            Object m22760a = m22760a(RxJavaSchedulersHook.class, m22759b());
            if (m22760a == null) {
                AbstractC17300An1.m69050a(this.f79425e, null, RxJavaSchedulersHook.getDefaultInstance());
            } else {
                AbstractC17300An1.m69050a(this.f79425e, null, (RxJavaSchedulersHook) m22760a);
            }
        }
        return (RxJavaSchedulersHook) this.f79425e.get();
    }

    public RxJavaSingleExecutionHook getSingleExecutionHook() {
        if (this.f79423c.get() == null) {
            Object m22760a = m22760a(RxJavaSingleExecutionHook.class, m22759b());
            if (m22760a == null) {
                AbstractC17300An1.m69050a(this.f79423c, null, CB1.m68820a());
            } else {
                AbstractC17300An1.m69050a(this.f79423c, null, (RxJavaSingleExecutionHook) m22760a);
            }
        }
        return (RxJavaSingleExecutionHook) this.f79423c.get();
    }

    public void registerCompletableExecutionHook(RxJavaCompletableExecutionHook rxJavaCompletableExecutionHook) {
        if (AbstractC17300An1.m69050a(this.f79424d, null, rxJavaCompletableExecutionHook)) {
            return;
        }
        throw new IllegalStateException("Another strategy was already registered: " + this.f79423c.get());
    }

    public void registerErrorHandler(RxJavaErrorHandler rxJavaErrorHandler) {
        if (AbstractC17300An1.m69050a(this.f79421a, null, rxJavaErrorHandler)) {
            return;
        }
        throw new IllegalStateException("Another strategy was already registered: " + this.f79421a.get());
    }

    public void registerObservableExecutionHook(RxJavaObservableExecutionHook rxJavaObservableExecutionHook) {
        if (AbstractC17300An1.m69050a(this.f79422b, null, rxJavaObservableExecutionHook)) {
            return;
        }
        throw new IllegalStateException("Another strategy was already registered: " + this.f79422b.get());
    }

    public void registerSchedulersHook(RxJavaSchedulersHook rxJavaSchedulersHook) {
        if (AbstractC17300An1.m69050a(this.f79425e, null, rxJavaSchedulersHook)) {
            return;
        }
        throw new IllegalStateException("Another strategy was already registered: " + this.f79425e.get());
    }

    public void registerSingleExecutionHook(RxJavaSingleExecutionHook rxJavaSingleExecutionHook) {
        if (AbstractC17300An1.m69050a(this.f79423c, null, rxJavaSingleExecutionHook)) {
            return;
        }
        throw new IllegalStateException("Another strategy was already registered: " + this.f79423c.get());
    }

    public void reset() {
        RxJavaPlugins rxJavaPlugins = f79419f;
        rxJavaPlugins.f79421a.set(null);
        rxJavaPlugins.f79422b.set(null);
        rxJavaPlugins.f79423c.set(null);
        rxJavaPlugins.f79424d.set(null);
        rxJavaPlugins.f79425e.set(null);
    }
}
