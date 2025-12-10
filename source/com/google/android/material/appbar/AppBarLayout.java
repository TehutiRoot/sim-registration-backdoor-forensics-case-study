package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.math.MathUtils;
import androidx.core.util.ObjectsCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.AttachedBehavior {

    /* renamed from: y */
    public static final int f48946y = R.style.Widget_Design_AppBarLayout;

    /* renamed from: a */
    public int f48947a;

    /* renamed from: b */
    public int f48948b;

    /* renamed from: c */
    public int f48949c;

    /* renamed from: d */
    public int f48950d;

    /* renamed from: e */
    public boolean f48951e;

    /* renamed from: f */
    public int f48952f;

    /* renamed from: g */
    public WindowInsetsCompat f48953g;

    /* renamed from: h */
    public List f48954h;

    /* renamed from: i */
    public boolean f48955i;

    /* renamed from: j */
    public boolean f48956j;

    /* renamed from: k */
    public boolean f48957k;

    /* renamed from: l */
    public boolean f48958l;

    /* renamed from: m */
    public int f48959m;

    /* renamed from: n */
    public WeakReference f48960n;

    /* renamed from: o */
    public final ColorStateList f48961o;

    /* renamed from: p */
    public ValueAnimator f48962p;

    /* renamed from: q */
    public ValueAnimator.AnimatorUpdateListener f48963q;

    /* renamed from: r */
    public final List f48964r;

    /* renamed from: s */
    public final long f48965s;

    /* renamed from: t */
    public final TimeInterpolator f48966t;

    /* renamed from: u */
    public int[] f48967u;

    /* renamed from: v */
    public Drawable f48968v;

    /* renamed from: w */
    public final float f48969w;

    /* renamed from: x */
    public Behavior f48970x;

    /* loaded from: classes4.dex */
    public static class BaseBehavior<T extends AppBarLayout> extends AbstractC22908x70 {

        /* renamed from: k */
        public int f48971k;

        /* renamed from: l */
        public int f48972l;

        /* renamed from: m */
        public ValueAnimator f48973m;

        /* renamed from: n */
        public SavedState f48974n;

        /* renamed from: o */
        public WeakReference f48975o;

        /* renamed from: p */
        public BaseDragCallback f48976p;

        /* renamed from: q */
        public boolean f48977q;

        /* loaded from: classes4.dex */
        public static abstract class BaseDragCallback<T extends AppBarLayout> {
            public abstract boolean canDrag(@NonNull T t);
        }

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a */
        /* loaded from: classes4.dex */
        public class C6800a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            public final /* synthetic */ CoordinatorLayout f48983a;

            /* renamed from: b */
            public final /* synthetic */ AppBarLayout f48984b;

            public C6800a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                BaseBehavior.this = r1;
                this.f48983a = coordinatorLayout;
                this.f48984b = appBarLayout;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseBehavior.this.m609i(this.f48983a, this.f48984b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$b */
        /* loaded from: classes4.dex */
        public class C6801b extends AccessibilityDelegateCompat {
            public C6801b() {
                BaseBehavior.this = r1;
            }

            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setScrollable(BaseBehavior.this.f48977q);
                accessibilityNodeInfoCompat.setClassName(ScrollView.class.getName());
            }
        }

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$c */
        /* loaded from: classes4.dex */
        public class C6802c implements AccessibilityViewCommand {

            /* renamed from: a */
            public final /* synthetic */ CoordinatorLayout f48987a;

            /* renamed from: b */
            public final /* synthetic */ AppBarLayout f48988b;

            /* renamed from: c */
            public final /* synthetic */ View f48989c;

            /* renamed from: d */
            public final /* synthetic */ int f48990d;

            public C6802c(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
                BaseBehavior.this = r1;
                this.f48987a = coordinatorLayout;
                this.f48988b = appBarLayout;
                this.f48989c = view;
                this.f48990d = i;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.core.view.accessibility.AccessibilityViewCommand
            public boolean perform(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
                BaseBehavior.this.onNestedPreScroll(this.f48987a, (CoordinatorLayout) this.f48988b, this.f48989c, 0, this.f48990d, new int[]{0, 0}, 1);
                return true;
            }
        }

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$d */
        /* loaded from: classes4.dex */
        public class C6803d implements AccessibilityViewCommand {

            /* renamed from: a */
            public final /* synthetic */ AppBarLayout f48992a;

            /* renamed from: b */
            public final /* synthetic */ boolean f48993b;

            public C6803d(AppBarLayout appBarLayout, boolean z) {
                BaseBehavior.this = r1;
                this.f48992a = appBarLayout;
                this.f48993b = z;
            }

            @Override // androidx.core.view.accessibility.AccessibilityViewCommand
            public boolean perform(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
                this.f48992a.setExpanded(this.f48993b);
                return true;
            }
        }

        public BaseBehavior() {
        }

        /* renamed from: k */
        public static /* synthetic */ boolean m45932k(BaseBehavior baseBehavior, View view, AppBarLayout appBarLayout, View view2, KeyEvent keyEvent) {
            return baseBehavior.m45942F(view, appBarLayout, view2, keyEvent);
        }

        /* renamed from: l */
        public static /* synthetic */ boolean m45931l(BaseBehavior baseBehavior, View view, AppBarLayout appBarLayout, View view2, int i, KeyEvent keyEvent) {
            return baseBehavior.m45941G(view, appBarLayout, view2, i, keyEvent);
        }

        /* renamed from: v */
        public static boolean m45921v(int i, int i2) {
            return (i & i2) == i2;
        }

        /* renamed from: z */
        public static View m45917z(AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: A */
        public final int m45947A(AppBarLayout appBarLayout, int i) {
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (m45921v(layoutParams.getScrollFlags(), 32)) {
                    top -= ((LinearLayout.LayoutParams) layoutParams).topMargin;
                    bottom += ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                }
                int i3 = -i;
                if (top <= i3 && bottom >= i3) {
                    return i2;
                }
            }
            return -1;
        }

        /* renamed from: B */
        public final View m45946B(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (((CoordinatorLayout.LayoutParams) childAt.getLayoutParams()).getBehavior() instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        @Override // p000.AbstractC22908x70
        /* renamed from: C */
        public int mo614d(AppBarLayout appBarLayout) {
            return -appBarLayout.getDownNestedScrollRange();
        }

        @Override // p000.AbstractC22908x70
        /* renamed from: D */
        public int mo613e(AppBarLayout appBarLayout) {
            return appBarLayout.getTotalScrollRange();
        }

        /* renamed from: E */
        public final int m45943E(AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                View childAt = appBarLayout.getChildAt(i3);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                Interpolator scrollInterpolator = layoutParams.getScrollInterpolator();
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    if (scrollInterpolator != null) {
                        int scrollFlags = layoutParams.getScrollFlags();
                        if ((scrollFlags & 1) != 0) {
                            i2 = childAt.getHeight() + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                            if ((scrollFlags & 2) != 0) {
                                i2 -= ViewCompat.getMinimumHeight(childAt);
                            }
                        }
                        if (ViewCompat.getFitsSystemWindows(childAt)) {
                            i2 -= appBarLayout.getTopInset();
                        }
                        if (i2 > 0) {
                            float f = i2;
                            return Integer.signum(i) * (childAt.getTop() + Math.round(f * scrollInterpolator.getInterpolation((abs - childAt.getTop()) / f)));
                        }
                    }
                } else {
                    i3++;
                }
            }
            return i;
        }

        /* renamed from: F */
        public final /* synthetic */ boolean m45942F(View view, AppBarLayout appBarLayout, View view2, KeyEvent keyEvent) {
            m45919x(keyEvent, view, appBarLayout);
            return false;
        }

        /* renamed from: G */
        public final /* synthetic */ boolean m45941G(View view, AppBarLayout appBarLayout, View view2, int i, KeyEvent keyEvent) {
            m45919x(keyEvent, view, appBarLayout);
            return false;
        }

        @Override // p000.AbstractC22908x70
        /* renamed from: H */
        public void mo611g(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            m45935M(coordinatorLayout, appBarLayout);
            if (appBarLayout.isLiftOnScroll()) {
                appBarLayout.m45954r(appBarLayout.m45951u(m45918y(coordinatorLayout)));
            }
        }

        /* renamed from: I */
        public void m45939I(SavedState savedState, boolean z) {
            if (this.f48974n == null || z) {
                this.f48974n = savedState;
            }
        }

        /* renamed from: J */
        public SavedState m45938J(Parcelable parcelable, AppBarLayout appBarLayout) {
            boolean z;
            boolean z2;
            int topAndBottomOffset = getTopAndBottomOffset();
            int childCount = appBarLayout.getChildCount();
            boolean z3 = false;
            for (int i = 0; i < childCount; i++) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + topAndBottomOffset;
                if (childAt.getTop() + topAndBottomOffset <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = AbsSavedState.EMPTY_STATE;
                    }
                    SavedState savedState = new SavedState(parcelable);
                    if (topAndBottomOffset == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    savedState.f48979c = z;
                    if (!z && (-topAndBottomOffset) >= appBarLayout.getTotalScrollRange()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    savedState.f48978b = z2;
                    savedState.f48980d = i;
                    if (bottom == ViewCompat.getMinimumHeight(childAt) + appBarLayout.getTopInset()) {
                        z3 = true;
                    }
                    savedState.f48982f = z3;
                    savedState.f48981e = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return null;
        }

        @Override // p000.AbstractC22908x70
        /* renamed from: K */
        public int mo608j(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, int i3) {
            int i4;
            int i5;
            int mo612f = mo612f();
            int i6 = 0;
            if (i2 != 0 && mo612f >= i2 && mo612f <= i3) {
                int clamp = MathUtils.clamp(i, i2, i3);
                if (mo612f != clamp) {
                    if (appBarLayout.m45967e()) {
                        i4 = m45943E(appBarLayout, clamp);
                    } else {
                        i4 = clamp;
                    }
                    boolean topAndBottomOffset = setTopAndBottomOffset(i4);
                    int i7 = mo612f - clamp;
                    this.f48971k = clamp - i4;
                    if (topAndBottomOffset) {
                        while (i6 < appBarLayout.getChildCount()) {
                            LayoutParams layoutParams = (LayoutParams) appBarLayout.getChildAt(i6).getLayoutParams();
                            ChildScrollEffect scrollEffect = layoutParams.getScrollEffect();
                            if (scrollEffect != null && (layoutParams.getScrollFlags() & 1) != 0) {
                                scrollEffect.onOffsetChanged(appBarLayout, appBarLayout.getChildAt(i6), getTopAndBottomOffset());
                            }
                            i6++;
                        }
                    }
                    if (!topAndBottomOffset && appBarLayout.m45967e()) {
                        coordinatorLayout.dispatchDependentViewsChanged(appBarLayout);
                    }
                    appBarLayout.m45959m(getTopAndBottomOffset());
                    if (clamp < mo612f) {
                        i5 = -1;
                    } else {
                        i5 = 1;
                    }
                    m45933O(coordinatorLayout, appBarLayout, clamp, i5, false);
                    i6 = i7;
                }
            } else {
                this.f48971k = 0;
            }
            m45934N(coordinatorLayout, appBarLayout);
            return i6;
        }

        /* renamed from: L */
        public final boolean m45936L(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            List<View> dependents = coordinatorLayout.getDependents(appBarLayout);
            int size = dependents.size();
            for (int i = 0; i < size; i++) {
                CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) dependents.get(i).getLayoutParams()).getBehavior();
                if (behavior instanceof ScrollingViewBehavior) {
                    if (((ScrollingViewBehavior) behavior).getOverlayTop() == 0) {
                        return false;
                    }
                    return true;
                }
            }
            return false;
        }

        /* renamed from: M */
        public final void m45935M(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int topInset = appBarLayout.getTopInset() + appBarLayout.getPaddingTop();
            int mo612f = mo612f() - topInset;
            int m45947A = m45947A(appBarLayout, mo612f);
            if (m45947A >= 0) {
                View childAt = appBarLayout.getChildAt(m45947A);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int scrollFlags = layoutParams.getScrollFlags();
                if ((scrollFlags & 17) == 17) {
                    int i = -childAt.getTop();
                    int i2 = -childAt.getBottom();
                    if (m45947A == 0 && ViewCompat.getFitsSystemWindows(appBarLayout) && ViewCompat.getFitsSystemWindows(childAt)) {
                        i -= appBarLayout.getTopInset();
                    }
                    if (m45921v(scrollFlags, 2)) {
                        i2 += ViewCompat.getMinimumHeight(childAt);
                    } else if (m45921v(scrollFlags, 5)) {
                        int minimumHeight = ViewCompat.getMinimumHeight(childAt) + i2;
                        if (mo612f < minimumHeight) {
                            i = minimumHeight;
                        } else {
                            i2 = minimumHeight;
                        }
                    }
                    if (m45921v(scrollFlags, 32)) {
                        i += ((LinearLayout.LayoutParams) layoutParams).topMargin;
                        i2 -= ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                    }
                    m45926q(coordinatorLayout, appBarLayout, MathUtils.clamp(m45924s(mo612f, i2, i) + topInset, -appBarLayout.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        /* renamed from: N */
        public final void m45934N(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            View m45946B;
            ViewCompat.removeAccessibilityAction(coordinatorLayout, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD.getId());
            ViewCompat.removeAccessibilityAction(coordinatorLayout, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD.getId());
            if (appBarLayout.getTotalScrollRange() == 0 || (m45946B = m45946B(coordinatorLayout)) == null || !m45920w(appBarLayout)) {
                return;
            }
            if (!ViewCompat.hasAccessibilityDelegate(coordinatorLayout)) {
                ViewCompat.setAccessibilityDelegate(coordinatorLayout, new C6801b());
            }
            this.f48977q = m45928o(coordinatorLayout, appBarLayout, m45946B);
        }

        /* renamed from: O */
        public final void m45933O(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, boolean z) {
            View m45917z = m45917z(appBarLayout, i);
            boolean z2 = false;
            if (m45917z != null) {
                int scrollFlags = ((LayoutParams) m45917z.getLayoutParams()).getScrollFlags();
                if ((scrollFlags & 1) != 0) {
                    int minimumHeight = ViewCompat.getMinimumHeight(m45917z);
                    if (i2 <= 0 || (scrollFlags & 12) == 0 ? !((scrollFlags & 2) == 0 || (-i) < (m45917z.getBottom() - minimumHeight) - appBarLayout.getTopInset()) : (-i) >= (m45917z.getBottom() - minimumHeight) - appBarLayout.getTopInset()) {
                        z2 = true;
                    }
                }
            }
            if (appBarLayout.isLiftOnScroll()) {
                z2 = appBarLayout.m45951u(m45918y(coordinatorLayout));
            }
            boolean m45954r = appBarLayout.m45954r(z2);
            if (z || (m45954r && m45936L(coordinatorLayout, appBarLayout))) {
                appBarLayout.jumpDrawablesToCurrentState();
            }
        }

        @Override // p000.AbstractC22908x70
        /* renamed from: f */
        public int mo612f() {
            return getTopAndBottomOffset() + this.f48971k;
        }

        /* renamed from: o */
        public final boolean m45928o(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view) {
            boolean z = false;
            if (mo612f() != (-appBarLayout.getTotalScrollRange())) {
                m45927p(coordinatorLayout, appBarLayout, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD, false);
                z = true;
            }
            if (mo612f() != 0) {
                if (view.canScrollVertically(-1)) {
                    int i = -appBarLayout.getDownNestedPreScrollRange();
                    if (i != 0) {
                        ViewCompat.replaceAccessibilityAction(coordinatorLayout, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD, null, new C6802c(coordinatorLayout, appBarLayout, view, i));
                        return true;
                    }
                } else {
                    m45927p(coordinatorLayout, appBarLayout, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD, true);
                    return true;
                }
            }
            return z;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.V22, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i) {
            return onLayoutChild(coordinatorLayout, (CoordinatorLayout) ((AppBarLayout) view), i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i, int i2, int i3, int i4) {
            return onMeasureChild(coordinatorLayout, (CoordinatorLayout) ((AppBarLayout) view), i, i2, i3, i4);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ void onNestedPreScroll(CoordinatorLayout coordinatorLayout, @NonNull View view, View view2, int i, int i2, int[] iArr, int i3) {
            onNestedPreScroll(coordinatorLayout, (CoordinatorLayout) ((AppBarLayout) view), view2, i, i2, iArr, i3);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ void onNestedScroll(CoordinatorLayout coordinatorLayout, @NonNull View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            onNestedScroll(coordinatorLayout, (CoordinatorLayout) ((AppBarLayout) view), view2, i, i2, i3, i4, i5, iArr);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ void onRestoreInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, Parcelable parcelable) {
            onRestoreInstanceState(coordinatorLayout, (CoordinatorLayout) ((AppBarLayout) view), parcelable);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ Parcelable onSaveInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view) {
            return onSaveInstanceState(coordinatorLayout, (CoordinatorLayout) ((AppBarLayout) view));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2, View view3, int i, int i2) {
            return onStartNestedScroll(coordinatorLayout, (CoordinatorLayout) ((AppBarLayout) view), view2, view3, i, i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ void onStopNestedScroll(CoordinatorLayout coordinatorLayout, @NonNull View view, View view2, int i) {
            onStopNestedScroll(coordinatorLayout, (CoordinatorLayout) ((AppBarLayout) view), view2, i);
        }

        /* renamed from: p */
        public final void m45927p(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat, boolean z) {
            ViewCompat.replaceAccessibilityAction(coordinatorLayout, accessibilityActionCompat, null, new C6803d(appBarLayout, z));
        }

        /* renamed from: q */
        public final void m45926q(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, float f) {
            int height;
            int abs = Math.abs(mo612f() - i);
            float abs2 = Math.abs(f);
            if (abs2 > 0.0f) {
                height = Math.round((abs / abs2) * 1000.0f) * 3;
            } else {
                height = (int) (((abs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            }
            m45925r(coordinatorLayout, appBarLayout, i, height);
        }

        /* renamed from: r */
        public final void m45925r(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2) {
            int mo612f = mo612f();
            if (mo612f == i) {
                ValueAnimator valueAnimator = this.f48973m;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f48973m.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.f48973m;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f48973m = valueAnimator3;
                valueAnimator3.setInterpolator(AnimationUtils.DECELERATE_INTERPOLATOR);
                this.f48973m.addUpdateListener(new C6800a(coordinatorLayout, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.f48973m.setDuration(Math.min(i2, 600));
            this.f48973m.setIntValues(mo612f, i);
            this.f48973m.start();
        }

        /* renamed from: s */
        public final int m45924s(int i, int i2, int i3) {
            if (i >= (i2 + i3) / 2) {
                return i3;
            }
            return i2;
        }

        public void setDragCallback(@Nullable BaseDragCallback baseDragCallback) {
            this.f48976p = baseDragCallback;
        }

        @Override // p000.AbstractC22908x70
        /* renamed from: t */
        public boolean mo617a(AppBarLayout appBarLayout) {
            BaseDragCallback baseDragCallback = this.f48976p;
            if (baseDragCallback != null) {
                return baseDragCallback.canDrag(appBarLayout);
            }
            WeakReference weakReference = this.f48975o;
            if (weakReference == null) {
                return true;
            }
            View view = (View) weakReference.get();
            if (view != null && view.isShown() && !view.canScrollVertically(-1)) {
                return true;
            }
            return false;
        }

        /* renamed from: u */
        public final boolean m45922u(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view) {
            if (appBarLayout.m45965g() && coordinatorLayout.getHeight() - view.getHeight() <= appBarLayout.getHeight()) {
                return true;
            }
            return false;
        }

        /* renamed from: w */
        public final boolean m45920w(AppBarLayout appBarLayout) {
            int childCount = appBarLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (((LayoutParams) appBarLayout.getChildAt(i).getLayoutParams()).f48997a != 0) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: x */
        public final void m45919x(KeyEvent keyEvent, View view, AppBarLayout appBarLayout) {
            if (keyEvent.getAction() == 0 || keyEvent.getAction() == 1) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 19 && keyCode != 280 && keyCode != 92) {
                    if ((keyCode == 20 || keyCode == 281 || keyCode == 93) && view.getScrollY() > 0) {
                        appBarLayout.setExpanded(false);
                    }
                } else if (view.getScrollY() < view.getMeasuredHeight() * 0.1d) {
                    appBarLayout.setExpanded(true);
                }
            }
        }

        /* renamed from: y */
        public final View m45918y(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof NestedScrollingChild) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull final T t, int i) {
            int round;
            boolean onLayoutChild = super.onLayoutChild(coordinatorLayout, (View) t, i);
            int pendingAction = t.getPendingAction();
            SavedState savedState = this.f48974n;
            if (savedState == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i2 = -t.getUpNestedPreScrollRange();
                        if (z) {
                            m45926q(coordinatorLayout, t, i2, 0.0f);
                        } else {
                            m609i(coordinatorLayout, t, i2);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z) {
                            m45926q(coordinatorLayout, t, 0, 0.0f);
                        } else {
                            m609i(coordinatorLayout, t, 0);
                        }
                    }
                }
            } else if (savedState.f48978b) {
                m609i(coordinatorLayout, t, -t.getTotalScrollRange());
            } else if (savedState.f48979c) {
                m609i(coordinatorLayout, t, 0);
            } else {
                View childAt = t.getChildAt(savedState.f48980d);
                int i3 = -childAt.getBottom();
                if (this.f48974n.f48982f) {
                    round = ViewCompat.getMinimumHeight(childAt) + t.getTopInset();
                } else {
                    round = Math.round(childAt.getHeight() * this.f48974n.f48981e);
                }
                m609i(coordinatorLayout, t, i3 + round);
            }
            t.m45957o();
            this.f48974n = null;
            setTopAndBottomOffset(MathUtils.clamp(getTopAndBottomOffset(), -t.getTotalScrollRange(), 0));
            m45933O(coordinatorLayout, t, getTopAndBottomOffset(), 0, true);
            t.m45959m(getTopAndBottomOffset());
            m45934N(coordinatorLayout, t);
            final View m45918y = m45918y(coordinatorLayout);
            if (m45918y != null) {
                if (Build.VERSION.SDK_INT >= 28) {
                    m45918y.addOnUnhandledKeyEventListener(new View.OnUnhandledKeyEventListener() { // from class: o5
                        {
                            AppBarLayout.BaseBehavior.this = this;
                        }

                        @Override // android.view.View.OnUnhandledKeyEventListener
                        public final boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent) {
                            return AppBarLayout.BaseBehavior.m45932k(AppBarLayout.BaseBehavior.this, m45918y, t, view, keyEvent);
                        }
                    });
                } else {
                    m45918y.setOnKeyListener(new View.OnKeyListener() { // from class: p5
                        {
                            AppBarLayout.BaseBehavior.this = this;
                        }

                        @Override // android.view.View.OnKeyListener
                        public final boolean onKey(View view, int i4, KeyEvent keyEvent) {
                            return AppBarLayout.BaseBehavior.m45931l(AppBarLayout.BaseBehavior.this, m45918y, t, view, i4, keyEvent);
                        }
                    });
                }
            }
            return onLayoutChild;
        }

        public boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t, int i, int i2, int i3, int i4) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.LayoutParams) t.getLayoutParams())).height == -2) {
                coordinatorLayout.onMeasureChild(t, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), i4);
                return true;
            }
            return super.onMeasureChild(coordinatorLayout, (CoordinatorLayout) t, i, i2, i3, i4);
        }

        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, @NonNull T t, View view, int i, int i2, int[] iArr, int i3) {
            int i4;
            int i5;
            if (i2 != 0) {
                if (i2 < 0) {
                    int i6 = -t.getTotalScrollRange();
                    i4 = i6;
                    i5 = t.getDownNestedPreScrollRange() + i6;
                } else {
                    i4 = -t.getUpNestedPreScrollRange();
                    i5 = 0;
                }
                if (i4 != i5) {
                    iArr[1] = m610h(coordinatorLayout, t, i2, i4, i5);
                }
            }
            if (t.isLiftOnScroll()) {
                t.m45954r(t.m45951u(view));
            }
        }

        public void onNestedScroll(CoordinatorLayout coordinatorLayout, @NonNull T t, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            if (i4 < 0) {
                iArr[1] = m610h(coordinatorLayout, t, i4, -t.getDownNestedScrollRange(), 0);
            }
            if (i4 == 0) {
                m45934N(coordinatorLayout, t);
            }
        }

        public void onRestoreInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                m45939I((SavedState) parcelable, true);
                super.onRestoreInstanceState(coordinatorLayout, (CoordinatorLayout) t, this.f48974n.getSuperState());
                return;
            }
            super.onRestoreInstanceState(coordinatorLayout, (CoordinatorLayout) t, parcelable);
            this.f48974n = null;
        }

        public Parcelable onSaveInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t) {
            Parcelable onSaveInstanceState = super.onSaveInstanceState(coordinatorLayout, (CoordinatorLayout) t);
            SavedState m45938J = m45938J(onSaveInstanceState, t);
            return m45938J == null ? onSaveInstanceState : m45938J;
        }

        public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t, @NonNull View view, View view2, int i, int i2) {
            ValueAnimator valueAnimator;
            boolean z = (i & 2) != 0 && (t.isLiftOnScroll() || m45922u(coordinatorLayout, t, view));
            if (z && (valueAnimator = this.f48973m) != null) {
                valueAnimator.cancel();
            }
            this.f48975o = null;
            this.f48972l = i2;
            return z;
        }

        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, @NonNull T t, View view, int i) {
            if (this.f48972l == 0 || i == 1) {
                m45935M(coordinatorLayout, t);
                if (t.isLiftOnScroll()) {
                    t.m45954r(t.m45951u(view));
                }
            }
            this.f48975o = new WeakReference(view);
        }

        /* loaded from: classes4.dex */
        public static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new C6799a();

            /* renamed from: b */
            public boolean f48978b;

            /* renamed from: c */
            public boolean f48979c;

            /* renamed from: d */
            public int f48980d;

            /* renamed from: e */
            public float f48981e;

            /* renamed from: f */
            public boolean f48982f;

            /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$SavedState$a */
            /* loaded from: classes4.dex */
            public class C6799a implements Parcelable.ClassLoaderCreator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a */
                public SavedState createFromParcel(Parcel parcel) {
                    return new SavedState(parcel, null);
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                /* renamed from: b */
                public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new SavedState(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: c */
                public SavedState[] newArray(int i) {
                    return new SavedState[i];
                }
            }

            public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f48978b = parcel.readByte() != 0;
                this.f48979c = parcel.readByte() != 0;
                this.f48980d = parcel.readInt();
                this.f48981e = parcel.readFloat();
                this.f48982f = parcel.readByte() != 0;
            }

            @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
            public void writeToParcel(@NonNull Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeByte(this.f48978b ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.f48979c ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f48980d);
                parcel.writeFloat(this.f48981e);
                parcel.writeByte(this.f48982f ? (byte) 1 : (byte) 0);
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    /* loaded from: classes4.dex */
    public interface BaseOnOffsetChangedListener<T extends AppBarLayout> {
        void onOffsetChanged(T t, int i);
    }

    /* loaded from: classes4.dex */
    public static class Behavior extends BaseBehavior<AppBarLayout> {

        /* loaded from: classes4.dex */
        public static abstract class DragCallback extends BaseBehavior.BaseDragCallback<AppBarLayout> {
        }

        public Behavior() {
        }

        @Override // p000.V22
        public /* bridge */ /* synthetic */ int getLeftAndRightOffset() {
            return super.getLeftAndRightOffset();
        }

        @Override // p000.V22
        public /* bridge */ /* synthetic */ int getTopAndBottomOffset() {
            return super.getTopAndBottomOffset();
        }

        @Override // p000.V22
        public /* bridge */ /* synthetic */ boolean isHorizontalOffsetEnabled() {
            return super.isHorizontalOffsetEnabled();
        }

        @Override // p000.V22
        public /* bridge */ /* synthetic */ boolean isVerticalOffsetEnabled() {
            return super.isVerticalOffsetEnabled();
        }

        @Override // p000.AbstractC22908x70, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
            return super.onInterceptTouchEvent(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, int i) {
            return super.onLayoutChild(coordinatorLayout, (CoordinatorLayout) appBarLayout, i);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, int i, int i2, int i3, int i4) {
            return super.onMeasureChild(coordinatorLayout, (CoordinatorLayout) appBarLayout, i, i2, i3, i4);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onNestedPreScroll(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
            super.onNestedPreScroll(coordinatorLayout, (CoordinatorLayout) appBarLayout, view, i, i2, iArr, i3);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onNestedScroll(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            super.onNestedScroll(coordinatorLayout, (CoordinatorLayout) appBarLayout, view, i, i2, i3, i4, i5, iArr);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onRestoreInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, Parcelable parcelable) {
            super.onRestoreInstanceState(coordinatorLayout, (CoordinatorLayout) appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ Parcelable onSaveInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout) {
            return super.onSaveInstanceState(coordinatorLayout, (CoordinatorLayout) appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, @NonNull View view, View view2, int i, int i2) {
            return super.onStartNestedScroll(coordinatorLayout, (CoordinatorLayout) appBarLayout, view, view2, i, i2);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onStopNestedScroll(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, View view, int i) {
            super.onStopNestedScroll(coordinatorLayout, (CoordinatorLayout) appBarLayout, view, i);
        }

        @Override // p000.AbstractC22908x70, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
            return super.onTouchEvent(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void setDragCallback(@Nullable BaseBehavior.BaseDragCallback baseDragCallback) {
            super.setDragCallback(baseDragCallback);
        }

        @Override // p000.V22
        public /* bridge */ /* synthetic */ void setHorizontalOffsetEnabled(boolean z) {
            super.setHorizontalOffsetEnabled(z);
        }

        @Override // p000.V22
        public /* bridge */ /* synthetic */ boolean setLeftAndRightOffset(int i) {
            return super.setLeftAndRightOffset(i);
        }

        @Override // p000.V22
        public /* bridge */ /* synthetic */ boolean setTopAndBottomOffset(int i) {
            return super.setTopAndBottomOffset(i);
        }

        @Override // p000.V22
        public /* bridge */ /* synthetic */ void setVerticalOffsetEnabled(boolean z) {
            super.setVerticalOffsetEnabled(z);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class ChildScrollEffect {
        public abstract void onOffsetChanged(@NonNull AppBarLayout appBarLayout, @NonNull View view, float f);
    }

    /* loaded from: classes4.dex */
    public static class CompressChildScrollEffect extends ChildScrollEffect {

        /* renamed from: a */
        public final Rect f48995a = new Rect();

        /* renamed from: b */
        public final Rect f48996b = new Rect();

        /* renamed from: a */
        public static void m45913a(Rect rect, AppBarLayout appBarLayout, View view) {
            view.getDrawingRect(rect);
            appBarLayout.offsetDescendantRectToMyCoords(view, rect);
            rect.offset(0, -appBarLayout.getTopInset());
        }

        @Override // com.google.android.material.appbar.AppBarLayout.ChildScrollEffect
        public void onOffsetChanged(@NonNull AppBarLayout appBarLayout, @NonNull View view, float f) {
            m45913a(this.f48995a, appBarLayout, view);
            float abs = this.f48995a.top - Math.abs(f);
            if (abs <= 0.0f) {
                float clamp = 1.0f - MathUtils.clamp(Math.abs(abs / this.f48995a.height()), 0.0f, 1.0f);
                float height = (-abs) - ((this.f48995a.height() * 0.3f) * (1.0f - (clamp * clamp)));
                view.setTranslationY(height);
                view.getDrawingRect(this.f48996b);
                this.f48996b.offset(0, (int) (-height));
                ViewCompat.setClipBounds(view, this.f48996b);
                return;
            }
            ViewCompat.setClipBounds(view, null);
            view.setTranslationY(0.0f);
        }
    }

    /* loaded from: classes4.dex */
    public static class LayoutParams extends LinearLayout.LayoutParams {
        public static final int SCROLL_EFFECT_COMPRESS = 1;
        public static final int SCROLL_EFFECT_NONE = 0;
        public static final int SCROLL_FLAG_ENTER_ALWAYS = 4;
        public static final int SCROLL_FLAG_ENTER_ALWAYS_COLLAPSED = 8;
        public static final int SCROLL_FLAG_EXIT_UNTIL_COLLAPSED = 2;
        public static final int SCROLL_FLAG_NO_SCROLL = 0;
        public static final int SCROLL_FLAG_SCROLL = 1;
        public static final int SCROLL_FLAG_SNAP = 16;
        public static final int SCROLL_FLAG_SNAP_MARGINS = 32;

        /* renamed from: a */
        public int f48997a;

        /* renamed from: b */
        public ChildScrollEffect f48998b;

        /* renamed from: c */
        public Interpolator f48999c;

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* loaded from: classes4.dex */
        public @interface ScrollEffect {
        }

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* loaded from: classes4.dex */
        public @interface ScrollFlags {
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f48997a = 1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.AppBarLayout_Layout);
            this.f48997a = obtainStyledAttributes.getInt(R.styleable.AppBarLayout_Layout_layout_scrollFlags, 0);
            setScrollEffect(obtainStyledAttributes.getInt(R.styleable.AppBarLayout_Layout_layout_scrollEffect, 0));
            if (obtainStyledAttributes.hasValue(R.styleable.AppBarLayout_Layout_layout_scrollInterpolator)) {
                this.f48999c = android.view.animation.AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(R.styleable.AppBarLayout_Layout_layout_scrollInterpolator, 0));
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public final ChildScrollEffect m45912a(int i) {
            if (i != 1) {
                return null;
            }
            return new CompressChildScrollEffect();
        }

        /* renamed from: b */
        public boolean m45911b() {
            int i = this.f48997a;
            if ((i & 1) == 1 && (i & 10) != 0) {
                return true;
            }
            return false;
        }

        @Nullable
        public ChildScrollEffect getScrollEffect() {
            return this.f48998b;
        }

        public int getScrollFlags() {
            return this.f48997a;
        }

        public Interpolator getScrollInterpolator() {
            return this.f48999c;
        }

        public void setScrollEffect(@Nullable ChildScrollEffect childScrollEffect) {
            this.f48998b = childScrollEffect;
        }

        public void setScrollFlags(int i) {
            this.f48997a = i;
        }

        public void setScrollInterpolator(Interpolator interpolator) {
            this.f48999c = interpolator;
        }

        public void setScrollEffect(int i) {
            this.f48998b = m45912a(i);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f48997a = 1;
        }

        public LayoutParams(int i, int i2, float f) {
            super(i, i2, f);
            this.f48997a = 1;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f48997a = 1;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f48997a = 1;
        }

        @RequiresApi(19)
        public LayoutParams(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f48997a = 1;
        }

        @RequiresApi(19)
        public LayoutParams(@NonNull LayoutParams layoutParams) {
            super((LinearLayout.LayoutParams) layoutParams);
            this.f48997a = 1;
            this.f48997a = layoutParams.f48997a;
            this.f48998b = layoutParams.f48998b;
            this.f48999c = layoutParams.f48999c;
        }
    }

    /* loaded from: classes4.dex */
    public interface LiftOnScrollListener {
        void onUpdate(@Dimension float f, @ColorInt int i);
    }

    /* loaded from: classes4.dex */
    public interface OnOffsetChangedListener extends BaseOnOffsetChangedListener<AppBarLayout> {
        @Override // com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
        void onOffsetChanged(AppBarLayout appBarLayout, int i);
    }

    /* loaded from: classes4.dex */
    public static class ScrollingViewBehavior extends AbstractC23080y70 {
        public ScrollingViewBehavior() {
        }

        /* renamed from: h */
        public static int m45909h(AppBarLayout appBarLayout) {
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) appBarLayout.getLayoutParams()).getBehavior();
            if (behavior instanceof BaseBehavior) {
                return ((BaseBehavior) behavior).mo612f();
            }
            return 0;
        }

        @Override // p000.AbstractC23080y70
        /* renamed from: c */
        public float mo337c(View view) {
            int i;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int m45909h = m45909h(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + m45909h > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (m45909h / i) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // p000.AbstractC23080y70
        /* renamed from: d */
        public int mo336d(View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout) view).getTotalScrollRange();
            }
            return super.mo336d(view);
        }

        @Override // p000.AbstractC23080y70
        /* renamed from: g */
        public AppBarLayout mo339a(List list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = (View) list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // p000.V22
        public /* bridge */ /* synthetic */ int getLeftAndRightOffset() {
            return super.getLeftAndRightOffset();
        }

        @Override // p000.V22
        public /* bridge */ /* synthetic */ int getTopAndBottomOffset() {
            return super.getTopAndBottomOffset();
        }

        /* renamed from: i */
        public final void m45908i(View view, View view2) {
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) view2.getLayoutParams()).getBehavior();
            if (behavior instanceof BaseBehavior) {
                ViewCompat.offsetTopAndBottom(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) behavior).f48971k) + m335e()) - m338b(view2));
            }
        }

        @Override // p000.V22
        public /* bridge */ /* synthetic */ boolean isHorizontalOffsetEnabled() {
            return super.isHorizontalOffsetEnabled();
        }

        @Override // p000.V22
        public /* bridge */ /* synthetic */ boolean isVerticalOffsetEnabled() {
            return super.isVerticalOffsetEnabled();
        }

        /* renamed from: j */
        public final void m45907j(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.isLiftOnScroll()) {
                    appBarLayout.m45954r(appBarLayout.m45951u(view));
                }
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onDependentViewChanged(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
            m45908i(view, view2);
            m45907j(view, view2);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void onDependentViewRemoved(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
            if (view2 instanceof AppBarLayout) {
                ViewCompat.removeAccessibilityAction(coordinatorLayout, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD.getId());
                ViewCompat.removeAccessibilityAction(coordinatorLayout, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD.getId());
                ViewCompat.setAccessibilityDelegate(coordinatorLayout, null);
            }
        }

        @Override // p000.V22, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i) {
            return super.onLayoutChild(coordinatorLayout, view, i);
        }

        @Override // p000.AbstractC23080y70, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i, int i2, int i3, int i4) {
            return super.onMeasureChild(coordinatorLayout, view, i, i2, i3, i4);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onRequestChildRectangleOnScreen(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull Rect rect, boolean z) {
            AppBarLayout mo339a = mo339a(coordinatorLayout.getDependencies(view));
            if (mo339a != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                Rect rect3 = this.f108617d;
                rect3.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect3.contains(rect2)) {
                    mo339a.setExpanded(false, !z);
                    return true;
                }
            }
            return false;
        }

        @Override // p000.V22
        public /* bridge */ /* synthetic */ void setHorizontalOffsetEnabled(boolean z) {
            super.setHorizontalOffsetEnabled(z);
        }

        @Override // p000.V22
        public /* bridge */ /* synthetic */ boolean setLeftAndRightOffset(int i) {
            return super.setLeftAndRightOffset(i);
        }

        @Override // p000.V22
        public /* bridge */ /* synthetic */ boolean setTopAndBottomOffset(int i) {
            return super.setTopAndBottomOffset(i);
        }

        @Override // p000.V22
        public /* bridge */ /* synthetic */ void setVerticalOffsetEnabled(boolean z) {
            super.setVerticalOffsetEnabled(z);
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ScrollingViewBehavior_Layout);
            setOverlayTop(obtainStyledAttributes.getDimensionPixelSize(R.styleable.ScrollingViewBehavior_Layout_behavior_overlapTop, 0));
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$a */
    /* loaded from: classes4.dex */
    public class C6804a implements OnApplyWindowInsetsListener {
        public C6804a() {
            AppBarLayout.this = r1;
        }

        @Override // androidx.core.view.OnApplyWindowInsetsListener
        public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
            return AppBarLayout.this.m45958n(windowInsetsCompat);
        }
    }

    public AppBarLayout(@NonNull Context context) {
        this(context, null);
    }

    public void addLiftOnScrollListener(@NonNull LiftOnScrollListener liftOnScrollListener) {
        this.f48964r.add(liftOnScrollListener);
    }

    public void addOnOffsetChangedListener(@Nullable BaseOnOffsetChangedListener baseOnOffsetChangedListener) {
        if (this.f48954h == null) {
            this.f48954h = new ArrayList();
        }
        if (baseOnOffsetChangedListener == null || this.f48954h.contains(baseOnOffsetChangedListener)) {
            return;
        }
        this.f48954h.add(baseOnOffsetChangedListener);
    }

    /* renamed from: c */
    public final void m45969c() {
        WeakReference weakReference = this.f48960n;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f48960n = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void clearLiftOnScrollListener() {
        this.f48964r.clear();
    }

    /* renamed from: d */
    public final View m45968d(View view) {
        int i;
        View view2;
        if (this.f48960n == null && (i = this.f48959m) != -1) {
            if (view != null) {
                view2 = view.findViewById(i);
            } else {
                view2 = null;
            }
            if (view2 == null && (getParent() instanceof ViewGroup)) {
                view2 = ((ViewGroup) getParent()).findViewById(this.f48959m);
            }
            if (view2 != null) {
                this.f48960n = new WeakReference(view2);
            }
        }
        WeakReference weakReference = this.f48960n;
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        if (m45952t()) {
            int save = canvas.save();
            canvas.translate(0.0f, -this.f48947a);
            this.f48968v.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f48968v;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* renamed from: e */
    public boolean m45967e() {
        return this.f48951e;
    }

    /* renamed from: f */
    public final boolean m45966f() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((LayoutParams) getChildAt(i).getLayoutParams()).m45911b()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public boolean m45965g() {
        if (getTotalScrollRange() != 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    @NonNull
    public CoordinatorLayout.Behavior<AppBarLayout> getBehavior() {
        Behavior behavior = new Behavior();
        this.f48970x = behavior;
        return behavior;
    }

    public int getDownNestedPreScrollRange() {
        int i;
        int minimumHeight;
        int i2 = this.f48949c;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i4 = layoutParams.f48997a;
                if ((i4 & 5) == 5) {
                    int i5 = ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                    if ((i4 & 8) != 0) {
                        minimumHeight = ViewCompat.getMinimumHeight(childAt);
                    } else if ((i4 & 2) != 0) {
                        minimumHeight = measuredHeight - ViewCompat.getMinimumHeight(childAt);
                    } else {
                        i = i5 + measuredHeight;
                        if (childCount == 0 && ViewCompat.getFitsSystemWindows(childAt)) {
                            i = Math.min(i, measuredHeight - getTopInset());
                        }
                        i3 += i;
                    }
                    i = i5 + minimumHeight;
                    if (childCount == 0) {
                        i = Math.min(i, measuredHeight - getTopInset());
                    }
                    i3 += i;
                } else if (i3 > 0) {
                    break;
                }
            }
        }
        int max = Math.max(0, i3);
        this.f48949c = max;
        return max;
    }

    public int getDownNestedScrollRange() {
        int i = this.f48950d;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight() + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                int i4 = layoutParams.f48997a;
                if ((i4 & 1) == 0) {
                    break;
                }
                i3 += measuredHeight;
                if ((i4 & 2) != 0) {
                    i3 -= ViewCompat.getMinimumHeight(childAt);
                    break;
                }
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f48950d = max;
        return max;
    }

    @IdRes
    public int getLiftOnScrollTargetViewId() {
        return this.f48959m;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int minimumHeight = ViewCompat.getMinimumHeight(this);
        if (minimumHeight == 0) {
            int childCount = getChildCount();
            if (childCount >= 1) {
                minimumHeight = ViewCompat.getMinimumHeight(getChildAt(childCount - 1));
            } else {
                minimumHeight = 0;
            }
            if (minimumHeight == 0) {
                return getHeight() / 3;
            }
        }
        return (minimumHeight * 2) + topInset;
    }

    public int getPendingAction() {
        return this.f48952f;
    }

    @Nullable
    public Drawable getStatusBarForeground() {
        return this.f48968v;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    @VisibleForTesting
    public final int getTopInset() {
        WindowInsetsCompat windowInsetsCompat = this.f48953g;
        if (windowInsetsCompat != null) {
            return windowInsetsCompat.getSystemWindowInsetTop();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.f48948b;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i4 = layoutParams.f48997a;
                if ((i4 & 1) == 0) {
                    break;
                }
                i3 += measuredHeight + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                if (i2 == 0 && ViewCompat.getFitsSystemWindows(childAt)) {
                    i3 -= getTopInset();
                }
                if ((i4 & 2) != 0) {
                    i3 -= ViewCompat.getMinimumHeight(childAt);
                    break;
                }
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f48948b = max;
        return max;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    /* renamed from: h */
    public final void m45964h(final MaterialShapeDrawable materialShapeDrawable) {
        int i;
        if (this.f48957k) {
            i = 255;
        } else {
            i = 0;
        }
        materialShapeDrawable.setAlpha(i);
        materialShapeDrawable.setFillColor(this.f48961o);
        this.f48963q = new ValueAnimator.AnimatorUpdateListener() { // from class: m5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AppBarLayout.this.m45961k(materialShapeDrawable, valueAnimator);
            }
        };
    }

    /* renamed from: i */
    public final void m45963i(Context context, final MaterialShapeDrawable materialShapeDrawable) {
        materialShapeDrawable.initializeElevationOverlay(context);
        this.f48963q = new ValueAnimator.AnimatorUpdateListener() { // from class: l5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AppBarLayout.this.m45960l(materialShapeDrawable, valueAnimator);
            }
        };
    }

    public boolean isLiftOnScroll() {
        return this.f48958l;
    }

    public boolean isLifted() {
        return this.f48957k;
    }

    /* renamed from: j */
    public final void m45962j() {
        BaseBehavior.SavedState savedState;
        Behavior behavior = this.f48970x;
        if (behavior != null && this.f48948b != -1 && this.f48952f == 0) {
            savedState = behavior.m45938J(AbsSavedState.EMPTY_STATE, this);
        } else {
            savedState = null;
        }
        this.f48948b = -1;
        this.f48949c = -1;
        this.f48950d = -1;
        if (savedState != null) {
            this.f48970x.m45939I(savedState, false);
        }
    }

    /* renamed from: k */
    public final /* synthetic */ void m45961k(MaterialShapeDrawable materialShapeDrawable, ValueAnimator valueAnimator) {
        int floatValue = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
        materialShapeDrawable.setAlpha(floatValue);
        for (LiftOnScrollListener liftOnScrollListener : this.f48964r) {
            if (materialShapeDrawable.getFillColor() != null) {
                liftOnScrollListener.onUpdate(0.0f, materialShapeDrawable.getFillColor().withAlpha(floatValue).getDefaultColor());
            }
        }
    }

    /* renamed from: l */
    public final /* synthetic */ void m45960l(MaterialShapeDrawable materialShapeDrawable, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        materialShapeDrawable.setElevation(floatValue);
        Drawable drawable = this.f48968v;
        if (drawable instanceof MaterialShapeDrawable) {
            ((MaterialShapeDrawable) drawable).setElevation(floatValue);
        }
        for (LiftOnScrollListener liftOnScrollListener : this.f48964r) {
            liftOnScrollListener.onUpdate(floatValue, materialShapeDrawable.getResolvedTintColor());
        }
    }

    /* renamed from: m */
    public void m45959m(int i) {
        this.f48947a = i;
        if (!willNotDraw()) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
        List list = this.f48954h;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                BaseOnOffsetChangedListener baseOnOffsetChangedListener = (BaseOnOffsetChangedListener) this.f48954h.get(i2);
                if (baseOnOffsetChangedListener != null) {
                    baseOnOffsetChangedListener.onOffsetChanged(this, i);
                }
            }
        }
    }

    /* renamed from: n */
    public WindowInsetsCompat m45958n(WindowInsetsCompat windowInsetsCompat) {
        WindowInsetsCompat windowInsetsCompat2;
        if (ViewCompat.getFitsSystemWindows(this)) {
            windowInsetsCompat2 = windowInsetsCompat;
        } else {
            windowInsetsCompat2 = null;
        }
        if (!ObjectsCompat.equals(this.f48953g, windowInsetsCompat2)) {
            this.f48953g = windowInsetsCompat2;
            m45948x();
            requestLayout();
        }
        return windowInsetsCompat;
    }

    /* renamed from: o */
    public void m45957o() {
        this.f48952f = 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        int i2;
        int i3;
        if (this.f48967u == null) {
            this.f48967u = new int[4];
        }
        int[] iArr = this.f48967u;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.f48956j;
        int i4 = R.attr.state_liftable;
        if (!z) {
            i4 = -i4;
        }
        iArr[0] = i4;
        if (z && this.f48957k) {
            i2 = R.attr.state_lifted;
        } else {
            i2 = -R.attr.state_lifted;
        }
        iArr[1] = i2;
        int i5 = R.attr.state_collapsible;
        if (!z) {
            i5 = -i5;
        }
        iArr[2] = i5;
        if (z && this.f48957k) {
            i3 = R.attr.state_collapsed;
        } else {
            i3 = -R.attr.state_collapsed;
        }
        iArr[3] = i3;
        return View.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m45969c();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (ViewCompat.getFitsSystemWindows(this) && m45950v()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                ViewCompat.offsetTopAndBottom(getChildAt(childCount), topInset);
            }
        }
        m45962j();
        this.f48951e = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            } else if (((LayoutParams) getChildAt(i5).getLayoutParams()).getScrollInterpolator() != null) {
                this.f48951e = true;
                break;
            } else {
                i5++;
            }
        }
        Drawable drawable = this.f48968v;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.f48955i) {
            if (!this.f48958l && !m45966f()) {
                z2 = false;
            }
            m45955q(z2);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && ViewCompat.getFitsSystemWindows(this) && m45950v()) {
            int measuredHeight = getMeasuredHeight();
            if (mode != Integer.MIN_VALUE) {
                if (mode == 0) {
                    measuredHeight += getTopInset();
                }
            } else {
                measuredHeight = MathUtils.clamp(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i2));
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        m45962j();
    }

    /* renamed from: p */
    public final void m45956p(boolean z, boolean z2, boolean z3) {
        int i;
        int i2;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        int i3 = 0;
        if (z2) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        int i4 = i | i2;
        if (z3) {
            i3 = 8;
        }
        this.f48952f = i4 | i3;
        requestLayout();
    }

    /* renamed from: q */
    public final boolean m45955q(boolean z) {
        if (this.f48956j != z) {
            this.f48956j = z;
            refreshDrawableState();
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public boolean m45954r(boolean z) {
        return m45953s(z, !this.f48955i);
    }

    public boolean removeLiftOnScrollListener(@NonNull LiftOnScrollListener liftOnScrollListener) {
        return this.f48964r.remove(liftOnScrollListener);
    }

    public void removeOnOffsetChangedListener(@Nullable BaseOnOffsetChangedListener baseOnOffsetChangedListener) {
        List list = this.f48954h;
        if (list == null || baseOnOffsetChangedListener == null) {
            return;
        }
        list.remove(baseOnOffsetChangedListener);
    }

    /* renamed from: s */
    public boolean m45953s(boolean z, boolean z2) {
        float f;
        float f2;
        if (z2 && this.f48957k != z) {
            this.f48957k = z;
            refreshDrawableState();
            if (this.f48958l && (getBackground() instanceof MaterialShapeDrawable)) {
                float f3 = 0.0f;
                if (this.f48961o != null) {
                    if (z) {
                        f2 = 0.0f;
                    } else {
                        f2 = 255.0f;
                    }
                    if (z) {
                        f3 = 255.0f;
                    }
                    m45949w(f2, f3);
                    return true;
                }
                if (z) {
                    f = 0.0f;
                } else {
                    f = this.f48969w;
                }
                if (z) {
                    f3 = this.f48969w;
                }
                m45949w(f, f3);
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // android.view.View
    @RequiresApi(21)
    public void setElevation(float f) {
        super.setElevation(f);
        MaterialShapeUtils.setElevation(this, f);
    }

    public void setExpanded(boolean z) {
        setExpanded(z, ViewCompat.isLaidOut(this));
    }

    public void setLiftOnScroll(boolean z) {
        this.f48958l = z;
    }

    public void setLiftOnScrollTargetView(@Nullable View view) {
        this.f48959m = -1;
        if (view == null) {
            m45969c();
        } else {
            this.f48960n = new WeakReference(view);
        }
    }

    public void setLiftOnScrollTargetViewId(@IdRes int i) {
        this.f48959m = i;
        m45969c();
    }

    public boolean setLiftable(boolean z) {
        this.f48955i = true;
        return m45955q(z);
    }

    public void setLiftableOverrideEnabled(boolean z) {
        this.f48955i = z;
    }

    public boolean setLifted(boolean z) {
        return m45953s(z, true);
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setStatusBarForeground(@Nullable Drawable drawable) {
        boolean z;
        Drawable drawable2 = this.f48968v;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f48968v = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f48968v.setState(getDrawableState());
                }
                DrawableCompat.setLayoutDirection(this.f48968v, ViewCompat.getLayoutDirection(this));
                Drawable drawable4 = this.f48968v;
                if (getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                drawable4.setVisible(z, false);
                this.f48968v.setCallback(this);
            }
            m45948x();
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public void setStatusBarForegroundColor(@ColorInt int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(@DrawableRes int i) {
        setStatusBarForeground(AppCompatResources.getDrawable(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f) {
        F32.m68427b(this, f);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        Drawable drawable = this.f48968v;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    /* renamed from: t */
    public final boolean m45952t() {
        if (this.f48968v != null && getTopInset() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    public boolean m45951u(View view) {
        View m45968d = m45968d(view);
        if (m45968d != null) {
            view = m45968d;
        }
        if (view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0)) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public final boolean m45950v() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        if (childAt.getVisibility() == 8 || ViewCompat.getFitsSystemWindows(childAt)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean verifyDrawable(@NonNull Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f48968v) {
            return false;
        }
        return true;
    }

    /* renamed from: w */
    public final void m45949w(float f, float f2) {
        ValueAnimator valueAnimator = this.f48962p;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        this.f48962p = ofFloat;
        ofFloat.setDuration(this.f48965s);
        this.f48962p.setInterpolator(this.f48966t);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f48963q;
        if (animatorUpdateListener != null) {
            this.f48962p.addUpdateListener(animatorUpdateListener);
        }
        this.f48962p.start();
    }

    /* renamed from: x */
    public final void m45948x() {
        setWillNotDraw(!m45952t());
    }

    public AppBarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.appBarLayoutStyle);
    }

    public void setExpanded(boolean z, boolean z2) {
        m45956p(z, z2, true);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AppBarLayout(@androidx.annotation.NonNull android.content.Context r10, @androidx.annotation.Nullable android.util.AttributeSet r11, int r12) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -2);
    }

    public void removeOnOffsetChangedListener(OnOffsetChangedListener onOffsetChangedListener) {
        removeOnOffsetChangedListener((BaseOnOffsetChangedListener) onOffsetChangedListener);
    }

    public void addOnOffsetChangedListener(OnOffsetChangedListener onOffsetChangedListener) {
        addOnOffsetChangedListener((BaseOnOffsetChangedListener) onOffsetChangedListener);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new LayoutParams((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }
}
