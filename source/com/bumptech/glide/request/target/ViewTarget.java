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
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.R;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.util.Preconditions;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Deprecated
/* loaded from: classes3.dex */
public abstract class ViewTarget<T extends View, Z> extends BaseTarget<Z> {

    /* renamed from: f */
    public static boolean f42667f;

    /* renamed from: g */
    public static int f42668g = R.id.glide_custom_view_target_tag;

    /* renamed from: b */
    public final C5926b f42669b;

    /* renamed from: c */
    public View.OnAttachStateChangeListener f42670c;

    /* renamed from: d */
    public boolean f42671d;

    /* renamed from: e */
    public boolean f42672e;
    protected final T view;

    /* renamed from: com.bumptech.glide.request.target.ViewTarget$a */
    /* loaded from: classes3.dex */
    public class View$OnAttachStateChangeListenerC5925a implements View.OnAttachStateChangeListener {
        public View$OnAttachStateChangeListenerC5925a() {
            ViewTarget.this = r1;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            ViewTarget.this.m50008e();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTarget.this.m50009d();
        }
    }

    /* renamed from: com.bumptech.glide.request.target.ViewTarget$b */
    /* loaded from: classes3.dex */
    public static final class C5926b {

        /* renamed from: e */
        public static Integer f42674e;

        /* renamed from: a */
        public final View f42675a;

        /* renamed from: b */
        public final List f42676b = new ArrayList();

        /* renamed from: c */
        public boolean f42677c;

        /* renamed from: d */
        public ViewTreeObserver$OnPreDrawListenerC5927a f42678d;

        /* renamed from: com.bumptech.glide.request.target.ViewTarget$b$a */
        /* loaded from: classes3.dex */
        public static final class ViewTreeObserver$OnPreDrawListenerC5927a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: a */
            public final WeakReference f42679a;

