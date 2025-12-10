package p000;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: qK0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class View$OnAttachStateChangeListenerC21743qK0 implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    public final View f76952a;

    /* renamed from: b */
    public final Function0 f76953b;

    /* renamed from: c */
    public boolean f76954c;

    public View$OnAttachStateChangeListenerC21743qK0(View view, Function0 onGlobalLayoutCallback) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(onGlobalLayoutCallback, "onGlobalLayoutCallback");
        this.f76952a = view;
        this.f76953b = onGlobalLayoutCallback;
        view.addOnAttachStateChangeListener(this);
        m23512b();
    }

    /* renamed from: a */
    public final void m23513a() {
        m23511c();
        this.f76952a.removeOnAttachStateChangeListener(this);
    }

    /* renamed from: b */
    public final void m23512b() {
        if (!this.f76954c && this.f76952a.isAttachedToWindow()) {
            this.f76952a.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f76954c = true;
        }
    }

    /* renamed from: c */
    public final void m23511c() {
        if (!this.f76954c) {
            return;
        }
        this.f76952a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f76954c = false;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f76953b.invoke();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        m23512b();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        m23511c();
    }
}
