package p000;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: wK0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class View$OnAttachStateChangeListenerC22843wK0 implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    public final View f108399a;

    /* renamed from: b */
    public final Function0 f108400b;

    /* renamed from: c */
    public boolean f108401c;

    public View$OnAttachStateChangeListenerC22843wK0(View view, Function0 onGlobalLayoutCallback) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(onGlobalLayoutCallback, "onGlobalLayoutCallback");
        this.f108399a = view;
        this.f108400b = onGlobalLayoutCallback;
        view.addOnAttachStateChangeListener(this);
        m757b();
    }

    /* renamed from: a */
    public final void m758a() {
        m756c();
        this.f108399a.removeOnAttachStateChangeListener(this);
    }

    /* renamed from: b */
    public final void m757b() {
        if (!this.f108401c && this.f108399a.isAttachedToWindow()) {
            this.f108399a.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f108401c = true;
        }
    }

    /* renamed from: c */
    public final void m756c() {
        if (!this.f108401c) {
            return;
        }
        this.f108399a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f108401c = false;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f108400b.invoke();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        m757b();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        m756c();
    }
}