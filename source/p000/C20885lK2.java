package p000;

import android.app.Activity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: lK2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C20885lK2 extends LifecycleCallback {

    /* renamed from: a */
    public final List f71593a;

    public C20885lK2(LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment);
        this.f71593a = new ArrayList();
        this.mLifecycleFragment.addCallback("TaskOnStopCallback", this);
    }

    /* renamed from: a */
    public static C20885lK2 m26482a(Activity activity) {
        C20885lK2 c20885lK2;
        LifecycleFragment fragment = LifecycleCallback.getFragment(activity);
        synchronized (fragment) {
            try {
                c20885lK2 = (C20885lK2) fragment.getCallbackOrNull("TaskOnStopCallback", C20885lK2.class);
                if (c20885lK2 == null) {
                    c20885lK2 = new C20885lK2(fragment);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c20885lK2;
    }

    /* renamed from: b */
    public final void m26481b(QI2 qi2) {
        synchronized (this.f71593a) {
            this.f71593a.add(new WeakReference(qi2));
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStop() {
        synchronized (this.f71593a) {
            try {
                for (WeakReference weakReference : this.f71593a) {
                    QI2 qi2 = (QI2) weakReference.get();
                    if (qi2 != null) {
                        qi2.zzc();
                    }
                }
                this.f71593a.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
