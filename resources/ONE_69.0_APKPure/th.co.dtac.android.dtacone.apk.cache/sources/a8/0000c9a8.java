package p000;

import android.app.Activity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: iL2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C20426iL2 extends LifecycleCallback {

    /* renamed from: a */
    public final List f62834a;

    public C20426iL2(LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment);
        this.f62834a = new ArrayList();
        this.mLifecycleFragment.addCallback("TaskOnStopCallback", this);
    }

    /* renamed from: a */
    public static C20426iL2 m30982a(Activity activity) {
        C20426iL2 c20426iL2;
        LifecycleFragment fragment = LifecycleCallback.getFragment(activity);
        synchronized (fragment) {
            try {
                c20426iL2 = (C20426iL2) fragment.getCallbackOrNull("TaskOnStopCallback", C20426iL2.class);
                if (c20426iL2 == null) {
                    c20426iL2 = new C20426iL2(fragment);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c20426iL2;
    }

    /* renamed from: b */
    public final void m30981b(NJ2 nj2) {
        synchronized (this.f62834a) {
            this.f62834a.add(new WeakReference(nj2));
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStop() {
        synchronized (this.f62834a) {
            try {
                for (WeakReference weakReference : this.f62834a) {
                    NJ2 nj2 = (NJ2) weakReference.get();
                    if (nj2 != null) {
                        nj2.zzc();
                    }
                }
                this.f62834a.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}