package com.google.firebase.perf.util;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public class PreDrawListener implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    public final Handler f56287a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public final AtomicReference f56288b;

    /* renamed from: c */
    public final Runnable f56289c;

    /* renamed from: d */
    public final Runnable f56290d;

    public PreDrawListener(View view, Runnable runnable, Runnable runnable2) {
        this.f56288b = new AtomicReference(view);
        this.f56289c = runnable;
        this.f56290d = runnable2;
    }

    public static void registerForNextDraw(View view, Runnable runnable, Runnable runnable2) {
        view.getViewTreeObserver().addOnPreDrawListener(new PreDrawListener(view, runnable, runnable2));
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        View view = (View) this.f56288b.getAndSet(null);
        if (view == null) {
            return true;
        }
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        this.f56287a.post(this.f56289c);
        this.f56287a.postAtFrontOfQueue(this.f56290d);
        return true;
    }
}