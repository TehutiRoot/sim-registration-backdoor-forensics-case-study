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
    public static final int f49001F = R.style.Widget_Design_CollapsingToolbar;
    public static final int TITLE_COLLAPSE_MODE_FADE = 1;
    public static final int TITLE_COLLAPSE_MODE_SCALE = 0;

    /* renamed from: A */
    public WindowInsetsCompat f49002A;

    /* renamed from: B */
    public int f49003B;

    /* renamed from: C */
    public boolean f49004C;

    /* renamed from: D */
    public int f49005D;

    /* renamed from: E */
    public boolean f49006E;

    /* renamed from: a */
    public boolean f49007a;

    /* renamed from: b */
    public int f49008b;

    /* renamed from: c */
    public ViewGroup f49009c;

    /* renamed from: d */
    public View f49010d;

    /* renamed from: e */
    public View f49011e;

    /* renamed from: f */
    public int f49012f;

    /* renamed from: g */
    public int f49013g;

    /* renamed from: h */
    public int f49014h;

    /* renamed from: i */
    public int f49015i;

    /* renamed from: j */
    public final Rect f49016j;

    /* renamed from: k */
    public final CollapsingTextHelper f49017k;

    /* renamed from: l */
    public final ElevationOverlayProvider f49018l;

    /* renamed from: m */
    public boolean f49019m;

    /* renamed from: n */
    public boolean f49020n;

    /* renamed from: o */
    public Drawable f49021o;

    /* renamed from: p */
    public Drawable f49022p;

    /* renamed from: q */
    public int f49023q;

    /* renamed from: r */
    public boolean f49024r;

    /* renamed from: s */
    public ValueAnimator f49025s;

    /* renamed from: t */
    public long f49026t;

    /* renamed from: u */
    public final TimeInterpolator f49027u;

    /* renamed from: v */
    public final TimeInterpolator f49028v;

    /* renamed from: w */
    public int f49029w;

    /* renamed from: x */
    public AppBarLayout.OnOffsetChangedListener f49030x;

    /* renamed from: y */
    public int f49031y;

    /* renamed from: z */
    public int f49032z;

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
    public class C6805a implements OnApplyWindowInsetsListener {
        public C6805a() {
        }

        @Override // androidx.core.view.OnApplyWindowInsetsListener
        public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
            return CollapsingToolbarLayout.this.m45894m(windowInsetsCompat);
        }
    }

    /* renamed from: com.google.android.material.appbar.CollapsingToolbarLayout$b */
    /* loaded from: classes4.dex */
    public class C6806b implements ValueAnimator.AnimatorUpdateListener {
        public C6806b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            CollapsingToolbarLayout.this.setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* renamed from: com.google.android.material.appbar.CollapsingToolbarLayout$c */
    /* loaded from: classes4.dex */
    public class C6807c implements AppBarLayout.OnOffsetChangedListener {
        public C6807c() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
        public void onOffsetChanged(AppBarLayout appBarLayout, int i) {
            int i2;
            int height;
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.f49031y = i;
            WindowInsetsCompat windowInsetsCompat = collapsingToolbarLayout.f49002A;
            if (windowInsetsCompat != null) {
                i2 = windowInsetsCompat.getSystemWindowInsetTop();
            } else {
                i2 = 0;
            }
            int childCount = CollapsingToolbarLayout.this.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = CollapsingToolbarLayout.this.getChildAt(i3);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                W22 m45898i = CollapsingToolbarLayout.m45898i(childAt);
                int i4 = layoutParams.f49033a;
                if (i4 != 1) {
                    if (i4 == 2) {
                        m45898i.m65695j(Math.round((-i) * layoutParams.f49034b));
                    }
                } else {
                    m45898i.m65695j(MathUtils.clamp(-i, 0, CollapsingToolbarLayout.this.m45900g(childAt)));
                }
            }
            CollapsingToolbarLayout.this.m45888s();
            CollapsingToolbarLayout collapsingToolbarLayout2 = CollapsingToolbarLayout.this;
            if (collapsingToolbarLayout2.f49022p != null && i2 > 0) {
                ViewCompat.postInvalidateOnAnimation(collapsingToolbarLayout2);
            }
            int height2 = (CollapsingToolbarLayout.this.getHeight() - ViewCompat.getMinimumHeight(CollapsingToolbarLayout.this)) - i2;
            float f = height2;
            CollapsingToolbarLayout.this.f49017k.setFadeModeStartFraction(Math.min(1.0f, (height - CollapsingToolbarLayout.this.getScrimVisibleHeightTrigger()) / f));
            CollapsingToolbarLayout collapsingToolbarLayout3 = CollapsingToolbarLayout.this;
            collapsingToolbarLayout3.f49017k.setCurrentOffsetY(collapsingToolbarLayout3.f49031y + height2);
            CollapsingToolbarLayout.this.f49017k.setExpansionFraction(Math.abs(i) / f);
        }
    }

    public CollapsingToolbarLayout(@NonNull Context context) {
        this(context, null);
    }

    /* renamed from: f */
    public static int m45901f(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            return view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
        }
        return view.getMeasuredHeight();
    }

    /* renamed from: h */
    public static CharSequence m45899h(View view) {
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getTitle();
        }
        if (view instanceof android.widget.Toolbar) {
            return ((android.widget.Toolbar) view).getTitle();
        }
        return null;
    }

    /* renamed from: i */
    public static W22 m45898i(View view) {
        W22 w22 = (W22) view.getTag(R.id.view_offset_helper);
        if (w22 == null) {
            W22 w222 = new W22(view);
            view.setTag(R.id.view_offset_helper, w222);
            return w222;
        }
        return w22;
    }

    /* renamed from: k */
    public static boolean m45896k(View view) {
        if (!(view instanceof Toolbar) && !(view instanceof android.widget.Toolbar)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void m45906a(int i) {
        TimeInterpolator timeInterpolator;
        m45903d();
        ValueAnimator valueAnimator = this.f49025s;
        if (valueAnimator == null) {
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.f49025s = valueAnimator2;
            if (i > this.f49023q) {
                timeInterpolator = this.f49027u;
            } else {
                timeInterpolator = this.f49028v;
            }
            valueAnimator2.setInterpolator(timeInterpolator);
            this.f49025s.addUpdateListener(new C6806b());
        } else if (valueAnimator.isRunning()) {
            this.f49025s.cancel();
        }
        this.f49025s.setDuration(this.f49026t);
        this.f49025s.setIntValues(this.f49023q, i);
        this.f49025s.start();
    }

    /* renamed from: b */
    public final TextUtils.TruncateAt m45905b(int i) {
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
    public final void m45904c(AppBarLayout appBarLayout) {
        if (m45897j()) {
            appBarLayout.setLiftOnScroll(false);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* renamed from: d */
    public final void m45903d() {
        if (!this.f49007a) {
            return;
        }
        ViewGroup viewGroup = null;
        this.f49009c = null;
        this.f49010d = null;
        int i = this.f49008b;
        if (i != -1) {
            ViewGroup viewGroup2 = (ViewGroup) findViewById(i);
            this.f49009c = viewGroup2;
            if (viewGroup2 != null) {
                this.f49010d = m45902e(viewGroup2);
            }
        }
        if (this.f49009c == null) {
            int childCount = getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 >= childCount) {
                    break;
                }
                View childAt = getChildAt(i2);
                if (m45896k(childAt)) {
                    viewGroup = (ViewGroup) childAt;
                    break;
                }
                i2++;
            }
            this.f49009c = viewGroup;
        }
        m45889r();
        this.f49007a = false;
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        int i;
        Drawable drawable;
        super.draw(canvas);
        m45903d();
        if (this.f49009c == null && (drawable = this.f49021o) != null && this.f49023q > 0) {
            drawable.mutate().setAlpha(this.f49023q);
            this.f49021o.draw(canvas);
        }
        if (this.f49019m && this.f49020n) {
            if (this.f49009c != null && this.f49021o != null && this.f49023q > 0 && m45897j() && this.f49017k.getExpansionFraction() < this.f49017k.getFadeModeThresholdFraction()) {
                int save = canvas.save();
                canvas.clipRect(this.f49021o.getBounds(), Region.Op.DIFFERENCE);
                this.f49017k.draw(canvas);
                canvas.restoreToCount(save);
            } else {
                this.f49017k.draw(canvas);
            }
        }
        if (this.f49022p != null && this.f49023q > 0) {
            WindowInsetsCompat windowInsetsCompat = this.f49002A;
            if (windowInsetsCompat != null) {
                i = windowInsetsCompat.getSystemWindowInsetTop();
            } else {
                i = 0;
            }
            if (i > 0) {
                this.f49022p.setBounds(0, -this.f49031y, getWidth(), i - this.f49031y);
                this.f49022p.mutate().setAlpha(this.f49023q);
                this.f49022p.draw(canvas);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        if (this.f49021o != null && this.f49023q > 0 && m45895l(view)) {
            m45890q(this.f49021o, view, getWidth(), getHeight());
            this.f49021o.mutate().setAlpha(this.f49023q);
            this.f49021o.draw(canvas);
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
        Drawable drawable = this.f49022p;
        if (drawable != null && drawable.isStateful()) {
            z = drawable.setState(drawableState);
        } else {
            z = false;
        }
        Drawable drawable2 = this.f49021o;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        CollapsingTextHelper collapsingTextHelper = this.f49017k;
        if (collapsingTextHelper != null) {
            z |= collapsingTextHelper.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* renamed from: e */
    public final View m45902e(View view) {
        for (ViewParent parent = view.getParent(); parent != this && parent != null; parent = parent.getParent()) {
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return view;
    }

    /* renamed from: g */
    public final int m45900g(View view) {
        return ((getHeight() - m45898i(view).m65703b()) - view.getHeight()) - ((FrameLayout.LayoutParams) ((LayoutParams) view.getLayoutParams())).bottomMargin;
    }

    public int getCollapsedTitleGravity() {
        return this.f49017k.getCollapsedTextGravity();
    }

    public float getCollapsedTitleTextSize() {
        return this.f49017k.getCollapsedTextSize();
    }

    @NonNull
    public Typeface getCollapsedTitleTypeface() {
        return this.f49017k.getCollapsedTypeface();
    }

    @Nullable
    public Drawable getContentScrim() {
        return this.f49021o;
    }

    public int getExpandedTitleGravity() {
        return this.f49017k.getExpandedTextGravity();
    }

    public int getExpandedTitleMarginBottom() {
        return this.f49015i;
    }

    public int getExpandedTitleMarginEnd() {
        return this.f49014h;
    }

    public int getExpandedTitleMarginStart() {
        return this.f49012f;
    }

    public int getExpandedTitleMarginTop() {
        return this.f49013g;
    }

    public float getExpandedTitleTextSize() {
        return this.f49017k.getExpandedTextSize();
    }

    @NonNull
    public Typeface getExpandedTitleTypeface() {
        return this.f49017k.getExpandedTypeface();
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getHyphenationFrequency() {
        return this.f49017k.getHyphenationFrequency();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getLineCount() {
        return this.f49017k.getLineCount();
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public float getLineSpacingAdd() {
        return this.f49017k.getLineSpacingAdd();
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public float getLineSpacingMultiplier() {
        return this.f49017k.getLineSpacingMultiplier();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getMaxLines() {
        return this.f49017k.getMaxLines();
    }

    public int getScrimAlpha() {
        return this.f49023q;
    }

    public long getScrimAnimationDuration() {
        return this.f49026t;
    }

    public int getScrimVisibleHeightTrigger() {
        int i;
        int i2 = this.f49029w;
        if (i2 >= 0) {
            return i2 + this.f49003B + this.f49005D;
        }
        WindowInsetsCompat windowInsetsCompat = this.f49002A;
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
        return this.f49022p;
    }

    @Nullable
    public CharSequence getTitle() {
        if (this.f49019m) {
            return this.f49017k.getText();
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.f49032z;
    }

    @Nullable
    public TimeInterpolator getTitlePositionInterpolator() {
        return this.f49017k.getPositionInterpolator();
    }

    @NonNull
    public TextUtils.TruncateAt getTitleTextEllipsize() {
        return this.f49017k.getTitleTextEllipsize();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isExtraMultilineHeightEnabled() {
        return this.f49006E;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isForceApplySystemWindowInsetTop() {
        return this.f49004C;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isRtlTextDirectionHeuristicsEnabled() {
        return this.f49017k.isRtlTextDirectionHeuristicsEnabled();
    }

    public boolean isTitleEnabled() {
        return this.f49019m;
    }

    /* renamed from: j */
    public final boolean m45897j() {
        if (this.f49032z == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public final boolean m45895l(View view) {
        View view2 = this.f49010d;
        if (view2 != null && view2 != this) {
            if (view != view2) {
                return false;
            }
        } else if (view != this.f49009c) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public WindowInsetsCompat m45894m(WindowInsetsCompat windowInsetsCompat) {
        WindowInsetsCompat windowInsetsCompat2;
        if (ViewCompat.getFitsSystemWindows(this)) {
            windowInsetsCompat2 = windowInsetsCompat;
        } else {
            windowInsetsCompat2 = null;
        }
        if (!ObjectsCompat.equals(this.f49002A, windowInsetsCompat2)) {
            this.f49002A = windowInsetsCompat2;
            requestLayout();
        }
        return windowInsetsCompat.consumeSystemWindowInsets();
    }

    /* renamed from: n */
    public final void m45893n(boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        View view = this.f49010d;
        if (view == null) {
            view = this.f49009c;
        }
        int m45900g = m45900g(view);
        DescendantOffsetUtils.getDescendantRect(this, this.f49011e, this.f49016j);
        ViewGroup viewGroup = this.f49009c;
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
        CollapsingTextHelper collapsingTextHelper = this.f49017k;
        Rect rect = this.f49016j;
        int i6 = rect.left;
        if (z) {
            i5 = i3;
        } else {
            i5 = i;
        }
        int i7 = i6 + i5;
        int i8 = rect.top + m45900g + i4;
        int i9 = rect.right;
        if (!z) {
            i = i3;
        }
        collapsingTextHelper.setCollapsedBounds(i7, i8, i9 - i, (rect.bottom + m45900g) - i2);
    }

    /* renamed from: o */
    public final void m45892o() {
        setContentDescription(getTitle());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            m45904c(appBarLayout);
            ViewCompat.setFitsSystemWindows(this, ViewCompat.getFitsSystemWindows(appBarLayout));
            if (this.f49030x == null) {
                this.f49030x = new C6807c();
            }
            appBarLayout.addOnOffsetChangedListener(this.f49030x);
            ViewCompat.requestApplyInsets(this);
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f49017k.maybeUpdateFontWeightAdjustment(configuration);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        ViewParent parent = getParent();
        AppBarLayout.OnOffsetChangedListener onOffsetChangedListener = this.f49030x;
        if (onOffsetChangedListener != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).removeOnOffsetChangedListener(onOffsetChangedListener);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        WindowInsetsCompat windowInsetsCompat = this.f49002A;
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
            m45898i(getChildAt(i6)).m65698g();
        }
        m45887t(i, i2, i3, i4, false);
        m45886u();
        m45888s();
        int childCount3 = getChildCount();
        for (int i7 = 0; i7 < childCount3; i7++) {
            m45898i(getChildAt(i7)).m65704a();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        m45903d();
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        WindowInsetsCompat windowInsetsCompat = this.f49002A;
        if (windowInsetsCompat != null) {
            i3 = windowInsetsCompat.getSystemWindowInsetTop();
        } else {
            i3 = 0;
        }
        if ((mode == 0 || this.f49004C) && i3 > 0) {
            this.f49003B = i3;
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + i3, 1073741824));
        }
        if (this.f49006E && this.f49017k.getMaxLines() > 1) {
            m45886u();
            m45887t(0, 0, getMeasuredWidth(), getMeasuredHeight(), true);
            int expandedLineCount = this.f49017k.getExpandedLineCount();
            if (expandedLineCount > 1) {
                this.f49005D = Math.round(this.f49017k.getExpandedTextFullHeight()) * (expandedLineCount - 1);
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + this.f49005D, 1073741824));
            }
        }
        ViewGroup viewGroup = this.f49009c;
        if (viewGroup != null) {
            View view = this.f49010d;
            if (view != null && view != this) {
                setMinimumHeight(m45901f(view));
            } else {
                setMinimumHeight(m45901f(viewGroup));
            }
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.f49021o;
        if (drawable != null) {
            m45891p(drawable, i, i2);
        }
    }

    /* renamed from: p */
    public final void m45891p(Drawable drawable, int i, int i2) {
        m45890q(drawable, this.f49009c, i, i2);
    }

    /* renamed from: q */
    public final void m45890q(Drawable drawable, View view, int i, int i2) {
        if (m45897j() && view != null && this.f49019m) {
            i2 = view.getBottom();
        }
        drawable.setBounds(0, 0, i, i2);
    }

    /* renamed from: r */
    public final void m45889r() {
        View view;
        if (!this.f49019m && (view = this.f49011e) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f49011e);
            }
        }
        if (this.f49019m && this.f49009c != null) {
            if (this.f49011e == null) {
                this.f49011e = new View(getContext());
            }
            if (this.f49011e.getParent() == null) {
                this.f49009c.addView(this.f49011e, -1, -1);
            }
        }
    }

    /* renamed from: s */
    public final void m45888s() {
        boolean z;
        if (this.f49021o != null || this.f49022p != null) {
            if (getHeight() + this.f49031y < getScrimVisibleHeightTrigger()) {
                z = true;
            } else {
                z = false;
            }
            setScrimsShown(z);
        }
    }

    public void setCollapsedTitleGravity(int i) {
        this.f49017k.setCollapsedTextGravity(i);
    }

    public void setCollapsedTitleTextAppearance(@StyleRes int i) {
        this.f49017k.setCollapsedTextAppearance(i);
    }

    public void setCollapsedTitleTextColor(@ColorInt int i) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapsedTitleTextSize(float f) {
        this.f49017k.setCollapsedTextSize(f);
    }

    public void setCollapsedTitleTypeface(@Nullable Typeface typeface) {
        this.f49017k.setCollapsedTypeface(typeface);
    }

    public void setContentScrim(@Nullable Drawable drawable) {
        Drawable drawable2 = this.f49021o;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f49021o = drawable3;
            if (drawable3 != null) {
                m45891p(drawable3, getWidth(), getHeight());
                this.f49021o.setCallback(this);
                this.f49021o.setAlpha(this.f49023q);
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
        this.f49017k.setExpandedTextGravity(i);
    }

    public void setExpandedTitleMargin(int i, int i2, int i3, int i4) {
        this.f49012f = i;
        this.f49013g = i2;
        this.f49014h = i3;
        this.f49015i = i4;
        requestLayout();
    }

    public void setExpandedTitleMarginBottom(int i) {
        this.f49015i = i;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i) {
        this.f49014h = i;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i) {
        this.f49012f = i;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i) {
        this.f49013g = i;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(@StyleRes int i) {
        this.f49017k.setExpandedTextAppearance(i);
    }

    public void setExpandedTitleTextColor(@NonNull ColorStateList colorStateList) {
        this.f49017k.setExpandedTextColor(colorStateList);
    }

    public void setExpandedTitleTextSize(float f) {
        this.f49017k.setExpandedTextSize(f);
    }

    public void setExpandedTitleTypeface(@Nullable Typeface typeface) {
        this.f49017k.setExpandedTypeface(typeface);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setExtraMultilineHeightEnabled(boolean z) {
        this.f49006E = z;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setForceApplySystemWindowInsetTop(boolean z) {
        this.f49004C = z;
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setHyphenationFrequency(int i) {
        this.f49017k.setHyphenationFrequency(i);
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setLineSpacingAdd(float f) {
        this.f49017k.setLineSpacingAdd(f);
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setLineSpacingMultiplier(@FloatRange(from = 0.0d) float f) {
        this.f49017k.setLineSpacingMultiplier(f);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setMaxLines(int i) {
        this.f49017k.setMaxLines(i);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setRtlTextDirectionHeuristicsEnabled(boolean z) {
        this.f49017k.setRtlTextDirectionHeuristicsEnabled(z);
    }

    public void setScrimAlpha(int i) {
        ViewGroup viewGroup;
        if (i != this.f49023q) {
            if (this.f49021o != null && (viewGroup = this.f49009c) != null) {
                ViewCompat.postInvalidateOnAnimation(viewGroup);
            }
            this.f49023q = i;
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public void setScrimAnimationDuration(@IntRange(from = 0) long j) {
        this.f49026t = j;
    }

    public void setScrimVisibleHeightTrigger(@IntRange(from = 0) int i) {
        if (this.f49029w != i) {
            this.f49029w = i;
            m45888s();
        }
    }

    public void setScrimsShown(boolean z) {
        setScrimsShown(z, ViewCompat.isLaidOut(this) && !isInEditMode());
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setStaticLayoutBuilderConfigurer(@Nullable StaticLayoutBuilderConfigurer staticLayoutBuilderConfigurer) {
        this.f49017k.setStaticLayoutBuilderConfigurer(staticLayoutBuilderConfigurer);
    }

    public void setStatusBarScrim(@Nullable Drawable drawable) {
        boolean z;
        Drawable drawable2 = this.f49022p;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f49022p = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f49022p.setState(getDrawableState());
                }
                DrawableCompat.setLayoutDirection(this.f49022p, ViewCompat.getLayoutDirection(this));
                Drawable drawable4 = this.f49022p;
                if (getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                drawable4.setVisible(z, false);
                this.f49022p.setCallback(this);
                this.f49022p.setAlpha(this.f49023q);
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
        this.f49017k.setText(charSequence);
        m45892o();
    }

    public void setTitleCollapseMode(int i) {
        this.f49032z = i;
        boolean m45897j = m45897j();
        this.f49017k.setFadeModeEnabled(m45897j);
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            m45904c((AppBarLayout) parent);
        }
        if (m45897j && this.f49021o == null) {
            setContentScrimColor(this.f49018l.compositeOverlayWithThemeSurfaceColorIfNeeded(getResources().getDimension(R.dimen.design_appbar_elevation)));
        }
    }

    public void setTitleEllipsize(@NonNull TextUtils.TruncateAt truncateAt) {
        this.f49017k.setTitleTextEllipsize(truncateAt);
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.f49019m) {
            this.f49019m = z;
            m45892o();
            m45889r();
            requestLayout();
        }
    }

    public void setTitlePositionInterpolator(@Nullable TimeInterpolator timeInterpolator) {
        this.f49017k.setPositionInterpolator(timeInterpolator);
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
        Drawable drawable = this.f49022p;
        if (drawable != null && drawable.isVisible() != z) {
            this.f49022p.setVisible(z, false);
        }
        Drawable drawable2 = this.f49021o;
        if (drawable2 != null && drawable2.isVisible() != z) {
            this.f49021o.setVisible(z, false);
        }
    }

    /* renamed from: t */
    public final void m45887t(int i, int i2, int i3, int i4, boolean z) {
        View view;
        boolean z2;
        int i5;
        int i6;
        if (this.f49019m && (view = this.f49011e) != null) {
            boolean z3 = false;
            if (ViewCompat.isAttachedToWindow(view) && this.f49011e.getVisibility() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f49020n = z2;
            if (z2 || z) {
                if (ViewCompat.getLayoutDirection(this) == 1) {
                    z3 = true;
                }
                m45893n(z3);
                CollapsingTextHelper collapsingTextHelper = this.f49017k;
                if (z3) {
                    i5 = this.f49014h;
                } else {
                    i5 = this.f49012f;
                }
                int i7 = this.f49016j.top + this.f49013g;
                int i8 = i3 - i;
                if (z3) {
                    i6 = this.f49012f;
                } else {
                    i6 = this.f49014h;
                }
                collapsingTextHelper.setExpandedBounds(i5, i7, i8 - i6, (i4 - i2) - this.f49015i);
                this.f49017k.recalculate(z);
            }
        }
    }

    /* renamed from: u */
    public final void m45886u() {
        if (this.f49009c != null && this.f49019m && TextUtils.isEmpty(this.f49017k.getText())) {
            setTitle(m45899h(this.f49009c));
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(@NonNull Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f49021o && drawable != this.f49022p) {
            return false;
        }
        return true;
    }

    public CollapsingToolbarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.collapsingToolbarLayoutStyle);
    }

    public void setCollapsedTitleTextColor(@NonNull ColorStateList colorStateList) {
        this.f49017k.setCollapsedTextColor(colorStateList);
    }

    public void setScrimsShown(boolean z, boolean z2) {
        if (this.f49024r != z) {
            if (z2) {
                m45906a(z ? 255 : 0);
            } else {
                setScrimAlpha(z ? 255 : 0);
            }
            this.f49024r = z;
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
        public int f49033a;

        /* renamed from: b */
        public float f49034b;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f49033a = 0;
            this.f49034b = 0.5f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CollapsingToolbarLayout_Layout);
            this.f49033a = obtainStyledAttributes.getInt(R.styleable.CollapsingToolbarLayout_Layout_layout_collapseMode, 0);
            setParallaxMultiplier(obtainStyledAttributes.getFloat(R.styleable.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier, 0.5f));
            obtainStyledAttributes.recycle();
        }

        public int getCollapseMode() {
            return this.f49033a;
        }

        public float getParallaxMultiplier() {
            return this.f49034b;
        }

        public void setCollapseMode(int i) {
            this.f49033a = i;
        }

        public void setParallaxMultiplier(float f) {
            this.f49034b = f;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f49033a = 0;
            this.f49034b = 0.5f;
        }

        public LayoutParams(int i, int i2, int i3) {
            super(i, i2, i3);
            this.f49033a = 0;
            this.f49034b = 0.5f;
        }

        public LayoutParams(@NonNull ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f49033a = 0;
            this.f49034b = 0.5f;
        }

        public LayoutParams(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f49033a = 0;
            this.f49034b = 0.5f;
        }

        @RequiresApi(19)
        public LayoutParams(@NonNull FrameLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f49033a = 0;
            this.f49034b = 0.5f;
        }

        @RequiresApi(19)
        public LayoutParams(@NonNull LayoutParams layoutParams) {
            super((FrameLayout.LayoutParams) layoutParams);
            this.f49033a = 0;
            this.f49034b = 0.5f;
            this.f49033a = layoutParams.f49033a;
            this.f49034b = layoutParams.f49034b;
        }
    }
}
