package p000;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: xK0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class View$OnAttachStateChangeListenerC23016xK0 implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    public final View f108717a;

    /* renamed from: b */
    public final Function0 f108718b;

    /* renamed from: c */
    public boolean f108719c;

    public View$OnAttachStateChangeListenerC23016xK0(View view, Function0 onGlobalLayoutCallback) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(onGlobalLayoutCallback, "onGlobalLayoutCallback");
        this.f108717a = view;
        this.f108718b = onGlobalLayoutCallback;
        view.addOnAttachStateChangeListener(this);
        m557b();
    }

    /* renamed from: a */
    public final void m558a() {
        m556c();
        this.f108717a.removeOnAttachStateChangeListener(this);
    }

    /* renamed from: b */
    public final void m557b() {
        if (!this.f108719c && this.f108717a.isAttachedToWindow()) {
            this.f108717a.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f108719c = true;
        }
    }

    /* renamed from: c */
    public final void m556c() {
        if (!this.f108719c) {
            return;
        }
        this.f108717a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f108719c = false;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f108718b.invoke();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        m557b();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        m556c();
    }
}