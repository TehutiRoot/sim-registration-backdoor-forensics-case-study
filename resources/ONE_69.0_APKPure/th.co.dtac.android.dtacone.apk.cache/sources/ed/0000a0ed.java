package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.math.MathUtils;
import androidx.core.util.ObjectsCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.elevation.ElevationOverlayProvider;
import com.google.android.material.internal.CollapsingTextHelper;
import com.google.android.material.internal.DescendantOffsetUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes4.dex */
public class CollapsingToolbarLayout extends FrameLayout {

    /* renamed from: F */
    public static final int f49013F = R.style.Widget_Design_CollapsingToolbar;
    public static final int TITLE_COLLAPSE_MODE_FADE = 1;
    public static final int TITLE_COLLAPSE_MODE_SCALE = 0;

    /* renamed from: A */
    public WindowInsetsCompat f49014A;

    /* renamed from: B */
    public int f49015B;

    /* renamed from: C */
    public boolean f49016C;

    /* renamed from: D */
    public int f49017D;

    /* renamed from: E */
    public boolean f49018E;

    /* renamed from: a */
    public boolean f49019a;

    /* renamed from: b */
    public int f49020b;

    /* renamed from: c */
    public ViewGroup f49021c;

    /* renamed from: d */
    public View f49022d;

    /* renamed from: e */
    public View f49023e;

    /* renamed from: f */
    public int f49024f;

    /* renamed from: g */
    public int f49025g;

    /* renamed from: h */
    public int f49026h;

    /* renamed from: i */
    public int f49027i;

    /* renamed from: j */
    public final Rect f49028j;

    /* renamed from: k */
    public final CollapsingTextHelper f49029k;

    /* renamed from: l */
    public final ElevationOverlayProvider f49030l;

    /* renamed from: m */
    public boolean f49031m;

    /* renamed from: n */
    public boolean f49032n;

    /* renamed from: o */
    public Drawable f49033o;

    /* renamed from: p */
    public Drawable f49034p;

    /* renamed from: q */
    public int f49035q;

    /* renamed from: r */
    public boolean f49036r;

    /* renamed from: s */
    public ValueAnimator f49037s;

    /* renamed from: t */
    public long f49038t;

    /* renamed from: u */
    public final TimeInterpolator f49039u;

    /* renamed from: v */
    public final TimeInterpolator f49040v;

    /* renamed from: w */
    public int f49041w;

    /* renamed from: x */
    public AppBarLayout.OnOffsetChangedListener f49042x;

    /* renamed from: y */
    public int f49043y;

    /* renamed from: z */
    public int f49044z;

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes4.dex */
    public interface StaticLayoutBuilderConfigurer extends com.google.android.material.internal.StaticLayoutBuilderConfigurer {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes4.dex */
    public @interface TitleCollapseMode {
    }

    /* renamed from: com.google.android.material.appbar.CollapsingToolbarLayout$a */
    /* loaded from: classes4.dex */
    public class C6794a implements OnApplyWindowInsetsListener {
        public C6794a() {
        }

        @Override // androidx.core.view.OnApplyWindowInsetsListener
        public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
            return CollapsingToolbarLayout.this.m45870m(windowInsetsCompat);
        }
    }

