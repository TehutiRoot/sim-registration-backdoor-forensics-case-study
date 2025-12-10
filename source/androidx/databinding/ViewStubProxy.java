package androidx.databinding;

import android.view.View;
import android.view.ViewStub;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public class ViewStubProxy {

    /* renamed from: a */
    public ViewStub f34539a;

    /* renamed from: b */
    public ViewDataBinding f34540b;

    /* renamed from: c */
    public View f34541c;

    /* renamed from: d */
    public ViewStub.OnInflateListener f34542d;

    /* renamed from: e */
    public ViewDataBinding f34543e;

    /* renamed from: f */
    public ViewStub.OnInflateListener f34544f;

    /* renamed from: androidx.databinding.ViewStubProxy$a */
    /* loaded from: classes2.dex */
    public class ViewStub$OnInflateListenerC4288a implements ViewStub.OnInflateListener {
        public ViewStub$OnInflateListenerC4288a() {
        }

        @Override // android.view.ViewStub.OnInflateListener
        public void onInflate(ViewStub viewStub, View view) {
            ViewStubProxy.this.f34541c = view;
            ViewStubProxy viewStubProxy = ViewStubProxy.this;
            viewStubProxy.f34540b = DataBindingUtil.m56360a(viewStubProxy.f34543e.mBindingComponent, view, viewStub.getLayoutResource());
            ViewStubProxy.this.f34539a = null;
            if (ViewStubProxy.this.f34542d != null) {
                ViewStubProxy.this.f34542d.onInflate(viewStub, view);
                ViewStubProxy.this.f34542d = null;
            }
            ViewStubProxy.this.f34543e.invalidateAll();
            ViewStubProxy.this.f34543e.m56323k();
        }
    }

    public ViewStubProxy(@NonNull ViewStub viewStub) {
        ViewStub$OnInflateListenerC4288a viewStub$OnInflateListenerC4288a = new ViewStub$OnInflateListenerC4288a();
        this.f34544f = viewStub$OnInflateListenerC4288a;
        this.f34539a = viewStub;
        viewStub.setOnInflateListener(viewStub$OnInflateListenerC4288a);
    }

    @Nullable
    public ViewDataBinding getBinding() {
        return this.f34540b;
    }

    public View getRoot() {
        return this.f34541c;
    }

    @Nullable
    public ViewStub getViewStub() {
        return this.f34539a;
    }

    public boolean isInflated() {
        if (this.f34541c != null) {
            return true;
        }
        return false;
    }

    public void setContainingBinding(@NonNull ViewDataBinding viewDataBinding) {
        this.f34543e = viewDataBinding;
    }

    public void setOnInflateListener(@Nullable ViewStub.OnInflateListener onInflateListener) {
        if (this.f34539a != null) {
            this.f34542d = onInflateListener;
        }
    }
}
