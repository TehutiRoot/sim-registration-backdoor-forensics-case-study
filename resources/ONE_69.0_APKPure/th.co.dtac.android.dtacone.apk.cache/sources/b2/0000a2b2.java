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
import androidx.annotation.InterfaceC2037Px;
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
    public static final int f50437o = R.style.Widget_MaterialComponents_ProgressIndicator;

    /* renamed from: a */
    public BaseProgressIndicatorSpec f50438a;

    /* renamed from: b */
    public int f50439b;

    /* renamed from: c */
    public boolean f50440c;

    /* renamed from: d */
    public boolean f50441d;

    /* renamed from: e */
    public final int f50442e;

    /* renamed from: f */
    public final int f50443f;

    /* renamed from: g */
    public long f50444g;

    /* renamed from: h */
    public AnimatorDurationScaleProvider f50445h;

    /* renamed from: i */
    public boolean f50446i;

    /* renamed from: j */
    public int f50447j;

    /* renamed from: k */
    public final Runnable f50448k;

    /* renamed from: l */
    public final Runnable f50449l;

    /* renamed from: m */
    public final Animatable2Compat.AnimationCallback f50450m;

    /* renamed from: n */
    public final Animatable2Compat.AnimationCallback f50451n;

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
    public class RunnableC7012a implements Runnable {
        public RunnableC7012a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseProgressIndicator.this.m44430j();
        }
    }

    /* renamed from: com.google.android.material.progressindicator.BaseProgressIndicator$b */
    /* loaded from: classes4.dex */
    public class RunnableC7013b implements Runnable {
        public RunnableC7013b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseProgressIndicator.this.m44431i();
            BaseProgressIndicator.this.f50444g = -1L;
        }
    }

    /* renamed from: com.google.android.material.progressindicator.BaseProgressIndicator$c */
    /* loaded from: classes4.dex */
    public class C7014c extends Animatable2Compat.AnimationCallback {
        public C7014c() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
        public void onAnimationEnd(Drawable drawable) {
            BaseProgressIndicator.this.setIndeterminate(false);
            BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
            baseProgressIndicator.setProgressCompat(baseProgressIndicator.f50439b, BaseProgressIndicator.this.f50440c);
        }
    }

    /* renamed from: com.google.android.material.progressindicator.BaseProgressIndicator$d */
    /* loaded from: classes4.dex */
    public class C7015d extends Animatable2Compat.AnimationCallback {
        public C7015d() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
        public void onAnimationEnd(Drawable drawable) {
            super.onAnimationEnd(drawable);
            if (!BaseProgressIndicator.this.f50446i) {
                BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
                baseProgressIndicator.setVisibility(baseProgressIndicator.f50447j);
            }
        }
    }

    public BaseProgressIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, f50437o), attributeSet, i);
        this.f50444g = -1L;
        this.f50446i = false;
        this.f50447j = 4;
        this.f50448k = new RunnableC7012a();
        this.f50449l = new RunnableC7013b();
        this.f50450m = new C7014c();
        this.f50451n = new C7015d();
        Context context2 = getContext();
        this.f50438a = mo44407h(context2, attributeSet);
        TypedArray obtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, R.styleable.BaseProgressIndicator, i, i2, new int[0]);
        this.f50442e = obtainStyledAttributes.getInt(R.styleable.BaseProgressIndicator_showDelay, -1);
        this.f50443f = Math.min(obtainStyledAttributes.getInt(R.styleable.BaseProgressIndicator_minHideDelay, -1), 1000);
        obtainStyledAttributes.recycle();
        this.f50445h = new AnimatorDurationScaleProvider();
        this.f50441d = true;
    }

    @Nullable
    private AbstractC17122yK getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().m44410o();
        } else if (getProgressDrawable() == null) {
            return null;
        } else {
            return getProgressDrawable().m44418p();
        }
    }

    public void applyNewVisibility(boolean z) {
        if (!this.f50441d) {
            return;
        }
        ((AbstractC7017a) getCurrentDrawable()).setVisible(m44425o(), false, z);
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
        return this.f50438a.hideAnimationBehavior;
    }

    @NonNull
    public int[] getIndicatorColor() {
        return this.f50438a.indicatorColors;
    }

    public int getShowAnimationBehavior() {
        return this.f50438a.showAnimationBehavior;
    }

    @ColorInt
    public int getTrackColor() {
        return this.f50438a.trackColor;
    }

    @InterfaceC2037Px
    public int getTrackCornerRadius() {
        return this.f50438a.trackCornerRadius;
    }

    @InterfaceC2037Px
    public int getTrackThickness() {
        return this.f50438a.trackThickness;
    }

    /* renamed from: h */
    public abstract BaseProgressIndicatorSpec mo44407h(Context context, AttributeSet attributeSet);

    public void hide() {
        if (getVisibility() != 0) {
            removeCallbacks(this.f50448k);
            return;
        }
        removeCallbacks(this.f50449l);
        long uptimeMillis = SystemClock.uptimeMillis() - this.f50444g;
        int i = this.f50443f;
        if (uptimeMillis >= i) {
            this.f50449l.run();
        } else {
            postDelayed(this.f50449l, i - uptimeMillis);
        }
    }

    /* renamed from: i */
    public final void m44431i() {
        ((AbstractC7017a) getCurrentDrawable()).setVisible(false, false, true);
        if (m44428l()) {
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
    public final void m44430j() {
        if (this.f50443f > 0) {
            this.f50444g = SystemClock.uptimeMillis();
        }
        setVisibility(0);
    }

    /* renamed from: k */
    public boolean m44429k() {
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
    public final boolean m44428l() {
        if ((getProgressDrawable() != null && getProgressDrawable().isVisible()) || (getIndeterminateDrawable() != null && getIndeterminateDrawable().isVisible())) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public final void m44427m() {
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().m44411n().mo31119d(this.f50450m);
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().registerAnimationCallback(this.f50451n);
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().registerAnimationCallback(this.f50451n);
        }
    }

    /* renamed from: n */
    public final void m44426n() {
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().unregisterAnimationCallback(this.f50451n);
            getIndeterminateDrawable().m44411n().mo31116h();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().unregisterAnimationCallback(this.f50451n);
        }
    }

    /* renamed from: o */
    public boolean m44425o() {
        if (ViewCompat.isAttachedToWindow(this) && getWindowVisibility() == 0 && m44429k()) {
            return true;
        }
        return false;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m44427m();
        if (m44425o()) {
            m44430j();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f50449l);
        removeCallbacks(this.f50448k);
        ((AbstractC7017a) getCurrentDrawable()).hideNow();
        m44426n();
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
        int mo314e;
        int mo315d;
        try {
            AbstractC17122yK currentDrawingDelegate = getCurrentDrawingDelegate();
            if (currentDrawingDelegate == null) {
                return;
            }
            if (currentDrawingDelegate.mo314e() < 0) {
                mo314e = View.getDefaultSize(getSuggestedMinimumWidth(), i);
            } else {
                mo314e = currentDrawingDelegate.mo314e() + getPaddingLeft() + getPaddingRight();
            }
            if (currentDrawingDelegate.mo315d() < 0) {
                mo315d = View.getDefaultSize(getSuggestedMinimumHeight(), i2);
            } else {
                mo315d = currentDrawingDelegate.mo315d() + getPaddingTop() + getPaddingBottom();
            }
            setMeasuredDimension(mo314e, mo315d);
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
        this.f50445h = animatorDurationScaleProvider;
        if (getProgressDrawable() != null) {
            getProgressDrawable().f50468c = animatorDurationScaleProvider;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f50468c = animatorDurationScaleProvider;
        }
    }

    public void setHideAnimationBehavior(int i) {
        this.f50438a.hideAnimationBehavior = i;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z) {
        try {
            if (z == isIndeterminate()) {
                return;
            }
            AbstractC7017a abstractC7017a = (AbstractC7017a) getCurrentDrawable();
            if (abstractC7017a != null) {
                abstractC7017a.hideNow();
            }
            super.setIndeterminate(z);
            AbstractC7017a abstractC7017a2 = (AbstractC7017a) getCurrentDrawable();
            if (abstractC7017a2 != null) {
                abstractC7017a2.setVisible(m44425o(), false, false);
            }
            if ((abstractC7017a2 instanceof IndeterminateDrawable) && m44425o()) {
                ((IndeterminateDrawable) abstractC7017a2).m44411n().mo31117g();
            }
            this.f50446i = false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(@Nullable Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else if (drawable instanceof IndeterminateDrawable) {
            ((AbstractC7017a) drawable).hideNow();
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
            this.f50438a.indicatorColors = iArr;
            getIndeterminateDrawable().m44411n().mo31120c();
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
                this.f50439b = i;
                this.f50440c = z;
                this.f50446i = true;
                if (getIndeterminateDrawable().isVisible() && this.f50445h.getSystemAnimatorDurationScale(getContext().getContentResolver()) != 0.0f) {
                    getIndeterminateDrawable().m44411n().mo31118f();
                    return;
                } else {
                    this.f50450m.onAnimationEnd(getIndeterminateDrawable());
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
            determinateDrawable.m44414t(getProgress() / getMax());
        } else {
            throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
        }
    }

    public void setShowAnimationBehavior(int i) {
        this.f50438a.showAnimationBehavior = i;
        invalidate();
    }

    public void setTrackColor(@ColorInt int i) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.f50438a;
        if (baseProgressIndicatorSpec.trackColor != i) {
            baseProgressIndicatorSpec.trackColor = i;
            invalidate();
        }
    }

    public void setTrackCornerRadius(@InterfaceC2037Px int i) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.f50438a;
        if (baseProgressIndicatorSpec.trackCornerRadius != i) {
            baseProgressIndicatorSpec.trackCornerRadius = Math.min(i, baseProgressIndicatorSpec.trackThickness / 2);
        }
    }

    public void setTrackThickness(@InterfaceC2037Px int i) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.f50438a;
        if (baseProgressIndicatorSpec.trackThickness != i) {
            baseProgressIndicatorSpec.trackThickness = i;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i) {
        if (i != 0 && i != 4 && i != 8) {
            throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.f50447j = i;
    }

    public void show() {
        if (this.f50442e > 0) {
            removeCallbacks(this.f50448k);
            postDelayed(this.f50448k, this.f50442e);
            return;
        }
        this.f50448k.run();
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