            public ViewTreeObserver$OnPreDrawListenerC5927a(C5926b c5926b) {
                this.f42679a = new WeakReference(c5926b);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("OnGlobalLayoutListener called attachStateListener=");
                    sb.append(this);
                }
                C5926b c5926b = (C5926b) this.f42679a.get();
                if (c5926b != null) {
                    c5926b.m50006a();
                    return true;
                }
                return true;
            }
        }

        public C5926b(View view) {
            this.f42675a = view;
        }

        /* renamed from: c */
        public static int m50004c(Context context) {
            if (f42674e == null) {
                Display defaultDisplay = ((WindowManager) Preconditions.checkNotNull((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f42674e = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f42674e.intValue();
        }

        /* renamed from: a */
        public void m50006a() {
            if (this.f42676b.isEmpty()) {
                return;
            }
            int m50000g = m50000g();
            int m50001f = m50001f();
            if (!m49998i(m50000g, m50001f)) {
                return;
            }
            m49997j(m50000g, m50001f);
            m50005b();
        }

        /* renamed from: b */
        public void m50005b() {
            ViewTreeObserver viewTreeObserver = this.f42675a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f42678d);
            }
            this.f42678d = null;
            this.f42676b.clear();
        }

        /* renamed from: d */
        public void m50003d(SizeReadyCallback sizeReadyCallback) {
            int m50000g = m50000g();
            int m50001f = m50001f();
            if (m49998i(m50000g, m50001f)) {
                sizeReadyCallback.onSizeReady(m50000g, m50001f);
                return;
            }
            if (!this.f42676b.contains(sizeReadyCallback)) {
                this.f42676b.add(sizeReadyCallback);
            }
            if (this.f42678d == null) {
                ViewTreeObserver viewTreeObserver = this.f42675a.getViewTreeObserver();
                ViewTreeObserver$OnPreDrawListenerC5927a viewTreeObserver$OnPreDrawListenerC5927a = new ViewTreeObserver$OnPreDrawListenerC5927a(this);
                this.f42678d = viewTreeObserver$OnPreDrawListenerC5927a;
                viewTreeObserver.addOnPreDrawListener(viewTreeObserver$OnPreDrawListenerC5927a);
            }
        }

        /* renamed from: e */
        public final int m50002e(int i, int i2, int i3) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                return i4;
            }
            if (this.f42677c && this.f42675a.isLayoutRequested()) {
                return 0;
            }
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            if (this.f42675a.isLayoutRequested() || i2 != -2) {
                return 0;
            }
            Log.isLoggable("ViewTarget", 4);
            return m50004c(this.f42675a.getContext());
        }

        /* renamed from: f */
        public final int m50001f() {
            int i;
            int paddingTop = this.f42675a.getPaddingTop() + this.f42675a.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f42675a.getLayoutParams();
            if (layoutParams != null) {
                i = layoutParams.height;
            } else {
                i = 0;
            }
            return m50002e(this.f42675a.getHeight(), i, paddingTop);
        }

        /* renamed from: g */
        public final int m50000g() {
            int i;
            int paddingLeft = this.f42675a.getPaddingLeft() + this.f42675a.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f42675a.getLayoutParams();
            if (layoutParams != null) {
                i = layoutParams.width;
            } else {
                i = 0;
            }
            return m50002e(this.f42675a.getWidth(), i, paddingLeft);
        }

        /* renamed from: h */
        public final boolean m49999h(int i) {
            return i > 0 || i == Integer.MIN_VALUE;
        }

        /* renamed from: i */
        public final boolean m49998i(int i, int i2) {
            if (m49999h(i) && m49999h(i2)) {
                return true;
            }
            return false;
        }

        /* renamed from: j */
        public final void m49997j(int i, int i2) {
            Iterator it = new ArrayList(this.f42676b).iterator();
            while (it.hasNext()) {
                ((SizeReadyCallback) it.next()).onSizeReady(i, i2);
            }
        }

        /* renamed from: k */
        public void m49996k(SizeReadyCallback sizeReadyCallback) {
            this.f42676b.remove(sizeReadyCallback);
        }
    }

    public ViewTarget(@NonNull T t) {
        this.view = (T) Preconditions.checkNotNull(t);
        this.f42669b = new C5926b(t);
    }

    @Deprecated
    public static void setTagId(int i) {
        if (!f42667f) {
            f42668g = i;
            return;
        }
        throw new IllegalArgumentException("You cannot set the tag id more than once or change the tag id after the first request has been made");
    }

    /* renamed from: a */
    public final Object m50012a() {
        return this.view.getTag(f42668g);
    }

    /* renamed from: b */
    public final void m50011b() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f42670c;
        if (onAttachStateChangeListener != null && !this.f42672e) {
            this.view.addOnAttachStateChangeListener(onAttachStateChangeListener);
            this.f42672e = true;
        }
    }

    /* renamed from: c */
    public final void m50010c() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f42670c;
        if (onAttachStateChangeListener != null && this.f42672e) {
            this.view.removeOnAttachStateChangeListener(onAttachStateChangeListener);
            this.f42672e = false;
        }
    }

    @NonNull
    public final ViewTarget<T, Z> clearOnDetach() {
        if (this.f42670c != null) {
            return this;
        }
        this.f42670c = new View$OnAttachStateChangeListenerC5925a();
        m50011b();
        return this;
    }

    /* renamed from: d */
    public void m50009d() {
        Request request = getRequest();
        if (request != null) {
            this.f42671d = true;
            request.clear();
            this.f42671d = false;
        }
    }

    /* renamed from: e */
    public void m50008e() {
        Request request = getRequest();
        if (request != null && request.isCleared()) {
            request.begin();
        }
    }

    /* renamed from: f */
    public final void m50007f(Object obj) {
        f42667f = true;
        this.view.setTag(f42668g, obj);
    }

    @Override // com.bumptech.glide.request.target.BaseTarget, com.bumptech.glide.request.target.Target
    @Nullable
    public Request getRequest() {
        Object m50012a = m50012a();
        if (m50012a != null) {
            if (m50012a instanceof Request) {
                return (Request) m50012a;
            }
            throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
        }
        return null;
    }

    @Override // com.bumptech.glide.request.target.Target
    @CallSuper
    public void getSize(@NonNull SizeReadyCallback sizeReadyCallback) {
        this.f42669b.m50003d(sizeReadyCallback);
    }

    @NonNull
    public T getView() {
        return this.view;
    }

    @Override // com.bumptech.glide.request.target.BaseTarget, com.bumptech.glide.request.target.Target
    @CallSuper
    public void onLoadCleared(@Nullable Drawable drawable) {
        super.onLoadCleared(drawable);
        this.f42669b.m50005b();
        if (!this.f42671d) {
            m50010c();
        }
    }

    @Override // com.bumptech.glide.request.target.BaseTarget, com.bumptech.glide.request.target.Target
    @CallSuper
    public void onLoadStarted(@Nullable Drawable drawable) {
        super.onLoadStarted(drawable);
        m50011b();
    }

    @Override // com.bumptech.glide.request.target.Target
    @CallSuper
    public void removeCallback(@NonNull SizeReadyCallback sizeReadyCallback) {
        this.f42669b.m49996k(sizeReadyCallback);
    }

    @Override // com.bumptech.glide.request.target.BaseTarget, com.bumptech.glide.request.target.Target
    public void setRequest(@Nullable Request request) {
        m50007f(request);
    }

    public String toString() {
        return "Target for: " + this.view;
    }

    @NonNull
    public final ViewTarget<T, Z> waitForLayout() {
        this.f42669b.f42677c = true;
        return this;
    }

    @Deprecated
    public ViewTarget(@NonNull T t, boolean z) {
        this(t);
        if (z) {
            waitForLayout();
        }
    }
}
