package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.core.graphics.Insets;
import androidx.core.view.NestedScrollingParent;
import androidx.core.view.NestedScrollingParent2;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

@SuppressLint({"UnknownNullness"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements DecorContentParent, NestedScrollingParent, NestedScrollingParent2, NestedScrollingParent3 {

    /* renamed from: F */
    public static final int[] f9477F = {R.attr.actionBarSize, 16842841};

    /* renamed from: A */
    public ViewPropertyAnimator f9478A;

    /* renamed from: B */
    public final AnimatorListenerAdapter f9479B;

    /* renamed from: C */
    public final Runnable f9480C;

    /* renamed from: D */
    public final Runnable f9481D;

    /* renamed from: E */
    public final NestedScrollingParentHelper f9482E;

    /* renamed from: a */
    public int f9483a;

    /* renamed from: b */
    public int f9484b;

    /* renamed from: c */
    public ContentFrameLayout f9485c;

    /* renamed from: d */
    public ActionBarContainer f9486d;

    /* renamed from: e */
    public DecorToolbar f9487e;

    /* renamed from: f */
    public Drawable f9488f;

    /* renamed from: g */
    public boolean f9489g;

    /* renamed from: h */
    public boolean f9490h;

    /* renamed from: i */
    public boolean f9491i;

    /* renamed from: j */
    public boolean f9492j;

    /* renamed from: k */
    public boolean f9493k;

    /* renamed from: l */
    public int f9494l;

    /* renamed from: m */
    public int f9495m;

    /* renamed from: n */
    public final Rect f9496n;

    /* renamed from: o */
    public final Rect f9497o;

    /* renamed from: p */
    public final Rect f9498p;

    /* renamed from: q */
    public final Rect f9499q;

    /* renamed from: r */
    public final Rect f9500r;

    /* renamed from: s */
    public final Rect f9501s;

    /* renamed from: t */
    public final Rect f9502t;

    /* renamed from: u */
    public WindowInsetsCompat f9503u;

    /* renamed from: v */
    public WindowInsetsCompat f9504v;

    /* renamed from: w */
    public WindowInsetsCompat f9505w;

    /* renamed from: x */
    public WindowInsetsCompat f9506x;

    /* renamed from: y */
    public ActionBarVisibilityCallback f9507y;

    /* renamed from: z */
    public OverScroller f9508z;

    /* loaded from: classes.dex */
    public interface ActionBarVisibilityCallback {
        void enableContentAnimations(boolean z);

        void hideForSystem();

        void onContentScrollStarted();

        void onContentScrollStopped();

        void onWindowVisibilityChanged(int i);

        void showForSystem();
    }

    /* loaded from: classes.dex */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$a */
    /* loaded from: classes.dex */
    public class C2166a extends AnimatorListenerAdapter {
        public C2166a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f9478A = null;
            actionBarOverlayLayout.f9493k = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f9478A = null;
            actionBarOverlayLayout.f9493k = false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$b */
    /* loaded from: classes.dex */
    public class RunnableC2167b implements Runnable {
        public RunnableC2167b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.m64405d();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f9478A = actionBarOverlayLayout.f9486d.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f9479B);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$c */
    /* loaded from: classes.dex */
    public class RunnableC2168c implements Runnable {
        public RunnableC2168c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.m64405d();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f9478A = actionBarOverlayLayout.f9486d.animate().translationY(-ActionBarOverlayLayout.this.f9486d.getHeight()).setListener(ActionBarOverlayLayout.this.f9479B);
        }
    }

    public ActionBarOverlayLayout(@NonNull Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void m64408a() {
        m64405d();
        this.f9481D.run();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m64407b(android.view.View r3, android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$LayoutParams r3 = (androidx.appcompat.widget.ActionBarOverlayLayout.LayoutParams) r3
            r0 = 1
            if (r5 == 0) goto L13
            int r5 = r3.leftMargin
            int r1 = r4.left
            if (r5 == r1) goto L13
            r3.leftMargin = r1
            r5 = 1
            goto L14
        L13:
            r5 = 0
        L14:
            if (r6 == 0) goto L1f
            int r6 = r3.topMargin
            int r1 = r4.top
            if (r6 == r1) goto L1f
            r3.topMargin = r1
            r5 = 1
        L1f:
            if (r8 == 0) goto L2a
            int r6 = r3.rightMargin
            int r8 = r4.right
            if (r6 == r8) goto L2a
            r3.rightMargin = r8
            r5 = 1
        L2a:
            if (r7 == 0) goto L35
            int r6 = r3.bottomMargin
            int r4 = r4.bottom
            if (r6 == r4) goto L35
            r3.bottomMargin = r4
            goto L36
        L35:
            r0 = r5
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.m64407b(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    /* renamed from: c */
    public final DecorToolbar m64406c(View view) {
        if (view instanceof DecorToolbar) {
            return (DecorToolbar) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public boolean canShowOverflowMenu() {
        m64401h();
        return this.f9487e.canShowOverflowMenu();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* renamed from: d */
    public void m64405d() {
        removeCallbacks(this.f9480C);
        removeCallbacks(this.f9481D);
        ViewPropertyAnimator viewPropertyAnimator = this.f9478A;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void dismissPopups() {
        m64401h();
        this.f9487e.dismissPopupMenus();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f9488f != null && !this.f9489g) {
            if (this.f9486d.getVisibility() == 0) {
                i = (int) (this.f9486d.getBottom() + this.f9486d.getTranslationY() + 0.5f);
            } else {
                i = 0;
            }
            this.f9488f.setBounds(0, i, getWidth(), this.f9488f.getIntrinsicHeight() + i);
            this.f9488f.draw(canvas);
        }
    }

    /* renamed from: e */
    public final void m64404e(Context context) {
        boolean z;
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f9477F);
        boolean z2 = false;
        this.f9483a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f9488f = drawable;
        if (drawable == null) {
            z = true;
        } else {
            z = false;
        }
        setWillNotDraw(z);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z2 = true;
        }
        this.f9489g = z2;
        this.f9508z = new OverScroller(context);
    }

    /* renamed from: f */
    public final void m64403f() {
        m64405d();
        postDelayed(this.f9481D, 600L);
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    /* renamed from: g */
    public final void m64402g() {
        m64405d();
        postDelayed(this.f9480C, 600L);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f9486d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.f9482E.getNestedScrollAxes();
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public CharSequence getTitle() {
        m64401h();
        return this.f9487e.getTitle();
    }

    /* renamed from: h */
    public void m64401h() {
        if (this.f9485c == null) {
            this.f9485c = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f9486d = (ActionBarContainer) findViewById(R.id.action_bar_container);
            this.f9487e = m64406c(findViewById(R.id.action_bar));
        }
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public boolean hasIcon() {
        m64401h();
        return this.f9487e.hasIcon();
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public boolean hasLogo() {
        m64401h();
        return this.f9487e.hasLogo();
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public boolean hideOverflowMenu() {
        m64401h();
        return this.f9487e.hideOverflowMenu();
    }

    /* renamed from: i */
    public final void m64400i() {
        m64405d();
        this.f9480C.run();
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void initFeature(int i) {
        m64401h();
        if (i != 2) {
            if (i != 5) {
                if (i == 109) {
                    setOverlayMode(true);
                    return;
                }
                return;
            }
            this.f9487e.initIndeterminateProgress();
            return;
        }
        this.f9487e.initProgress();
    }

    public boolean isHideOnContentScrollEnabled() {
        return this.f9492j;
    }

    public boolean isInOverlayMode() {
        return this.f9490h;
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public boolean isOverflowMenuShowPending() {
        m64401h();
        return this.f9487e.isOverflowMenuShowPending();
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public boolean isOverflowMenuShowing() {
        m64401h();
        return this.f9487e.isOverflowMenuShowing();
    }

    /* renamed from: j */
    public final boolean m64399j(float f) {
        this.f9508z.fling(0, 0, 0, (int) f, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f9508z.getFinalY() > this.f9486d.getHeight()) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    @RequiresApi(21)
    public WindowInsets onApplyWindowInsets(@NonNull WindowInsets windowInsets) {
        m64401h();
        WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(windowInsets, this);
        boolean m64407b = m64407b(this.f9486d, new Rect(windowInsetsCompat.getSystemWindowInsetLeft(), windowInsetsCompat.getSystemWindowInsetTop(), windowInsetsCompat.getSystemWindowInsetRight(), windowInsetsCompat.getSystemWindowInsetBottom()), true, true, false, true);
        ViewCompat.computeSystemWindowInsets(this, windowInsetsCompat, this.f9496n);
        Rect rect = this.f9496n;
        WindowInsetsCompat inset = windowInsetsCompat.inset(rect.left, rect.top, rect.right, rect.bottom);
        this.f9503u = inset;
        boolean z = true;
        if (!this.f9504v.equals(inset)) {
            this.f9504v = this.f9503u;
            m64407b = true;
        }
        if (!this.f9497o.equals(this.f9496n)) {
            this.f9497o.set(this.f9496n);
        } else {
            z = m64407b;
        }
        if (z) {
            requestLayout();
        }
        return windowInsetsCompat.consumeDisplayCutout().consumeSystemWindowInsets().consumeStableInsets().toWindowInsets();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m64404e(getContext());
        ViewCompat.requestApplyInsets(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m64405d();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        boolean z;
        int measuredHeight;
        m64401h();
        measureChildWithMargins(this.f9486d, i, 0, i2, 0);
        LayoutParams layoutParams = (LayoutParams) this.f9486d.getLayoutParams();
        int max = Math.max(0, this.f9486d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
        int max2 = Math.max(0, this.f9486d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f9486d.getMeasuredState());
        if ((ViewCompat.getWindowSystemUiVisibility(this) & 256) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            measuredHeight = this.f9483a;
            if (this.f9491i && this.f9486d.getTabContainer() != null) {
                measuredHeight += this.f9483a;
            }
        } else {
            measuredHeight = this.f9486d.getVisibility() != 8 ? this.f9486d.getMeasuredHeight() : 0;
        }
        this.f9498p.set(this.f9496n);
        WindowInsetsCompat windowInsetsCompat = this.f9503u;
        this.f9505w = windowInsetsCompat;
        if (!this.f9490h && !z) {
            Rect rect = this.f9498p;
            rect.top += measuredHeight;
            rect.bottom = rect.bottom;
            this.f9505w = windowInsetsCompat.inset(0, measuredHeight, 0, 0);
        } else {
            this.f9505w = new WindowInsetsCompat.Builder(this.f9505w).setSystemWindowInsets(Insets.m57371of(windowInsetsCompat.getSystemWindowInsetLeft(), this.f9505w.getSystemWindowInsetTop() + measuredHeight, this.f9505w.getSystemWindowInsetRight(), this.f9505w.getSystemWindowInsetBottom())).build();
        }
        m64407b(this.f9485c, this.f9498p, true, true, true, true);
        if (!this.f9506x.equals(this.f9505w)) {
            WindowInsetsCompat windowInsetsCompat2 = this.f9505w;
            this.f9506x = windowInsetsCompat2;
            ViewCompat.dispatchApplyWindowInsets(this.f9485c, windowInsetsCompat2);
        }
        measureChildWithMargins(this.f9485c, i, 0, i2, 0);
        LayoutParams layoutParams2 = (LayoutParams) this.f9485c.getLayoutParams();
        int max3 = Math.max(max, this.f9485c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin);
        int max4 = Math.max(max2, this.f9485c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f9485c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (this.f9492j && z) {
            if (m64399j(f2)) {
                m64408a();
            } else {
                m64400i();
            }
            this.f9493k = true;
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        onNestedScroll(view, i, i2, i3, i4, i5);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i) {
        boolean z;
        super.onWindowSystemUiVisibilityChanged(i);
        m64401h();
        int i2 = this.f9495m ^ i;
        this.f9495m = i;
        boolean z2 = false;
        if ((i & 4) == 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 256) != 0) {
            z2 = true;
        }
        ActionBarVisibilityCallback actionBarVisibilityCallback = this.f9507y;
        if (actionBarVisibilityCallback != null) {
            actionBarVisibilityCallback.enableContentAnimations(!z2);
            if (!z && z2) {
                this.f9507y.hideForSystem();
            } else {
                this.f9507y.showForSystem();
            }
        }
        if ((i2 & 256) != 0 && this.f9507y != null) {
            ViewCompat.requestApplyInsets(this);
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f9484b = i;
        ActionBarVisibilityCallback actionBarVisibilityCallback = this.f9507y;
        if (actionBarVisibilityCallback != null) {
            actionBarVisibilityCallback.onWindowVisibilityChanged(i);
        }
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void restoreToolbarHierarchyState(SparseArray<Parcelable> sparseArray) {
        m64401h();
        this.f9487e.restoreHierarchyState(sparseArray);
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void saveToolbarHierarchyState(SparseArray<Parcelable> sparseArray) {
        m64401h();
        this.f9487e.saveHierarchyState(sparseArray);
    }

    public void setActionBarHideOffset(int i) {
        m64405d();
        this.f9486d.setTranslationY(-Math.max(0, Math.min(i, this.f9486d.getHeight())));
    }

    public void setActionBarVisibilityCallback(ActionBarVisibilityCallback actionBarVisibilityCallback) {
        this.f9507y = actionBarVisibilityCallback;
        if (getWindowToken() != null) {
            this.f9507y.onWindowVisibilityChanged(this.f9484b);
            int i = this.f9495m;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                ViewCompat.requestApplyInsets(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f9491i = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f9492j) {
            this.f9492j = z;
            if (!z) {
                m64405d();
                setActionBarHideOffset(0);
            }
        }
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void setIcon(int i) {
        m64401h();
        this.f9487e.setIcon(i);
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void setLogo(int i) {
        m64401h();
        this.f9487e.setLogo(i);
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void setMenu(Menu menu, MenuPresenter.Callback callback) {
        m64401h();
        this.f9487e.setMenu(menu, callback);
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void setMenuPrepared() {
        m64401h();
        this.f9487e.setMenuPrepared();
    }

    public void setOverlayMode(boolean z) {
        boolean z2;
        this.f9490h = z;
        if (z && getContext().getApplicationInfo().targetSdkVersion < 19) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f9489g = z2;
    }

    public void setShowingForActionMode(boolean z) {
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void setUiOptions(int i) {
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void setWindowCallback(Window.Callback callback) {
        m64401h();
        this.f9487e.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void setWindowTitle(CharSequence charSequence) {
        m64401h();
        this.f9487e.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public boolean showOverflowMenu() {
        m64401h();
        return this.f9487e.showOverflowMenu();
    }

    public ActionBarOverlayLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9484b = 0;
        this.f9496n = new Rect();
        this.f9497o = new Rect();
        this.f9498p = new Rect();
        this.f9499q = new Rect();
        this.f9500r = new Rect();
        this.f9501s = new Rect();
        this.f9502t = new Rect();
        WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.CONSUMED;
        this.f9503u = windowInsetsCompat;
        this.f9504v = windowInsetsCompat;
        this.f9505w = windowInsetsCompat;
        this.f9506x = windowInsetsCompat;
        this.f9479B = new C2166a();
        this.f9480C = new RunnableC2167b();
        this.f9481D = new RunnableC2168c();
        m64404e(context);
        this.f9482E = new NestedScrollingParentHelper(this);
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f9482E.onNestedScrollAccepted(view, view2, i);
        this.f9494l = getActionBarHideOffset();
        m64405d();
        ActionBarVisibilityCallback actionBarVisibilityCallback = this.f9507y;
        if (actionBarVisibilityCallback != null) {
            actionBarVisibilityCallback.onContentScrollStarted();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f9486d.getVisibility() != 0) {
            return false;
        }
        return this.f9492j;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onStopNestedScroll(View view) {
        if (this.f9492j && !this.f9493k) {
            if (this.f9494l <= this.f9486d.getHeight()) {
                m64402g();
            } else {
                m64403f();
            }
        }
        ActionBarVisibilityCallback actionBarVisibilityCallback = this.f9507y;
        if (actionBarVisibilityCallback != null) {
            actionBarVisibilityCallback.onContentScrollStopped();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.f9494l + i2;
        this.f9494l = i5;
        setActionBarHideOffset(i5);
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void setIcon(Drawable drawable) {
        m64401h();
        this.f9487e.setIcon(drawable);
    }
}
