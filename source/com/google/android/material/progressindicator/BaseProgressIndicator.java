package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.ProgressBar;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.InterfaceC2055Px;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.google.android.material.R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;

/* loaded from: classes4.dex */
public abstract class BaseProgressIndicator<S extends BaseProgressIndicatorSpec> extends ProgressBar {
    public static final int HIDE_INWARD = 2;
    public static final int HIDE_NONE = 0;
    public static final int HIDE_OUTWARD = 1;
    public static final int SHOW_INWARD = 2;
    public static final int SHOW_NONE = 0;
    public static final int SHOW_OUTWARD = 1;

    /* renamed from: o */
    public static final int f50425o = R.style.Widget_MaterialComponents_ProgressIndicator;

    /* renamed from: a */
    public BaseProgressIndicatorSpec f50426a;

    /* renamed from: b */
    public int f50427b;

    /* renamed from: c */
    public boolean f50428c;

    /* renamed from: d */
    public boolean f50429d;

    /* renamed from: e */
    public final int f50430e;

    /* renamed from: f */
    public final int f50431f;

    /* renamed from: g */
    public long f50432g;

    /* renamed from: h */
    public AnimatorDurationScaleProvider f50433h;

    /* renamed from: i */
    public boolean f50434i;

    /* renamed from: j */
    public int f50435j;

    /* renamed from: k */
    public final Runnable f50436k;

    /* renamed from: l */
    public final Runnable f50437l;

    /* renamed from: m */
    public final Animatable2Compat.AnimationCallback f50438m;

    /* renamed from: n */
    public final Animatable2Compat.AnimationCallback f50439n;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes4.dex */
    public @interface HideAnimationBehavior {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes4.dex */
    public @interface ShowAnimationBehavior {
    }

    /* renamed from: com.google.android.material.progressindicator.BaseProgressIndicator$a */
    /* loaded from: classes4.dex */
    public class RunnableC7023a implements Runnable {
        public RunnableC7023a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseProgressIndicator.this.m44443j();
        }
    }

