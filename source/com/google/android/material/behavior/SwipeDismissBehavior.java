package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.customview.widget.ViewDragHelper;

/* loaded from: classes4.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_SETTLING = 2;
    public static final int SWIPE_DIRECTION_ANY = 2;
    public static final int SWIPE_DIRECTION_END_TO_START = 1;
    public static final int SWIPE_DIRECTION_START_TO_END = 0;

    /* renamed from: a */
    public ViewDragHelper f49117a;

    /* renamed from: b */
    public OnDismissListener f49118b;

    /* renamed from: c */
    public boolean f49119c;

    /* renamed from: d */
    public boolean f49120d;

    /* renamed from: f */
    public boolean f49122f;

    /* renamed from: e */
    public float f49121e = 0.0f;

    /* renamed from: g */
    public int f49123g = 2;

    /* renamed from: h */
    public float f49124h = 0.5f;

    /* renamed from: i */
    public float f49125i = 0.0f;

    /* renamed from: j */
    public float f49126j = 0.5f;

    /* renamed from: k */
    public final ViewDragHelper.Callback f49127k = new C6815a();

    /* loaded from: classes4.dex */
    public interface OnDismissListener {
        void onDismiss(View view);

        void onDragStateChanged(int i);
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$a */
    /* loaded from: classes4.dex */
    public class C6815a extends ViewDragHelper.Callback {

        /* renamed from: a */
        public int f49128a;

        /* renamed from: b */
        public int f49129b = -1;

        public C6815a() {
        }

        /* renamed from: a */
        public final boolean m45745a(View view, float f) {
            boolean z;
            int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            if (i != 0) {
                if (ViewCompat.getLayoutDirection(view) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                int i2 = SwipeDismissBehavior.this.f49123g;
                if (i2 == 2) {
                    return true;
                }
                if (i2 == 0) {
                    if (z) {
                        if (f >= 0.0f) {
                            return false;
                        }
                    } else if (i <= 0) {
                        return false;
                    }
                    return true;
                } else if (i2 != 1) {
                    return false;
                } else {
                    if (z) {
                        if (i <= 0) {
                            return false;
                        }
                    } else if (f >= 0.0f) {
                        return false;
                    }
                    return true;
                }
            }
            int left = view.getLeft() - this.f49128a;
            if (Math.abs(left) < Math.round(view.getWidth() * SwipeDismissBehavior.this.f49124h)) {
                return false;
            }
            return true;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionHorizontal(View view, int i, int i2) {
            boolean z;
            int width;
            int width2;
            int width3;
            if (ViewCompat.getLayoutDirection(view) == 1) {
                z = true;
            } else {
                z = false;
            }
            int i3 = SwipeDismissBehavior.this.f49123g;
            if (i3 == 0) {
                if (z) {
                    width = this.f49128a - view.getWidth();
                    width2 = this.f49128a;
                } else {
                    width = this.f49128a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i3 == 1) {
                if (z) {
                    width = this.f49128a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                } else {
                    width = this.f49128a - view.getWidth();
                    width2 = this.f49128a;
                }
            } else {
                width = this.f49128a - view.getWidth();
                width2 = view.getWidth() + this.f49128a;
            }
            return SwipeDismissBehavior.m45749c(width, i, width2);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionVertical(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int getViewHorizontalDragRange(View view) {
            return view.getWidth();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewCaptured(View view, int i) {
            this.f49129b = i;
            this.f49128a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                SwipeDismissBehavior.this.f49120d = true;
                parent.requestDisallowInterceptTouchEvent(true);
                SwipeDismissBehavior.this.f49120d = false;
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewDragStateChanged(int i) {
            OnDismissListener onDismissListener = SwipeDismissBehavior.this.f49118b;
            if (onDismissListener != null) {
                onDismissListener.onDragStateChanged(i);
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            float width = view.getWidth() * SwipeDismissBehavior.this.f49125i;
            float width2 = view.getWidth() * SwipeDismissBehavior.this.f49126j;
            float abs = Math.abs(i - this.f49128a);
            if (abs <= width) {
                view.setAlpha(1.0f);
            } else if (abs >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.m45750b(0.0f, 1.0f - SwipeDismissBehavior.m45747e(width, width2, abs), 1.0f));
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewReleased(View view, float f, float f2) {
            int i;
            boolean z;
            OnDismissListener onDismissListener;
            this.f49129b = -1;
            int width = view.getWidth();
            if (m45745a(view, f)) {
                if (f >= 0.0f) {
                    int left = view.getLeft();
                    int i2 = this.f49128a;
                    if (left >= i2) {
                        i = i2 + width;
                        z = true;
                    }
                }
                i = this.f49128a - width;
                z = true;
            } else {
                i = this.f49128a;
                z = false;
            }
            if (SwipeDismissBehavior.this.f49117a.settleCapturedViewAt(i, view.getTop())) {
                ViewCompat.postOnAnimation(view, new RunnableC6817c(view, z));
            } else if (z && (onDismissListener = SwipeDismissBehavior.this.f49118b) != null) {
                onDismissListener.onDismiss(view);
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public boolean tryCaptureView(View view, int i) {
            int i2 = this.f49129b;
            if ((i2 == -1 || i2 == i) && SwipeDismissBehavior.this.canSwipeDismissView(view)) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$b */
    /* loaded from: classes4.dex */
    public class C6816b implements AccessibilityViewCommand {
        public C6816b() {
        }

        @Override // androidx.core.view.accessibility.AccessibilityViewCommand
        public boolean perform(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
            int width;
            boolean z = false;
            if (!SwipeDismissBehavior.this.canSwipeDismissView(view)) {
                return false;
            }
            if (ViewCompat.getLayoutDirection(view) == 1) {
                z = true;
            }
            int i = SwipeDismissBehavior.this.f49123g;
            if ((i == 0 && z) || (i == 1 && !z)) {
                width = -view.getWidth();
            } else {
                width = view.getWidth();
            }
            ViewCompat.offsetLeftAndRight(view, width);
            view.setAlpha(0.0f);
            OnDismissListener onDismissListener = SwipeDismissBehavior.this.f49118b;
            if (onDismissListener != null) {
                onDismissListener.onDismiss(view);
            }
            return true;
        }
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$c */
    /* loaded from: classes4.dex */
    public class RunnableC6817c implements Runnable {

        /* renamed from: a */
        public final View f49132a;

        /* renamed from: b */
        public final boolean f49133b;

        public RunnableC6817c(View view, boolean z) {
            this.f49132a = view;
            this.f49133b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            OnDismissListener onDismissListener;
            ViewDragHelper viewDragHelper = SwipeDismissBehavior.this.f49117a;
            if (viewDragHelper != null && viewDragHelper.continueSettling(true)) {
                ViewCompat.postOnAnimation(this.f49132a, this);
            } else if (this.f49133b && (onDismissListener = SwipeDismissBehavior.this.f49118b) != null) {
                onDismissListener.onDismiss(this.f49132a);
            }
        }
    }

    /* renamed from: b */
    public static float m45750b(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    /* renamed from: c */
    public static int m45749c(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    /* renamed from: e */
    public static float m45747e(float f, float f2, float f3) {
        return (f3 - f) / (f2 - f);
    }

    public boolean canSwipeDismissView(@NonNull View view) {
        return true;
    }

    /* renamed from: d */
    public final void m45748d(ViewGroup viewGroup) {
        ViewDragHelper create;
        if (this.f49117a == null) {
            if (this.f49122f) {
                create = ViewDragHelper.create(viewGroup, this.f49121e, this.f49127k);
            } else {
                create = ViewDragHelper.create(viewGroup, this.f49127k);
            }
            this.f49117a = create;
        }
    }

    /* renamed from: f */
    public final void m45746f(View view) {
        ViewCompat.removeAccessibilityAction(view, 1048576);
        if (canSwipeDismissView(view)) {
            ViewCompat.replaceAccessibilityAction(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_DISMISS, null, new C6816b());
        }
    }

    public int getDragState() {
        ViewDragHelper viewDragHelper = this.f49117a;
        if (viewDragHelper != null) {
            return viewDragHelper.getViewDragState();
        }
        return 0;
    }

    @Nullable
    @VisibleForTesting
    public OnDismissListener getListener() {
        return this.f49118b;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
        boolean z = this.f49119c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.f49119c = false;
            }
        } else {
            z = coordinatorLayout.isPointInChildBounds(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f49119c = z;
        }
        if (!z) {
            return false;
        }
        m45748d(coordinatorLayout);
        if (!this.f49120d && this.f49117a.shouldInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i) {
        boolean onLayoutChild = super.onLayoutChild(coordinatorLayout, v, i);
        if (ViewCompat.getImportantForAccessibility(v) == 0) {
            ViewCompat.setImportantForAccessibility(v, 1);
            m45746f(v);
        }
        return onLayoutChild;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (this.f49117a != null) {
            if (!this.f49120d || motionEvent.getActionMasked() != 3) {
                this.f49117a.processTouchEvent(motionEvent);
                return true;
            }
            return true;
        }
        return false;
    }

    public void setDragDismissDistance(float f) {
        this.f49124h = m45750b(0.0f, f, 1.0f);
    }

    public void setEndAlphaSwipeDistance(float f) {
        this.f49126j = m45750b(0.0f, f, 1.0f);
    }

    public void setListener(@Nullable OnDismissListener onDismissListener) {
        this.f49118b = onDismissListener;
    }

    public void setSensitivity(float f) {
        this.f49121e = f;
        this.f49122f = true;
    }

    public void setStartAlphaSwipeDistance(float f) {
        this.f49125i = m45750b(0.0f, f, 1.0f);
    }

    public void setSwipeDirection(int i) {
        this.f49123g = i;
    }
}
