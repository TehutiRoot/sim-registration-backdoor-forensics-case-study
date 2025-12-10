package p046rx.android.plugins;

import java.util.concurrent.atomic.AtomicReference;
import p046rx.annotations.Experimental;

/* renamed from: rx.android.plugins.RxAndroidPlugins */
/* loaded from: classes5.dex */
public final class RxAndroidPlugins {

    /* renamed from: b */
    public static final RxAndroidPlugins f77907b = new RxAndroidPlugins();

    /* renamed from: a */
    public final AtomicReference f77908a = new AtomicReference();

    public static RxAndroidPlugins getInstance() {
        return f77907b;
    }

    public RxAndroidSchedulersHook getSchedulersHook() {
        if (this.f77908a.get() == null) {
            AbstractC23094xo1.m479a(this.f77908a, null, RxAndroidSchedulersHook.getDefaultInstance());
        }
        return (RxAndroidSchedulersHook) this.f77908a.get();
    }

    public void registerSchedulersHook(RxAndroidSchedulersHook rxAndroidSchedulersHook) {
        if (AbstractC23094xo1.m479a(this.f77908a, null, rxAndroidSchedulersHook)) {
            return;
        }
        throw new IllegalStateException("Another strategy was already registered: " + this.f77908a.get());
    }

    @Experimental
    public void reset() {
        this.f77908a.set(null);
    }
}