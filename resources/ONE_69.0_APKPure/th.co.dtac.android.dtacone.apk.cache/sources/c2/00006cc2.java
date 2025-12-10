package androidx.databinding;

import android.view.View;
import android.view.ViewStub;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public class ViewStubProxy {

    /* renamed from: a */
    public ViewStub f34627a;

    /* renamed from: b */
    public ViewDataBinding f34628b;

    /* renamed from: c */
    public View f34629c;

    /* renamed from: d */
    public ViewStub.OnInflateListener f34630d;

    /* renamed from: e */
    public ViewDataBinding f34631e;

    /* renamed from: f */
    public ViewStub.OnInflateListener f34632f;

    /* renamed from: androidx.databinding.ViewStubProxy$a */
    /* loaded from: classes2.dex */
    public class ViewStub$OnInflateListenerC4270a implements ViewStub.OnInflateListener {
        public ViewStub$OnInflateListenerC4270a() {
        }

        @Override // android.view.ViewStub.OnInflateListener
        public void onInflate(ViewStub viewStub, View view) {
            ViewStubProxy.this.f34629c = view;
            ViewStubProxy viewStubProxy = ViewStubProxy.this;
            viewStubProxy.f34628b = DataBindingUtil.m56310a(viewStubProxy.f34631e.mBindingComponent, view, viewStub.getLayoutResource());
            ViewStubProxy.this.f34627a = null;
            if (ViewStubProxy.this.f34630d != null) {
                ViewStubProxy.this.f34630d.onInflate(viewStub, view);
                ViewStubProxy.this.f34630d = null;
            }
            ViewStubProxy.this.f34631e.invalidateAll();
            ViewStubProxy.this.f34631e.m56273k();
        }
    }

    public ViewStubProxy(@NonNull ViewStub viewStub) {
        ViewStub$OnInflateListenerC4270a viewStub$OnInflateListenerC4270a = new ViewStub$OnInflateListenerC4270a();
        this.f34632f = viewStub$OnInflateListenerC4270a;
        this.f34627a = viewStub;
        viewStub.setOnInflateListener(viewStub$OnInflateListenerC4270a);
    }

    @Nullable
    public ViewDataBinding getBinding() {
        return this.f34628b;
    }

    public View getRoot() {
        return this.f34629c;
    }

    @Nullable
    public ViewStub getViewStub() {
        return this.f34627a;
    }

    public boolean isInflated() {
        if (this.f34629c != null) {
            return true;
        }
        return false;
    }

    public void setContainingBinding(@NonNull ViewDataBinding viewDataBinding) {
        this.f34631e = viewDataBinding;
    }

    public void setOnInflateListener(@Nullable ViewStub.OnInflateListener onInflateListener) {
        if (this.f34627a != null) {
            this.f34630d = onInflateListener;
        }
    }
}