package com.bumptech.glide.manager;

import android.content.Context;
import com.bumptech.glide.manager.ConnectivityMonitor;

/* renamed from: com.bumptech.glide.manager.a */
/* loaded from: classes3.dex */
public final class C5899a implements ConnectivityMonitor {

    /* renamed from: a */
    public final Context f42484a;

    /* renamed from: b */
    public final ConnectivityMonitor.ConnectivityListener f42485b;

    public C5899a(Context context, ConnectivityMonitor.ConnectivityListener connectivityListener) {
        this.f42484a = context.getApplicationContext();
        this.f42485b = connectivityListener;
    }

    /* renamed from: a */
    public final void m50102a() {
        C5903c.m50097a(this.f42484a).m50094d(this.f42485b);
    }

    /* renamed from: b */
    public final void m50101b() {
        C5903c.m50097a(this.f42484a).m50093e(this.f42485b);
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onDestroy() {
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onStart() {
        m50102a();
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onStop() {
        m50101b();
    }
}