    /* renamed from: com.google.android.material.appbar.CollapsingToolbarLayout$b */
    /* loaded from: classes4.dex */
    public class C6795b implements ValueAnimator.AnimatorUpdateListener {
        public C6795b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            CollapsingToolbarLayout.this.setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* renamed from: com.google.android.material.appbar.CollapsingToolbarLayout$c */
    /* loaded from: classes4.dex */
    public class C6796c implements AppBarLayout.OnOffsetChangedListener {
        public C6796c() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
        public void onOffsetChanged(AppBarLayout appBarLayout, int i) {
            int i2;
            int height;
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.f49043y = i;
            WindowInsetsCompat windowInsetsCompat = collapsingToolbarLayout.f49014A;
            if (windowInsetsCompat != null) {
                i2 = windowInsetsCompat.getSystemWindowInsetTop();
            } else {
                i2 = 0;
            }
            int childCount = CollapsingToolbarLayout.this.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = CollapsingToolbarLayout.this.getChildAt(i3);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                T32 m45874i = CollapsingToolbarLayout.m45874i(childAt);
                int i4 = layoutParams.f49045a;
                if (i4 != 1) {
                    if (i4 == 2) {
                        m45874i.m66374j(Math.round((-i) * layoutParams.f49046b));
                    }
                } else {
                    m45874i.m66374j(MathUtils.clamp(-i, 0, CollapsingToolbarLayout.this.m45876g(childAt)));
                }
            }
            CollapsingToolbarLayout.this.m45864s();
            CollapsingToolbarLayout collapsingToolbarLayout2 = CollapsingToolbarLayout.this;
            if (collapsingToolbarLayout2.f49034p != null && i2 > 0) {
                ViewCompat.postInvalidateOnAnimation(collapsingToolbarLayout2);
            }
            int height2 = (CollapsingToolbarLayout.this.getHeight() - ViewCompat.getMinimumHeight(CollapsingToolbarLayout.this)) - i2;
            float f = height2;
            CollapsingToolbarLayout.this.f49029k.setFadeModeStartFraction(Math.min(1.0f, (height - CollapsingToolbarLayout.this.getScrimVisibleHeightTrigger()) / f));
            CollapsingToolbarLayout collapsingToolbarLayout3 = CollapsingToolbarLayout.this;
            collapsingToolbarLayout3.f49029k.setCurrentOffsetY(collapsingToolbarLayout3.f49043y + height2);
            CollapsingToolbarLayout.this.f49029k.setExpansionFraction(Math.abs(i) / f);
        }
    }

    public CollapsingToolbarLayout(@NonNull Context context) {
        this(context, null);
    }

