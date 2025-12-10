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
    public static final int f42647e = R.id.glide_custom_view_target_tag;

    /* renamed from: a */
    public final C5910b f42648a;

    /* renamed from: b */
    public View.OnAttachStateChangeListener f42649b;

    /* renamed from: c */
    public boolean f42650c;

    /* renamed from: d */
    public boolean f42651d;
    protected final T view;

    /* renamed from: com.bumptech.glide.request.target.CustomViewTarget$a */
    /* loaded from: classes3.dex */
    public class View$OnAttachStateChangeListenerC5909a implements View.OnAttachStateChangeListener {
        public View$OnAttachStateChangeListenerC5909a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            CustomViewTarget.this.m50028e();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            CustomViewTarget.this.m50029d();
        }
    }

    /* renamed from: com.bumptech.glide.request.target.CustomViewTarget$b */
    /* loaded from: classes3.dex */
    public static final class C5910b {

        /* renamed from: e */
        public static Integer f42653e;

        /* renamed from: a */
        public final View f42654a;

        /* renamed from: b */
        public final List f42655b = new ArrayList();

        /* renamed from: c */
        public boolean f42656c;

        /* renamed from: d */
        public ViewTreeObserver$OnPreDrawListenerC5911a f42657d;

        /* renamed from: com.bumptech.glide.request.target.CustomViewTarget$b$a */
        /* loaded from: classes3.dex */
        public static final class ViewTreeObserver$OnPreDrawListenerC5911a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: a */
            public final WeakReference f42658a;

            public ViewTreeObserver$OnPreDrawListenerC5911a(C5910b c5910b) {
                this.f42658a = new WeakReference(c5910b);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (Log.isLoggable("CustomViewTarget", 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("OnGlobalLayoutListener called attachStateListener=");
                    sb.append(this);
                }
                C5910b c5910b = (C5910b) this.f42658a.get();
                if (c5910b != null) {
                    c5910b.m50026a();
                    return true;
                }
                return true;
            }
        }

        public C5910b(View view) {
            this.f42654a = view;
        }

        /* renamed from: c */
        public static int m50024c(Context context) {
            if (f42653e == null) {
                Display defaultDisplay = ((WindowManager) Preconditions.checkNotNull((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f42653e = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f42653e.intValue();
        }

        /* renamed from: a */
        public void m50026a() {
            if (this.f42655b.isEmpty()) {
                return;
            }
            int m50020g = m50020g();
            int m50021f = m50021f();
            if (!m50018i(m50020g, m50021f)) {
                return;
            }
            m50017j(m50020g, m50021f);
            m50025b();
        }

        /* renamed from: b */
        public void m50025b() {
            ViewTreeObserver viewTreeObserver = this.f42654a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f42657d);
            }
            this.f42657d = null;
            this.f42655b.clear();
        }

        /* renamed from: d */
        public void m50023d(SizeReadyCallback sizeReadyCallback) {
            int m50020g = m50020g();
            int m50021f = m50021f();
            if (m50018i(m50020g, m50021f)) {
                sizeReadyCallback.onSizeReady(m50020g, m50021f);
                return;
            }
            if (!this.f42655b.contains(sizeReadyCallback)) {
                this.f42655b.add(sizeReadyCallback);
            }
            if (this.f42657d == null) {
                ViewTreeObserver viewTreeObserver = this.f42654a.getViewTreeObserver();
                ViewTreeObserver$OnPreDrawListenerC5911a viewTreeObserver$OnPreDrawListenerC5911a = new ViewTreeObserver$OnPreDrawListenerC5911a(this);
                this.f42657d = viewTreeObserver$OnPreDrawListenerC5911a;
                viewTreeObserver.addOnPreDrawListener(viewTreeObserver$OnPreDrawListenerC5911a);
            }
        }

        /* renamed from: e */
        public final int m50022e(int i, int i2, int i3) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                return i4;
            }
            if (this.f42656c && this.f42654a.isLayoutRequested()) {
                return 0;
            }
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            if (this.f42654a.isLayoutRequested() || i2 != -2) {
                return 0;
            }
            Log.isLoggable("CustomViewTarget", 4);
            return m50024c(this.f42654a.getContext());
        }

        /* renamed from: f */
        public final int m50021f() {
            int i;
            int paddingTop = this.f42654a.getPaddingTop() + this.f42654a.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f42654a.getLayoutParams();
            if (layoutParams != null) {
                i = layoutParams.height;
            } else {
                i = 0;
            }
            return m50022e(this.f42654a.getHeight(), i, paddingTop);
        }

        /* renamed from: g */
        public final int m50020g() {
            int i;
            int paddingLeft = this.f42654a.getPaddingLeft() + this.f42654a.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f42654a.getLayoutParams();
            if (layoutParams != null) {
                i = layoutParams.width;
            } else {
                i = 0;
            }
            return m50022e(this.f42654a.getWidth(), i, paddingLeft);
        }

        /* renamed from: h */
        public final boolean m50019h(int i) {
            return i > 0 || i == Integer.MIN_VALUE;
        }

        /* renamed from: i */
        public final boolean m50018i(int i, int i2) {
            if (m50019h(i) && m50019h(i2)) {
                return true;
            }
            return false;
        }

        /* renamed from: j */
        public final void m50017j(int i, int i2) {
            Iterator it = new ArrayList(this.f42655b).iterator();
            while (it.hasNext()) {
                ((SizeReadyCallback) it.next()).onSizeReady(i, i2);
            }
        }

        /* renamed from: k */
        public void m50016k(SizeReadyCallback sizeReadyCallback) {
            this.f42655b.remove(sizeReadyCallback);
        }
    }

    public CustomViewTarget(@NonNull T t) {
        this.view = (T) Preconditions.checkNotNull(t);
        this.f42648a = new C5910b(t);
    }

    /* renamed from: a */
    private Object m50032a() {
        return this.view.getTag(f42647e);
    }

    /* renamed from: b */
    private void m50031b() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f42649b;
        if (onAttachStateChangeListener != null && !this.f42651d) {
            this.view.addOnAttachStateChangeListener(onAttachStateChangeListener);
            this.f42651d = true;
        }
    }

    /* renamed from: c */
    private void m50030c() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f42649b;
        if (onAttachStateChangeListener != null && this.f42651d) {
            this.view.removeOnAttachStateChangeListener(onAttachStateChangeListener);
            this.f42651d = false;
        }
    }

    /* renamed from: f */
    private void m50027f(Object obj) {
        this.view.setTag(f42647e, obj);
    }

    @NonNull
    public final CustomViewTarget<T, Z> clearOnDetach() {
        if (this.f42649b != null) {
            return this;
        }
        this.f42649b = new View$OnAttachStateChangeListenerC5909a();
        m50031b();
        return this;
    }

    /* renamed from: d */
    public final void m50029d() {
        Request request = getRequest();
        if (request != null) {
            this.f42650c = true;
            request.clear();
            this.f42650c = false;
        }
    }

    /* renamed from: e */
    public final void m50028e() {
        Request request = getRequest();
        if (request != null && request.isCleared()) {
            request.begin();
        }
    }

    @Override // com.bumptech.glide.request.target.Target
    @Nullable
    public final Request getRequest() {
        Object m50032a = m50032a();
        if (m50032a != null) {
            if (m50032a instanceof Request) {
                return (Request) m50032a;
            }
            throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
        }
        return null;
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void getSize(@NonNull SizeReadyCallback sizeReadyCallback) {
        this.f42648a.m50023d(sizeReadyCallback);
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
        this.f42648a.m50025b();
        onResourceCleared(drawable);
        if (!this.f42650c) {
            m50030c();
        }
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void onLoadStarted(@Nullable Drawable drawable) {
        m50031b();
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
        this.f42648a.m50016k(sizeReadyCallback);
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void setRequest(@Nullable Request request) {
        m50027f(request);
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
        this.f42648a.f42656c = true;
        return this;
    }
}