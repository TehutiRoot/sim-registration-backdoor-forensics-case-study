package p000;

import android.app.Activity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: S82 */
/* loaded from: classes3.dex */
public final class S82 extends LifecycleCallback {

    /* renamed from: a */
    public List f5745a;

    public S82(LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment);
        this.f5745a = new ArrayList();
        this.mLifecycleFragment.addCallback("LifecycleObserverOnStop", this);
    }

    /* renamed from: a */
    public static /* bridge */ /* synthetic */ S82 m66536a(Activity activity) {
        S82 s82;
        synchronized (activity) {
            try {
                LifecycleFragment fragment = LifecycleCallback.getFragment(activity);
                s82 = (S82) fragment.getCallbackOrNull("LifecycleObserverOnStop", S82.class);
                if (s82 == null) {
                    s82 = new S82(fragment);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return s82;
    }

    /* renamed from: c */
    public final synchronized void m66534c(Runnable runnable) {
        this.f5745a.add(runnable);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStop() {
        List<Runnable> list;
        synchronized (this) {
            list = this.f5745a;
            this.f5745a = new ArrayList();
        }
        for (Runnable runnable : list) {
            runnable.run();
        }
    }
}