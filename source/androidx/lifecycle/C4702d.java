package androidx.lifecycle;

import androidx.lifecycle.C4687a;
import androidx.lifecycle.Lifecycle;

/* renamed from: androidx.lifecycle.d */
/* loaded from: classes2.dex */
public class C4702d implements LifecycleEventObserver {

    /* renamed from: a */
    public final Object f35925a;

    /* renamed from: b */
    public final C4687a.C4688a f35926b;

    public C4702d(Object obj) {
        this.f35925a = obj;
        this.f35926b = C4687a.f35892c.m54088c(obj.getClass());
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        this.f35926b.m54085a(lifecycleOwner, event, this.f35925a);
    }
}
