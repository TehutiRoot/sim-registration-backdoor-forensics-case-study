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
    public final Handler f56280a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public final AtomicReference f56281b;

    /* renamed from: c */
    public final Runnable f56282c;

    /* renamed from: com.google.firebase.perf.util.FirstDrawDoneListener$a */
    /* loaded from: classes4.dex */
    public class View$OnAttachStateChangeListenerC8569a implements View.OnAttachStateChangeListener {
        public View$OnAttachStateChangeListenerC8569a() {
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
        this.f56281b = new AtomicReference(view);
        this.f56282c = runnable;
    }

    /* renamed from: b */
    public static boolean m38152b(View view) {
        if (view.getViewTreeObserver().isAlive() && m38151c(view)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m38151c(View view) {
        return view.isAttachedToWindow();
    }

    public static void registerForNextDraw(View view, Runnable runnable) {
        FirstDrawDoneListener firstDrawDoneListener = new FirstDrawDoneListener(view, runnable);
        if (Build.VERSION.SDK_INT < 26 && !m38152b(view)) {
            view.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC8569a());
        } else {
            view.getViewTreeObserver().addOnDrawListener(firstDrawDoneListener);
        }
    }

    /* renamed from: d */
    public final /* synthetic */ void m38150d(View view) {
        view.getViewTreeObserver().removeOnDrawListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public void onDraw() {
        final View view = (View) this.f56281b.getAndSet(null);
        if (view == null) {
            return;
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: A20
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                FirstDrawDoneListener.this.m38150d(view);
            }
        });
        this.f56280a.postAtFrontOfQueue(this.f56282c);
    }
}