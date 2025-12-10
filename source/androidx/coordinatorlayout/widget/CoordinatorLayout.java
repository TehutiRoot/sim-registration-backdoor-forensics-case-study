package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.coordinatorlayout.R;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.util.ObjectsCompat;
import androidx.core.util.Pools;
import androidx.core.view.GravityCompat;
import androidx.core.view.NestedScrollingParent2;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbsSavedState;
import com.zxy.tiny.core.CompressKit;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class CoordinatorLayout extends ViewGroup implements NestedScrollingParent2, NestedScrollingParent3 {

    /* renamed from: u */
    public static final String f33386u;

    /* renamed from: v */
    public static final Class[] f33387v;

    /* renamed from: w */
    public static final ThreadLocal f33388w;

    /* renamed from: x */
    public static final Comparator f33389x;

    /* renamed from: y */
    public static final Pools.Pool f33390y;

    /* renamed from: a */
    public final List f33391a;

    /* renamed from: b */
    public final DirectedAcyclicGraph f33392b;

    /* renamed from: c */
    public final List f33393c;

    /* renamed from: d */
    public final List f33394d;

    /* renamed from: e */
    public Paint f33395e;

    /* renamed from: f */
    public final int[] f33396f;

    /* renamed from: g */
    public final int[] f33397g;

    /* renamed from: h */
    public boolean f33398h;

    /* renamed from: i */
    public boolean f33399i;

    /* renamed from: j */
    public int[] f33400j;

    /* renamed from: k */
    public View f33401k;

    /* renamed from: l */
    public View f33402l;

    /* renamed from: m */
    public ViewTreeObserver$OnPreDrawListenerC3805c f33403m;

    /* renamed from: n */
    public boolean f33404n;

    /* renamed from: o */
    public WindowInsetsCompat f33405o;

    /* renamed from: p */
    public boolean f33406p;

    /* renamed from: q */
    public Drawable f33407q;

    /* renamed from: r */
    public ViewGroup.OnHierarchyChangeListener f33408r;

    /* renamed from: s */
    public OnApplyWindowInsetsListener f33409s;

    /* renamed from: t */
    public final NestedScrollingParentHelper f33410t;

    /* loaded from: classes2.dex */
    public interface AttachedBehavior {
        @NonNull
        Behavior getBehavior();
    }

    /* loaded from: classes2.dex */
    public static abstract class Behavior<V extends View> {
        public Behavior() {
        }

        @Nullable
        public static Object getTag(@NonNull View view) {
            return ((LayoutParams) view.getLayoutParams()).f33423m;
        }

        public static void setTag(@NonNull View view, @Nullable Object obj) {
            ((LayoutParams) view.getLayoutParams()).f33423m = obj;
        }

        public boolean blocksInteractionBelow(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v) {
            if (getScrimOpacity(coordinatorLayout, v) > 0.0f) {
                return true;
            }
            return false;
        }

        public boolean getInsetDodgeRect(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull Rect rect) {
            return false;
        }

        @ColorInt
        public int getScrimColor(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v) {
            return -16777216;
        }

        @FloatRange(from = 0.0d, m64743to = 1.0d)
        public float getScrimOpacity(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v) {
            return 0.0f;
        }

        public boolean layoutDependsOn(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view) {
            return false;
        }

        @NonNull
        public WindowInsetsCompat onApplyWindowInsets(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull WindowInsetsCompat windowInsetsCompat) {
            return windowInsetsCompat;
        }

        public void onAttachedToLayoutParams(@NonNull LayoutParams layoutParams) {
        }

        public boolean onDependentViewChanged(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view) {
            return false;
        }

        public void onDependentViewRemoved(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view) {
        }

        public void onDetachedFromLayoutParams() {
        }

        public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
            return false;
        }

        public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i) {
            return false;
        }

        public boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i, int i2, int i3, int i4) {
            return false;
        }

        public boolean onNestedFling(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, float f, float f2, boolean z) {
            return false;
        }

        public boolean onNestedPreFling(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, float f, float f2) {
            return false;
        }

        @Deprecated
        public void onNestedPreScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, @NonNull int[] iArr) {
        }

        @Deprecated
        public void onNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, int i3, int i4) {
        }

        @Deprecated
        public void onNestedScrollAccepted(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, @NonNull View view2, int i) {
        }

        public boolean onRequestChildRectangleOnScreen(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull Rect rect, boolean z) {
            return false;
        }

        public void onRestoreInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull Parcelable parcelable) {
        }

        @Nullable
        public Parcelable onSaveInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, @NonNull View view2, int i) {
            return false;
        }

        @Deprecated
        public void onStopNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view) {
        }

        public boolean onTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
            return false;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
        }

        public void onNestedPreScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, @NonNull int[] iArr, int i3) {
            if (i3 == 0) {
                onNestedPreScroll(coordinatorLayout, v, view, i, i2, iArr);
            }
        }

        @Deprecated
        public void onNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, int i3, int i4, int i5) {
            if (i5 == 0) {
                onNestedScroll(coordinatorLayout, v, view, i, i2, i3, i4);
            }
        }

        public void onNestedScrollAccepted(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, @NonNull View view2, int i, int i2) {
            if (i2 == 0) {
                onNestedScrollAccepted(coordinatorLayout, v, view, view2, i);
            }
        }

        public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, @NonNull View view2, int i, int i2) {
            if (i2 == 0) {
                return onStartNestedScroll(coordinatorLayout, v, view, view2, i);
            }
            return false;
        }

        public void onStopNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i) {
            if (i == 0) {
                onStopNestedScroll(coordinatorLayout, v, view);
            }
        }

        public void onNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, int i3, int i4, int i5, @NonNull int[] iArr) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
            onNestedScroll(coordinatorLayout, v, view, i, i2, i3, i4, i5);
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    /* loaded from: classes2.dex */
    public @interface DefaultBehavior {
        Class<? extends Behavior> value();
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes2.dex */
    public @interface DispatchChangeEvent {
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$a */
    /* loaded from: classes2.dex */
    public class C3803a implements OnApplyWindowInsetsListener {
        public C3803a() {
            CoordinatorLayout.this = r1;
        }

        @Override // androidx.core.view.OnApplyWindowInsetsListener
        public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
            return CoordinatorLayout.this.m58034H(windowInsetsCompat);
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$b */
    /* loaded from: classes2.dex */
    public class ViewGroup$OnHierarchyChangeListenerC3804b implements ViewGroup.OnHierarchyChangeListener {
        public ViewGroup$OnHierarchyChangeListenerC3804b() {
            CoordinatorLayout.this = r1;
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f33408r;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.m58012u(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f33408r;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$c */
    /* loaded from: classes2.dex */
    public class ViewTreeObserver$OnPreDrawListenerC3805c implements ViewTreeObserver.OnPreDrawListener {
        public ViewTreeObserver$OnPreDrawListenerC3805c() {
            CoordinatorLayout.this = r1;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.m58012u(0);
            return true;
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$d */
    /* loaded from: classes2.dex */
    public static class C3806d implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(View view, View view2) {
            float z = ViewCompat.getZ(view);
            float z2 = ViewCompat.getZ(view2);
            if (z > z2) {
                return -1;
            }
            if (z < z2) {
                return 1;
            }
            return 0;
        }
    }

    static {
        String str;
        Package r0 = CoordinatorLayout.class.getPackage();
        if (r0 != null) {
            str = r0.getName();
        } else {
            str = null;
        }
        f33386u = str;
        f33389x = new C3806d();
        f33387v = new Class[]{Context.class, AttributeSet.class};
        f33388w = new ThreadLocal();
        f33390y = new Pools.SynchronizedPool(12);
    }

    public CoordinatorLayout(@NonNull Context context) {
        this(context, null);
    }

    /* renamed from: C */
    public static int m58039C(int i) {
        if (i == 0) {
            return 17;
        }
        return i;
    }

    /* renamed from: D */
    public static int m58038D(int i) {
        if ((i & 7) == 0) {
            i |= GravityCompat.START;
        }
        return (i & 112) == 0 ? i | 48 : i;
    }

    /* renamed from: E */
    public static int m58037E(int i) {
        if (i == 0) {
            return 8388661;
        }
        return i;
    }

    /* renamed from: a */
    public static Rect m58032a() {
        Rect rect = (Rect) f33390y.acquire();
        if (rect == null) {
            return new Rect();
        }
        return rect;
    }

    /* renamed from: c */
    private static int m58030c(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    /* renamed from: v */
    public static Behavior m58011v(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = f33386u;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal threadLocal = f33388w;
            Map map = (Map) threadLocal.get();
            if (map == null) {
                map = new HashMap();
                threadLocal.set(map);
            }
            Constructor<?> constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(f33387v);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (Behavior) constructor.newInstance(context, attributeSet);
        } catch (Exception e) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e);
        }
    }

    /* renamed from: z */
    public static void m58007z(Rect rect) {
        rect.setEmpty();
        f33390y.release(rect);
    }

    /* renamed from: A */
    public void m58041A() {
        if (this.f33399i && this.f33403m != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f33403m);
        }
        this.f33404n = false;
    }

    /* renamed from: B */
    public final void m58040B(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            Behavior behavior = ((LayoutParams) childAt.getLayoutParams()).getBehavior();
            if (behavior != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    behavior.onInterceptTouchEvent(this, childAt, obtain);
                } else {
                    behavior.onTouchEvent(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((LayoutParams) getChildAt(i2).getLayoutParams()).m57995l();
        }
        this.f33401k = null;
        this.f33398h = false;
    }

    /* renamed from: F */
    public final void m58036F(View view, int i) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i2 = layoutParams.f33414d;
        if (i2 != i) {
            ViewCompat.offsetLeftAndRight(view, i - i2);
            layoutParams.f33414d = i;
        }
    }

    /* renamed from: G */
    public final void m58035G(View view, int i) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i2 = layoutParams.f33415e;
        if (i2 != i) {
            ViewCompat.offsetTopAndBottom(view, i - i2);
            layoutParams.f33415e = i;
        }
    }

    /* renamed from: H */
    public final WindowInsetsCompat m58034H(WindowInsetsCompat windowInsetsCompat) {
        boolean z;
        if (!ObjectsCompat.equals(this.f33405o, windowInsetsCompat)) {
            this.f33405o = windowInsetsCompat;
            boolean z2 = false;
            if (windowInsetsCompat != null && windowInsetsCompat.getSystemWindowInsetTop() > 0) {
                z = true;
            } else {
                z = false;
            }
            this.f33406p = z;
            if (!z && getBackground() == null) {
                z2 = true;
            }
            setWillNotDraw(z2);
            WindowInsetsCompat m58028e = m58028e(windowInsetsCompat);
            requestLayout();
            return m58028e;
        }
        return windowInsetsCompat;
    }

    /* renamed from: I */
    public final void m58033I() {
        if (ViewCompat.getFitsSystemWindows(this)) {
            if (this.f33409s == null) {
                this.f33409s = new C3803a();
            }
            ViewCompat.setOnApplyWindowInsetsListener(this, this.f33409s);
            setSystemUiVisibility(CompressKit.DEFAULT_MAX_COMPRESS_SIZE);
            return;
        }
        ViewCompat.setOnApplyWindowInsetsListener(this, null);
    }

    /* renamed from: b */
    public void m58031b() {
        if (this.f33399i) {
            if (this.f33403m == null) {
                this.f33403m = new ViewTreeObserver$OnPreDrawListenerC3805c();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f33403m);
        }
        this.f33404n = true;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final void m58029d(LayoutParams layoutParams, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    public void dispatchDependentViewsChanged(@NonNull View view) {
        List incomingEdges = this.f33392b.getIncomingEdges(view);
        if (incomingEdges != null && !incomingEdges.isEmpty()) {
            for (int i = 0; i < incomingEdges.size(); i++) {
                View view2 = (View) incomingEdges.get(i);
                Behavior behavior = ((LayoutParams) view2.getLayoutParams()).getBehavior();
                if (behavior != null) {
                    behavior.onDependentViewChanged(this, view2, view);
                }
            }
        }
    }

    public boolean doViewsOverlap(@NonNull View view, @NonNull View view2) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (view.getVisibility() != 0 || view2.getVisibility() != 0) {
            return false;
        }
        Rect m58032a = m58032a();
        if (view.getParent() != this) {
            z = true;
        } else {
            z = false;
        }
        m58026g(view, z, m58032a);
        Rect m58032a2 = m58032a();
        if (view2.getParent() != this) {
            z2 = true;
        } else {
            z2 = false;
        }
        m58026g(view2, z2, m58032a2);
        try {
            if (m58032a.left <= m58032a2.right && m58032a.top <= m58032a2.bottom && m58032a.right >= m58032a2.left) {
                if (m58032a.bottom >= m58032a2.top) {
                    z3 = true;
                }
            }
            return z3;
        } finally {
            m58007z(m58032a);
            m58007z(m58032a2);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Behavior behavior = layoutParams.f33411a;
        if (behavior != null) {
            float scrimOpacity = behavior.getScrimOpacity(this, view);
            if (scrimOpacity > 0.0f) {
                if (this.f33395e == null) {
                    this.f33395e = new Paint();
                }
                this.f33395e.setColor(layoutParams.f33411a.getScrimColor(this, view));
                this.f33395e.setAlpha(m58030c(Math.round(scrimOpacity * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.f33395e);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        boolean z;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f33407q;
        if (drawable != null && drawable.isStateful()) {
            z = drawable.setState(drawableState);
        } else {
            z = false;
        }
        if (z) {
            invalidate();
        }
    }

    /* renamed from: e */
    public final WindowInsetsCompat m58028e(WindowInsetsCompat windowInsetsCompat) {
        Behavior behavior;
        if (windowInsetsCompat.isConsumed()) {
            return windowInsetsCompat;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (ViewCompat.getFitsSystemWindows(childAt) && (behavior = ((LayoutParams) childAt.getLayoutParams()).getBehavior()) != null) {
                windowInsetsCompat = behavior.onApplyWindowInsets(this, childAt, windowInsetsCompat);
                if (windowInsetsCompat.isConsumed()) {
                    break;
                }
            }
        }
        return windowInsetsCompat;
    }

    /* renamed from: f */
    public void m58027f() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (m58018o(getChildAt(i))) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z != this.f33404n) {
            if (z) {
                m58031b();
            } else {
                m58041A();
            }
        }
    }

    /* renamed from: g */
    public void m58026g(View view, boolean z, Rect rect) {
        if (!view.isLayoutRequested() && view.getVisibility() != 8) {
            if (z) {
                m58025h(view, rect);
                return;
            } else {
                rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                return;
            }
        }
        rect.setEmpty();
    }

    @NonNull
    public List<View> getDependencies(@NonNull View view) {
        List outgoingEdges = this.f33392b.getOutgoingEdges(view);
        this.f33394d.clear();
        if (outgoingEdges != null) {
            this.f33394d.addAll(outgoingEdges);
        }
        return this.f33394d;
    }

    @VisibleForTesting
    public final List<View> getDependencySortedChildren() {
        m58009x();
        return Collections.unmodifiableList(this.f33391a);
    }

    @NonNull
    public List<View> getDependents(@NonNull View view) {
        List incomingEdges = this.f33392b.getIncomingEdges(view);
        this.f33394d.clear();
        if (incomingEdges != null) {
            this.f33394d.addAll(incomingEdges);
        }
        return this.f33394d;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final WindowInsetsCompat getLastWindowInsets() {
        return this.f33405o;
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.f33410t.getNestedScrollAxes();
    }

    @Nullable
    public Drawable getStatusBarBackground() {
        return this.f33407q;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    /* renamed from: h */
    public void m58025h(View view, Rect rect) {
        ViewGroupUtils.getDescendantRect(this, view, rect);
    }

    /* renamed from: i */
    public void m58024i(View view, int i, Rect rect, Rect rect2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        m58023j(view, i, rect, rect2, layoutParams, measuredWidth, measuredHeight);
        m58029d(layoutParams, rect2, measuredWidth, measuredHeight);
    }

    public boolean isPointInChildBounds(@NonNull View view, int i, int i2) {
        Rect m58032a = m58032a();
        m58025h(view, m58032a);
        try {
            return m58032a.contains(i, i2);
        } finally {
            m58007z(m58032a);
        }
    }

    /* renamed from: j */
    public final void m58023j(View view, int i, Rect rect, Rect rect2, LayoutParams layoutParams, int i2, int i3) {
        int width;
        int height;
        int absoluteGravity = GravityCompat.getAbsoluteGravity(m58039C(layoutParams.gravity), i);
        int absoluteGravity2 = GravityCompat.getAbsoluteGravity(m58038D(layoutParams.anchorGravity), i);
        int i4 = absoluteGravity & 7;
        int i5 = absoluteGravity & 112;
        int i6 = absoluteGravity2 & 7;
        int i7 = absoluteGravity2 & 112;
        if (i6 != 1) {
            if (i6 != 5) {
                width = rect.left;
            } else {
                width = rect.right;
            }
        } else {
            width = rect.left + (rect.width() / 2);
        }
        if (i7 != 16) {
            if (i7 != 80) {
                height = rect.top;
            } else {
                height = rect.bottom;
            }
        } else {
            height = rect.top + (rect.height() / 2);
        }
        if (i4 != 1) {
            if (i4 != 5) {
                width -= i2;
            }
        } else {
            width -= i2 / 2;
        }
        if (i5 != 16) {
            if (i5 != 80) {
                height -= i3;
            }
        } else {
            height -= i3 / 2;
        }
        rect2.set(width, height, i2 + width, i3 + height);
    }

    /* renamed from: k */
    public final int m58022k(int i) {
        int[] iArr = this.f33400j;
        if (iArr == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("No keylines defined for ");
            sb.append(this);
            sb.append(" - attempted index lookup ");
            sb.append(i);
            return 0;
        } else if (i >= 0 && i < iArr.length) {
            return iArr[i];
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Keyline index ");
            sb2.append(i);
            sb2.append(" out of range for ");
            sb2.append(this);
            return 0;
        }
    }

    /* renamed from: l */
    public void m58021l(View view, Rect rect) {
        rect.set(((LayoutParams) view.getLayoutParams()).m58001f());
    }

    /* renamed from: m */
    public LayoutParams m58020m(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!layoutParams.f33412b) {
            if (view instanceof AttachedBehavior) {
                layoutParams.setBehavior(((AttachedBehavior) view).getBehavior());
                layoutParams.f33412b = true;
            } else {
                DefaultBehavior defaultBehavior = null;
                for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    defaultBehavior = (DefaultBehavior) cls.getAnnotation(DefaultBehavior.class);
                    if (defaultBehavior != null) {
                        break;
                    }
                }
                if (defaultBehavior != null) {
                    try {
                        layoutParams.setBehavior(defaultBehavior.value().getDeclaredConstructor(null).newInstance(null));
                    } catch (Exception unused) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Default behavior class ");
                        sb.append(defaultBehavior.value().getName());
                        sb.append(" could not be instantiated. Did you forget a default constructor?");
                    }
                }
                layoutParams.f33412b = true;
            }
        }
        return layoutParams;
    }

    /* renamed from: n */
    public final void m58019n(List list) {
        int i;
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            if (isChildrenDrawingOrderEnabled) {
                i = getChildDrawingOrder(childCount, i2);
            } else {
                i = i2;
            }
            list.add(getChildAt(i));
        }
        Comparator comparator = f33389x;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    /* renamed from: o */
    public final boolean m58018o(View view) {
        return this.f33392b.hasOutgoingEdges(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m58040B(false);
        if (this.f33404n) {
            if (this.f33403m == null) {
                this.f33403m = new ViewTreeObserver$OnPreDrawListenerC3805c();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f33403m);
        }
        if (this.f33405o == null && ViewCompat.getFitsSystemWindows(this)) {
            ViewCompat.requestApplyInsets(this);
        }
        this.f33399i = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m58040B(false);
        if (this.f33404n && this.f33403m != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f33403m);
        }
        View view = this.f33402l;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f33399i = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        if (this.f33406p && this.f33407q != null) {
            WindowInsetsCompat windowInsetsCompat = this.f33405o;
            if (windowInsetsCompat != null) {
                i = windowInsetsCompat.getSystemWindowInsetTop();
            } else {
                i = 0;
            }
            if (i > 0) {
                this.f33407q.setBounds(0, 0, getWidth(), i);
                this.f33407q.draw(canvas);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m58040B(true);
        }
        boolean m58010w = m58010w(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            m58040B(true);
        }
        return m58010w;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Behavior behavior;
        int layoutDirection = ViewCompat.getLayoutDirection(this);
        int size = this.f33391a.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) this.f33391a.get(i5);
            if (view.getVisibility() != 8 && ((behavior = ((LayoutParams) view.getLayoutParams()).getBehavior()) == null || !behavior.onLayoutChild(this, view, layoutDirection))) {
                onLayoutChild(view, layoutDirection);
            }
        }
    }

    public void onLayoutChild(@NonNull View view, int i) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!layoutParams.m58006a()) {
            View view2 = layoutParams.f33416f;
            if (view2 != null) {
                m58016q(view, view2, i);
                return;
            }
            int i2 = layoutParams.keyline;
            if (i2 >= 0) {
                m58015r(view, i2, i);
                return;
            } else {
                m58017p(view, i);
                return;
            }
        }
        throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x011c, code lost:
        if (r0.onMeasureChild(r30, r20, r11, r21, r23, 0) == false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00fd  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r31, int r32) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    public void onMeasureChild(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        Behavior behavior;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.m57998i(0) && (behavior = layoutParams.getBehavior()) != null) {
                    z2 |= behavior.onNestedFling(this, childAt, view, f, f2, z);
                }
            }
        }
        if (z2) {
            m58012u(1);
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        Behavior behavior;
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.m57998i(0) && (behavior = layoutParams.getBehavior()) != null) {
                    z |= behavior.onNestedPreFling(this, childAt, view, f, f2);
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        onNestedPreScroll(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        onNestedScroll(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        onNestedScrollAccepted(view, view2, i, 0);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        SparseArray sparseArray = savedState.f33424b;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id2 = childAt.getId();
            Behavior behavior = m58020m(childAt).getBehavior();
            if (id2 != -1 && behavior != null && (parcelable2 = (Parcelable) sparseArray.get(id2)) != null) {
                behavior.onRestoreInstanceState(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id2 = childAt.getId();
            Behavior behavior = ((LayoutParams) childAt.getLayoutParams()).getBehavior();
            if (id2 != -1 && behavior != null && (onSaveInstanceState = behavior.onSaveInstanceState(this, childAt)) != null) {
                sparseArray.append(id2, onSaveInstanceState);
            }
        }
        savedState.f33424b = sparseArray;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return onStartNestedScroll(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0012, code lost:
        if (r3 != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x004c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f33401k
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L17
            boolean r3 = r0.m58010w(r1, r4)
            if (r3 == 0) goto L15
            goto L18
        L15:
            r6 = 0
            goto L2c
        L17:
            r3 = 0
        L18:
            android.view.View r6 = r0.f33401k
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r6 = r6.getBehavior()
            if (r6 == 0) goto L15
            android.view.View r7 = r0.f33401k
            boolean r6 = r6.onTouchEvent(r0, r7, r1)
        L2c:
            android.view.View r7 = r0.f33401k
            r8 = 0
            if (r7 != 0) goto L37
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L4a
        L37:
            if (r3 == 0) goto L4a
            long r11 = android.os.SystemClock.uptimeMillis()
            r15 = 0
            r16 = 0
            r13 = 3
            r14 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L4a:
            if (r8 == 0) goto L4f
            r8.recycle()
        L4f:
            if (r2 == r4) goto L54
            r1 = 3
            if (r2 != r1) goto L57
        L54:
            r0.m58040B(r5)
        L57:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public final void m58017p(View view, int i) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect m58032a = m58032a();
        m58032a.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        if (this.f33405o != null && ViewCompat.getFitsSystemWindows(this) && !ViewCompat.getFitsSystemWindows(view)) {
            m58032a.left += this.f33405o.getSystemWindowInsetLeft();
            m58032a.top += this.f33405o.getSystemWindowInsetTop();
            m58032a.right -= this.f33405o.getSystemWindowInsetRight();
            m58032a.bottom -= this.f33405o.getSystemWindowInsetBottom();
        }
        Rect m58032a2 = m58032a();
        GravityCompat.apply(m58038D(layoutParams.gravity), view.getMeasuredWidth(), view.getMeasuredHeight(), m58032a, m58032a2, i);
        view.layout(m58032a2.left, m58032a2.top, m58032a2.right, m58032a2.bottom);
        m58007z(m58032a);
        m58007z(m58032a2);
    }

    /* renamed from: q */
    public final void m58016q(View view, View view2, int i) {
        Rect m58032a = m58032a();
        Rect m58032a2 = m58032a();
        try {
            m58025h(view2, m58032a);
            m58024i(view, i, m58032a, m58032a2);
            view.layout(m58032a2.left, m58032a2.top, m58032a2.right, m58032a2.bottom);
        } finally {
            m58007z(m58032a);
            m58007z(m58032a2);
        }
    }

    /* renamed from: r */
    public final void m58015r(View view, int i, int i2) {
        int i3;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int absoluteGravity = GravityCompat.getAbsoluteGravity(m58037E(layoutParams.gravity), i2);
        int i4 = absoluteGravity & 7;
        int i5 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i2 == 1) {
            i = width - i;
        }
        int m58022k = m58022k(i) - measuredWidth;
        if (i4 != 1) {
            if (i4 == 5) {
                m58022k += measuredWidth;
            }
        } else {
            m58022k += measuredWidth / 2;
        }
        if (i5 != 16) {
            if (i5 != 80) {
                i3 = 0;
            } else {
                i3 = measuredHeight;
            }
        } else {
            i3 = measuredHeight / 2;
        }
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, Math.min(m58022k, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, Math.min(i3, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        Behavior behavior = ((LayoutParams) view.getLayoutParams()).getBehavior();
        if (behavior != null && behavior.onRequestChildRectangleOnScreen(this, view, rect, z)) {
            return true;
        }
        return super.requestChildRectangleOnScreen(view, rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.f33398h) {
            m58040B(false);
            this.f33398h = true;
        }
    }

    /* renamed from: s */
    public final void m58014s(View view, Rect rect, int i) {
        boolean z;
        boolean z2;
        int width;
        int i2;
        int i3;
        int i4;
        int height;
        int i5;
        int i6;
        int i7;
        if (ViewCompat.isLaidOut(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Behavior behavior = layoutParams.getBehavior();
            Rect m58032a = m58032a();
            Rect m58032a2 = m58032a();
            m58032a2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (behavior != null && behavior.getInsetDodgeRect(this, view, m58032a)) {
                if (!m58032a2.contains(m58032a)) {
                    throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + m58032a.toShortString() + " | Bounds:" + m58032a2.toShortString());
                }
            } else {
                m58032a.set(m58032a2);
            }
            m58007z(m58032a2);
            if (m58032a.isEmpty()) {
                m58007z(m58032a);
                return;
            }
            int absoluteGravity = GravityCompat.getAbsoluteGravity(layoutParams.dodgeInsetEdges, i);
            boolean z3 = true;
            if ((absoluteGravity & 48) == 48 && (i6 = (m58032a.top - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - layoutParams.f33415e) < (i7 = rect.top)) {
                m58035G(view, i7 - i6);
                z = true;
            } else {
                z = false;
            }
            if ((absoluteGravity & 80) == 80 && (height = ((getHeight() - m58032a.bottom) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) + layoutParams.f33415e) < (i5 = rect.bottom)) {
                m58035G(view, height - i5);
                z = true;
            }
            if (!z) {
                m58035G(view, 0);
            }
            if ((absoluteGravity & 3) == 3 && (i3 = (m58032a.left - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - layoutParams.f33414d) < (i4 = rect.left)) {
                m58036F(view, i4 - i3);
                z2 = true;
            } else {
                z2 = false;
            }
            if ((absoluteGravity & 5) == 5 && (width = ((getWidth() - m58032a.right) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin) + layoutParams.f33414d) < (i2 = rect.right)) {
                m58036F(view, width - i2);
            } else {
                z3 = z2;
            }
            if (!z3) {
                m58036F(view, 0);
            }
            m58007z(m58032a);
        }
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        m58033I();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f33408r = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(@Nullable Drawable drawable) {
        boolean z;
        Drawable drawable2 = this.f33407q;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f33407q = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f33407q.setState(getDrawableState());
                }
                DrawableCompat.setLayoutDirection(this.f33407q, ViewCompat.getLayoutDirection(this));
                Drawable drawable4 = this.f33407q;
                if (getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                drawable4.setVisible(z, false);
                this.f33407q.setCallback(this);
            }
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public void setStatusBarBackgroundColor(@ColorInt int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(@DrawableRes int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = ContextCompat.getDrawable(getContext(), i);
        } else {
            drawable = null;
        }
        setStatusBarBackground(drawable);
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
        Drawable drawable = this.f33407q;
        if (drawable != null && drawable.isVisible() != z) {
            this.f33407q.setVisible(z, false);
        }
    }

    /* renamed from: t */
    public void m58013t(View view, int i) {
        Behavior behavior;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (layoutParams.f33416f != null) {
            Rect m58032a = m58032a();
            Rect m58032a2 = m58032a();
            Rect m58032a3 = m58032a();
            m58025h(layoutParams.f33416f, m58032a);
            boolean z = false;
            m58026g(view, false, m58032a2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            m58023j(view, i, m58032a, m58032a3, layoutParams, measuredWidth, measuredHeight);
            z = (m58032a3.left == m58032a2.left && m58032a3.top == m58032a2.top) ? true : true;
            m58029d(layoutParams, m58032a3, measuredWidth, measuredHeight);
            int i2 = m58032a3.left - m58032a2.left;
            int i3 = m58032a3.top - m58032a2.top;
            if (i2 != 0) {
                ViewCompat.offsetLeftAndRight(view, i2);
            }
            if (i3 != 0) {
                ViewCompat.offsetTopAndBottom(view, i3);
            }
            if (z && (behavior = layoutParams.getBehavior()) != null) {
                behavior.onDependentViewChanged(this, view, layoutParams.f33416f);
            }
            m58007z(m58032a);
            m58007z(m58032a2);
            m58007z(m58032a3);
        }
    }

    /* renamed from: u */
    public final void m58012u(int i) {
        boolean z;
        int layoutDirection = ViewCompat.getLayoutDirection(this);
        int size = this.f33391a.size();
        Rect m58032a = m58032a();
        Rect m58032a2 = m58032a();
        Rect m58032a3 = m58032a();
        for (int i2 = 0; i2 < size; i2++) {
            View view = (View) this.f33391a.get(i2);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (i != 0 || view.getVisibility() != 8) {
                for (int i3 = 0; i3 < i2; i3++) {
                    if (layoutParams.f33417g == ((View) this.f33391a.get(i3))) {
                        m58013t(view, layoutDirection);
                    }
                }
                m58026g(view, true, m58032a2);
                if (layoutParams.insetEdge != 0 && !m58032a2.isEmpty()) {
                    int absoluteGravity = GravityCompat.getAbsoluteGravity(layoutParams.insetEdge, layoutDirection);
                    int i4 = absoluteGravity & 112;
                    if (i4 != 48) {
                        if (i4 == 80) {
                            m58032a.bottom = Math.max(m58032a.bottom, getHeight() - m58032a2.top);
                        }
                    } else {
                        m58032a.top = Math.max(m58032a.top, m58032a2.bottom);
                    }
                    int i5 = absoluteGravity & 7;
                    if (i5 != 3) {
                        if (i5 == 5) {
                            m58032a.right = Math.max(m58032a.right, getWidth() - m58032a2.left);
                        }
                    } else {
                        m58032a.left = Math.max(m58032a.left, m58032a2.right);
                    }
                }
                if (layoutParams.dodgeInsetEdges != 0 && view.getVisibility() == 0) {
                    m58014s(view, m58032a, layoutDirection);
                }
                if (i != 2) {
                    m58021l(view, m58032a3);
                    if (!m58032a3.equals(m58032a2)) {
                        m58008y(view, m58032a2);
                    }
                }
                for (int i6 = i2 + 1; i6 < size; i6++) {
                    View view2 = (View) this.f33391a.get(i6);
                    LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
                    Behavior behavior = layoutParams2.getBehavior();
                    if (behavior != null && behavior.layoutDependsOn(this, view2, view)) {
                        if (i == 0 && layoutParams2.m58002e()) {
                            layoutParams2.m57997j();
                        } else {
                            if (i != 2) {
                                z = behavior.onDependentViewChanged(this, view2, view);
                            } else {
                                behavior.onDependentViewRemoved(this, view2, view);
                                z = true;
                            }
                            if (i == 1) {
                                layoutParams2.m57993n(z);
                            }
                        }
                    }
                }
            }
        }
        m58007z(m58032a);
        m58007z(m58032a2);
        m58007z(m58032a3);
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f33407q) {
            return false;
        }
        return true;
    }

    /* renamed from: w */
    public final boolean m58010w(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        List list = this.f33393c;
        m58019n(list);
        int size = list.size();
        MotionEvent motionEvent2 = null;
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            View view = (View) list.get(i2);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Behavior behavior = layoutParams.getBehavior();
            if ((z || z2) && actionMasked != 0) {
                if (behavior != null) {
                    if (motionEvent2 == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i != 0) {
                        if (i == 1) {
                            behavior.onTouchEvent(this, view, motionEvent2);
                        }
                    } else {
                        behavior.onInterceptTouchEvent(this, view, motionEvent2);
                    }
                }
            } else {
                if (!z && behavior != null) {
                    if (i != 0) {
                        if (i == 1) {
                            z = behavior.onTouchEvent(this, view, motionEvent);
                        }
                    } else {
                        z = behavior.onInterceptTouchEvent(this, view, motionEvent);
                    }
                    if (z) {
                        this.f33401k = view;
                    }
                }
                boolean m58004c = layoutParams.m58004c();
                boolean m57999h = layoutParams.m57999h(this, view);
                if (m57999h && !m58004c) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (m57999h && !z2) {
                    break;
                }
            }
        }
        list.clear();
        return z;
    }

    /* renamed from: x */
    public final void m58009x() {
        this.f33391a.clear();
        this.f33392b.clear();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            LayoutParams m58020m = m58020m(childAt);
            m58020m.m58003d(this, childAt);
            this.f33392b.addNode(childAt);
            for (int i2 = 0; i2 < childCount; i2++) {
                if (i2 != i) {
                    View childAt2 = getChildAt(i2);
                    if (m58020m.m58005b(this, childAt, childAt2)) {
                        if (!this.f33392b.contains(childAt2)) {
                            this.f33392b.addNode(childAt2);
                        }
                        this.f33392b.addEdge(childAt2, childAt);
                    }
                }
            }
        }
        this.f33391a.addAll(this.f33392b.getSortedList());
        Collections.reverse(this.f33391a);
    }

    /* renamed from: y */
    public void m58008y(View view, Rect rect) {
        ((LayoutParams) view.getLayoutParams()).m57992o(rect);
    }

    public CoordinatorLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.coordinatorLayoutStyle);
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        Behavior behavior;
        int childCount = getChildCount();
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.m57998i(i3) && (behavior = layoutParams.getBehavior()) != null) {
                    int[] iArr2 = this.f33396f;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    behavior.onNestedPreScroll(this, childAt, view, i, i2, iArr2, i3);
                    int[] iArr3 = this.f33396f;
                    i4 = i > 0 ? Math.max(i4, iArr3[0]) : Math.min(i4, iArr3[0]);
                    int[] iArr4 = this.f33396f;
                    i5 = i2 > 0 ? Math.max(i5, iArr4[1]) : Math.min(i5, iArr4[1]);
                    z = true;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (z) {
            m58012u(1);
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        onNestedScroll(view, i, i2, i3, i4, 0, this.f33397g);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        Behavior behavior;
        this.f33410t.onNestedScrollAccepted(view, view2, i, i2);
        this.f33402l = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (layoutParams.m57998i(i2) && (behavior = layoutParams.getBehavior()) != null) {
                behavior.onNestedScrollAccepted(this, childAt, view, view2, i, i2);
            }
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                Behavior behavior = layoutParams.getBehavior();
                if (behavior != null) {
                    boolean onStartNestedScroll = behavior.onStartNestedScroll(this, childAt, view, view2, i, i2);
                    z |= onStartNestedScroll;
                    layoutParams.m57991p(i2, onStartNestedScroll);
                } else {
                    layoutParams.m57991p(i2, false);
                }
            }
        }
        return z;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(View view, int i) {
        this.f33410t.onStopNestedScroll(view, i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (layoutParams.m57998i(i)) {
                Behavior behavior = layoutParams.getBehavior();
                if (behavior != null) {
                    behavior.onStopNestedScroll(this, childAt, view, i);
                }
                layoutParams.m57996k(i);
                layoutParams.m57997j();
            }
        }
        this.f33402l = null;
    }

    public CoordinatorLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes;
        this.f33391a = new ArrayList();
        this.f33392b = new DirectedAcyclicGraph();
        this.f33393c = new ArrayList();
        this.f33394d = new ArrayList();
        this.f33396f = new int[2];
        this.f33397g = new int[2];
        this.f33410t = new NestedScrollingParentHelper(this);
        if (i == 0) {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CoordinatorLayout, 0, R.style.Widget_Support_CoordinatorLayout);
        } else {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CoordinatorLayout, i, 0);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (i == 0) {
                saveAttributeDataForStyleable(context, R.styleable.CoordinatorLayout, attributeSet, obtainStyledAttributes, 0, R.style.Widget_Support_CoordinatorLayout);
            } else {
                saveAttributeDataForStyleable(context, R.styleable.CoordinatorLayout, attributeSet, obtainStyledAttributes, i, 0);
            }
        }
        int resourceId = obtainStyledAttributes.getResourceId(R.styleable.CoordinatorLayout_keylines, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f33400j = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.f33400j.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr = this.f33400j;
                iArr[i2] = (int) (iArr[i2] * f);
            }
        }
        this.f33407q = obtainStyledAttributes.getDrawable(R.styleable.CoordinatorLayout_statusBarBackground);
        obtainStyledAttributes.recycle();
        m58033I();
        super.setOnHierarchyChangeListener(new ViewGroup$OnHierarchyChangeListenerC3804b());
        if (ViewCompat.getImportantForAccessibility(this) == 0) {
            ViewCompat.setImportantForAccessibility(this, 1);
        }
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public void onNestedScroll(@NonNull View view, int i, int i2, int i3, int i4, int i5, @NonNull int[] iArr) {
        Behavior behavior;
        int min;
        int childCount = getChildCount();
        boolean z = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.m57998i(i5) && (behavior = layoutParams.getBehavior()) != null) {
                    int[] iArr2 = this.f33396f;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    behavior.onNestedScroll(this, childAt, view, i, i2, i3, i4, i5, iArr2);
                    int[] iArr3 = this.f33396f;
                    i6 = i3 > 0 ? Math.max(i6, iArr3[0]) : Math.min(i6, iArr3[0]);
                    if (i4 > 0) {
                        min = Math.max(i7, this.f33396f[1]);
                    } else {
                        min = Math.min(i7, this.f33396f[1]);
                    }
                    i7 = min;
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + i6;
        iArr[1] = iArr[1] + i7;
        if (z) {
            m58012u(1);
        }
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    /* loaded from: classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C3802a();

        /* renamed from: b */
        public SparseArray f33424b;

        /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$SavedState$a */
        /* loaded from: classes2.dex */
        public static class C3802a implements Parcelable.ClassLoaderCreator {
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

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f33424b = new SparseArray(readInt);
            for (int i = 0; i < readInt; i++) {
                this.f33424b.append(iArr[i], readParcelableArray[i]);
            }
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            int i2;
            super.writeToParcel(parcel, i);
            SparseArray sparseArray = this.f33424b;
            if (sparseArray != null) {
                i2 = sparseArray.size();
            } else {
                i2 = 0;
            }
            parcel.writeInt(i2);
            int[] iArr = new int[i2];
            Parcelable[] parcelableArr = new Parcelable[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                iArr[i3] = this.f33424b.keyAt(i3);
                parcelableArr[i3] = (Parcelable) this.f33424b.valueAt(i3);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* loaded from: classes2.dex */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public Behavior f33411a;
        public int anchorGravity;

        /* renamed from: b */
        public boolean f33412b;

        /* renamed from: c */
        public int f33413c;

        /* renamed from: d */
        public int f33414d;
        public int dodgeInsetEdges;

        /* renamed from: e */
        public int f33415e;

        /* renamed from: f */
        public View f33416f;

        /* renamed from: g */
        public View f33417g;
        public int gravity;

        /* renamed from: h */
        public boolean f33418h;

        /* renamed from: i */
        public boolean f33419i;
        public int insetEdge;

        /* renamed from: j */
        public boolean f33420j;

        /* renamed from: k */
        public boolean f33421k;
        public int keyline;

        /* renamed from: l */
        public final Rect f33422l;

        /* renamed from: m */
        public Object f33423m;

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f33412b = false;
            this.gravity = 0;
            this.anchorGravity = 0;
            this.keyline = -1;
            this.f33413c = -1;
            this.insetEdge = 0;
            this.dodgeInsetEdges = 0;
            this.f33422l = new Rect();
        }

        /* renamed from: a */
        public boolean m58006a() {
            if (this.f33416f == null && this.f33413c != -1) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public boolean m58005b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            Behavior behavior;
            if (view2 != this.f33417g && !m57990q(view2, ViewCompat.getLayoutDirection(coordinatorLayout)) && ((behavior = this.f33411a) == null || !behavior.layoutDependsOn(coordinatorLayout, view, view2))) {
                return false;
            }
            return true;
        }

        /* renamed from: c */
        public boolean m58004c() {
            if (this.f33411a == null) {
                this.f33418h = false;
            }
            return this.f33418h;
        }

        /* renamed from: d */
        public View m58003d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f33413c == -1) {
                this.f33417g = null;
                this.f33416f = null;
                return null;
            }
            if (this.f33416f == null || !m57989r(view, coordinatorLayout)) {
                m57994m(view, coordinatorLayout);
            }
            return this.f33416f;
        }

        /* renamed from: e */
        public boolean m58002e() {
            return this.f33421k;
        }

        /* renamed from: f */
        public Rect m58001f() {
            return this.f33422l;
        }

        /* renamed from: g */
        public void m58000g() {
            this.f33417g = null;
            this.f33416f = null;
        }

        @IdRes
        public int getAnchorId() {
            return this.f33413c;
        }

        @Nullable
        public Behavior getBehavior() {
            return this.f33411a;
        }

        /* renamed from: h */
        public boolean m57999h(CoordinatorLayout coordinatorLayout, View view) {
            boolean z;
            boolean z2 = this.f33418h;
            if (z2) {
                return true;
            }
            Behavior behavior = this.f33411a;
            if (behavior != null) {
                z = behavior.blocksInteractionBelow(coordinatorLayout, view);
            } else {
                z = false;
            }
            boolean z3 = z | z2;
            this.f33418h = z3;
            return z3;
        }

        /* renamed from: i */
        public boolean m57998i(int i) {
            if (i != 0) {
                if (i != 1) {
                    return false;
                }
                return this.f33420j;
            }
            return this.f33419i;
        }

        /* renamed from: j */
        public void m57997j() {
            this.f33421k = false;
        }

        /* renamed from: k */
        public void m57996k(int i) {
            m57991p(i, false);
        }

        /* renamed from: l */
        public void m57995l() {
            this.f33418h = false;
        }

        /* renamed from: m */
        public final void m57994m(View view, CoordinatorLayout coordinatorLayout) {
            View findViewById = coordinatorLayout.findViewById(this.f33413c);
            this.f33416f = findViewById;
            if (findViewById != null) {
                if (findViewById == coordinatorLayout) {
                    if (coordinatorLayout.isInEditMode()) {
                        this.f33417g = null;
                        this.f33416f = null;
                        return;
                    }
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
                for (ViewParent parent = findViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                    if (parent == view) {
                        if (coordinatorLayout.isInEditMode()) {
                            this.f33417g = null;
                            this.f33416f = null;
                            return;
                        }
                        throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                    }
                    if (parent instanceof View) {
                        findViewById = (View) parent;
                    }
                }
                this.f33417g = findViewById;
            } else if (coordinatorLayout.isInEditMode()) {
                this.f33417g = null;
                this.f33416f = null;
            } else {
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f33413c) + " to anchor view " + view);
            }
        }

        /* renamed from: n */
        public void m57993n(boolean z) {
            this.f33421k = z;
        }

        /* renamed from: o */
        public void m57992o(Rect rect) {
            this.f33422l.set(rect);
        }

        /* renamed from: p */
        public void m57991p(int i, boolean z) {
            if (i != 0) {
                if (i == 1) {
                    this.f33420j = z;
                    return;
                }
                return;
            }
            this.f33419i = z;
        }

        /* renamed from: q */
        public final boolean m57990q(View view, int i) {
            int absoluteGravity = GravityCompat.getAbsoluteGravity(((LayoutParams) view.getLayoutParams()).insetEdge, i);
            if (absoluteGravity != 0 && (GravityCompat.getAbsoluteGravity(this.dodgeInsetEdges, i) & absoluteGravity) == absoluteGravity) {
                return true;
            }
            return false;
        }

        /* renamed from: r */
        public final boolean m57989r(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f33416f.getId() != this.f33413c) {
                return false;
            }
            View view2 = this.f33416f;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent != null && parent != view) {
                    if (parent instanceof View) {
                        view2 = (View) parent;
                    }
                } else {
                    this.f33417g = null;
                    this.f33416f = null;
                    return false;
                }
            }
            this.f33417g = view2;
            return true;
        }

        public void setAnchorId(@IdRes int i) {
            m58000g();
            this.f33413c = i;
        }

        public void setBehavior(@Nullable Behavior behavior) {
            Behavior behavior2 = this.f33411a;
            if (behavior2 != behavior) {
                if (behavior2 != null) {
                    behavior2.onDetachedFromLayoutParams();
                }
                this.f33411a = behavior;
                this.f33423m = null;
                this.f33412b = true;
                if (behavior != null) {
                    behavior.onAttachedToLayoutParams(this);
                }
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f33412b = false;
            this.gravity = 0;
            this.anchorGravity = 0;
            this.keyline = -1;
            this.f33413c = -1;
            this.insetEdge = 0;
            this.dodgeInsetEdges = 0;
            this.f33422l = new Rect();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CoordinatorLayout_Layout);
            this.gravity = obtainStyledAttributes.getInteger(R.styleable.CoordinatorLayout_Layout_android_layout_gravity, 0);
            this.f33413c = obtainStyledAttributes.getResourceId(R.styleable.CoordinatorLayout_Layout_layout_anchor, -1);
            this.anchorGravity = obtainStyledAttributes.getInteger(R.styleable.CoordinatorLayout_Layout_layout_anchorGravity, 0);
            this.keyline = obtainStyledAttributes.getInteger(R.styleable.CoordinatorLayout_Layout_layout_keyline, -1);
            this.insetEdge = obtainStyledAttributes.getInt(R.styleable.CoordinatorLayout_Layout_layout_insetEdge, 0);
            this.dodgeInsetEdges = obtainStyledAttributes.getInt(R.styleable.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
            boolean hasValue = obtainStyledAttributes.hasValue(R.styleable.CoordinatorLayout_Layout_layout_behavior);
            this.f33412b = hasValue;
            if (hasValue) {
                this.f33411a = CoordinatorLayout.m58011v(context, attributeSet, obtainStyledAttributes.getString(R.styleable.CoordinatorLayout_Layout_layout_behavior));
            }
            obtainStyledAttributes.recycle();
            Behavior behavior = this.f33411a;
            if (behavior != null) {
                behavior.onAttachedToLayoutParams(this);
            }
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.f33412b = false;
            this.gravity = 0;
            this.anchorGravity = 0;
            this.keyline = -1;
            this.f33413c = -1;
            this.insetEdge = 0;
            this.dodgeInsetEdges = 0;
            this.f33422l = new Rect();
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f33412b = false;
            this.gravity = 0;
            this.anchorGravity = 0;
            this.keyline = -1;
            this.f33413c = -1;
            this.insetEdge = 0;
            this.dodgeInsetEdges = 0;
            this.f33422l = new Rect();
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f33412b = false;
            this.gravity = 0;
            this.anchorGravity = 0;
            this.keyline = -1;
            this.f33413c = -1;
            this.insetEdge = 0;
            this.dodgeInsetEdges = 0;
            this.f33422l = new Rect();
        }
    }
}
