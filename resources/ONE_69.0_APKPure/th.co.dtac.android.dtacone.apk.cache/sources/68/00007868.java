package p000;

import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;

/* renamed from: bh1 */
/* loaded from: classes4.dex */
public class C19267bh1 implements Provider, Deferred {

    /* renamed from: c */
    public static final Deferred.DeferredHandler f39193c = new Deferred.DeferredHandler() { // from class: Yg1
        @Override // com.google.firebase.inject.Deferred.DeferredHandler
        public final void handle(Provider provider) {
            C19267bh1.m51894c(provider);
        }
    };

    /* renamed from: d */
    public static final Provider f39194d = new Provider() { // from class: Zg1
        @Override // com.google.firebase.inject.Provider
        public final Object get() {
            return C19267bh1.m51896a();
        }
    };

    /* renamed from: a */
    public Deferred.DeferredHandler f39195a;

    /* renamed from: b */
    public volatile Provider f39196b;

    public C19267bh1(Deferred.DeferredHandler deferredHandler, Provider provider) {
        this.f39195a = deferredHandler;
        this.f39196b = provider;
    }

    /* renamed from: a */
    public static /* synthetic */ Object m51896a() {
        return m51891f();
    }

    /* renamed from: b */
    public static /* synthetic */ void m51895b(Deferred.DeferredHandler deferredHandler, Deferred.DeferredHandler deferredHandler2, Provider provider) {
        m51890g(deferredHandler, deferredHandler2, provider);
    }

    /* renamed from: c */
    public static /* synthetic */ void m51894c(Provider provider) {
        m51892e(provider);
    }

    /* renamed from: d */
    public static C19267bh1 m51893d() {
        return new C19267bh1(f39193c, f39194d);
    }

    /* renamed from: f */
    public static /* synthetic */ Object m51891f() {
        return null;
    }

    /* renamed from: g */
    public static /* synthetic */ void m51890g(Deferred.DeferredHandler deferredHandler, Deferred.DeferredHandler deferredHandler2, Provider provider) {
        deferredHandler.handle(provider);
        deferredHandler2.handle(provider);
    }

    /* renamed from: h */
    public static C19267bh1 m51889h(Provider provider) {
        return new C19267bh1(null, provider);
    }

    @Override // com.google.firebase.inject.Provider
    public Object get() {
        return this.f39196b.get();
    }

    /* renamed from: i */
    public void m51888i(Provider provider) {
        Deferred.DeferredHandler deferredHandler;
        if (this.f39196b == f39194d) {
            synchronized (this) {
                deferredHandler = this.f39195a;
                this.f39195a = null;
                this.f39196b = provider;
            }
            deferredHandler.handle(provider);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }

    @Override // com.google.firebase.inject.Deferred
    public void whenAvailable(final Deferred.DeferredHandler deferredHandler) {
        Provider provider;
        Provider provider2;
        Provider provider3 = this.f39196b;
        Provider provider4 = f39194d;
        if (provider3 != provider4) {
            deferredHandler.handle(provider3);
            return;
        }
        synchronized (this) {
            provider = this.f39196b;
            if (provider != provider4) {
                provider2 = provider;
            } else {
                final Deferred.DeferredHandler deferredHandler2 = this.f39195a;
                this.f39195a = new Deferred.DeferredHandler() { // from class: ah1
                    @Override // com.google.firebase.inject.Deferred.DeferredHandler
                    public final void handle(Provider provider5) {
                        C19267bh1.m51895b(Deferred.DeferredHandler.this, deferredHandler, provider5);
                    }
                };
                provider2 = null;
            }
        }
        if (provider2 != null) {
            deferredHandler.handle(provider);
        }
    }

    /* renamed from: e */
    public static /* synthetic */ void m51892e(Provider provider) {
    }
}