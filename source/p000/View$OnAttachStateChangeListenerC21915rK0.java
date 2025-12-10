package p000;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: rK0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class View$OnAttachStateChangeListenerC21915rK0 implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    public final View f77242a;

    /* renamed from: b */
    public final Function0 f77243b;

    /* renamed from: c */
    public boolean f77244c;

    public View$OnAttachStateChangeListenerC21915rK0(View view, Function0 onGlobalLayoutCallback) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(onGlobalLayoutCallback, "onGlobalLayoutCallback");
        this.f77242a = view;
        this.f77243b = onGlobalLayoutCallback;
        view.addOnAttachStateChangeListener(this);
        m23340b();
    }

    /* renamed from: a */
    public final void m23341a() {
        m23339c();
        this.f77242a.removeOnAttachStateChangeListener(this);
    }

    /* renamed from: b */
    public final void m23340b() {
        if (!this.f77244c && this.f77242a.isAttachedToWindow()) {
            this.f77242a.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f77244c = true;
        }
    }

    /* renamed from: c */
    public final void m23339c() {
        if (!this.f77244c) {
            return;
        }
        this.f77242a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f77244c = false;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f77243b.invoke();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        m23340b();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        m23339c();
    }
}
