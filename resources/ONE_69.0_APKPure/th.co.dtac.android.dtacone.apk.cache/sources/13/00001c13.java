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
    public static final int[] f9565F = {R.attr.actionBarSize, 16842841};

    /* renamed from: A */
    public ViewPropertyAnimator f9566A;

    /* renamed from: B */
    public final AnimatorListenerAdapter f9567B;

    /* renamed from: C */
    public final Runnable f9568C;

    /* renamed from: D */
    public final Runnable f9569D;

    /* renamed from: E */
    public final NestedScrollingParentHelper f9570E;

    /* renamed from: a */
    public int f9571a;

    /* renamed from: b */
    public int f9572b;

    /* renamed from: c */
    public ContentFrameLayout f9573c;

    /* renamed from: d */
    public ActionBarContainer f9574d;

    /* renamed from: e */
    public DecorToolbar f9575e;

    /* renamed from: f */
    public Drawable f9576f;

    /* renamed from: g */
    public boolean f9577g;

    /* renamed from: h */
    public boolean f9578h;

    /* renamed from: i */
    public boolean f9579i;

    /* renamed from: j */
    public boolean f9580j;

    /* renamed from: k */
    public boolean f9581k;

    /* renamed from: l */
    public int f9582l;

    /* renamed from: m */
    public int f9583m;

    /* renamed from: n */
    public final Rect f9584n;

    /* renamed from: o */
    public final Rect f9585o;

    /* renamed from: p */
    public final Rect f9586p;

    /* renamed from: q */
    public final Rect f9587q;

    /* renamed from: r */
    public final Rect f9588r;

    /* renamed from: s */
    public final Rect f9589s;

    /* renamed from: t */
    public final Rect f9590t;

    /* renamed from: u */
    public WindowInsetsCompat f9591u;

    /* renamed from: v */
    public WindowInsetsCompat f9592v;

    /* renamed from: w */
    public WindowInsetsCompat f9593w;

    /* renamed from: x */
    public WindowInsetsCompat f9594x;

    /* renamed from: y */
    public ActionBarVisibilityCallback f9595y;

    /* renamed from: z */
    public OverScroller f9596z;

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
    public class C2148a extends AnimatorListenerAdapter {
        public C2148a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f9566A = null;
            actionBarOverlayLayout.f9581k = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f9566A = null;
            actionBarOverlayLayout.f9581k = false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$b */
    /* loaded from: classes.dex */
    public class RunnableC2149b implements Runnable {
        public RunnableC2149b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.m64356d();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f9566A = actionBarOverlayLayout.f9574d.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f9567B);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$c */
    /* loaded from: classes.dex */
    public class RunnableC2150c implements Runnable {
        public RunnableC2150c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.m64356d();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f9566A = actionBarOverlayLayout.f9574d.animate().translationY(-ActionBarOverlayLayout.this.f9574d.getHeight()).setListener(ActionBarOverlayLayout.this.f9567B);
        }
    }

    public ActionBarOverlayLayout(@NonNull Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void m64359a() {
        m64356d();
        this.f9569D.run();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m64358b(android.view.View r3, android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.m64358b(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    /* renamed from: c */
    public final DecorToolbar m64357c(View view) {
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
        m64352h();
        return this.f9575e.canShowOverflowMenu();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* renamed from: d */
    public void m64356d() {
        removeCallbacks(this.f9568C);
        removeCallbacks(this.f9569D);
        ViewPropertyAnimator viewPropertyAnimator = this.f9566A;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void dismissPopups() {
        m64352h();
        this.f9575e.dismissPopupMenus();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f9576f != null && !this.f9577g) {
            if (this.f9574d.getVisibility() == 0) {
                i = (int) (this.f9574d.getBottom() + this.f9574d.getTranslationY() + 0.5f);
            } else {
                i = 0;
            }
            this.f9576f.setBounds(0, i, getWidth(), this.f9576f.getIntrinsicHeight() + i);
            this.f9576f.draw(canvas);
        }
    }

    /* renamed from: e */
    public final void m64355e(Context context) {
        boolean z;
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f9565F);
        boolean z2 = false;
        this.f9571a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f9576f = drawable;
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
        this.f9577g = z2;
        this.f9596z = new OverScroller(context);
    }

    /* renamed from: f */
    public final void m64354f() {
        m64356d();
        postDelayed(this.f9569D, 600L);
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    /* renamed from: g */
    public final void m64353g() {
        m64356d();
        postDelayed(this.f9568C, 600L);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f9574d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.f9570E.getNestedScrollAxes();
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public CharSequence getTitle() {
        m64352h();
        return this.f9575e.getTitle();
    }

    /* renamed from: h */
    public void m64352h() {
        if (this.f9573c == null) {
            this.f9573c = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f9574d = (ActionBarContainer) findViewById(R.id.action_bar_container);
            this.f9575e = m64357c(findViewById(R.id.action_bar));
        }
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public boolean hasIcon() {
        m64352h();
        return this.f9575e.hasIcon();
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public boolean hasLogo() {
        m64352h();
        return this.f9575e.hasLogo();
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public boolean hideOverflowMenu() {
        m64352h();
        return this.f9575e.hideOverflowMenu();
    }

    /* renamed from: i */
    public final void m64351i() {
        m64356d();
        this.f9568C.run();
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void initFeature(int i) {
        m64352h();
        if (i != 2) {
            if (i != 5) {
                if (i == 109) {
                    setOverlayMode(true);
                    return;
                }
                return;
            }
            this.f9575e.initIndeterminateProgress();
            return;
        }
        this.f9575e.initProgress();
    }

    public boolean isHideOnContentScrollEnabled() {
        return this.f9580j;
    }

    public boolean isInOverlayMode() {
        return this.f9578h;
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public boolean isOverflowMenuShowPending() {
        m64352h();
        return this.f9575e.isOverflowMenuShowPending();
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public boolean isOverflowMenuShowing() {
        m64352h();
        return this.f9575e.isOverflowMenuShowing();
    }

    /* renamed from: j */
    public final boolean m64350j(float f) {
        this.f9596z.fling(0, 0, 0, (int) f, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f9596z.getFinalY() > this.f9574d.getHeight()) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    @RequiresApi(21)
    public WindowInsets onApplyWindowInsets(@NonNull WindowInsets windowInsets) {
        m64352h();
        WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(windowInsets, this);
        boolean m64358b = m64358b(this.f9574d, new Rect(windowInsetsCompat.getSystemWindowInsetLeft(), windowInsetsCompat.getSystemWindowInsetTop(), windowInsetsCompat.getSystemWindowInsetRight(), windowInsetsCompat.getSystemWindowInsetBottom()), true, true, false, true);
        ViewCompat.computeSystemWindowInsets(this, windowInsetsCompat, this.f9584n);
        Rect rect = this.f9584n;
        WindowInsetsCompat inset = windowInsetsCompat.inset(rect.left, rect.top, rect.right, rect.bottom);
        this.f9591u = inset;
        boolean z = true;
        if (!this.f9592v.equals(inset)) {
            this.f9592v = this.f9591u;
            m64358b = true;
        }
        if (!this.f9585o.equals(this.f9584n)) {
            this.f9585o.set(this.f9584n);
        } else {
            z = m64358b;
        }
        if (z) {
            requestLayout();
        }
        return windowInsetsCompat.consumeDisplayCutout().consumeSystemWindowInsets().consumeStableInsets().toWindowInsets();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m64355e(getContext());
        ViewCompat.requestApplyInsets(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m64356d();
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
        m64352h();
        measureChildWithMargins(this.f9574d, i, 0, i2, 0);
        LayoutParams layoutParams = (LayoutParams) this.f9574d.getLayoutParams();
        int max = Math.max(0, this.f9574d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
        int max2 = Math.max(0, this.f9574d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f9574d.getMeasuredState());
        if ((ViewCompat.getWindowSystemUiVisibility(this) & 256) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            measuredHeight = this.f9571a;
            if (this.f9579i && this.f9574d.getTabContainer() != null) {
                measuredHeight += this.f9571a;
            }
        } else {
            measuredHeight = this.f9574d.getVisibility() != 8 ? this.f9574d.getMeasuredHeight() : 0;
        }
        this.f9586p.set(this.f9584n);
        WindowInsetsCompat windowInsetsCompat = this.f9591u;
        this.f9593w = windowInsetsCompat;
        if (!this.f9578h && !z) {
            Rect rect = this.f9586p;
            rect.top += measuredHeight;
            rect.bottom = rect.bottom;
            this.f9593w = windowInsetsCompat.inset(0, measuredHeight, 0, 0);
        } else {
            this.f9593w = new WindowInsetsCompat.Builder(this.f9593w).setSystemWindowInsets(Insets.m57321of(windowInsetsCompat.getSystemWindowInsetLeft(), this.f9593w.getSystemWindowInsetTop() + measuredHeight, this.f9593w.getSystemWindowInsetRight(), this.f9593w.getSystemWindowInsetBottom())).build();
        }
        m64358b(this.f9573c, this.f9586p, true, true, true, true);
        if (!this.f9594x.equals(this.f9593w)) {
            WindowInsetsCompat windowInsetsCompat2 = this.f9593w;
            this.f9594x = windowInsetsCompat2;
            ViewCompat.dispatchApplyWindowInsets(this.f9573c, windowInsetsCompat2);
        }
        measureChildWithMargins(this.f9573c, i, 0, i2, 0);
        LayoutParams layoutParams2 = (LayoutParams) this.f9573c.getLayoutParams();
        int max3 = Math.max(max, this.f9573c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin);
        int max4 = Math.max(max2, this.f9573c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f9573c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (this.f9580j && z) {
            if (m64350j(f2)) {
                m64359a();
            } else {
                m64351i();
            }
            this.f9581k = true;
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
        m64352h();
        int i2 = this.f9583m ^ i;
        this.f9583m = i;
        boolean z2 = false;
        if ((i & 4) == 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 256) != 0) {
            z2 = true;
        }
        ActionBarVisibilityCallback actionBarVisibilityCallback = this.f9595y;
        if (actionBarVisibilityCallback != null) {
            actionBarVisibilityCallback.enableContentAnimations(!z2);
            if (!z && z2) {
                this.f9595y.hideForSystem();
            } else {
                this.f9595y.showForSystem();
            }
        }
        if ((i2 & 256) != 0 && this.f9595y != null) {
            ViewCompat.requestApplyInsets(this);
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f9572b = i;
        ActionBarVisibilityCallback actionBarVisibilityCallback = this.f9595y;
        if (actionBarVisibilityCallback != null) {
            actionBarVisibilityCallback.onWindowVisibilityChanged(i);
        }
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void restoreToolbarHierarchyState(SparseArray<Parcelable> sparseArray) {
        m64352h();
        this.f9575e.restoreHierarchyState(sparseArray);
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void saveToolbarHierarchyState(SparseArray<Parcelable> sparseArray) {
        m64352h();
        this.f9575e.saveHierarchyState(sparseArray);
    }

    public void setActionBarHideOffset(int i) {
        m64356d();
        this.f9574d.setTranslationY(-Math.max(0, Math.min(i, this.f9574d.getHeight())));
    }

    public void setActionBarVisibilityCallback(ActionBarVisibilityCallback actionBarVisibilityCallback) {
        this.f9595y = actionBarVisibilityCallback;
        if (getWindowToken() != null) {
            this.f9595y.onWindowVisibilityChanged(this.f9572b);
            int i = this.f9583m;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                ViewCompat.requestApplyInsets(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f9579i = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f9580j) {
            this.f9580j = z;
            if (!z) {
                m64356d();
                setActionBarHideOffset(0);
            }
        }
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void setIcon(int i) {
        m64352h();
        this.f9575e.setIcon(i);
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void setLogo(int i) {
        m64352h();
        this.f9575e.setLogo(i);
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void setMenu(Menu menu, MenuPresenter.Callback callback) {
        m64352h();
        this.f9575e.setMenu(menu, callback);
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void setMenuPrepared() {
        m64352h();
        this.f9575e.setMenuPrepared();
    }

    public void setOverlayMode(boolean z) {
        boolean z2;
        this.f9578h = z;
        if (z && getContext().getApplicationInfo().targetSdkVersion < 19) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f9577g = z2;
    }

    public void setShowingForActionMode(boolean z) {
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void setUiOptions(int i) {
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void setWindowCallback(Window.Callback callback) {
        m64352h();
        this.f9575e.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void setWindowTitle(CharSequence charSequence) {
        m64352h();
        this.f9575e.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public boolean showOverflowMenu() {
        m64352h();
        return this.f9575e.showOverflowMenu();
    }

    public ActionBarOverlayLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9572b = 0;
        this.f9584n = new Rect();
        this.f9585o = new Rect();
        this.f9586p = new Rect();
        this.f9587q = new Rect();
        this.f9588r = new Rect();
        this.f9589s = new Rect();
        this.f9590t = new Rect();
        WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.CONSUMED;
        this.f9591u = windowInsetsCompat;
        this.f9592v = windowInsetsCompat;
        this.f9593w = windowInsetsCompat;
        this.f9594x = windowInsetsCompat;
        this.f9567B = new C2148a();
        this.f9568C = new RunnableC2149b();
        this.f9569D = new RunnableC2150c();
        m64355e(context);
        this.f9570E = new NestedScrollingParentHelper(this);
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
        this.f9570E.onNestedScrollAccepted(view, view2, i);
        this.f9582l = getActionBarHideOffset();
        m64356d();
        ActionBarVisibilityCallback actionBarVisibilityCallback = this.f9595y;
        if (actionBarVisibilityCallback != null) {
            actionBarVisibilityCallback.onContentScrollStarted();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f9574d.getVisibility() != 0) {
            return false;
        }
        return this.f9580j;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onStopNestedScroll(View view) {
        if (this.f9580j && !this.f9581k) {
            if (this.f9582l <= this.f9574d.getHeight()) {
                m64353g();
            } else {
                m64354f();
            }
        }
        ActionBarVisibilityCallback actionBarVisibilityCallback = this.f9595y;
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
        int i5 = this.f9582l + i2;
        this.f9582l = i5;
        setActionBarHideOffset(i5);
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void setIcon(Drawable drawable) {
        m64352h();
        this.f9575e.setIcon(drawable);
    }
}