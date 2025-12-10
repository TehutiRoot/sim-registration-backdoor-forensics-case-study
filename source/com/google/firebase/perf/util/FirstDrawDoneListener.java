package com.google.firebase.perf.util;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.firebase.perf.util.FirstDrawDoneListener;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public class FirstDrawDoneListener implements ViewTreeObserver.OnDrawListener {

    /* renamed from: a */
    public final Handler f56268a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public final AtomicReference f56269b;

    /* renamed from: c */
    public final Runnable f56270c;

    /* renamed from: com.google.firebase.perf.util.FirstDrawDoneListener$a */
    /* loaded from: classes4.dex */
    public class View$OnAttachStateChangeListenerC8580a implements View.OnAttachStateChangeListener {
        public View$OnAttachStateChangeListenerC8580a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnDrawListener(FirstDrawDoneListener.this);
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public FirstDrawDoneListener(View view, Runnable runnable) {
        this.f56269b = new AtomicReference(view);
        this.f56270c = runnable;
    }

    /* renamed from: b */
    public static boolean m38160b(View view) {
        if (view.getViewTreeObserver().isAlive() && m38159c(view)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m38159c(View view) {
        return view.isAttachedToWindow();
    }

    public static void registerForNextDraw(View view, Runnable runnable) {
        FirstDrawDoneListener firstDrawDoneListener = new FirstDrawDoneListener(view, runnable);
        if (Build.VERSION.SDK_INT < 26 && !m38160b(view)) {
            view.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC8580a());
        } else {
            view.getViewTreeObserver().addOnDrawListener(firstDrawDoneListener);
        }
    }

    /* renamed from: d */
    public final /* synthetic */ void m38158d(View view) {
        view.getViewTreeObserver().removeOnDrawListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public void onDraw() {
        final View view = (View) this.f56269b.getAndSet(null);
        if (view == null) {
            return;
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: w20
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                FirstDrawDoneListener.this.m38158d(view);
            }
        });
        this.f56268a.postAtFrontOfQueue(this.f56270c);
    }
}
