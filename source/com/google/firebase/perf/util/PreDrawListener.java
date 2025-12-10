package com.google.firebase.perf.util;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public class PreDrawListener implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    public final Handler f56275a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public final AtomicReference f56276b;

    /* renamed from: c */
    public final Runnable f56277c;

    /* renamed from: d */
    public final Runnable f56278d;

    public PreDrawListener(View view, Runnable runnable, Runnable runnable2) {
        this.f56276b = new AtomicReference(view);
        this.f56277c = runnable;
        this.f56278d = runnable2;
    }

    public static void registerForNextDraw(View view, Runnable runnable, Runnable runnable2) {
        view.getViewTreeObserver().addOnPreDrawListener(new PreDrawListener(view, runnable, runnable2));
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        View view = (View) this.f56276b.getAndSet(null);
        if (view == null) {
            return true;
        }
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        this.f56275a.post(this.f56277c);
        this.f56275a.postAtFrontOfQueue(this.f56278d);
        return true;
    }
}
