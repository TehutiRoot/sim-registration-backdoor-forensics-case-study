package p046rx.android.plugins;

import java.util.concurrent.atomic.AtomicReference;
import p046rx.annotations.Experimental;

/* renamed from: rx.android.plugins.RxAndroidPlugins */
/* loaded from: classes5.dex */
public final class RxAndroidPlugins {

    /* renamed from: b */
    public static final RxAndroidPlugins f77701b = new RxAndroidPlugins();

    /* renamed from: a */
    public final AtomicReference f77702a = new AtomicReference();

    public static RxAndroidPlugins getInstance() {
        return f77701b;
    }

    public RxAndroidSchedulersHook getSchedulersHook() {
        if (this.f77702a.get() == null) {
            AbstractC17300An1.m69050a(this.f77702a, null, RxAndroidSchedulersHook.getDefaultInstance());
        }
        return (RxAndroidSchedulersHook) this.f77702a.get();
    }

    public void registerSchedulersHook(RxAndroidSchedulersHook rxAndroidSchedulersHook) {
        if (AbstractC17300An1.m69050a(this.f77702a, null, rxAndroidSchedulersHook)) {
            return;
        }
        throw new IllegalStateException("Another strategy was already registered: " + this.f77702a.get());
    }

    @Experimental
    public void reset() {
        this.f77702a.set(null);
    }
}