    /* renamed from: com.google.android.material.progressindicator.BaseProgressIndicator$b */
    /* loaded from: classes4.dex */
    public class RunnableC7024b implements Runnable {
        public RunnableC7024b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseProgressIndicator.this.m44444i();
            BaseProgressIndicator.this.f50432g = -1L;
        }
    }

    /* renamed from: com.google.android.material.progressindicator.BaseProgressIndicator$c */
    /* loaded from: classes4.dex */
    public class C7025c extends Animatable2Compat.AnimationCallback {
        public C7025c() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
        public void onAnimationEnd(Drawable drawable) {
            BaseProgressIndicator.this.setIndeterminate(false);
            BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
            baseProgressIndicator.setProgressCompat(baseProgressIndicator.f50427b, BaseProgressIndicator.this.f50428c);
        }
    }

    /* renamed from: com.google.android.material.progressindicator.BaseProgressIndicator$d */
    /* loaded from: classes4.dex */
    public class C7026d extends Animatable2Compat.AnimationCallback {
        public C7026d() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
        public void onAnimationEnd(Drawable drawable) {
            super.onAnimationEnd(drawable);
            if (!BaseProgressIndicator.this.f50434i) {
                BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
                baseProgressIndicator.setVisibility(baseProgressIndicator.f50435j);
            }
        }
    }

    public BaseProgressIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, f50425o), attributeSet, i);
        this.f50432g = -1L;
        this.f50434i = false;
        this.f50435j = 4;
        this.f50436k = new RunnableC7023a();
        this.f50437l = new RunnableC7024b();
        this.f50438m = new C7025c();
        this.f50439n = new C7026d();
        Context context2 = getContext();
        this.f50426a = mo44420h(context2, attributeSet);
        TypedArray obtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, R.styleable.BaseProgressIndicator, i, i2, new int[0]);
        this.f50430e = obtainStyledAttributes.getInt(R.styleable.BaseProgressIndicator_showDelay, -1);
        this.f50431f = Math.min(obtainStyledAttributes.getInt(R.styleable.BaseProgressIndicator_minHideDelay, -1), 1000);
        obtainStyledAttributes.recycle();
        this.f50433h = new AnimatorDurationScaleProvider();
        this.f50429d = true;
    }

    @Nullable
    private AbstractC17040xK getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().m44423o();
        } else if (getProgressDrawable() == null) {
            return null;
        } else {
            return getProgressDrawable().m44431p();
        }
    }

    public void applyNewVisibility(boolean z) {
        if (!this.f50429d) {
            return;
        }
        ((AbstractC7028a) getCurrentDrawable()).setVisible(m44438o(), false, z);
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public Drawable getCurrentDrawable() {
        if (isIndeterminate()) {
            return getIndeterminateDrawable();
        }
        return getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.f50426a.hideAnimationBehavior;
    }

    @NonNull
    public int[] getIndicatorColor() {
        return this.f50426a.indicatorColors;
    }

    public int getShowAnimationBehavior() {
        return this.f50426a.showAnimationBehavior;
    }

    @ColorInt
    public int getTrackColor() {
        return this.f50426a.trackColor;
    }

    @InterfaceC2055Px
    public int getTrackCornerRadius() {
        return this.f50426a.trackCornerRadius;
    }

    @InterfaceC2055Px
    public int getTrackThickness() {
        return this.f50426a.trackThickness;
    }

    /* renamed from: h */
    public abstract BaseProgressIndicatorSpec mo44420h(Context context, AttributeSet attributeSet);

    public void hide() {
        if (getVisibility() != 0) {
            removeCallbacks(this.f50436k);
            return;
        }
        removeCallbacks(this.f50437l);
        long uptimeMillis = SystemClock.uptimeMillis() - this.f50432g;
        int i = this.f50431f;
        if (uptimeMillis >= i) {
            this.f50437l.run();
        } else {
            postDelayed(this.f50437l, i - uptimeMillis);
        }
    }

    /* renamed from: i */
    public final void m44444i() {
        ((AbstractC7028a) getCurrentDrawable()).setVisible(false, false, true);
        if (m44441l()) {
            setVisibility(4);
        }
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    /* renamed from: j */
    public final void m44443j() {
        if (this.f50431f > 0) {
            this.f50432g = SystemClock.uptimeMillis();
        }
        setVisibility(0);
    }

    /* renamed from: k */
    public boolean m44442k() {
        View view = this;
        while (view.getVisibility() == 0) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                if (getWindowVisibility() != 0) {
                    return false;
                }
                return true;
            } else if (!(parent instanceof View)) {
                return true;
            } else {
                view = (View) parent;
            }
        }
        return false;
    }

    /* renamed from: l */
    public final boolean m44441l() {
        if ((getProgressDrawable() != null && getProgressDrawable().isVisible()) || (getIndeterminateDrawable() != null && getIndeterminateDrawable().isVisible())) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public final void m44440m() {
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().m44424n().mo51885d(this.f50438m);
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().registerAnimationCallback(this.f50439n);
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().registerAnimationCallback(this.f50439n);
        }
    }

    /* renamed from: n */
    public final void m44439n() {
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().unregisterAnimationCallback(this.f50439n);
            getIndeterminateDrawable().m44424n().mo51882h();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().unregisterAnimationCallback(this.f50439n);
        }
    }

    /* renamed from: o */
    public boolean m44438o() {
        if (ViewCompat.isAttachedToWindow(this) && getWindowVisibility() == 0 && m44442k()) {
            return true;
        }
        return false;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m44440m();
        if (m44438o()) {
            m44443j();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f50437l);
        removeCallbacks(this.f50436k);
        ((AbstractC7028a) getCurrentDrawable()).hideNow();
        m44439n();
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(@NonNull Canvas canvas) {
        try {
            int save = canvas.save();
            if (getPaddingLeft() == 0) {
                if (getPaddingTop() != 0) {
                }
                if (getPaddingRight() == 0 || getPaddingBottom() != 0) {
                    canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
                }
                getCurrentDrawable().draw(canvas);
                canvas.restoreToCount(save);
            }
            canvas.translate(getPaddingLeft(), getPaddingTop());
            if (getPaddingRight() == 0) {
            }
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
            getCurrentDrawable().draw(canvas);
            canvas.restoreToCount(save);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public synchronized void onMeasure(int i, int i2) {
        int mo536e;
        int mo537d;
        try {
            AbstractC17040xK currentDrawingDelegate = getCurrentDrawingDelegate();
            if (currentDrawingDelegate == null) {
                return;
            }
            if (currentDrawingDelegate.mo536e() < 0) {
                mo536e = View.getDefaultSize(getSuggestedMinimumWidth(), i);
            } else {
                mo536e = currentDrawingDelegate.mo536e() + getPaddingLeft() + getPaddingRight();
            }
            if (currentDrawingDelegate.mo537d() < 0) {
                mo537d = View.getDefaultSize(getSuggestedMinimumHeight(), i2);
            } else {
                mo537d = currentDrawingDelegate.mo537d() + getPaddingTop() + getPaddingBottom();
            }
            setMeasuredDimension(mo536e, mo537d);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i) {
        boolean z;
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        applyNewVisibility(z);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        applyNewVisibility(false);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public void setAnimatorDurationScaleProvider(@NonNull AnimatorDurationScaleProvider animatorDurationScaleProvider) {
        this.f50433h = animatorDurationScaleProvider;
        if (getProgressDrawable() != null) {
            getProgressDrawable().f50456c = animatorDurationScaleProvider;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f50456c = animatorDurationScaleProvider;
        }
    }

    public void setHideAnimationBehavior(int i) {
        this.f50426a.hideAnimationBehavior = i;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z) {
        try {
            if (z == isIndeterminate()) {
                return;
            }
            AbstractC7028a abstractC7028a = (AbstractC7028a) getCurrentDrawable();
            if (abstractC7028a != null) {
                abstractC7028a.hideNow();
            }
            super.setIndeterminate(z);
            AbstractC7028a abstractC7028a2 = (AbstractC7028a) getCurrentDrawable();
            if (abstractC7028a2 != null) {
                abstractC7028a2.setVisible(m44438o(), false, false);
            }
            if ((abstractC7028a2 instanceof IndeterminateDrawable) && m44438o()) {
                ((IndeterminateDrawable) abstractC7028a2).m44424n().mo51883g();
            }
            this.f50434i = false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(@Nullable Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else if (drawable instanceof IndeterminateDrawable) {
            ((AbstractC7028a) drawable).hideNow();
            super.setIndeterminateDrawable(drawable);
        } else {
            throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
        }
    }

    public void setIndicatorColor(@ColorInt int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{MaterialColors.getColor(getContext(), R.attr.colorPrimary, -1)};
        }
        if (!Arrays.equals(getIndicatorColor(), iArr)) {
            this.f50426a.indicatorColors = iArr;
            getIndeterminateDrawable().m44424n().mo51886c();
            invalidate();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i) {
        if (isIndeterminate()) {
            return;
        }
        setProgressCompat(i, false);
    }

    public void setProgressCompat(int i, boolean z) {
        if (isIndeterminate()) {
            if (getProgressDrawable() != null) {
                this.f50427b = i;
                this.f50428c = z;
                this.f50434i = true;
                if (getIndeterminateDrawable().isVisible() && this.f50433h.getSystemAnimatorDurationScale(getContext().getContentResolver()) != 0.0f) {
                    getIndeterminateDrawable().m44424n().mo51884f();
                    return;
                } else {
                    this.f50438m.onAnimationEnd(getIndeterminateDrawable());
                    return;
                }
            }
            return;
        }
        super.setProgress(i);
        if (getProgressDrawable() != null && !z) {
            getProgressDrawable().jumpToCurrentState();
        }
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(@Nullable Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable(null);
        } else if (drawable instanceof DeterminateDrawable) {
            DeterminateDrawable determinateDrawable = (DeterminateDrawable) drawable;
            determinateDrawable.hideNow();
            super.setProgressDrawable(determinateDrawable);
            determinateDrawable.m44427t(getProgress() / getMax());
        } else {
            throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
        }
    }

    public void setShowAnimationBehavior(int i) {
        this.f50426a.showAnimationBehavior = i;
        invalidate();
    }

    public void setTrackColor(@ColorInt int i) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.f50426a;
        if (baseProgressIndicatorSpec.trackColor != i) {
            baseProgressIndicatorSpec.trackColor = i;
            invalidate();
        }
    }

    public void setTrackCornerRadius(@InterfaceC2055Px int i) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.f50426a;
        if (baseProgressIndicatorSpec.trackCornerRadius != i) {
            baseProgressIndicatorSpec.trackCornerRadius = Math.min(i, baseProgressIndicatorSpec.trackThickness / 2);
        }
    }

    public void setTrackThickness(@InterfaceC2055Px int i) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.f50426a;
        if (baseProgressIndicatorSpec.trackThickness != i) {
            baseProgressIndicatorSpec.trackThickness = i;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i) {
        if (i != 0 && i != 4 && i != 8) {
            throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.f50435j = i;
    }

    public void show() {
        if (this.f50430e > 0) {
            removeCallbacks(this.f50436k);
            postDelayed(this.f50436k, this.f50430e);
            return;
        }
        this.f50436k.run();
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public IndeterminateDrawable<S> getIndeterminateDrawable() {
        return (IndeterminateDrawable) super.getIndeterminateDrawable();
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public DeterminateDrawable<S> getProgressDrawable() {
        return (DeterminateDrawable) super.getProgressDrawable();
    }
}
