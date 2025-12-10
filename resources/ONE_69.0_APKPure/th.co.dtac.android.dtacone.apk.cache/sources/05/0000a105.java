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
    public ViewDragHelper f49129a;

    /* renamed from: b */
    public OnDismissListener f49130b;

    /* renamed from: c */
    public boolean f49131c;

    /* renamed from: d */
    public boolean f49132d;

    /* renamed from: f */
    public boolean f49134f;

    /* renamed from: e */
    public float f49133e = 0.0f;

    /* renamed from: g */
    public int f49135g = 2;

    /* renamed from: h */
    public float f49136h = 0.5f;

    /* renamed from: i */
    public float f49137i = 0.0f;

    /* renamed from: j */
    public float f49138j = 0.5f;

    /* renamed from: k */
    public final ViewDragHelper.Callback f49139k = new C6804a();

    /* loaded from: classes4.dex */
    public interface OnDismissListener {
        void onDismiss(View view);

        void onDragStateChanged(int i);
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$a */
    /* loaded from: classes4.dex */
    public class C6804a extends ViewDragHelper.Callback {

        /* renamed from: a */
        public int f49140a;

        /* renamed from: b */
        public int f49141b = -1;

        public C6804a() {
        }

        /* renamed from: a */
        public final boolean m45721a(View view, float f) {
            boolean z;
            int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            if (i != 0) {
                if (ViewCompat.getLayoutDirection(view) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                int i2 = SwipeDismissBehavior.this.f49135g;
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
            int left = view.getLeft() - this.f49140a;
            if (Math.abs(left) < Math.round(view.getWidth() * SwipeDismissBehavior.this.f49136h)) {
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
            int i3 = SwipeDismissBehavior.this.f49135g;
            if (i3 == 0) {
                if (z) {
                    width = this.f49140a - view.getWidth();
                    width2 = this.f49140a;
                } else {
                    width = this.f49140a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i3 == 1) {
                if (z) {
                    width = this.f49140a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                } else {
                    width = this.f49140a - view.getWidth();
                    width2 = this.f49140a;
                }
            } else {
                width = this.f49140a - view.getWidth();
                width2 = view.getWidth() + this.f49140a;
            }
            return SwipeDismissBehavior.m45725c(width, i, width2);
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
            this.f49141b = i;
            this.f49140a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                SwipeDismissBehavior.this.f49132d = true;
                parent.requestDisallowInterceptTouchEvent(true);
                SwipeDismissBehavior.this.f49132d = false;
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewDragStateChanged(int i) {
            OnDismissListener onDismissListener = SwipeDismissBehavior.this.f49130b;
            if (onDismissListener != null) {
                onDismissListener.onDragStateChanged(i);
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            float width = view.getWidth() * SwipeDismissBehavior.this.f49137i;
            float width2 = view.getWidth() * SwipeDismissBehavior.this.f49138j;
            float abs = Math.abs(i - this.f49140a);
            if (abs <= width) {
                view.setAlpha(1.0f);
            } else if (abs >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.m45726b(0.0f, 1.0f - SwipeDismissBehavior.m45723e(width, width2, abs), 1.0f));
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewReleased(View view, float f, float f2) {
            int i;
            boolean z;
            OnDismissListener onDismissListener;
            this.f49141b = -1;
            int width = view.getWidth();
            if (m45721a(view, f)) {
                if (f >= 0.0f) {
                    int left = view.getLeft();
                    int i2 = this.f49140a;
                    if (left >= i2) {
                        i = i2 + width;
                        z = true;
                    }
                }
                i = this.f49140a - width;
                z = true;
            } else {
                i = this.f49140a;
                z = false;
            }
            if (SwipeDismissBehavior.this.f49129a.settleCapturedViewAt(i, view.getTop())) {
                ViewCompat.postOnAnimation(view, new RunnableC6806c(view, z));
            } else if (z && (onDismissListener = SwipeDismissBehavior.this.f49130b) != null) {
                onDismissListener.onDismiss(view);
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public boolean tryCaptureView(View view, int i) {
            int i2 = this.f49141b;
            if ((i2 == -1 || i2 == i) && SwipeDismissBehavior.this.canSwipeDismissView(view)) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$b */
    /* loaded from: classes4.dex */
    public class C6805b implements AccessibilityViewCommand {
        public C6805b() {
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
            int i = SwipeDismissBehavior.this.f49135g;
            if ((i == 0 && z) || (i == 1 && !z)) {
                width = -view.getWidth();
            } else {
                width = view.getWidth();
            }
            ViewCompat.offsetLeftAndRight(view, width);
            view.setAlpha(0.0f);
            OnDismissListener onDismissListener = SwipeDismissBehavior.this.f49130b;
            if (onDismissListener != null) {
                onDismissListener.onDismiss(view);
            }
            return true;
        }
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$c */
    /* loaded from: classes4.dex */
    public class RunnableC6806c implements Runnable {

        /* renamed from: a */
        public final View f49144a;

        /* renamed from: b */
        public final boolean f49145b;

        public RunnableC6806c(View view, boolean z) {
            this.f49144a = view;
            this.f49145b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            OnDismissListener onDismissListener;
            ViewDragHelper viewDragHelper = SwipeDismissBehavior.this.f49129a;
            if (viewDragHelper != null && viewDragHelper.continueSettling(true)) {
                ViewCompat.postOnAnimation(this.f49144a, this);
            } else if (this.f49145b && (onDismissListener = SwipeDismissBehavior.this.f49130b) != null) {
                onDismissListener.onDismiss(this.f49144a);
            }
        }
    }

    /* renamed from: b */
    public static float m45726b(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    /* renamed from: c */
    public static int m45725c(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    /* renamed from: e */
    public static float m45723e(float f, float f2, float f3) {
        return (f3 - f) / (f2 - f);
    }

    public boolean canSwipeDismissView(@NonNull View view) {
        return true;
    }

    /* renamed from: d */
    public final void m45724d(ViewGroup viewGroup) {
        ViewDragHelper create;
        if (this.f49129a == null) {
            if (this.f49134f) {
                create = ViewDragHelper.create(viewGroup, this.f49133e, this.f49139k);
            } else {
                create = ViewDragHelper.create(viewGroup, this.f49139k);
            }
            this.f49129a = create;
        }
    }

    /* renamed from: f */
    public final void m45722f(View view) {
        ViewCompat.removeAccessibilityAction(view, 1048576);
        if (canSwipeDismissView(view)) {
            ViewCompat.replaceAccessibilityAction(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_DISMISS, null, new C6805b());
        }
    }

    public int getDragState() {
        ViewDragHelper viewDragHelper = this.f49129a;
        if (viewDragHelper != null) {
            return viewDragHelper.getViewDragState();
        }
        return 0;
    }

    @Nullable
    @VisibleForTesting
    public OnDismissListener getListener() {
        return this.f49130b;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
        boolean z = this.f49131c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.f49131c = false;
            }
        } else {
            z = coordinatorLayout.isPointInChildBounds(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f49131c = z;
        }
        if (!z) {
            return false;
        }
        m45724d(coordinatorLayout);
        if (!this.f49132d && this.f49129a.shouldInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i) {
        boolean onLayoutChild = super.onLayoutChild(coordinatorLayout, v, i);
        if (ViewCompat.getImportantForAccessibility(v) == 0) {
            ViewCompat.setImportantForAccessibility(v, 1);
            m45722f(v);
        }
        return onLayoutChild;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (this.f49129a != null) {
            if (!this.f49132d || motionEvent.getActionMasked() != 3) {
                this.f49129a.processTouchEvent(motionEvent);
                return true;
            }
            return true;
        }
        return false;
    }

    public void setDragDismissDistance(float f) {
        this.f49136h = m45726b(0.0f, f, 1.0f);
    }

    public void setEndAlphaSwipeDistance(float f) {
        this.f49138j = m45726b(0.0f, f, 1.0f);
    }

    public void setListener(@Nullable OnDismissListener onDismissListener) {
        this.f49130b = onDismissListener;
    }

    public void setSensitivity(float f) {
        this.f49133e = f;
        this.f49134f = true;
    }

    public void setStartAlphaSwipeDistance(float f) {
        this.f49137i = m45726b(0.0f, f, 1.0f);
    }

    public void setSwipeDirection(int i) {
        this.f49135g = i;
    }
}