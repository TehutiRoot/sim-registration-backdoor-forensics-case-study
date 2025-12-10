package com.bumptech.glide.request.target;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.R;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.util.Preconditions;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class CustomViewTarget<T extends View, Z> implements Target<Z> {

    /* renamed from: e */
    public static final int f42635e = R.id.glide_custom_view_target_tag;

    /* renamed from: a */
    public final C5921b f42636a;

    /* renamed from: b */
    public View.OnAttachStateChangeListener f42637b;

    /* renamed from: c */
    public boolean f42638c;

    /* renamed from: d */
    public boolean f42639d;
    protected final T view;

    /* renamed from: com.bumptech.glide.request.target.CustomViewTarget$a */
    /* loaded from: classes3.dex */
    public class View$OnAttachStateChangeListenerC5920a implements View.OnAttachStateChangeListener {
        public View$OnAttachStateChangeListenerC5920a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            CustomViewTarget.this.m50031e();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            CustomViewTarget.this.m50032d();
        }
    }

    /* renamed from: com.bumptech.glide.request.target.CustomViewTarget$b */
    /* loaded from: classes3.dex */
    public static final class C5921b {

        /* renamed from: e */
        public static Integer f42641e;

        /* renamed from: a */
        public final View f42642a;

        /* renamed from: b */
        public final List f42643b = new ArrayList();

        /* renamed from: c */
        public boolean f42644c;

        /* renamed from: d */
        public ViewTreeObserver$OnPreDrawListenerC5922a f42645d;

        /* renamed from: com.bumptech.glide.request.target.CustomViewTarget$b$a */
        /* loaded from: classes3.dex */
        public static final class ViewTreeObserver$OnPreDrawListenerC5922a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: a */
            public final WeakReference f42646a;

            public ViewTreeObserver$OnPreDrawListenerC5922a(C5921b c5921b) {
                this.f42646a = new WeakReference(c5921b);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (Log.isLoggable("CustomViewTarget", 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("OnGlobalLayoutListener called attachStateListener=");
                    sb.append(this);
                }
                C5921b c5921b = (C5921b) this.f42646a.get();
                if (c5921b != null) {
                    c5921b.m50029a();
                    return true;
                }
                return true;
            }
        }

        public C5921b(View view) {
            this.f42642a = view;
        }

        /* renamed from: c */
        public static int m50027c(Context context) {
            if (f42641e == null) {
                Display defaultDisplay = ((WindowManager) Preconditions.checkNotNull((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f42641e = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f42641e.intValue();
        }

        /* renamed from: a */
        public void m50029a() {
            if (this.f42643b.isEmpty()) {
                return;
            }
            int m50023g = m50023g();
            int m50024f = m50024f();
            if (!m50021i(m50023g, m50024f)) {
                return;
            }
            m50020j(m50023g, m50024f);
            m50028b();
        }

        /* renamed from: b */
        public void m50028b() {
            ViewTreeObserver viewTreeObserver = this.f42642a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f42645d);
            }
            this.f42645d = null;
            this.f42643b.clear();
        }

        /* renamed from: d */
        public void m50026d(SizeReadyCallback sizeReadyCallback) {
            int m50023g = m50023g();
            int m50024f = m50024f();
            if (m50021i(m50023g, m50024f)) {
                sizeReadyCallback.onSizeReady(m50023g, m50024f);
                return;
            }
            if (!this.f42643b.contains(sizeReadyCallback)) {
                this.f42643b.add(sizeReadyCallback);
            }
            if (this.f42645d == null) {
                ViewTreeObserver viewTreeObserver = this.f42642a.getViewTreeObserver();
                ViewTreeObserver$OnPreDrawListenerC5922a viewTreeObserver$OnPreDrawListenerC5922a = new ViewTreeObserver$OnPreDrawListenerC5922a(this);
                this.f42645d = viewTreeObserver$OnPreDrawListenerC5922a;
                viewTreeObserver.addOnPreDrawListener(viewTreeObserver$OnPreDrawListenerC5922a);
            }
        }

        /* renamed from: e */
        public final int m50025e(int i, int i2, int i3) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                return i4;
            }
            if (this.f42644c && this.f42642a.isLayoutRequested()) {
                return 0;
            }
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            if (this.f42642a.isLayoutRequested() || i2 != -2) {
                return 0;
            }
            Log.isLoggable("CustomViewTarget", 4);
            return m50027c(this.f42642a.getContext());
        }

        /* renamed from: f */
        public final int m50024f() {
            int i;
            int paddingTop = this.f42642a.getPaddingTop() + this.f42642a.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f42642a.getLayoutParams();
            if (layoutParams != null) {
                i = layoutParams.height;
            } else {
                i = 0;
            }
            return m50025e(this.f42642a.getHeight(), i, paddingTop);
        }

        /* renamed from: g */
        public final int m50023g() {
            int i;
            int paddingLeft = this.f42642a.getPaddingLeft() + this.f42642a.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f42642a.getLayoutParams();
            if (layoutParams != null) {
                i = layoutParams.width;
            } else {
                i = 0;
            }
            return m50025e(this.f42642a.getWidth(), i, paddingLeft);
        }

        /* renamed from: h */
        public final boolean m50022h(int i) {
            return i > 0 || i == Integer.MIN_VALUE;
        }

        /* renamed from: i */
        public final boolean m50021i(int i, int i2) {
            if (m50022h(i) && m50022h(i2)) {
                return true;
            }
            return false;
        }

        /* renamed from: j */
        public final void m50020j(int i, int i2) {
            Iterator it = new ArrayList(this.f42643b).iterator();
            while (it.hasNext()) {
                ((SizeReadyCallback) it.next()).onSizeReady(i, i2);
            }
        }

        /* renamed from: k */
        public void m50019k(SizeReadyCallback sizeReadyCallback) {
            this.f42643b.remove(sizeReadyCallback);
        }
    }

    public CustomViewTarget(@NonNull T t) {
        this.view = (T) Preconditions.checkNotNull(t);
        this.f42636a = new C5921b(t);
    }

    /* renamed from: a */
    private Object m50035a() {
        return this.view.getTag(f42635e);
    }

    /* renamed from: b */
    private void m50034b() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f42637b;
        if (onAttachStateChangeListener != null && !this.f42639d) {
            this.view.addOnAttachStateChangeListener(onAttachStateChangeListener);
            this.f42639d = true;
        }
    }

    /* renamed from: c */
    private void m50033c() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f42637b;
        if (onAttachStateChangeListener != null && this.f42639d) {
            this.view.removeOnAttachStateChangeListener(onAttachStateChangeListener);
            this.f42639d = false;
        }
    }

    /* renamed from: f */
    private void m50030f(Object obj) {
        this.view.setTag(f42635e, obj);
    }

    @NonNull
    public final CustomViewTarget<T, Z> clearOnDetach() {
        if (this.f42637b != null) {
            return this;
        }
        this.f42637b = new View$OnAttachStateChangeListenerC5920a();
        m50034b();
        return this;
    }

    /* renamed from: d */
    public final void m50032d() {
        Request request = getRequest();
        if (request != null) {
            this.f42638c = true;
            request.clear();
            this.f42638c = false;
        }
    }

    /* renamed from: e */
    public final void m50031e() {
        Request request = getRequest();
        if (request != null && request.isCleared()) {
            request.begin();
        }
    }

    @Override // com.bumptech.glide.request.target.Target
    @Nullable
    public final Request getRequest() {
        Object m50035a = m50035a();
        if (m50035a != null) {
            if (m50035a instanceof Request) {
                return (Request) m50035a;
            }
            throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
        }
        return null;
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void getSize(@NonNull SizeReadyCallback sizeReadyCallback) {
        this.f42636a.m50026d(sizeReadyCallback);
    }

    @NonNull
    public final T getView() {
        return this.view;
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onDestroy() {
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void onLoadCleared(@Nullable Drawable drawable) {
        this.f42636a.m50028b();
        onResourceCleared(drawable);
        if (!this.f42638c) {
            m50033c();
        }
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void onLoadStarted(@Nullable Drawable drawable) {
        m50034b();
        onResourceLoading(drawable);
    }

    public abstract void onResourceCleared(@Nullable Drawable drawable);

    public void onResourceLoading(@Nullable Drawable drawable) {
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onStart() {
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onStop() {
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void removeCallback(@NonNull SizeReadyCallback sizeReadyCallback) {
        this.f42636a.m50019k(sizeReadyCallback);
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void setRequest(@Nullable Request request) {
        m50030f(request);
    }

    public String toString() {
        return "Target for: " + this.view;
    }

    @Deprecated
    public final CustomViewTarget<T, Z> useTagId(@IdRes int i) {
        return this;
    }

    @NonNull
    public final CustomViewTarget<T, Z> waitForLayout() {
        this.f42636a.f42644c = true;
        return this;
    }
}
