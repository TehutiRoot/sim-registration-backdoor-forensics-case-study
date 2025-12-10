package p000;

import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;

/* renamed from: eg1 */
/* loaded from: classes4.dex */
public class C19732eg1 implements Provider, Deferred {

    /* renamed from: c */
    public static final Deferred.DeferredHandler f61562c = new Deferred.DeferredHandler() { // from class: bg1
        @Override // com.google.firebase.inject.Deferred.DeferredHandler
        public final void handle(Provider provider) {
            C19732eg1.m31510c(provider);
        }
    };

    /* renamed from: d */
    public static final Provider f61563d = new Provider() { // from class: cg1
        @Override // com.google.firebase.inject.Provider
        public final Object get() {
            return C19732eg1.m31512a();
        }
    };

    /* renamed from: a */
    public Deferred.DeferredHandler f61564a;

    /* renamed from: b */
    public volatile Provider f61565b;

    public C19732eg1(Deferred.DeferredHandler deferredHandler, Provider provider) {
        this.f61564a = deferredHandler;
        this.f61565b = provider;
    }

    /* renamed from: a */
    public static /* synthetic */ Object m31512a() {
        return m31507f();
    }

    /* renamed from: b */
    public static /* synthetic */ void m31511b(Deferred.DeferredHandler deferredHandler, Deferred.DeferredHandler deferredHandler2, Provider provider) {
        m31506g(deferredHandler, deferredHandler2, provider);
    }

    /* renamed from: c */
    public static /* synthetic */ void m31510c(Provider provider) {
        m31508e(provider);
    }

    /* renamed from: d */
    public static C19732eg1 m31509d() {
        return new C19732eg1(f61562c, f61563d);
    }

    /* renamed from: f */
    public static /* synthetic */ Object m31507f() {
        return null;
    }

    /* renamed from: g */
    public static /* synthetic */ void m31506g(Deferred.DeferredHandler deferredHandler, Deferred.DeferredHandler deferredHandler2, Provider provider) {
        deferredHandler.handle(provider);
        deferredHandler2.handle(provider);
    }

    /* renamed from: h */
    public static C19732eg1 m31505h(Provider provider) {
        return new C19732eg1(null, provider);
    }

    @Override // com.google.firebase.inject.Provider
    public Object get() {
        return this.f61565b.get();
    }

    /* renamed from: i */
    public void m31504i(Provider provider) {
        Deferred.DeferredHandler deferredHandler;
        if (this.f61565b == f61563d) {
            synchronized (this) {
                deferredHandler = this.f61564a;
                this.f61564a = null;
                this.f61565b = provider;
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
        Provider provider3 = this.f61565b;
        Provider provider4 = f61563d;
        if (provider3 != provider4) {
            deferredHandler.handle(provider3);
            return;
        }
        synchronized (this) {
            provider = this.f61565b;
            if (provider != provider4) {
                provider2 = provider;
            } else {
                final Deferred.DeferredHandler deferredHandler2 = this.f61564a;
                this.f61564a = new Deferred.DeferredHandler() { // from class: dg1
                    @Override // com.google.firebase.inject.Deferred.DeferredHandler
                    public final void handle(Provider provider5) {
                        C19732eg1.m31511b(Deferred.DeferredHandler.this, deferredHandler, provider5);
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
    public static /* synthetic */ void m31508e(Provider provider) {
    }
}