    /* renamed from: f */
    public static int m45877f(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            return view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
        }
        return view.getMeasuredHeight();
    }

    /* renamed from: h */
    public static CharSequence m45875h(View view) {
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getTitle();
        }
        if (view instanceof android.widget.Toolbar) {
            return ((android.widget.Toolbar) view).getTitle();
        }
        return null;
    }

    /* renamed from: i */
    public static T32 m45874i(View view) {
        T32 t32 = (T32) view.getTag(R.id.view_offset_helper);
        if (t32 == null) {
            T32 t322 = new T32(view);
            view.setTag(R.id.view_offset_helper, t322);
            return t322;
        }
        return t32;
    }

    /* renamed from: k */
    public static boolean m45872k(View view) {
        if (!(view instanceof Toolbar) && !(view instanceof android.widget.Toolbar)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void m45882a(int i) {
        TimeInterpolator timeInterpolator;
        m45879d();
        ValueAnimator valueAnimator = this.f49037s;
        if (valueAnimator == null) {
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.f49037s = valueAnimator2;
            if (i > this.f49035q) {
                timeInterpolator = this.f49039u;
            } else {
                timeInterpolator = this.f49040v;
            }
            valueAnimator2.setInterpolator(timeInterpolator);
            this.f49037s.addUpdateListener(new C6795b());
        } else if (valueAnimator.isRunning()) {
            this.f49037s.cancel();
        }
        this.f49037s.setDuration(this.f49038t);
        this.f49037s.setIntValues(this.f49035q, i);
        this.f49037s.start();
    }

    /* renamed from: b */
    public final TextUtils.TruncateAt m45881b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 3) {
                    return TextUtils.TruncateAt.END;
                }
                return TextUtils.TruncateAt.MARQUEE;
            }
            return TextUtils.TruncateAt.MIDDLE;
        }
        return TextUtils.TruncateAt.START;
    }

    /* renamed from: c */
    public final void m45880c(AppBarLayout appBarLayout) {
        if (m45873j()) {
            appBarLayout.setLiftOnScroll(false);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* renamed from: d */
    public final void m45879d() {
        if (!this.f49019a) {
            return;
        }
        ViewGroup viewGroup = null;
        this.f49021c = null;
        this.f49022d = null;
        int i = this.f49020b;
        if (i != -1) {
            ViewGroup viewGroup2 = (ViewGroup) findViewById(i);
            this.f49021c = viewGroup2;
            if (viewGroup2 != null) {
                this.f49022d = m45878e(viewGroup2);
            }
        }
        if (this.f49021c == null) {
            int childCount = getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 >= childCount) {
                    break;
                }
                View childAt = getChildAt(i2);
                if (m45872k(childAt)) {
                    viewGroup = (ViewGroup) childAt;
                    break;
                }
                i2++;
            }
            this.f49021c = viewGroup;
        }
        m45865r();
        this.f49019a = false;
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        int i;
        Drawable drawable;
        super.draw(canvas);
        m45879d();
        if (this.f49021c == null && (drawable = this.f49033o) != null && this.f49035q > 0) {
            drawable.mutate().setAlpha(this.f49035q);
            this.f49033o.draw(canvas);
        }
        if (this.f49031m && this.f49032n) {
            if (this.f49021c != null && this.f49033o != null && this.f49035q > 0 && m45873j() && this.f49029k.getExpansionFraction() < this.f49029k.getFadeModeThresholdFraction()) {
                int save = canvas.save();
                canvas.clipRect(this.f49033o.getBounds(), Region.Op.DIFFERENCE);
                this.f49029k.draw(canvas);
                canvas.restoreToCount(save);
            } else {
                this.f49029k.draw(canvas);
            }
        }
        if (this.f49034p != null && this.f49035q > 0) {
            WindowInsetsCompat windowInsetsCompat = this.f49014A;
            if (windowInsetsCompat != null) {
                i = windowInsetsCompat.getSystemWindowInsetTop();
            } else {
                i = 0;
            }
            if (i > 0) {
                this.f49034p.setBounds(0, -this.f49043y, getWidth(), i - this.f49043y);
                this.f49034p.mutate().setAlpha(this.f49035q);
                this.f49034p.draw(canvas);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        if (this.f49033o != null && this.f49035q > 0 && m45871l(view)) {
            m45866q(this.f49033o, view, getWidth(), getHeight());
            this.f49033o.mutate().setAlpha(this.f49035q);
            this.f49033o.draw(canvas);
            z = true;
        } else {
            z = false;
        }
        if (super.drawChild(canvas, view, j) || z) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        boolean z;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f49034p;
        if (drawable != null && drawable.isStateful()) {
            z = drawable.setState(drawableState);
        } else {
            z = false;
        }
        Drawable drawable2 = this.f49033o;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        CollapsingTextHelper collapsingTextHelper = this.f49029k;
        if (collapsingTextHelper != null) {
            z |= collapsingTextHelper.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* renamed from: e */
    public final View m45878e(View view) {
        for (ViewParent parent = view.getParent(); parent != this && parent != null; parent = parent.getParent()) {
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return view;
    }

    /* renamed from: g */
    public final int m45876g(View view) {
        return ((getHeight() - m45874i(view).m66382b()) - view.getHeight()) - ((FrameLayout.LayoutParams) ((LayoutParams) view.getLayoutParams())).bottomMargin;
    }

    public int getCollapsedTitleGravity() {
        return this.f49029k.getCollapsedTextGravity();
    }

    public float getCollapsedTitleTextSize() {
        return this.f49029k.getCollapsedTextSize();
    }

    @NonNull
    public Typeface getCollapsedTitleTypeface() {
        return this.f49029k.getCollapsedTypeface();
    }

    @Nullable
    public Drawable getContentScrim() {
        return this.f49033o;
    }

    public int getExpandedTitleGravity() {
        return this.f49029k.getExpandedTextGravity();
    }

    public int getExpandedTitleMarginBottom() {
        return this.f49027i;
    }

    public int getExpandedTitleMarginEnd() {
        return this.f49026h;
    }

    public int getExpandedTitleMarginStart() {
        return this.f49024f;
    }

    public int getExpandedTitleMarginTop() {
        return this.f49025g;
    }

    public float getExpandedTitleTextSize() {
        return this.f49029k.getExpandedTextSize();
    }

    @NonNull
    public Typeface getExpandedTitleTypeface() {
        return this.f49029k.getExpandedTypeface();
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getHyphenationFrequency() {
        return this.f49029k.getHyphenationFrequency();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getLineCount() {
        return this.f49029k.getLineCount();
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public float getLineSpacingAdd() {
        return this.f49029k.getLineSpacingAdd();
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public float getLineSpacingMultiplier() {
        return this.f49029k.getLineSpacingMultiplier();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getMaxLines() {
        return this.f49029k.getMaxLines();
    }

    public int getScrimAlpha() {
        return this.f49035q;
    }

    public long getScrimAnimationDuration() {
        return this.f49038t;
    }

    public int getScrimVisibleHeightTrigger() {
        int i;
        int i2 = this.f49041w;
        if (i2 >= 0) {
            return i2 + this.f49015B + this.f49017D;
        }
        WindowInsetsCompat windowInsetsCompat = this.f49014A;
        if (windowInsetsCompat != null) {
            i = windowInsetsCompat.getSystemWindowInsetTop();
        } else {
            i = 0;
        }
        int minimumHeight = ViewCompat.getMinimumHeight(this);
        if (minimumHeight > 0) {
            return Math.min((minimumHeight * 2) + i, getHeight());
        }
        return getHeight() / 3;
    }

    @Nullable
    public Drawable getStatusBarScrim() {
        return this.f49034p;
    }

    @Nullable
    public CharSequence getTitle() {
        if (this.f49031m) {
            return this.f49029k.getText();
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.f49044z;
    }

    @Nullable
    public TimeInterpolator getTitlePositionInterpolator() {
        return this.f49029k.getPositionInterpolator();
    }

    @NonNull
    public TextUtils.TruncateAt getTitleTextEllipsize() {
        return this.f49029k.getTitleTextEllipsize();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isExtraMultilineHeightEnabled() {
        return this.f49018E;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isForceApplySystemWindowInsetTop() {
        return this.f49016C;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isRtlTextDirectionHeuristicsEnabled() {
        return this.f49029k.isRtlTextDirectionHeuristicsEnabled();
    }

    public boolean isTitleEnabled() {
        return this.f49031m;
    }

    /* renamed from: j */
    public final boolean m45873j() {
        if (this.f49044z == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public final boolean m45871l(View view) {
        View view2 = this.f49022d;
        if (view2 != null && view2 != this) {
            if (view != view2) {
                return false;
            }
        } else if (view != this.f49021c) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public WindowInsetsCompat m45870m(WindowInsetsCompat windowInsetsCompat) {
        WindowInsetsCompat windowInsetsCompat2;
        if (ViewCompat.getFitsSystemWindows(this)) {
            windowInsetsCompat2 = windowInsetsCompat;
        } else {
            windowInsetsCompat2 = null;
        }
        if (!ObjectsCompat.equals(this.f49014A, windowInsetsCompat2)) {
            this.f49014A = windowInsetsCompat2;
            requestLayout();
        }
        return windowInsetsCompat.consumeSystemWindowInsets();
    }

    /* renamed from: n */
    public final void m45869n(boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        View view = this.f49022d;
        if (view == null) {
            view = this.f49021c;
        }
        int m45876g = m45876g(view);
        DescendantOffsetUtils.getDescendantRect(this, this.f49023e, this.f49028j);
        ViewGroup viewGroup = this.f49021c;
        if (viewGroup instanceof Toolbar) {
            Toolbar toolbar = (Toolbar) viewGroup;
            i = toolbar.getTitleMarginStart();
            i3 = toolbar.getTitleMarginEnd();
            i4 = toolbar.getTitleMarginTop();
            i2 = toolbar.getTitleMarginBottom();
        } else if (Build.VERSION.SDK_INT >= 24 && (viewGroup instanceof android.widget.Toolbar)) {
            android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
            i = toolbar2.getTitleMarginStart();
            i3 = toolbar2.getTitleMarginEnd();
            i4 = toolbar2.getTitleMarginTop();
            i2 = toolbar2.getTitleMarginBottom();
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
        }
        CollapsingTextHelper collapsingTextHelper = this.f49029k;
        Rect rect = this.f49028j;
        int i6 = rect.left;
        if (z) {
            i5 = i3;
        } else {
            i5 = i;
        }
        int i7 = i6 + i5;
        int i8 = rect.top + m45876g + i4;
        int i9 = rect.right;
        if (!z) {
            i = i3;
        }
        collapsingTextHelper.setCollapsedBounds(i7, i8, i9 - i, (rect.bottom + m45876g) - i2);
    }

    /* renamed from: o */
    public final void m45868o() {
        setContentDescription(getTitle());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            m45880c(appBarLayout);
            ViewCompat.setFitsSystemWindows(this, ViewCompat.getFitsSystemWindows(appBarLayout));
            if (this.f49042x == null) {
                this.f49042x = new C6796c();
            }
            appBarLayout.addOnOffsetChangedListener(this.f49042x);
            ViewCompat.requestApplyInsets(this);
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f49029k.maybeUpdateFontWeightAdjustment(configuration);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        ViewParent parent = getParent();
        AppBarLayout.OnOffsetChangedListener onOffsetChangedListener = this.f49042x;
        if (onOffsetChangedListener != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).removeOnOffsetChangedListener(onOffsetChangedListener);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        WindowInsetsCompat windowInsetsCompat = this.f49014A;
        if (windowInsetsCompat != null) {
            int systemWindowInsetTop = windowInsetsCompat.getSystemWindowInsetTop();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (!ViewCompat.getFitsSystemWindows(childAt) && childAt.getTop() < systemWindowInsetTop) {
                    ViewCompat.offsetTopAndBottom(childAt, systemWindowInsetTop);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            m45874i(getChildAt(i6)).m66377g();
        }
        m45863t(i, i2, i3, i4, false);
        m45862u();
        m45864s();
        int childCount3 = getChildCount();
        for (int i7 = 0; i7 < childCount3; i7++) {
            m45874i(getChildAt(i7)).m66383a();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        m45879d();
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        WindowInsetsCompat windowInsetsCompat = this.f49014A;
        if (windowInsetsCompat != null) {
            i3 = windowInsetsCompat.getSystemWindowInsetTop();
        } else {
            i3 = 0;
        }
        if ((mode == 0 || this.f49016C) && i3 > 0) {
            this.f49015B = i3;
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + i3, 1073741824));
        }
        if (this.f49018E && this.f49029k.getMaxLines() > 1) {
            m45862u();
            m45863t(0, 0, getMeasuredWidth(), getMeasuredHeight(), true);
            int expandedLineCount = this.f49029k.getExpandedLineCount();
            if (expandedLineCount > 1) {
                this.f49017D = Math.round(this.f49029k.getExpandedTextFullHeight()) * (expandedLineCount - 1);
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + this.f49017D, 1073741824));
            }
        }
        ViewGroup viewGroup = this.f49021c;
        if (viewGroup != null) {
            View view = this.f49022d;
            if (view != null && view != this) {
                setMinimumHeight(m45877f(view));
            } else {
                setMinimumHeight(m45877f(viewGroup));
            }
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.f49033o;
        if (drawable != null) {
            m45867p(drawable, i, i2);
        }
    }

    /* renamed from: p */
    public final void m45867p(Drawable drawable, int i, int i2) {
        m45866q(drawable, this.f49021c, i, i2);
    }

    /* renamed from: q */
    public final void m45866q(Drawable drawable, View view, int i, int i2) {
        if (m45873j() && view != null && this.f49031m) {
            i2 = view.getBottom();
        }
        drawable.setBounds(0, 0, i, i2);
    }

    /* renamed from: r */
    public final void m45865r() {
        View view;
        if (!this.f49031m && (view = this.f49023e) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f49023e);
            }
        }
        if (this.f49031m && this.f49021c != null) {
            if (this.f49023e == null) {
                this.f49023e = new View(getContext());
            }
            if (this.f49023e.getParent() == null) {
                this.f49021c.addView(this.f49023e, -1, -1);
            }
        }
    }

    /* renamed from: s */
    public final void m45864s() {
        boolean z;
        if (this.f49033o != null || this.f49034p != null) {
            if (getHeight() + this.f49043y < getScrimVisibleHeightTrigger()) {
                z = true;
            } else {
                z = false;
            }
            setScrimsShown(z);
        }
    }

    public void setCollapsedTitleGravity(int i) {
        this.f49029k.setCollapsedTextGravity(i);
    }

    public void setCollapsedTitleTextAppearance(@StyleRes int i) {
        this.f49029k.setCollapsedTextAppearance(i);
    }

    public void setCollapsedTitleTextColor(@ColorInt int i) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapsedTitleTextSize(float f) {
        this.f49029k.setCollapsedTextSize(f);
    }

    public void setCollapsedTitleTypeface(@Nullable Typeface typeface) {
        this.f49029k.setCollapsedTypeface(typeface);
    }

    public void setContentScrim(@Nullable Drawable drawable) {
        Drawable drawable2 = this.f49033o;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f49033o = drawable3;
            if (drawable3 != null) {
                m45867p(drawable3, getWidth(), getHeight());
                this.f49033o.setCallback(this);
                this.f49033o.setAlpha(this.f49035q);
            }
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public void setContentScrimColor(@ColorInt int i) {
        setContentScrim(new ColorDrawable(i));
    }

    public void setContentScrimResource(@DrawableRes int i) {
        setContentScrim(ContextCompat.getDrawable(getContext(), i));
    }

    public void setExpandedTitleColor(@ColorInt int i) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setExpandedTitleGravity(int i) {
        this.f49029k.setExpandedTextGravity(i);
    }

    public void setExpandedTitleMargin(int i, int i2, int i3, int i4) {
        this.f49024f = i;
        this.f49025g = i2;
        this.f49026h = i3;
        this.f49027i = i4;
        requestLayout();
    }

    public void setExpandedTitleMarginBottom(int i) {
        this.f49027i = i;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i) {
        this.f49026h = i;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i) {
        this.f49024f = i;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i) {
        this.f49025g = i;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(@StyleRes int i) {
        this.f49029k.setExpandedTextAppearance(i);
    }

    public void setExpandedTitleTextColor(@NonNull ColorStateList colorStateList) {
        this.f49029k.setExpandedTextColor(colorStateList);
    }

    public void setExpandedTitleTextSize(float f) {
        this.f49029k.setExpandedTextSize(f);
    }

    public void setExpandedTitleTypeface(@Nullable Typeface typeface) {
        this.f49029k.setExpandedTypeface(typeface);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setExtraMultilineHeightEnabled(boolean z) {
        this.f49018E = z;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setForceApplySystemWindowInsetTop(boolean z) {
        this.f49016C = z;
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setHyphenationFrequency(int i) {
        this.f49029k.setHyphenationFrequency(i);
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setLineSpacingAdd(float f) {
        this.f49029k.setLineSpacingAdd(f);
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setLineSpacingMultiplier(@FloatRange(from = 0.0d) float f) {
        this.f49029k.setLineSpacingMultiplier(f);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setMaxLines(int i) {
        this.f49029k.setMaxLines(i);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setRtlTextDirectionHeuristicsEnabled(boolean z) {
        this.f49029k.setRtlTextDirectionHeuristicsEnabled(z);
    }

    public void setScrimAlpha(int i) {
        ViewGroup viewGroup;
        if (i != this.f49035q) {
            if (this.f49033o != null && (viewGroup = this.f49021c) != null) {
                ViewCompat.postInvalidateOnAnimation(viewGroup);
            }
            this.f49035q = i;
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public void setScrimAnimationDuration(@IntRange(from = 0) long j) {
        this.f49038t = j;
    }

    public void setScrimVisibleHeightTrigger(@IntRange(from = 0) int i) {
        if (this.f49041w != i) {
            this.f49041w = i;
            m45864s();
        }
    }

    public void setScrimsShown(boolean z) {
        setScrimsShown(z, ViewCompat.isLaidOut(this) && !isInEditMode());
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setStaticLayoutBuilderConfigurer(@Nullable StaticLayoutBuilderConfigurer staticLayoutBuilderConfigurer) {
        this.f49029k.setStaticLayoutBuilderConfigurer(staticLayoutBuilderConfigurer);
    }

    public void setStatusBarScrim(@Nullable Drawable drawable) {
        boolean z;
        Drawable drawable2 = this.f49034p;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f49034p = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f49034p.setState(getDrawableState());
                }
                DrawableCompat.setLayoutDirection(this.f49034p, ViewCompat.getLayoutDirection(this));
                Drawable drawable4 = this.f49034p;
                if (getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                drawable4.setVisible(z, false);
                this.f49034p.setCallback(this);
                this.f49034p.setAlpha(this.f49035q);
            }
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public void setStatusBarScrimColor(@ColorInt int i) {
        setStatusBarScrim(new ColorDrawable(i));
    }

    public void setStatusBarScrimResource(@DrawableRes int i) {
        setStatusBarScrim(ContextCompat.getDrawable(getContext(), i));
    }

    public void setTitle(@Nullable CharSequence charSequence) {
        this.f49029k.setText(charSequence);
        m45868o();
    }

    public void setTitleCollapseMode(int i) {
        this.f49044z = i;
        boolean m45873j = m45873j();
        this.f49029k.setFadeModeEnabled(m45873j);
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            m45880c((AppBarLayout) parent);
        }
        if (m45873j && this.f49033o == null) {
            setContentScrimColor(this.f49030l.compositeOverlayWithThemeSurfaceColorIfNeeded(getResources().getDimension(R.dimen.design_appbar_elevation)));
        }
    }

    public void setTitleEllipsize(@NonNull TextUtils.TruncateAt truncateAt) {
        this.f49029k.setTitleTextEllipsize(truncateAt);
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.f49031m) {
            this.f49031m = z;
            m45868o();
            m45865r();
            requestLayout();
        }
    }

    public void setTitlePositionInterpolator(@Nullable TimeInterpolator timeInterpolator) {
        this.f49029k.setPositionInterpolator(timeInterpolator);
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
        Drawable drawable = this.f49034p;
        if (drawable != null && drawable.isVisible() != z) {
            this.f49034p.setVisible(z, false);
        }
        Drawable drawable2 = this.f49033o;
        if (drawable2 != null && drawable2.isVisible() != z) {
            this.f49033o.setVisible(z, false);
        }
    }

    /* renamed from: t */
    public final void m45863t(int i, int i2, int i3, int i4, boolean z) {
        View view;
        boolean z2;
        int i5;
        int i6;
        if (this.f49031m && (view = this.f49023e) != null) {
            boolean z3 = false;
            if (ViewCompat.isAttachedToWindow(view) && this.f49023e.getVisibility() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f49032n = z2;
            if (z2 || z) {
                if (ViewCompat.getLayoutDirection(this) == 1) {
                    z3 = true;
                }
                m45869n(z3);
                CollapsingTextHelper collapsingTextHelper = this.f49029k;
                if (z3) {
                    i5 = this.f49026h;
                } else {
                    i5 = this.f49024f;
                }
                int i7 = this.f49028j.top + this.f49025g;
                int i8 = i3 - i;
                if (z3) {
                    i6 = this.f49024f;
                } else {
                    i6 = this.f49026h;
                }
                collapsingTextHelper.setExpandedBounds(i5, i7, i8 - i6, (i4 - i2) - this.f49027i);
                this.f49029k.recalculate(z);
            }
        }
    }

    /* renamed from: u */
    public final void m45862u() {
        if (this.f49021c != null && this.f49031m && TextUtils.isEmpty(this.f49029k.getText())) {
            setTitle(m45875h(this.f49021c));
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(@NonNull Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f49033o && drawable != this.f49034p) {
            return false;
        }
        return true;
    }

    public CollapsingToolbarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.collapsingToolbarLayoutStyle);
    }

    public void setCollapsedTitleTextColor(@NonNull ColorStateList colorStateList) {
        this.f49029k.setCollapsedTextColor(colorStateList);
    }

    public void setScrimsShown(boolean z, boolean z2) {
        if (this.f49036r != z) {
            if (z2) {
                m45882a(z ? 255 : 0);
            } else {
                setScrimAlpha(z ? 255 : 0);
            }
            this.f49036r = z;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public CollapsingToolbarLayout(@androidx.annotation.NonNull android.content.Context r11, @androidx.annotation.Nullable android.util.AttributeSet r12, int r13) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    /* loaded from: classes4.dex */
    public static class LayoutParams extends FrameLayout.LayoutParams {
        public static final int COLLAPSE_MODE_OFF = 0;
        public static final int COLLAPSE_MODE_PARALLAX = 2;
        public static final int COLLAPSE_MODE_PIN = 1;

        /* renamed from: a */
        public int f49045a;

        /* renamed from: b */
        public float f49046b;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f49045a = 0;
            this.f49046b = 0.5f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CollapsingToolbarLayout_Layout);
            this.f49045a = obtainStyledAttributes.getInt(R.styleable.CollapsingToolbarLayout_Layout_layout_collapseMode, 0);
            setParallaxMultiplier(obtainStyledAttributes.getFloat(R.styleable.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier, 0.5f));
            obtainStyledAttributes.recycle();
        }

        public int getCollapseMode() {
            return this.f49045a;
        }

        public float getParallaxMultiplier() {
            return this.f49046b;
        }

        public void setCollapseMode(int i) {
            this.f49045a = i;
        }

        public void setParallaxMultiplier(float f) {
            this.f49046b = f;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f49045a = 0;
            this.f49046b = 0.5f;
        }

        public LayoutParams(int i, int i2, int i3) {
            super(i, i2, i3);
            this.f49045a = 0;
            this.f49046b = 0.5f;
        }

        public LayoutParams(@NonNull ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f49045a = 0;
            this.f49046b = 0.5f;
        }

        public LayoutParams(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f49045a = 0;
            this.f49046b = 0.5f;
        }

        @RequiresApi(19)
        public LayoutParams(@NonNull FrameLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f49045a = 0;
            this.f49046b = 0.5f;
        }

        @RequiresApi(19)
        public LayoutParams(@NonNull LayoutParams layoutParams) {
            super((FrameLayout.LayoutParams) layoutParams);
            this.f49045a = 0;
            this.f49046b = 0.5f;
            this.f49045a = layoutParams.f49045a;
            this.f49046b = layoutParams.f49046b;
        }
    }
}