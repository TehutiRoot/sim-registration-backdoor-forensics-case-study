package p000;

import android.app.Activity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: V72 */
/* loaded from: classes3.dex */
public final class V72 extends LifecycleCallback {

    /* renamed from: a */
    public List f6557a;

    public V72(LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment);
        this.f6557a = new ArrayList();
        this.mLifecycleFragment.addCallback("LifecycleObserverOnStop", this);
    }

    /* renamed from: a */
    public static /* bridge */ /* synthetic */ V72 m65908a(Activity activity) {
        V72 v72;
        synchronized (activity) {
            try {
                LifecycleFragment fragment = LifecycleCallback.getFragment(activity);
                v72 = (V72) fragment.getCallbackOrNull("LifecycleObserverOnStop", V72.class);
                if (v72 == null) {
                    v72 = new V72(fragment);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return v72;
    }

    /* renamed from: c */
    public final synchronized void m65906c(Runnable runnable) {
        this.f6557a.add(runnable);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStop() {
        List<Runnable> list;
        synchronized (this) {
            list = this.f6557a;
            this.f6557a = new ArrayList();
        }
        for (Runnable runnable : list) {
            runnable.run();
        }
    }
}
